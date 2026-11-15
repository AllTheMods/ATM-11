/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagriculture
package startup_scripts.blocks

// Magical Soil is registered by ATM: Compat; these keep soil placed by older pack versions.
$StartupEvents.registry("block") { allthemods ->
  allthemods.addAlias("kubejs:magical_soil", "allthemodium:magical_soil")
  allthemods.addAlias("kubegroovy:magical_soil", "allthemodium:magical_soil")
}
