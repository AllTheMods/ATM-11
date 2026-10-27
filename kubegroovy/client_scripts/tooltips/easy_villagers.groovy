/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires easy_villagers
package client_scripts.tooltips

$ItemEvents.modifyTooltips((allthemods) -> {
  // Easy Villagers
  allthemods.add(
      ["easy_villagers:trader", "easy_villagers:auto_trader"],
      [$Text.of("§aRight click with job site block to put it inside and allow trade restocking")]
  )
})
