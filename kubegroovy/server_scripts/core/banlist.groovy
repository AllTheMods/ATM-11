/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// priority 99
package server_scripts.core

// related files:
// instance/server_banlist_config.json
// instance/kubejs/client_scripts/server_sync_banlist.js
// instance/kubejs/server_scripts/Tweaks/remove_recipes_from_banlist.js
// instance/kubejs/server_scripts/banlist_script.js


import groovy.transform.Field
import net.minecraft.core.BlockPos
import net.minecraft.world.level.Level
import net.minecraft.world.level.LevelAccessor
import net.minecraft.world.level.chunk.LevelChunk
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent
import net.neoforged.neoforge.event.level.ChunkEvent.Load
import net.neoforged.neoforge.event.tick.LevelTickEvent.Pre

import java.util.concurrent.ConcurrentLinkedQueue

config = (Map<String, Map<String, List<String>>>) $Utils.newMap()

@Field
static List<String> bannedBlockEntities

def addSignToPos = { Level level, BlockPos pos ->
  def beRL = level.getBlock(pos).entityId
  level.getBlock(pos).set($Block.getBlock("minecraft:oak_sign"), [:], 18)
  def oakSignBlockEntity = level.getBlockEntity(pos)
  def namespace = "'${$ID.namespace(beRL)}:'"
  def path = $ID.path(beRL)
  def nbt = [
      is_waxed  : 1,
      front_text: [has_glowing_text: 1, color: "black", messages: [namespace, path, '"is banned on this"', "server"]]
  ]
  oakSignBlockEntity.loadWithComponents($NBT.toValueInput(nbt))
}

def levelAndPosToRemove = (Map<LevelAccessor, ConcurrentLinkedQueue<BlockPos>>) $Utils.newMap()
def removeBlockEntities = { Load event ->
  if (event.isNewChunk()) return
  def blocksToRemove = (List<BlockPos>) $Utils.newList()
  if (event.chunk instanceof LevelChunk) {
    if (event.chunk.persistedStatus.toString() != "minecraft:full") return
    event.chunk.getBlockEntities().forEach((pos, be) -> {
      def beRL = $Registry.of("block_entity_type").getId(be.getType())
      if (beRL && bannedBlockEntities.contains(beRL.toString())) {
        blocksToRemove.add(pos)
      }
    })
  }
  if (!blocksToRemove.isEmpty()) {
    def original = levelAndPosToRemove.get(event.level)
    if (original == null) {
      def queue = new ConcurrentLinkedQueue(blocksToRemove)
      levelAndPosToRemove.put(event.level, queue)
    } else {
      original.addAll(blocksToRemove)
    }
  }
}

def sendMessageAndCancel = { event, type ->
  switch (type) {
    case "item":
      event.player.setStatusMessage($Text.red("This server does not allow you to use this item!"))
      event.cancel()
      break
    default:
      break
  }
}

if (!$Platform.isClientEnvironment()) {
  def configPath = "server_banlist_config.json"
  def defaultConfig = [
      server: [
          banned_block_entities: (List<String>) $Utils.newList(),
          banned_items         : (List<String>) $Utils.newList(),
          banned_entities      : (List<String>) $Utils.newList(),
          remove_recipes_by    : (List<String>) $Utils.newList()
      ]
  ]

  config = (Map<String, Map<String, List<String>>>) $JsonIO.read(configPath)
  if (config == null) {
    $JsonIO.write(configPath, defaultConfig)
    config = defaultConfig
  }

  bannedBlockEntities = config?.server?.banned_block_entities.toList().stream().map(prim -> prim.asString).toList()
  def bannedItems = config?.server?.banned_items.toList().stream().map(prim -> prim.asString).toList()
  def bannedEntities = config?.server?.banned_entities.toList().stream().map(prim -> prim.asString).toList()

  if (bannedEntities instanceof List) {
    $NativeEvents.onEvent(EntityJoinLevelEvent, (event) -> {
      if (bannedEntities.contains(event.entity.type)) {
        event.level.server.tell(
            $Text.red(
                "Removed banned entity: " + event.entity.type + " at " + event.entity.blockPosition().toShortString()
            )
        )
        event.setCanceled(true)
      }
    })
  }

  def bannedList = new HashSet<String>()
  bannedList.addAll(bannedBlockEntities)
  bannedList.addAll(bannedItems)

  if (!bannedList.isEmpty()) {
    bannedList.forEach((item) -> {
      $ItemEvents.rightClicked(item, (event) -> sendMessageAndCancel(event, "item"))
    })

    $BlockEvents.rightClicked((event) -> {
      if (bannedList.contains(event.item.id)) sendMessageAndCancel(event, "item")
    })

    $PlayerEvents.loggedIn((event) -> {
      def data = bannedList
      console.log("Banned items: " + data)
      console.log("Sending banned items to " + event.player.username)
      event.player.sendData("banned_items", [ banned_items:
      data ])
    })
  }
  if (!bannedBlockEntities.isEmpty()) {
    $NativeEvents.onEvent(Load, (event) -> {
      if (event.level.clientSide) return
      removeBlockEntities(event)
    })
    $NativeEvents.onEvent(Pre, (event) -> {
      def blocksToRemove = levelAndPosToRemove.get(event.level)
      if (blocksToRemove == null) return
      BlockPos pos
      while ((pos = blocksToRemove.poll()) != null) {
        addSignToPos(event.level, pos)
        event.level.server.tell("Removing banned block entity at " + pos.toShortString())
      }
    })
    $LevelEvents.unloaded((event) -> {
      levelAndPosToRemove.remove(event.level)
    })
  }
}
