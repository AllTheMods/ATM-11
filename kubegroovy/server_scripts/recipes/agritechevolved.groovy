/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires agritechevolved
package server_scripts.recipes

import net.neoforged.neoforge.common.crafting.DifferenceIngredient

$ServerEvents.recipes((allthemods) -> {
  def ownPlanter = ["acacia", "bamboo", "birch", "cherry", "crimson", "dark_oak", "jungle", "mangrove", "pale_oak", "spruce", "warped"]
      .collect { "minecraft:${it}_planks".toString() }
  allthemods.replaceInput([id: "agritechevolved:zzz_basic_planter_from_any_wood"], "#minecraft:planks",
      DifferenceIngredient.of($Ingredient.of("#minecraft:planks"), $Ingredient.of(ownPlanter)))
})
