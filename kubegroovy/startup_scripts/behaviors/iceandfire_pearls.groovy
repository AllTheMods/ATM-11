/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// priority 100
// requires iceandfire
package startup_scripts.behaviors

import com.iafenvoy.iceandfire.entity.DragonBaseEntity
import com.iafenvoy.iceandfire.registry.IafDragonTypes
import com.mojang.datafixers.util.Pair
import dev.uncandango.kubegroovy.item.ItemBehavior
import net.minecraft.core.BlockPos
import net.minecraft.core.Holder
import net.minecraft.core.HolderSet
import net.minecraft.network.chat.Component
import net.minecraft.server.level.ServerChunkCache
import net.minecraft.server.level.ServerLevel
import net.minecraft.sounds.SoundEvent
import net.minecraft.util.Mth
import net.minecraft.world.entity.projectile.EyeOfEnder
import net.minecraft.world.level.levelgen.structure.Structure
import net.minecraft.world.phys.AABB

global.iceAndFirePearls = (level, player, hand) -> {
    def mainItemStack = player.getItemInHand(hand)
    if (level.clientSide) return true
    // currentStopwatch = $Stopwatch.createStarted()

    def thisType = null
    def structure = null
    if (mainItemStack.idLocation.path == "fire_eye") {
        thisType = IafDragonTypes.FIRE
        structure = $ID.of("iceandfire:fire_dragon_roost", false)
    }
    if (mainItemStack.idLocation.path == "ice_eye") {
        thisType = IafDragonTypes.ICE
        structure = $ID.of("iceandfire:ice_dragon_roost", false)
    }
    if (mainItemStack.idLocation.path == "lightning_eye") {
        thisType = IafDragonTypes.LIGHTNING
        structure = $ID.of("iceandfire:lightning_dragon_roost", false)
    }

    def radiusEntity = 32
    def radiusStructure = 16

    def playerPos = player.block.pos
    def searchAABB = new AABB(
            (double) playerPos.x - radiusEntity * 16,
            (double) level.getMinY(),
            (double) playerPos.z - radiusEntity * 16,
            (double) playerPos.x + radiusEntity * 16,
            (double) level.getMaxY(),
            (double) playerPos.z + radiusEntity * 16
    )
    def targets = level.getEntitiesOfClass(DragonBaseEntity, searchAABB)
    DragonBaseEntity closest = null
    def currentMinDist = 0
    targets.forEach((dragon) -> {
        if (dragon.dragonType == thisType && !dragon.isModelDead() && !dragon.isTame()) {
            def dist = dragon.distanceToEntity(player)
            if (currentMinDist == 0 || dist < currentMinDist) {
                closest = dragon
            }
        }
    })
    /** @type {$Pair_<$BlockPos_,$Holder_<$Structure_>} */
    Pair<BlockPos, Holder<Structure>> structureResult = null
    if (closest == null) {
        def holderRef = $Registry.of("minecraft:worldgen/structure").registry().get(structure)
        def holderSet = HolderSet.direct((Holder<Structure>) holderRef.get())
        def serverChunkCache = (ServerChunkCache) level.getChunkSource()
        structureResult = serverChunkCache
                .getGenerator()
                .findNearestMapStructure((ServerLevel) level, holderSet, player.block.pos, radiusStructure, false)
    }
    if (closest != null || structureResult != null) {

        def headPos = closest != null ? $BlockPos.containing(closest.getHeadPosition()) : structureResult.getFirst()
        def eyeOfEnder = new EyeOfEnder(level, player.x, player.getY(0.5), player.z)
        eyeOfEnder.setItem(mainItemStack)
        eyeOfEnder.signalTo(headPos.center)

        level.addFreshEntity(eyeOfEnder)

        def f = (float) Mth.lerp(level.random.nextFloat(), 0.33f, 0.5f)
        level.playSound(null, player.block.pos, "minecraft:entity.ender_eye.launch" as SoundEvent, "neutral", 1f, f)

        if (!player.isCreative()) {
            mainItemStack.consume(1, player)
        }

        player.swing(hand, true)
        // console.log(`IceAndFire Pearl event took: ${currentStopwatch.elapsed("milliseconds")} ms`)
        return true
    } else {
        player.statusMessage = "Dragon or Dragon Roost not found nearby..." as Component
        // console.log(`IceAndFire Pearl event took: ${currentStopwatch.elapsed("milliseconds")} ms`)
        return false
    }
} as ItemBehavior.UseCallback
