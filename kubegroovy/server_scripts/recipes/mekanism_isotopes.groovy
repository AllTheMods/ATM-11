/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mekanism
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.remove([id: "mekanism:processing/lategame/polonium"])
  allthemods.custom([
      type: "mekanism:activating",
      input: [amount: 5, chemical: "mekanism:nuclear_waste"],
      output: [amount: 1, id: "mekanism:polonium"]
  ]).id("allthemods:mekanism/processing/lategame/polonium")
  allthemods.remove([id: "mekanism:processing/lategame/plutonium"])
  allthemods.custom([
      type: "mekanism:centrifuging",
      input: [amount: 5, chemical: "mekanism:nuclear_waste"],
      output: [amount: 1, id: "mekanism:plutonium"]
  ]).id("allthemods:mekanism/processing/lategame/plutonium")
})
