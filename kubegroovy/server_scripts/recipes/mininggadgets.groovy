/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mininggadgets
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.remove([id: "mininggadgets:upgrade_empty"])
  allthemods.shaped("mininggadgets:upgrade_empty", ["RAL", "DGD", "LAR"], [
      L: "#c:storage_blocks/lapis",
      R: "#c:storage_blocks/redstone",
      D: "#c:gems/diamond",
      A: "#c:nuggets/allthemodium",
      G: "#c:glass_panes"
  ])
})
