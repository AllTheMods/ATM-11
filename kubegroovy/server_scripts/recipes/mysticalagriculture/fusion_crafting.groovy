/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagriculture
package server_scripts.recipes.mysticalagriculture

$ServerEvents.recipes((allthemods) -> {
  // essence crafting for custom seeds
  def essenceCircle = { result, essenceType ->
    allthemods
        .shaped(result, ["aaa", "a a", "aaa"], [a: "mysticalagriculture:${essenceType}_essence"])
        .id("kubejs:mysticalagriculture/${essenceType}_essence_crafting")
  }

  if ($Platform.isLoaded("xycraft_world")) {
    essenceCircle("12x xycraft_world:kivi", "kivi")
  }

  essenceCircle("12x forbidden_arcanus:darkstone", "darkstone")
  essenceCircle("6x silentgear:azure_silver_ingot", "azure_silver")
  essenceCircle("6x silentgear:crimson_iron_ingot", "crimson_iron")
  if ($Platform.isLoaded("extendedae")) {
    essenceCircle("3x extendedae:entro_crystal", "entro")
  }
})
