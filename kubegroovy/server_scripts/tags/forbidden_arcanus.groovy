/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires forbidden_arcanus
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  // Stellar Blacklist
  allthemods.add("forbidden_arcanus:modifier/eternal_incompatible", [
      "ars_additions:undying_charm",
      "modularbees:electrode_copper",
      "modularbees:electrode_iron",
      "modularbees:electrode_gold",
      "modularbees:electrode_netherite",
      "modern_industrialization:forge_hammer",
      "modern_industrialization:iron_hammer",
      "modern_industrialization:steel_hammer",
      "modern_industrialization:netherite_hammer",
      "modern_industrialization:diamond_hammer"
  ])
})

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("kubegroovy:entity_blacklist", [
      "forbidden_arcanus:corrupt_lost_soul",
      "forbidden_arcanus:lost_soul",
      "forbidden_arcanus:enchanted_lost_soul"
  ])
})
