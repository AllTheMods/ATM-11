/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires hostilenetworks
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.shaped("minecraft:dragon_head", ["AAA", "BPB", "AAA"], [
      A: "hostilenetworks:end_prediction",
      P: 'hostilenetworks:prediction[hostilenetworks:data_model="hostilenetworks:wither"]',
      B: "minecraft:dragon_breath"
  ])
})
