/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires strainers
package startup_scripts.items

$StartupEvents.registry("item") { allthemods ->
  allthemods.create('allthemodium_mesh').unstackable()
  allthemods.addAlias("kubejs:allthemodium_mesh", "kubegroovy:allthemodium_mesh")
}
