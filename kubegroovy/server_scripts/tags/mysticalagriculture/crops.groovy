/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagriculture
package server_scripts.tags.mysticalagriculture

import com.blakebr0.mysticalagriculture.registry.CropRegistry
import net.minecraft.world.level.block.Block
import java.util.Objects as $Objects

// sets the chance for a seed to drop
def SecondarySeed = 0.01
def TierSecondaryCutoff = 5

$ServerEvents.tags("item", (allthemods) -> {
  def CropRegistryInstance = CropRegistry.getInstance()
  def cropTiers = CropRegistryInstance.getTiers()
  def tiers = new Block[cropTiers.size()]
  for (def CropTier : cropTiers) {
    tiers[CropTier.getValue() - 1] = CropTier.getFarmlandBlock()
    if (CropTier.getValue() >= TierSecondaryCutoff) {
      CropTier.setSecondarySeedDrop(false)
      CropTier.setBaseSecondaryChance(0)
    } else {
      CropTier.setBaseSecondaryChance(SecondarySeed)
    }
  }
  for (def i = 0; i < tiers.length; i++) {
    def farmA = tiers[i]
    def farmB = null
    if (i + 1 < tiers.length) {
      if (!$Objects.equals(farmA, tiers[i + 1])) {
        farmB = tiers[i + 1]
      }
    }
    def tierA = farmA.getIdLocation().getPath().replace("_farmland", "")
    allthemods.add("kubegroovy:farmland/${tierA}", farmA.idLocation.toString())
    if (farmB) {
      def tierB = farmB.getIdLocation().getPath().replace("_farmland", "")
      allthemods.add("kubegroovy:farmland/${tierA}", "#kubegroovy:farmland/${tierB}")
    } else {
      break
    }
  }
})
