/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires ars_nouveau
package startup_scripts.blocks

$StartupEvents.registry("item") { allthemods ->
  // from the block aliases
  allthemods.addAlias("kubejs:air_essence_block", "kubegroovy:air_essence_block")
  allthemods.addAlias("kubejs:earth_essence_block", "kubegroovy:earth_essence_block")
  allthemods.addAlias("kubejs:fire_essence_block", "kubegroovy:fire_essence_block")
  allthemods.addAlias("kubejs:water_essence_block", "kubegroovy:water_essence_block")
}

$StartupEvents.registry("block") {allthemods ->

  allthemods.create("air_essence_block").with {
    displayName("Air Essence Block")
    stoneSoundType()
    mapColor("stone")
    hardness(0.6)
    renderType("translucent")
    notSolid()
    tagBoth(["c:essence_blocks", "c:storage_blocks/air_essence"])
  }

  allthemods.addAlias("kubejs:air_essence_block", "kubegroovy:air_essence_block")

  allthemods.create("earth_essence_block").with {
    displayName("Earth Essence Block")
    stoneSoundType()
    mapColor("stone")
    hardness(0.6)
    renderType("translucent")
    notSolid()
    tagBoth(["c:essence_blocks", "c:storage_blocks/earth_essence"])
  }
  allthemods.addAlias("kubejs:earth_essence_block", "kubegroovy:earth_essence_block")

  allthemods.create("fire_essence_block").with {
    displayName("Fire Essence Block")
    stoneSoundType()
    mapColor("stone")
    hardness(0.6)
    renderType("translucent")
    notSolid()
    tagBoth(["c:essence_blocks", "c:storage_blocks/fire_essence"])
  }
  allthemods.addAlias("kubejs:fire_essence_block", "kubegroovy:fire_essence_block")

  allthemods.create("water_essence_block").with {
    displayName("Water Essence Block")
    stoneSoundType()
    mapColor("stone")
    hardness(0.6)
    renderType("translucent")
    notSolid()
    tagBoth(["c:essence_blocks", "c:storage_blocks/water_essence"])
  }
  allthemods.addAlias("kubejs:water_essence_block", "kubegroovy:water_essence_block")
}
