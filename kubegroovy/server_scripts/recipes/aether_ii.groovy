/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires aether_ii
package server_scripts.recipes

import net.neoforged.neoforge.common.crafting.DifferenceIngredient

$ServerEvents.recipes((allthemods) -> {
  def colours = ["white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
                 "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"]
  def without = { String tag, items -> DifferenceIngredient.of($Ingredient.of(tag), $Ingredient.of(items)) }

  allthemods.replaceInput([id: ~/^minecraft:dye_[a-z_]+_wool$/], "#minecraft:wool",
      without("#minecraft:wool", ["aether_ii:cloudwool"] + colours.collect { "aether_ii:${it}_cloudwool".toString() }))
  allthemods.replaceInput([id: ~/^minecraft:dye_[a-z_]+_carpet$/], "#minecraft:wool_carpets",
      without("#minecraft:wool_carpets", ["aether_ii:cloudwool_carpet"] + colours.collect { "aether_ii:${it}_cloudwool_carpet".toString() }))
  allthemods.replaceInput([id: ~/^minecraft:dye_[a-z_]+_bed$/], "#minecraft:beds",
      without("#minecraft:beds", ["aether_ii:skyroot_bed", "aether_ii:cloudwool_bedroll"] + colours.collect { "aether_ii:${it}_skyroot_bed".toString() }))
  allthemods.replaceInput([id: ~/^aether_ii:dyed_[a-z_]+_arilum_lantern$/], "#aether_ii:arilum_lantern",
      without("#aether_ii:arilum_lantern", ["aether_ii:pink_cloudwool"]))

  allthemods.replaceInput([id: "minecraft:barrel"], "#minecraft:planks", without("#minecraft:planks", "#aether_ii:planks_crafting"))
  allthemods.replaceInput([id: "minecraft:bowl"], "#minecraft:planks", without("#minecraft:planks", "#aether_ii:crafts_skyroot_tools"))
  allthemods.replaceInput([id: "minecraft:furnace"], "#minecraft:stone_crafting_materials",
      without("#minecraft:stone_crafting_materials", "#aether_ii:stone_crafting"))
  allthemods.replaceInput([id: ~/^minecraft:(leather_(helmet|chestplate|leggings|boots)|bundle)$/], "#c:leathers",
      without("#c:leathers", "aether_ii:beast_pelt"))
  allthemods.replaceInput([id: ~/^minecraft:(wooden_(axe|pickaxe|shovel|sword|hoe)|ladder)$/], "#c:rods/wooden",
      without("#c:rods/wooden", "#aether_ii:rods/skyroot"))
  if ($Platform.isLoaded("energizedpower")) {
    allthemods.replaceInput([id: "energizedpower:crafting/wooden_hammer"], "#c:rods/wooden", without("#c:rods/wooden", "#aether_ii:rods/skyroot"))
  }
  if ($Platform.isLoaded("chisel")) {
    allthemods.replaceInput([id: "chisel:palette_builder"], "#c:rods/wooden", without("#c:rods/wooden", "#aether_ii:rods/skyroot"))
  }
})
