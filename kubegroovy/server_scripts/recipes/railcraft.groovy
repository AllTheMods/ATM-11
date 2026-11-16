/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires railcraft
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  def toRemoveRecipes = [
      "railcraft:lead_gear",
      "railcraft:nickel_gear",
      "railcraft:silver_gear",
      "railcraft:tin_gear",
      "railcraft:zinc_gear",
      "railcraft:steel_gear",
      "railcraft:invar_gear",
      "railcraft:bronze_gear",
      "railcraft:iron_gear",
      "railcraft:gold_gear",
      "railcraft:copper_gear",
      "railcraft:brass_gear"
  ]
  toRemoveRecipes.each { allthemods.remove([id: it]) }

  allthemods.remove([id: "railcraft:bronze_ingot_crafted_with_ingots"])
  allthemods.remove([id: "railcraft:invar_ingot_crafted_with_ingots"])
  allthemods.remove([id: "railcraft:brass_ingot_crafted_with_ingots"])

  if ($Platform.isLoaded("mekanismtools")) {
    allthemods.replaceInput([mod: "railcraft"], "railcraft:steel_shovel", "mekanismtools:steel_shovel")
  }
})
