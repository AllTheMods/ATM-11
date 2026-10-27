/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagriculture
package server_scripts.recipes.mysticalagriculture

import net.minecraft.world.item.ItemStackTemplate
import net.minecraft.world.item.crafting.Ingredient

$ServerEvents.recipes((allthemods) -> {
  def awakenedEssenceCrafting = { essenceCount, input, ingredients, String result ->
    allthemods.recipes.mysticalagricultureAwakening(result as ItemStackTemplate, input as Ingredient, ingredients as List<Ingredient>,
        [
            "${essenceCount}x mysticalagriculture:air_essence",
            "${essenceCount}x mysticalagriculture:earth_essence",
            "${essenceCount}x mysticalagriculture:water_essence",
            "${essenceCount}x mysticalagriculture:fire_essence"
        ]
    ).id("allthemods:mysticalagriculture/awakening/" + $ID.path(result))
//      allthemods
//          .custom([
//              type       : "mysticalagriculture:awakening",
//              essences   : [
//                  [
//                      ingredient: "mysticalagriculture:air_essence",
//                      count     : essenceCount
//                  ],
//                  [
//                      ingredient: "mysticalagriculture:earth_essence",
//                      count     : essenceCount
//                  ],
//                  [
//                      ingredient: "mysticalagriculture:water_essence",
//                      count     : essenceCount
//                  ],
//                  [
//                      ingredient: "mysticalagriculture:fire_essence",
//                      count     : essenceCount
//                  ]
//              ],
//              input      : input,
//              ingredients: ingredients,
//              result     : [
//                  id: result
//              ]
//          ])
//          .id("allthemods:mysticalagriculture/awakening/" + $ID.path(result))
  }

  //allthemods.remove([output: "reliquary:fertile_lily_pad"])
  awakenedEssenceCrafting(
      40,
      "minecraft:lily_pad",
      [
          "allthemodium:vibranium_plate",
          "reliquary:fertile_essence",
          "reliquary:fertile_essence",
          "reliquary:fertile_essence"
      ],
      "reliquary:fertile_lily_pad"
  ).id("reliquary:fertile_lily_pad")
})
