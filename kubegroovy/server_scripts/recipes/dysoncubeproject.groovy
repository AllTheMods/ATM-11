/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires dysoncubeproject
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.shaped($Item.of("kubejs:allthemodium_solar_sail_package", 1), ["AAA", "APA", "AAA"], [
      A: "#c:plates/allthemodium",
      P: "dysoncubeproject:solar_sail_package"
  ])

  allthemods.shaped($Item.of("kubejs:allthemodium_beam_package", 1), [" A ", "APA", " A "], [
      A: "#c:plates/allthemodium",
      P: "dysoncubeproject:beam_package"
  ])
})
