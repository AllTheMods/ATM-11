/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires thaumaturge
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  [iron: "iron", brass: "brass", thaumium: "thaumium", void: "void_metal"].each { plate, ingot ->
    allthemods.shaped("3x thaumaturge:plate_${plate}".toString(), ["N", "N", "N"], [N: "#c:ingots/${ingot}".toString()])
        .id("thaumaturge:plate_${plate}".toString())
  }
})
