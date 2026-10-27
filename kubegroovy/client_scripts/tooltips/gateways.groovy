/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires gateways
package client_scripts.tooltips

$ItemEvents.modifyTooltips((allthemods) -> {
  // Apotheosis Gateway Warning
  if ($Platform.isLoaded("twilightforest")) {
    allthemods.add(
        [
            'gateways:gate_pearl[gateways:gateway="apotheosis:tiered/frontier"]',
            'gateways:gate_pearl[gateways:gateway="apotheosis:tiered/ascent"]',
            'gateways:gate_pearl[gateways:gateway="apotheosis:tiered/summit"]',
            'gateways:gate_pearl[gateways:gateway="apotheosis:tiered/pinnacle"]'
        ],
        [
            $Text.of("§cWARNING: Will implode at wave 3 outside of the following dimensions:"),
            $Text.of("§cOverworld, The Nether, The End, The Twilight Forest")
        ]
    )
  } else {
    allthemods.add(
        [
            'gateways:gate_pearl[gateways:gateway="apotheosis:tiered/frontier"]',
            'gateways:gate_pearl[gateways:gateway="apotheosis:tiered/ascent"]',
            'gateways:gate_pearl[gateways:gateway="apotheosis:tiered/summit"]',
            'gateways:gate_pearl[gateways:gateway="apotheosis:tiered/pinnacle"]'
        ],
        [
            $Text.of("§cWARNING: Will implode at wave 3 outside of the following dimensions:"),
            $Text.of("§cOverworld, The Nether, The End")
        ]
    )
  }
})
