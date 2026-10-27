/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires farmingforblockheads
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  if ($Platform.isLoaded("herbsandharvest")) {
    // Saplings
    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:saplings",
        preset  : "herbsandharvest:saplings",
        result  : [
            count: 1,
            item : "herbsandharvest:avocado_fruit_sapling"
        ]
    ])

    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:saplings",
        preset  : "herbsandharvest:saplings",
        result  : [
            count: 1,
            item : "herbsandharvest:cherry_fruit_sapling"
        ]
    ])

    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:saplings",
        preset  : "herbsandharvest:saplings",
        result  : [
            count: 1,
            item : "herbsandharvest:lemon_fruit_sapling"
        ]
    ])

    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:saplings",
        preset  : "herbsandharvest:saplings",
        result  : [
            count: 1,
            item : "herbsandharvest:lime_fruit_sapling"
        ]
    ])

    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:saplings",
        preset  : "herbsandharvest:saplings",
        result  : [
            count: 1,
            item : "herbsandharvest:orange_fruit_sapling"
        ]
    ])

    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:saplings",
        preset  : "herbsandharvest:saplings",
        result  : [
            count: 1,
            item : "herbsandharvest:peach_fruit_sapling"
        ]
    ])

    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:saplings",
        preset  : "herbsandharvest:saplings",
        result  : [
            count: 1,
            item : "herbsandharvest:pear_fruit_sapling"
        ]
    ])

    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:saplings",
        preset  : "herbsandharvest:saplings",
        result  : [
            count: 1,
            item : "herbsandharvest:plum_fruit_sapling"
        ]
    ])
  }

  if ($Platform.isLoaded("silentgear")) {
    allthemods.recipes
        .farmingforblockheadsMarket(
            "silentgear:fluffy_seeds",
            "selling.seed_crops.silentgear.fluffy_seeds"
        ).category("farmingforblockheads:seeds")

    allthemods.recipes
        .farmingforblockheadsMarket(
            "silentgear:flax_seeds",
            "selling.seed_crops.silentgear.flax_seeds"
        ).category("farmingforblockheads:seeds")
  }
})
