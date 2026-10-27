/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagriculture
package server_scripts.recipes.mysticalagriculture

import dev.uncandango.kubegroovy.recipe.filter.RecipeFilter

// ingots to be switched to tags
def ingots = [
    [resource: "aluminum", essence: "prudentium"],
    [resource: "copper", essence: "tertium"],
    [resource: "iron", essence: "tertium"],
    [resource: "zinc", essence: "tertium"],
    [resource: "silver", essence: "tertium"],
    [resource: "lead", essence: "tertium"],
    // {resource: 'brass', essence: 'tertium'},
    // {resource: 'bronze', essence: 'tertium'},
    [resource: "tin", essence: "tertium"],
    [resource: "nickel", essence: "imperium"],
    [resource: "uranium", essence: "imperium"],
    [resource: "gold", essence: "imperium"],
    [resource: "osmium", essence: "imperium"],
    // {resource: 'invar', essence: 'imperium'},
    [resource: "iridium", essence: "supremium"],
    [resource: "platinum", essence: "supremium"]
]

// resources to use blocks instead of ingots
def useBlocks = [
    [resource: "steel", essence: "imperium"],
    [resource: "bronze", essence: "tertium"],
    [resource: "brass", essence: "tertium", block: "alltheores:brass_block"],
    [resource: "nitro_crystal", essence: "insanium"],
    [resource: "spirited_crystal", essence: "supremium"],
    [resource: "niotic_crystal", essence: "supremium"],
    [resource: "blazing_crystal", essence: "imperium"],
    [resource: "energized_steel", essence: "imperium"],
    [resource: "certus_quartz", essence: "tertium", block: "ae2:quartz_block"],
    [resource: "fluix", essence: "imperium", block: "ae2:fluix_block"],
    [resource: "soularium", essence: "imperium"],
    [resource: "conductive_alloy", essence: "tertium"],
    [resource: "copper_alloy", essence: "tertium"],
    [resource: "end_steel", essence: "supremium"],
    [resource: "redstone_alloy", essence: "tertium"],
    [resource: "vibrant_alloy", essence: "supremium"],
    [resource: "dark_steel", essence: "imperium"],
    [resource: "pulsating_alloy", essence: "imperium"],
    [resource: "energetic_alloy", essence: "imperium"],
    [resource: "refined_glowstone", essence: "imperium", block: "mekanism:block_refined_glowstone"],
    [resource: "refined_obsidian", essence: "imperium", block: "mekanism:block_refined_obsidian"],
    [resource: "constantan", essence: "imperium"],
    [resource: "cyanite", essence: "supremium", block: "bigreactors:cyanite_block"],
    [resource: "graphite", essence: "tertium", block: "bigreactors:graphite_block"],
    [resource: "compressed_iron", essence: "imperium"],
    [resource: "electrum", essence: "imperium"],
    [resource: "invar", essence: "imperium"]
]

// dusts to be switched to tags
def dusts = [
    [resource: "sulfur", essence: "prudentium"],
    [resource: "saltpeter", essence: "prudentium"]
]

// gems to be switched to tags
def gems = [
    [resource: "quartz", essence: "tertium", seed: "nether_quartz"],
    [resource: "fluorite", essence: "imperium", seed: null],
    [resource: "peridot", essence: "imperium", seed: null],
    [resource: "ruby", essence: "imperium", seed: null],
    [resource: "sapphire", essence: "imperium", seed: null]
]

// ingredients in a different format to use tags
def different = [
    [tag: "minecraft:logs", essence: "inferium", seed: "wood"],
    [tag: "c:silicon", essence: "prudentium", seed: "silicon"]
]

$ServerEvents.recipes((allthemods) -> {
  def mysticalTags = { material, tag, tags ->

    def recipeEssence = ""
    def recipeTag = ""
    def recipeSeed = ""

    // for ingredients in a different format
    if (tags == "different") {
      recipeEssence = "mysticalagriculture:${material.essence}_essence"
      recipeTag = "#${material.tag}"
      recipeSeed = "mysticalagriculture:${material.seed}_seeds"
    }
    // for ingots/gems (and probably dusts)
    else {
      recipeEssence = "mysticalagriculture:${material.essence}_essence"
      recipeTag = "#${tag}${material.resource}"
      if (material.seed != null) {
        recipeSeed = "mysticalagriculture:${material.seed}_seeds"
      } else if ($Item.exists("mysticalagriculture:${material.resource}_seeds")) {
        recipeSeed = "mysticalagriculture:${material.resource}_seeds"
      } else {
        return
      }
    }

    //console.log("Checking recipe output for \"${recipeSeed}\"")
    allthemods.forEachRecipe([type: "mysticalagriculture:infusion", output: recipeSeed] as RecipeFilter, r -> {
      console.log("Removing recipe: \"${r.id}\"")
      r.remove()
    })

    if (tags == "block") {
      if (material.essence == "insanium") {
        recipeEssence = "mysticalagradditions:insanium_essence"
      } else {
        recipeEssence = "mysticalagriculture:${material.essence}_essence"
      }

      if ($Item.exists("allthecompressed:${material.resource}_block_1x")) {
        // use the allthecompressed block if it exists
        recipeTag = "allthecompressed:${material.resource}_block_1x"
      } else if (material.block != null && $Item.exists(material.block)) {
        // else use the provided block in useBlocks
        recipeTag = material.block
      } else {
        // else neither exists, fallback to the first thing we can find via the storage_blocks tag
        def result = $Ingredient.parseString("#c:storage_blocks/${material.resource}")
        if (result.isError()) {
          return
        }
        recipeTag = result.getOrThrow().getFirst()
        if (recipeTag.isEmpty()) {
          return
        } else {
          recipeTag = recipeTag.id
        }
      }
      allthemods.recipes.mysticalagricultureInfusion(recipeSeed, "mysticalagriculture:prosperity_seed_base",[
          recipeTag,
          recipeEssence,
          recipeTag,
          recipeEssence,
          recipeTag,
          recipeEssence,
          recipeTag,
          recipeEssence
      ])
    } else {
      allthemods.recipes.mysticalagricultureInfusion(recipeSeed, "mysticalagriculture:prosperity_seed_base", [
          recipeTag,
          recipeEssence,
          recipeTag,
          recipeEssence,
          recipeTag,
          recipeEssence,
          recipeTag,
          recipeEssence
      ])
    }
  }

  for (def i = 0; i < ingots.size(); i++) {
    mysticalTags(ingots[i], "c:ingots/", null)
  }

  for (def i = 0; i < gems.size(); i++) {
    mysticalTags(gems[i], "c:gems/", null)
  }

  for (def i = 0; i < dusts.size(); i++) {
    mysticalTags(dusts[i], "c:dusts/", null)
  }

  for (def i = 0; i < different.size(); i++) {
    mysticalTags(different[i], "", "different")
  }

  for (def i = 0; i < useBlocks.size(); i++) {
    mysticalTags(useBlocks[i], "", "block")
  }
})
