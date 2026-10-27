/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires buildinggadgets2
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.remove([id: "buildinggadgets2:gadget_building"])
  allthemods.shaped("buildinggadgets2:gadget_building", ["IRI", "DLD", "IAI"], [
      I: "#c:ingots/iron",
      R: "#c:dusts/redstone",
      L: "minecraft:lapis_lazuli",
      D: "alltheores:diamond_gear",
      A: "#c:nuggets/allthemodium"
  ])
})
