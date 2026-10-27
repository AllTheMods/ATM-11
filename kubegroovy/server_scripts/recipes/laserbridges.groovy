/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires laserbridges
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.shaped(
      "2x laserbridges:laser_source_block",
      [
          // arg 1: output
          "ABA",
          "ACA",
          "AAA"
      ],
      [
          A: "#c:ingots/iron",
          B: "#c:glass_blocks", // arg 3: the mapping object
          C: "minecraft:end_crystal"
      ]
  )
})
