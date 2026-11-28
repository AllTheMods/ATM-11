/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires oritech
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  // Rebalance of 'machine addon extender'
  allthemods.remove([id: "oritech:crafting/core3alt"])
  allthemods.remove([id: "oritech:crafting/core3"])
  allthemods.remove([id: "minecraft:crafting/core3alt"])
  allthemods.remove([id: "minecraft:crafting/core3"])
  allthemods.shaped($Item.of("oritech:machine_core_3", 1), ["AAA", "ABA", "AAA"], [
      A: "oritech:carbon_fibre_strands",
      B: "oritech:fluxite_block"
  ])
  allthemods.remove([id: 'oritech:crafting/extender'])
  allthemods.remove([id: 'minecraft:crafting/extender'])
  allthemods.shaped($Item.of("oritech:machine_extender", 1), ["AAA", "ABA", "AAA"], [
      A: "oritech:carbon_plating",
      B: "oritech:machine_core_3"
  ])
  // Oil compatibility
  allthemods.replaceInput([id: "oritech:refinery/oilalt"], $Fluid.sizedIngredientOf("#c:oil", 1_000), $Fluid.sizedIngredientOf("#c:crude_oil", 1_000))
  allthemods.replaceInput([id: "oritech:refinery/oilbase"], $Fluid.sizedIngredientOf("#c:oil", 1_000), $Fluid.sizedIngredientOf("#c:crude_oil", 1_000))
  // Remove enchanting stuff
  // allthemods.remove({ id: "oritech:crafting/catalyst_alt" })
  // allthemods.remove({ id: "oritech:crafting/catalyst" })
  // allthemods.remove({ id: "oritech:crafting/enchanter" })
  // allthemods.remove({ id: "minecraft:crafting/catalyst_alt" })
  // allthemods.remove({ id: "minecraft:crafting/catalyst" })
  // allthemods.remove({ id: "minecraft:crafting/enchanter" })
  // Cheaty alloys
  allthemods.remove([id: "oritech:steel_ingot"])
  allthemods.remove([id: "oritech:electrum_ingot"])
  // Alternate Tainted Refinery recipe
  // To be revisited another time
  /* if ($Platform.isLoaded("apothic_enchanting")) {
    allthemods.custom({
        "type": "oritech:machine_recipe",
        "itemInputs": [
          "oritech:refinery",
          "apothic_enchanting:echoing_sculkshelf"
        ],
        "itemResults": [
        {
          "id": "oritech:tainted_refinery"
        }
        ],
        "recipeType": "oritech:particle_collision",
        "time": 6000
      }).id("allthemods:tainted_refinery")
  } */
})
