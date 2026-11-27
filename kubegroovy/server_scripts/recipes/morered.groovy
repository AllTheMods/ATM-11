/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires morered
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  def prefixes = [""] + ["white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
                         "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"].collect { "${it}_" }
  def ids = ["copper", "gold"].collectMany { metal -> prefixes.collect { [id: "morered:${it}tube_from_${metal}".toString()] } }
  allthemods.forEachRecipe(ids, (recipe) -> recipe.set("pattern", ["i  ", " G ", "  i"]))
})
