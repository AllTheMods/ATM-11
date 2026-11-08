/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires silentgear
package startup_scripts.items

// The silent plates are registered by ATM: Compat; these keep plates from older pack versions.
$StartupEvents.registry("item") { allthemods ->
  ["allthemodium", "vibranium", "unobtainium"].each { metal ->
    allthemods.addAlias("kubejs:silent_${metal}_plate", "allthemodium:silent_${metal}_plate")
    allthemods.addAlias("kubegroovy:silent_${metal}_plate", "allthemodium:silent_${metal}_plate")
  }
}
