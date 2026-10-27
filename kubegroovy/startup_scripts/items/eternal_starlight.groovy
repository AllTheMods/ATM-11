/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires eternal_starlight
package startup_scripts.items

$StartupEvents.registry("item") {allthemods ->
  if ($Platform.isLoaded("hostilenetworks")) {
    allthemods.create("starlight_prediction").displayName("Generalized Starlight Prediction")
  }
}
