/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires morered
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.forEachRecipe([id: ~/^morered:([a-z_]+_)?tube_from_(copper|gold)$/], (recipe) -> recipe.set("pattern", ["i  ", " G ", "  i"]))
})
