/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires powah
package server_scripts.recipes

import net.minecraft.world.item.ItemStackTemplate
import net.minecraft.world.item.crafting.Ingredient

$ServerEvents.recipes((allthemods) -> {
  // Blaze Powder
  if ($Item.exists("kubegroovy:blaze_powder_block")) {
    allthemods.shaped("kubegroovy:blaze_powder_block", ["SSS", "SSS", "SSS"], [
        S: "minecraft:blaze_powder"
    ])
    allthemods.shapeless("9x minecraft:blaze_powder", [
        // arg 1: output
        "kubegroovy:blaze_powder_block"
    ])
  }

  // Blaze Block
  // allthemods.shaped('kubejs:blaze_block', [
  //     'SSS',
  //     'SSS',
  //     'SSS'
  // ], {
  //     S: 'minecraft:blaze_rod'
  // })
  // allthemods.shapeless('9x minecraft:blaze_rod', [ // arg 1: output
  //     'kubejs:blaze_block'
  // ])

  def bulk_energizing = { input, output, Long energy, id ->
    allthemods.remove([id: "powah:energizing/${id}"])
    def loop = 0
    def ingredients = []
    while (loop <= 5) {
      for (def item = 1; item <= input.count; item++) {
        ingredients.push(input.item)
      }
      allthemods.recipes.powahEnergizing("${(loop + input.count) / input.count}x ${output}" as ItemStackTemplate, ingredients as List<Ingredient>, (energy * (ingredients.size() / input.count)) as Long)
//        allthemods
//            .custom([
//                type       : "powah:energizing",
//                energy     : energy * (ingredients.size() / input.count),
//                ingredients: ingredients,
//                result     : [
//                    count: (loop + input.count) / input.count,
//                    id   : output
//                ]
//            ])
          //.id("kubegroovy:energizing/${(loop + input.count) / input.count}x_${id}")
      loop = loop + input.count
    }
  }
  def energizing = { input, output, energy, id ->
    def ingredients = []

    for (def item = 1; item <= input.count; item++) {
      ingredients.push(input.item)
    }

    allthemods.recipes.powahEnergizing(output as ItemStackTemplate, ingredients as List<Ingredient>, energy as Long)
  }

  if ($Platform.isLoaded("ae2")) {
    bulk_energizing(
        [item: "#c:gems/certus_quartz", count: 1],
        "ae2:charged_certus_quartz_crystal",
        20000,
        "charged_certus_quartz_crystal"
    )
  }

  bulk_energizing([item: "#c:ices/blue", count: 2], "powah:dry_ice", 10000, "dry_ice")
  if ($Platform.isLoaded("appflux")) {
    bulk_energizing([item: "#c:gems/redstone", count: 1], "appflux:charged_redstone", 20000, "charged_redstone")
    bulk_energizing([item: "#c:storage_blocks/redstone", count: 1], "appflux:charged_redstone_block", 180000, "charged_redstone_block")
  }

  bulk_energizing([item: "#c:ingots/uranium", count: 1], "powah:uraninite", 30000, "uraninite_from_uranium")
  bulk_energizing([item: "#c:raw_materials/uraninite", count: 1], "powah:uraninite", 2000, "uraninite_from_raw")
  bulk_energizing([item: "#c:storage_blocks/uranium", count: 1], "powah:uraninite_block", 270000, "uraninite_from_uranium_block")
  energizing(
      [item: "#c:storage_blocks/blaze_powder", count: 4],
      "powah:blazing_crystal_block",
      1080000,
      "blazing_crystal_from_powder_block"
  )
  if ($Platform.isLoaded("allthecompressed")) {
    energizing(
        [item: "#c:storage_blocks/blaze_rod", count: 1],
        "powah:blazing_crystal_block",
        1080000,
        "blazing_crystal_from_block"
    )
  }

  // Dense Uraninite Ore Energizing Recipes
  allthemods.recipes.powahEnergizing("5x powah:uraninite", ["#c:ores/uraninite_regular"], 50000).id("powah:energizing/uraninite_from_ore")
})
