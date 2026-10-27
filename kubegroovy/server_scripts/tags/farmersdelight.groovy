/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires farmersdelight
package server_scripts.tags

// This file adds the Pam's Dough tags to the Farmer's Delight Dough

$ServerEvents.tags("item", (allthemods) -> {
  // Dough
  allthemods.add("c:dough", "farmersdelight:wheat_dough")
  allthemods.add("c:dough/dough", "farmersdelight:wheat_dough")

  allthemods.add("farmersdelight:tools/knives", "#c:tools/knife")

  // Small tweaks
  allthemods.add("c:onions/onion", "farmersdelight:onion")
  allthemods.add("c:onions", "farmersdelight:onion")
})
