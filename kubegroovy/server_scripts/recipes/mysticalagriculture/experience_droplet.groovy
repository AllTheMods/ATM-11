/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagriculture
package server_scripts.recipes.mysticalagriculture

if ($Platform.isLoaded("justdirethings")) {
  $ServerEvents.recipes((allthemods) -> {
    // ID Squeezers
    if ($Platform.isLoaded("integrateddynamics")) {
      allthemods.recipes
          .integrateddynamicsSqueezer("mysticalagriculture:experience_droplet")
          .outputFluid("250x justdirethings:xp_fluid_source").id("integrateddynamics:kgy/squeezer/experience_droplet")
      allthemods.recipes
          .integrateddynamicsMechanicalSqueezer("mysticalagriculture:experience_droplet", 20)
          .outputFluid("250x justdirethings:xp_fluid_source").id("integrateddynamics:kgy/mechanical_squeezer/experience_droplet")
    }
  })
}
