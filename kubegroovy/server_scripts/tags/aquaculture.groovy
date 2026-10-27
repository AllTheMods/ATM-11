/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires aquaculture
package server_scripts.tags

// adds Aquaculture Raw Fish Fillet to the Pam's Harvestcraft recipes
$ServerEvents.tags("item", (allthemods) -> {
  // Raw Fish Fillet
  allthemods.add("c:rawfish", "aquaculture:fish_fillet_raw")
  allthemods.add("c:rawmeats", "aquaculture:fish_fillet_raw")
  allthemods.add("livingthings:penguin_food", "aquaculture:fish_fillet_raw")
  allthemods.add("c:stock_ingredients", "aquaculture:fish_fillet_raw")

  // Driftwood
  allthemods.add("minecraft:logs", "aquaculture:driftwood")
})
