/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires explorerscompass
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.remove([id: "explorerscompass:explorers_compass"])
  allthemods.shaped("explorerscompass:explorerscompass", ["NAN", "ACA", "NAN"], [
      A: "alltheores:enderium_gear",
      N: "minecraft:netherite_ingot",
      C: "minecraft:recovery_compass"
  ])
})
