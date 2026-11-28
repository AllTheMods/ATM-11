/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires thaumaturge
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  [
      iron    : ["iron", "alltheores:iron_plate"],
      brass   : ["brass", "alltheores:brass_plate"],
      thaumium: ["thaumium", "thaumaturge:plate_thaumium"],
      void    : ["void_metal", "thaumaturge:plate_void"]
  ].each { plate, values ->
    def (ingot, result) = values
    allthemods.shaped("3x ${result}".toString(), ["N", "N", "N"], [N: "#c:ingots/${ingot}".toString()])
        .id("thaumaturge:plate_${plate}".toString())
  }
})
