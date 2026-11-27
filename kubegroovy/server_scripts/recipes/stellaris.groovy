/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires stellaris
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.shaped("2x stellaris:iron_pillar", ["P", "P"], [P: "stellaris:iron_plating_block"]).id("stellaris:iron_pillar")
})
