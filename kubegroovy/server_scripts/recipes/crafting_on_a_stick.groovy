/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires crafting_on_a_stick
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.replaceInput(
      [output: "crafting_on_a_stick:crafting_table"],
      "minecraft:crafting_table",
      "#c:player_workstations/crafting_tables"
  )
})
