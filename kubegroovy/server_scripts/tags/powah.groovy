/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires powah
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  allthemods.add("c:storage_blocks/blaze_rod", "allthecompressed:blaze_rod_block")
  allthemods.add("c:storage_blocks/blaze_powder", "kubegroovy:blaze_powder_block")
  allthemods.add("c:storage_blocks/blaze_rod", "kubegroovy:blaze_block")

  // Bibliocraft compat
  allthemods.add("minecraft:bookshelf_books", "powah:book")
})
