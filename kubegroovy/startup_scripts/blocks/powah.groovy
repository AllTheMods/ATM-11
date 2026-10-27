/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires powah
package startup_scripts.blocks

$StartupEvents.registry("item") { allthemods ->
  // from the block aliases
  allthemods.addAlias("kubejs:blaze_powder_block", "kubegroovy:blaze_powder_block")
}

$StartupEvents.registry("block") { allthemods ->

  allthemods.create("blaze_powder_block").with {
    displayName("Blaze Powder Block")
    stoneSoundType()
    mapColor("stone")
    hardness(1)
  }
  allthemods.addAlias("kubejs:blaze_powder_block", "kubegroovy:blaze_powder_block")
}
