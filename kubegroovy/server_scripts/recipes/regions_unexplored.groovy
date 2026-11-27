/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires regions_unexplored
package server_scripts.recipes

import net.neoforged.neoforge.common.crafting.DifferenceIngredient

$ServerEvents.recipes((allthemods) -> {
  allthemods.shapeless("minecraft:redstone", ["regions_unexplored:pointed_redstone"])

  // Remove Raw Redstone Block Recipe
  allthemods.remove([id: "regions_unexplored:raw_redstone_block"])

  allthemods.remove([id: "minecraft:yellow_bioshroom_from_tall_yellow_bioshroom"])
  allthemods.replaceInput([id: "minecraft:bamboo_planks"], "#minecraft:bamboo_blocks",
      DifferenceIngredient.of($Ingredient.of("#minecraft:bamboo_blocks"), $Ingredient.of("#regions_unexplored:bamboo_logs")))
})
