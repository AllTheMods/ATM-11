// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
if (Platform.isLoaded("oritech")) {
  ServerEvents.recipes((allthemods) => {
    // Rebalance of 'machine addon extender'
    allthemods.remove({ id: "oritech:crafting/core3alt" })
    allthemods.remove({ id: "oritech:crafting/core3" })
    allthemods.remove({ id: "minecraft:crafting/core3alt" })
    allthemods.remove({ id: "minecraft:crafting/core3" })
    allthemods.shaped(Item.of("oritech:machine_core_3", 1), ["AAA", "ABA", "AAA"], {
      A: "oritech:carbon_fibre_strands",
      B: "oritech:fluxite_block"
    })
    allthemods.remove({id: 'oritech:crafting/extender'})
    allthemods.remove({id: 'minecraft:crafting/extender'})
    allthemods.shaped(Item.of("oritech:machine_extender", 1), ["AAA", "ABA", "AAA"], {
      A: "oritech:carbon_plating",
      B: "oritech:machine_core_3"
    })
    // Oil compatibility
    allthemods.remove({ id: "oritech:refinery/oilalt" })
    allthemods.remove({ id: "oritech:refinery/oilbase" })

    allthemods.custom({
      type: "oritech:machine_recipe",
      recipeType: "oritech:refinery",
      fluidInput: {
        amount: 1000,
        ingredient: "#c:crude_oil"
      },
      fluidOutputs: [
        {
          amount: 500,
          id: "oritech:still_heavy_oil"
        },
        {
          amount: 250,
          id: "oritech:still_naphtha"
        },
        {
          amount: 250,
          id: "oritech:still_sulfuric_acid"
        }
      ],
      itemInputs: [],
      itemResults: [],
      time: 120
    })
    allthemods.custom({
      type: "oritech:machine_recipe",
      recipeType: "oritech:refinery",
      fluidInput: {
        amount: 1000,
        ingredient: "#c:crude_oil"
      },
      fluidOutputs: [
        {
          amount: 500,
          id: "oritech:still_diesel"
        },
        {
          amount: 500,
          id: "oritech:still_naphtha"
        },
        {
          amount: 500,
          id: "oritech:still_sulfuric_acid"
        }
      ],
      itemInputs: [
        "oritech:clay_catalyst_beads"
      ],
      itemResults: [],
      time: 120
    })
    // Remove enchanting stuff
    allthemods.remove({ id: "oritech:crafting/catalyst_alt" })
    allthemods.remove({ id: "oritech:crafting/catalyst" })
    allthemods.remove({ id: "oritech:crafting/enchanter" })
    allthemods.remove({ id: "minecraft:crafting/catalyst_alt" })
    allthemods.remove({ id: "minecraft:crafting/catalyst" })
    allthemods.remove({ id: "minecraft:crafting/enchanter" })
    // Cheaty alloys
    allthemods.remove({ id: "oritech:crafting/alloy/steel" })
    allthemods.remove({ id: "oritech:crafting/alloy/electrum" })
    allthemods.remove({ id: "minecraft:crafting/alloy/steel" })
    allthemods.remove({ id: "minecraft:crafting/alloy/electrum" })
  })
}

// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
