/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires aether_ii
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  allthemods.add("allthemods:planks_with_bookshelf", ["aether_ii:skyroot_planks", "aether_ii:greatroot_planks", "aether_ii:wisproot_planks"])
  allthemods.add("allthemods:planks_with_crafting_table", "#aether_ii:planks_crafting")
  allthemods.add("allthemods:planks_with_chest", "#aether_ii:planks_crafting")

  allthemods.add("aether_ii:arilum_lantern", "aether_ii:pink_arilum_lantern")
})
