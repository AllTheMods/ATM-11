/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires bibliocraft
package server_scripts.recipes

$ServerEvents.generateData("after_mods", (allthemods) -> {
  def woodTypes = [
      "jungle",
      "mangrove",
      "warped",
      "birch",
      "bamboo",
      "crimson",
      "dark_oak",
      "oak",
      "cherry",
      "spruce",
      "acacia"
  ]

  woodTypes.forEach((wood) -> {
    if (!$Item.exists("bibliocraft:${wood}_fancy_sign")) {
      allthemods.json("bibliocraft:recipe/wood/${wood}/fancy_sign", [
          "neoforge:condition": [[type: "neoforge:never"]]
      ])
    }
  })
})
