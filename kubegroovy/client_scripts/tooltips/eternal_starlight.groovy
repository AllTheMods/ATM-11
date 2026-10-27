/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires eternal_starlight
package client_scripts.tooltips

$ItemEvents.modifyTooltips((allthemods) -> {
  // Eternal Starlight
  allthemods.add(
      'eternal_starlight:loot_bag[eternal_starlight:loot_table="eternal_starlight:bosses/lunar_monstrosity"]',
      [$Text.of('This loot bag is from the \"Lunar Monstrosity\".')]
  )
})
