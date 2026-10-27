/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires productivebees
package startup_scripts.blocks

$StartupEvents.registry("item") { allthemods ->
  // from the block aliases
  allthemods.addAlias("kubejs:saltpeter_block", "kubegroovy:saltpeter_block")
}

$StartupEvents.registry("block") { allthemods ->
  allthemods.create("saltpeter_block").with {
    displayName("Saltpeter Block")
    stoneSoundType()
    mapColor("stone")
    hardness(1)
    tagBoth(["c:storage_blocks/saltpeter", "c:storage_blocks"])
  }
  allthemods.addAlias("kubejs:saltpeter_block", "kubegroovy:saltpeter_block")
}
