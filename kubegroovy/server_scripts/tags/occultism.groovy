/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires occultism
package server_scripts.tags

$ServerEvents.tags("block", (allthemods) -> {
  // Crystalline Infusion Altar Materials
  allthemods.add("occultism:pentacle_materials", [
      "occultism:sacrificial_bowl",
      "occultism:otherstone_pedestal",
      "neovitae:air_ritual_stone",
      "neovitae:tenebrae_ritual_stone",
      "neovitae:fire_ritual_stone",
      "neovitae:water_ritual_stone",
      "neovitae:master_ritual_stone",
      "minecraft:soul_lantern",
      "ae2:controller",
      "ae2:smooth_sky_stone_block",
      "ae2:sky_stone_block",
      "ae2:sky_stone_small_brick",
      "ae2:quartz_vibrant_glass",
      "occultism:otherstone_pedestal",
      "ae2:not_so_mysterious_cube",
      "ae2:dense_energy_cell",
  ])
})

$ServerEvents.tags("item", (allthemods) -> {
  // Crystalline Infusion Altar Materials
  allthemods.add("occultism:pentacle_materials", [
      "occultism:sacrificial_bowl",
      "occultism:otherstone_pedestal",
      "neovitae:air_ritual_stone",
      "neovitae:tenebrae_ritual_stone",
      "neovitae:fire_ritual_stone",
      "neovitae:water_ritual_stone",
      "neovitae:master_ritual_stone",
      "minecraft:soul_lantern",
      "ae2:controller",
      "ae2:smooth_sky_stone_block",
      "ae2:sky_stone_block",
      "ae2:sky_stone_small_brick",
      "ae2:quartz_vibrant_glass",
      "occultism:otherstone_pedestal",
      "ae2:not_so_mysterious_cube",
      "ae2:dense_energy_cell",
  ])
})

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("kubegroovy:entity_blacklist", "@occultism")
})
