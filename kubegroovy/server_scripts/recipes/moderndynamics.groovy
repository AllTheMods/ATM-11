/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires moderndynamics
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.shaped("8x moderndynamics:item_pipe", ["i", "g", "i"], [i: "minecraft:iron_ingot", g: "minecraft:glass"]).id("moderndynamics:item_pipe")
  allthemods.shaped("8x moderndynamics:fluid_pipe", ["i", "g", "i"], [i: "minecraft:copper_ingot", g: "minecraft:glass"]).id("moderndynamics:fluid_pipe")
})
