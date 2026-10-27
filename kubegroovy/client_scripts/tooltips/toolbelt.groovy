/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires toolbelt
package client_scripts.tooltips

$ItemEvents.modifyTooltips((allthemods) -> {
  allthemods.add("toolbelt:belt", [
      $Text.of("§7Has it's own slot to be placed in"),
      $Text.of('§7Check your Keybinds for "Open Belt Slot Inventory"')
  ])
})
