/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires merrymaking
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  def toRemoveRecipes = [
      "merrymaking:poultry_dinner",
      "merrymaking:latke",
      "merrymaking:sweet_potato_pie",
      "merrymaking:icing",
      "merrymaking:ground_ginger",
      "merrymaking:cookie_dough",
      "merrymaking:gingerbread_dough",
      "merrymaking:harvest_tray"
  ]
  allthemods.remove(toRemoveRecipes)

  allthemods
      .shaped("merrymaking:stuffed_poultry_dinner", ["ABC", "DEF"], [
          A: "merrymaking:quartz_platter",
          B: "#c:vegetables/sweet_potato",
          C: "#c:grain/corn",
          D: "minecraft:carrot",
          E: "minecraft:potato",
          F: "minecraft:beetroot"
      ])
      .id("allthemods:merrymaking/poultry_dinner")

  allthemods
      .shapeless("merrymaking:latke", ["minecraft:potato", "#c:onions/onion", "minecraft:egg", "minecraft:wheat"])
      .id("allthemods:merrymaking/latke")

  allthemods
      .shapeless("merrymaking:sweet_potato_pie", [
          "#c:milk",
          "minecraft:wheat",
          "minecraft:sugar",
          "minecraft:egg",
          "#c:vegetables/sweet_potato"
      ])
      .id("allthemods:merrymaking/sweet_potato_pie")

  allthemods
      .shapeless("8x merrymaking:icing", ["minecraft:sugar", "#c:milk", "minecraft:bowl"])
      .id("allthemods:merrymaking/icing")

  allthemods.shapeless("8x merrymaking:ground_ginger", ["#c:crops/ginger"]).id("allthemods:merrymaking/ground_ginger")

  allthemods
      .shapeless("merrymaking:cookie_dough", ["#c:milk", "minecraft:wheat", "minecraft:sugar", "minecraft:egg"])
      .id("allthemods:merrymaking/cookie_dough")

  allthemods
      .shapeless("merrymaking:gingerbread_dough", [
          "merrymaking:ground_ginger",
          "#c:milk",
          "minecraft:wheat",
          "minecraft:sugar",
          "minecraft:egg"
      ])
      .id("allthemods:merrymaking/gingerbread_dough")

  allthemods
      .shapeless("merrymaking:harvest_tray", [
          "merrymaking:empty_tray",
          "#c:vegetables/sweet_potato",
          "#c:grain/corn",
          "minecraft:carrot",
          "minecraft:apple",
          "minecraft:potato",
          "minecraft:sweet_berries",
          "minecraft:beetroot",
          "minecraft:wheat"
      ])
      .id("allthemods:merrymaking/harvest_tray")
})
