/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package server_scripts.core.player_fixes

import net.minecraft.world.phys.Vec3

def stuckPlayers = [:]

$PlayerEvents.tick((allthemods) -> {
  def player = allthemods.getPlayer()
  if (player.isFakePlayer()) return
  if (player.tickCount % 60 != 0) return
  def interaction = player.getFluidInteraction()
  def inFluid = interaction.getMaxHeightFluidType()
  if (inFluid.toString() == "minecraft:empty") return
  def likeWater = inFluid.getIsWaterLike()
  def canMove = inFluid.move(player, [0, 0, 0] as Vec3, 0.08)
  if (!likeWater && !canMove) {
    def lastStuck = stuckPlayers.getOrDefault(player.uuid, 0)
    if (lastStuck == 0 || player.tickCount - lastStuck > 200) {
      player.tell($Text.translatable("You are stuck on fluid %s!", $Text.green(inFluid.getDescription())).red())
      def identifier = $Registry.of("neoforge:fluid_type").getId(inFluid)
      def modInfo = $Platform.getInfo(identifier.getNamespace())
      if (modInfo != null) {
        player.tell($Text.translate("Report this issue to %s!", $Text.green(modInfo.getName())).red())
      }
      def message = $Text.of("Click here to teleport to spawn").green().clickRunCommand("/spawn")
      player.tell(message)
      stuckPlayers.put(player.uuid, player.tickCount)
    }
  }
})
