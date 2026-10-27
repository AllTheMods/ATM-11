/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires biomeswevegone
package server_scripts.tags

// Biomes We've Gone; blueberries tag unification

$ServerEvents.tags("item", (allthemods) -> {
  allthemods.add("c:crops", "biomeswevegone:blueberries")
  allthemods.add("c:fruits", "biomeswevegone:blueberries")
  allthemods.add("c:berries", "biomeswevegone:blueberries")
  allthemods.add("c:berries/blueberry", "biomeswevegone:blueberries")
  allthemods.add("c:crops/blueberry", "biomeswevegone:blueberries")
  allthemods.add("c:fruits/blueberries", "biomeswevegone:blueberries")
  allthemods.add("c:fruits/blueberry", "biomeswevegone:blueberries")
  allthemods.add("minecolonies:compostables", "biomeswevegone:blueberries")
  allthemods.add("minecolonies:blacksmith_ingredient_excluded", "biomeswevegone:blueberries")
})
