/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagriculture
package client_scripts.tooltips

$ItemEvents.modifyTooltips((allthemods) -> {
  // Mystical Agriculture
  allthemods.add("/mysticalagriculture:.*watering_can/", [
      $Text.of("§cDisabled for Fake Player"),
      $Text.of("§c(Blocks like Modular Routers, Clickers, etc)")
  ])
})
