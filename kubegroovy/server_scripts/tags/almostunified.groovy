/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires almostunified
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  allthemods.add("almostunified:hide", [
      "immersiveengineering:coke",
      "immersiveengineering:dust_coke",
      "railcraft:coal_coke_block",
      "immersiveengineering:slab_coke"
  ])
})
