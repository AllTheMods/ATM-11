/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires ae2
package server_scripts.recipes.ae2

import net.minecraft.world.item.ItemStackTemplate

$ServerEvents.recipes((allthemods) -> {
  allthemods.remove([id: "aeinfinitybooster:infinity_card"])
  allthemods
      .shaped("aeinfinitybooster:infinity_card", ["EBE", "BUB", "NNN"], [
          U: "alltheores:lumium_gear",
          B: "ae2:wireless_booster",
          E: "alltheores:enderium_gear",
          N: "minecraft:netherite_ingot"
      ]).with {
    id("allthemods:aeinfinitybooster/infinity_card")
  }

  if ($Platform.isLoaded("megacells")) {
    allthemods
        .shaped("kubegroovy:universal_press", ["FPF", "CSL", "FEF"], [
            F: "#c:ingots/sky_steel",
            P: "ae2:silicon_press",
            C: "ae2:calculation_processor_press",
            S: "minecraft:slime_ball",
            L: "ae2:logic_processor_press",
            E: "ae2:engineering_processor_press"
        ])
        .id("allthemods:universal_press")
  } else {
    allthemods
        .shaped("kubegroovy:universal_press", ["FPF", "CSL", "FEF"], [
            F: "#c:ingots/steel",
            P: "ae2:silicon_press",
            C: "ae2:calculation_processor_press",
            S: "minecraft:slime_ball",
            L: "ae2:logic_processor_press",
            E: "ae2:engineering_processor_press"
        ])
        .id("allthemods:universal_press")
  }

  def universalPress = { input, output, id ->
    allthemods.recipes.ae2.inscriber(output,[top: "kubegroovy:universal_press", middle: input])
        .id("ae2:kgy/inscriber/universal_press/${id}")
  }
  def createCrystalAssemblerRecipe = { output, inputs, id, fluid = null ->
    if (fluid) {
      allthemods.recipes.extendedae.crystal_assembler(output, inputs, 10000, fluid).id("extendedae:kgy/crystal_assembler/${id}")
    } else {
      allthemods.recipes.extendedae.crystal_assembler(output, inputs, 10000).id("extendedae:kgy/crystal_assembler/${id}")
    }
  }

  if ($Platform.isLoaded("megacells")) {
    createCrystalAssemblerRecipe(
        "8x megacells:sky_bronze_ingot",
        [
            "4x ae2:charged_certus_quartz_crystal",
            "4x minecraft:copper_ingot",
            "4x ae2:sky_stone_block"
        ],
        "sky_bronze_ingot",
        "100x minecraft:lava"
    )
    createCrystalAssemblerRecipe(
        "8x megacells:sky_osmium_ingot",
        [
            "4x ae2:charged_certus_quartz_crystal",
            "4x alltheores:osmium_ingot",
            "4x ae2:sky_stone_block"
        ],
        "sky_osmium_ingot",
        "100x minecraft:lava"
    )
  }

  universalPress("#c:silicon", "ae2:printed_silicon", "printed_silicon")
  universalPress("ae2:certus_quartz_crystal", "ae2:printed_calculation_processor", "printed_calculation_processor")
  universalPress("minecraft:diamond", "ae2:printed_engineering_processor", "printed_engineering_processor")
  universalPress("minecraft:gold_ingot", "ae2:printed_logic_processor", "printed_logic_processor")
  if ($Platform.isLoaded("megacells")) {
    universalPress(
        "megacells:sky_steel_ingot",
        "megacells:printed_accumulation_processor",
        "printed_accumulation_processor"
    )
  }

  if ($Platform.isLoaded("appflux")) {
    universalPress("appflux:charged_redstone", "appflux:printed_energy_processor", "printed_energy_processor")
  }

  if ($Platform.isLoaded("extendedae")) {
    universalPress("extendedae:entro_crystal", "extendedae:concurrent_processor_print", "concurrent_processor_print")
  }

  universalPress("minecraft:iron_block", "kubegroovy:universal_press", "universal_press_duplicate")

  if ($Platform.isLoaded("advanced_ae")) {
    universalPress("advanced_ae:quantum_alloy", "advanced_ae:printed_quantum_processor", "printed_quantum_processor")
  }


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
    allthemods
        .shapeless("4x ae2:${color}_covered_cable", ["ae2:${color}_covered_dense_cable"])
        .id("allthemods:ae2/${color}_dense_covered_to_normal")
    allthemods
        .shapeless("4x ae2:${color}_smart_cable", ["ae2:${color}_smart_dense_cable"])
        .id("allthemods:ae2/${color}_smart_covered_to_normal")
    allthemods
        .shapeless("ae2:${color}_covered_dense_cable", ["4x ae2:${color}_covered_cable"])
        .id("allthemods:ae2/${color}_covered_to_dense")
    allthemods
        .shapeless("ae2:${color}_smart_dense_cable", ["4x ae2:${color}_smart_cable"])
        .id("allthemods:ae2/${color}_smart_to_dense")
  })

  allthemods
      .shapeless("4x ae2:fluix_covered_cable", ["ae2:fluix_covered_dense_cable"])
      .id("allthemods:ae2/dense_to_normal")
  allthemods
      .shapeless("4x ae2:fluix_smart_cable", ["ae2:fluix_smart_dense_cable"])
      .id("allthemods:ae2/smart_dense_to_smart_normal")

  if ($Platform.isLoaded("extendedae")) {
    // duplicating universal press with the circuit slicer for when you used up all your presses
    createCrystalAssemblerRecipe(
        "extendedae:circuit_cutter",
        [
            "extendedae:machine_frame",
            "8x ae2:engineering_processor",
            "kubegroovy:universal_press",
            "minecraft:stonecutter"
        ],
        "circuit_cutter_from_universal"
    )

    // making more circuit slicers with the universal press as both have the same capabilities
    allthemods.recipes.extendedaeCircuitCutter("kubegroovy:universal_press", ["minecraft:iron_block"], 18000).id("extendedae:slicing/universal_press")
//      allthemods
//          .custom([
//              type  : "extendedae:circuit_cutter",
//              energy: 18000,
//              input : [
//                  ingredient: "minecraft:iron_block"
//              ],
//              output: [
//                  count: 1,
//                  id   : "kubegroovy:universal_press"
//              ]
//          ])
//          .id("extendedae:slicing/universal_press")
  }

  // Meteorite Divination Rod recipe, to serve as the Ars Dowsing Rod's spiritual successor for finding meteorites
  if ($Platform.isLoaded("occultism")) {
    allthemods.recipes.ae2.charger(
        'occultism:divination_rod[occultism:divination_linked_block="ae2:mysterious_cube",custom_name="Meteorite Divination Rod"]',
        "occultism:divination_rod"
    ).id("ae2:kgy/charger/meteorite_divination_rod")
  }
})
