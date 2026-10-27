/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires apothic_enchanting
package server_scripts.tags

$ServerEvents.tags("enchantment", (allthemods) -> {
  allthemods.remove("minecraft:non_treasure", "apothic_enchanting:miners_fervor")
})
