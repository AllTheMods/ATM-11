/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires alltheores
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  allthemods.add("c:dusts", "alltheores:netherite_dust")
  allthemods.add("c:dusts/netherite", "alltheores:netherite_dust")
  allthemods.add("c:storage_blocks/sulfur", "alltheores:sulfur_block")
})

$ServerEvents.tags("block", (allthemods) -> {
  // Extreme Reactors
  allthemods.add("c:storage_blocks/yellorium", "alltheores:uranium_block")
})
