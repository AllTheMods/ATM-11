/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires irons_spellbooks
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  def fill = allthemods.recipes.irons_spellbooks.alchemist_cauldron_fill

  fill(
      "1000x minecraft:water",
      "reliquary:emperor_chalice",
      "reliquary:emperor_chalice",
      false,
      "irons_spellbooks:cast.generic.lightning"
  )
})
