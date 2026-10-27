/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires silentgear
package startup_scripts.items

$StartupEvents.registry("item") { allthemods ->
  allthemods.create('silent_allthemodium_plate').with {
    displayName('Silent Allthemodium Plate')
    glow(true)
  }
  allthemods.create('silent_vibranium_plate').with {
    displayName('Silent Vibranium Plate')
    glow(true)
  }
  allthemods.create('silent_unobtainium_plate').with {
    displayName('Silent Unobtainium Plate')
    glow(true)
  }

  allthemods.addAlias("kubejs:silent_allthemodium_plate", "kubegroovy:silent_allthemodium_plate")
  allthemods.addAlias("kubejs:silent_vibranium_plate", "kubegroovy:silent_vibranium_plate")
  allthemods.addAlias("kubejs:silent_unobtainium_plate", "kubegroovy:silent_unobtainium_plate")
}
