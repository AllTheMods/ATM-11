/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires dysoncubeproject
package startup_scripts.items

$StartupEvents.registry("item") { allthemods ->
  allthemods.create("allthemodium_solar_sail_package").with {
    displayName("Allthemodium Solar Sail Package")
    component("dysoncubeproject:sphere_component_solar_sail", 64)
  }
  allthemods.addAlias("kubejs:allthemodium_solar_sail_package", "kubegroovy:allthemodium_solar_sail_package")

  allthemods.create("allthemodium_beam_package").with {
    displayName("Allthemodium Beam Package")
    component("dysoncubeproject:sphere_component_beam", 16)
  }
  allthemods.addAlias("kubejs:allthemodium_beam_package", "kubegroovy:allthemodium_beam_package")
}
