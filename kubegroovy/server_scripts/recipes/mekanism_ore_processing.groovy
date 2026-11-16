/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mekanism
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  ["copper", "gold", "iron", "lead", "osmium", "tin", "uranium"].each { metal ->
    def replace = { path, recipe ->
      allthemods.remove([id: "mekanism:processing/${metal}/${path}"])
      allthemods.custom(recipe).id("allthemods:mekanism/processing/${metal}/${path}")
    }

    replace("dirty_dust/from_clump", [
        type: "mekanism:crushing",
        input: [count: 1, ingredient: "#mekanism:clumps/${metal}"],
        output: [count: 2, id: "mekanism:dirty_dust_${metal}"]
    ])
    replace("dust/from_dirty_dust", [
        type: "mekanism:enriching",
        input: [count: 4, ingredient: "#mekanism:dirty_dusts/${metal}"],
        output: [count: 3, id: "alltheores:${metal}_dust"]
    ])
    replace("dust/from_ingot", [
        type: "mekanism:crushing",
        input: [count: 1, ingredient: "#c:ingots/${metal}"],
        output: [id: "alltheores:${metal}_dust"]
    ])
    replace("dust/from_ore", [
        type: "mekanism:enriching",
        input: [count: 1, ingredient: "#c:ores/${metal}"],
        output: [count: 2, id: "alltheores:${metal}_dust"]
    ])
    replace("dust/from_raw_block", [
        type: "mekanism:enriching",
        input: [count: 1, ingredient: "#c:storage_blocks/raw_${metal}"],
        output: [count: 12, id: "alltheores:${metal}_dust"]
    ])
    replace("dust/from_raw_ore", [
        type: "mekanism:enriching",
        input: [count: 3, ingredient: "#c:raw_materials/${metal}"],
        output: [count: 4, id: "alltheores:${metal}_dust"]
    ])
    replace("shard/from_crystal", [
        type: "mekanism:injecting",
        chemical_input: [amount: 1, chemical: "mekanism:hydrogen_chloride"],
        item_input: [count: 1, ingredient: "#mekanism:crystals/${metal}"],
        per_tick_usage: true,
        output: [count: 2, id: "mekanism:shard_${metal}"]
    ])
    replace("slurry/clean", [
        type: "mekanism:washing",
        chemical_input: [amount: 5, chemical: "mekanism:dirty_${metal}"],
        fluid_input: [amount: 25, ingredient: "#minecraft:water"],
        output: [amount: 3, id: "mekanism:clean_${metal}"]
    ])
  }
})
