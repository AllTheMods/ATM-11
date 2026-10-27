/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires actuallyadditions
package server_scripts.recipes.actuallyadditions

if ($Platform.isLoaded("farmingforblockheads")) {
  $ServerEvents.recipes((allthemods) -> {
    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:seeds",
        preset  : "minecraft:seeds",
        result  : [
            count: 1,
            item : "actuallyadditions:canola_seeds"
        ]
    ])

    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:seeds",
        preset  : "minecraft:seeds",
        result  : [
            count: 1,
            item : "actuallyadditions:flax_seeds"
        ]
    ])

    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:seeds",
        preset  : "minecraft:seeds",
        result  : [
            count: 1,
            item : "actuallyadditions:rice_seeds"
        ]
    ])

    allthemods.custom([
        type    : "farmingforblockheads:market",
        category: "farmingforblockheads:seeds",
        preset  : "minecraft:seeds",
        result  : [
            count: 1,
            item : "actuallyadditions:coffee_beans"
        ]
    ])
  })
}
