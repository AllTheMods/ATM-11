/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires utilitarian
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.shaped("utilitarian:redstone_clock", [" R ", "RSR", " R "], [
      R: "minecraft:redstone",
      S: "minecraft:chiseled_stone_bricks"
  ])

  allthemods.remove([id: "utilitarian:tiny_fuel/coal"])
  allthemods.remove([id: "utilitarian:tiny_fuel/charcoal"])

  def colours = ["white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
                 "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"]

  if ($Platform.isLoaded("occultism")) {
    allthemods.replaceInput(colours.collect { [id: "utilitarian:utility/redying/${it}_candle".toString()] }, "#minecraft:candles",
        $Ingredient.of("#minecraft:candles").except("#occultism:candles"))
  }

  colours.each { colour ->
    allthemods.replaceInput([id: "utilitarian:utility/redying/${colour}_stained_glass".toString()], "#c:glass_blocks/cheap",
        $Ingredient.of("#c:glass_blocks/cheap").except("minecraft:${colour}_stained_glass".toString()))
  }
})
