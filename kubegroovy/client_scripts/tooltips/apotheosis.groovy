/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires apotheosis
package client_scripts.tooltips

$ItemEvents.modifyTooltips((allthemods) -> {
  // Apotheosis Gems
  allthemods.add(
      [
          'apotheosis:gem[apotheosis:gem="apotheosis:the_end/endersurge"]',
          'apotheosis:gem[apotheosis:gem="apotheosis:the_end/mageslayer"]'
      ],
      [$Text.of("§7Can be dropped by hostile mobs in The End")])
  allthemods.add(
      [
          'apotheosis:gem[apotheosis:gem="apotheosis:overworld/royalty"]',
          'apotheosis:gem[apotheosis:gem="apotheosis:overworld/earth"]',
          'apotheosis:gem[apotheosis:gem="apotheosis:overworld/verdant_ruin"]'
      ],
      [$Text.of("§7Can be dropped by hostile mobs in the Overworld")])
  allthemods.add(
      [
          'apotheosis:gem[apotheosis:gem="apotheosis:the_nether/blood_lord"]',
          'apotheosis:gem[apotheosis:gem="apotheosis:the_nether/inferno"]',
          'apotheosis:gem[apotheosis:gem="apotheosis:the_nether/molten_breach"]'
      ],
      [$Text.of("§7Can be dropped by hostile mobs in The Nether")])
})
