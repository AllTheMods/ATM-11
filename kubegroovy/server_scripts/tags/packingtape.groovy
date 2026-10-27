/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires packingtape
package server_scripts.tags

$ServerEvents.tags("block_entity_type", (allthemods) -> {
  allthemods.remove("packingtape:blacklist/problematic", [
      "extrastorage:block_16384k_fluid",
      "extrastorage:block_65536k_fluid",
      "extrastorage:block_262144k_fluid",
      "extrastorage:block_1048576k_fluid"
  ])
})
