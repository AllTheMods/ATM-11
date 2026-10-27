/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires patchouli
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  // Bibliocraft compat
  allthemods.add("minecraft:bookshelf_books", "patchouli:guide_book")
})
