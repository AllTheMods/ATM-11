/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires allthetweaks
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.remove([id: "allthetweaks:greg_star_from_greg_star_block"])
  allthemods.remove([id: "allthetweaks:greg_star_block"])
  if ($Platform.isLoaded("allthecompressed")) {
    for (def i = 1; i < 10; i++) {
      allthemods.remove([id: "allthecompressed:compress/greg_star_block_${i}x"])
      allthemods.remove([id: "allthecompressed:decompress/greg_star_block_${i}x"])
    }
  }
})
