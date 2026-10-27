/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires pneumaticcraft
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.remove([id: "pneumaticcraft:compressed_iron_gear"])

  allthemods
      .shaped("pneumaticcraft:compressed_iron_gear", [" C ", "CNC", " C "], [
          C: "pneumaticcraft:ingot_iron_compressed",
          N: "minecraft:iron_nugget"
      ])
      .id("allthemods:pneumaticcraft/compressed_iron_gear")
})
