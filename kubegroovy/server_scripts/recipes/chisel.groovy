/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires chisel
package server_scripts.recipes

import net.neoforged.neoforge.common.crafting.DifferenceIngredient

$ServerEvents.recipes((allthemods) -> {
  allthemods.replaceInput([id: "chisel:mossy_stone_raw"], "minecraft:vine", "minecraft:moss_block")
  allthemods.replaceInput([id: "chisel:futura_controller"], "#c:stones",
      DifferenceIngredient.of($Ingredient.of("#c:stones"), $Ingredient.of("#c:cobblestones")))
  allthemods.shaped("36x chisel:kitchen_checker", ["WBW", "BWB", "WBW"], [W: "minecraft:white_concrete", B: "minecraft:black_concrete"])
      .id("chisel:kitchen_checker")
})
