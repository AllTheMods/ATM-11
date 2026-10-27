/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package server_scripts.recipes._global

$ServerEvents.recipes((allthemods) -> {
  allthemods.shaped(
      '8x minecraft:item_frame[entity_data={Invisible:1b,id:"minecraft:item_frame"},custom_name="Invisible Item Frame"]',
      ["iii", "ipi", "iii"],
      [
          i: "minecraft:item_frame",
          p: 'minecraft:potion[potion_contents={potion:"minecraft:invisibility"}]'
      ]
  )

  allthemods.shaped(
      '8x minecraft:glow_item_frame[entity_data={Invisible:1b,id:"minecraft:item_frame"},custom_name="Invisible Glow Item Frame"]',
      ["iii", "ipi", "iii"],
      [
          i: "minecraft:glow_item_frame",
          p: 'minecraft:potion[potion_contents={potion:"minecraft:invisibility"}]'
      ]
  )

  // Concrete from Concrete Powder using Water Buckets
  def colors = [
      "white",
      "yellow",
      "orange",
      "red",
      "pink",
      "magenta",
      "purple",
      "light_blue",
      "cyan",
      "blue",
      "lime",
      "green",
      "brown",
      "light_gray",
      "gray",
      "black"
  ]

  colors.forEach((color) -> {
    allthemods.shaped($Item.of("minecraft:${color}_concrete", 8), ["CCC", "CBC", "CCC"], [
        C: "minecraft:${color}_concrete_powder",
        B: "minecraft:water_bucket"
    ])
  })

  allthemods.shaped("minecraft:crafting_table", ["XX", "XX"], [X: "#minecraft:planks"]).id("minecraft:crafting_table")

  allthemods.shapeless($Item.of("minecraft:crafting_table"), ["#c:player_workstations/crafting_tables"])
  // Example Firework Star recipe to help people in JEI (as it's not shown there)
  allthemods
      .shapeless($Item.of('minecraft:firework_star[firework_explosion={colors:[I;15790320],shape:"small_ball"}]'), [
          "minecraft:gunpowder",
          "minecraft:white_dye"
      ])
      .id("allthemods:example_firework_star")
  // Saltpeter Block Recipes
  if ($Item.exists("kubegroovy:saltpeter_block")) {
    allthemods
        .shaped($Item.of("kubegroovy:saltpeter_block"), ["CCC", "CCC", "CCC"], [
            C: "#c:dusts/saltpeter"
        ])
        .id("allthemods:saltpeter_block")
  }
})
