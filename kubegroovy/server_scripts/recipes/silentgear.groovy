/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires silentgear
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.remove([id: "silentgear:bronze_ingot"])

  // adds a chainmail salvage, mirroring the crafting recipe from MineColonies, which uses vanilla Iron items rather than Modern Industrialization Iron Rings
  // Chainmail Helmet
  allthemods.recipes.silentgearSalvaging(
      ["5x minecraft:iron_nugget", "minecraft:iron_ingot"],
      "minecraft:chainmail_helmet"
  )

  // Chainmail Chestplate
  allthemods.recipes.silentgearSalvaging(
      ["6x minecraft:iron_nugget", "2x minecraft:iron_ingot"],
      "minecraft:chainmail_chestplate"
  )

  // Chainmail Leggings
  allthemods.recipes.silentgearSalvaging(
      ["4x minecraft:iron_nugget", "3x minecraft:iron_ingot"],
      "minecraft:chainmail_leggings"
  )

  // Chainmail Boots
  allthemods.recipes.silentgearSalvaging(
      ["2x minecraft:iron_nugget", "2x minecraft:iron_ingot"],
      "minecraft:chainmail_boots"
  )

  if ($Platform.isLoaded("pneumaticcraft")) {
    // Adds Pneumaticraft's Compressed Iron Armor to the Salvager
    // Compressed Iron Helmet
    allthemods.recipes.silentgearSalvaging(
        ["5x minecraft:leather", "5x pneumaticcraft:ingot_iron_compressed"],
        "pneumaticcraft:compressed_iron_helmet"
    )

    // Compressed Iron Chestplate
    allthemods.recipes.silentgearSalvaging(
        ["8x minecraft:leather", "8x pneumaticcraft:ingot_iron_compressed"],
        "pneumaticcraft:compressed_iron_chestplate"
    )

    // Compressed Iron Leggings
    allthemods.recipes.silentgearSalvaging(
        ["7x minecraft:leather", "7x pneumaticcraft:ingot_iron_compressed"],
        "pneumaticcraft:compressed_iron_leggings"
    )

    // Compressed Iron Boots
    allthemods.recipes.silentgearSalvaging(
        ["4x minecraft:leather", "4x pneumaticcraft:ingot_iron_compressed"],
        "pneumaticcraft:compressed_iron_boots"
    )
  }

  if ($Platform.isLoaded("everythingcopper")) {
    // adds Everything is Copper gear to the Salvager
    // Copper Pickaxe
    allthemods.recipes.silentgearSalvaging(
        ["3x minecraft:copper_ingot", "2x minecraft:stick"],
        "everythingcopper:copper_pickaxe"
    )

    // Copper Horse Armor
    allthemods.recipes.silentgearSalvaging(
        ["6x minecraft:copper_ingot", "1x minecraft:leather"],
        "everythingcopper:copper_horse_armor"
    )

// Copper Sword
    allthemods.recipes.silentgearSalvaging(
        ["2x minecraft:copper_ingot", "1x minecraft:stick"],
        "everythingcopper:copper_sword"
    )

// Copper Axe
    allthemods.recipes.silentgearSalvaging(
        ["3x minecraft:copper_ingot", "2x minecraft:stick"],
        "everythingcopper:copper_axe"
    )

// Copper Helmet
    allthemods.recipes.silentgearSalvaging(
        ["5x minecraft:copper_ingot"],
        "everythingcopper:copper_helmet"
    )

// Copper Chestplate
    allthemods.recipes.silentgearSalvaging(
        ["8x minecraft:copper_ingot"],
        "everythingcopper:copper_chestplate"
    )

// Copper Leggings
    allthemods.recipes.silentgearSalvaging(
        ["7x minecraft:copper_ingot"],
        "everythingcopper:copper_leggings"
    )

// Copper Boots
    allthemods.recipes.silentgearSalvaging(
        ["4x minecraft:copper_ingot"],
        "everythingcopper:copper_boots"
    )

// Copper Hoe
    allthemods.recipes.silentgearSalvaging(
        ["2x minecraft:copper_ingot", "2x minecraft:stick"],
        "everythingcopper:copper_hoe"
    )

// Copper Shovel
    allthemods.recipes.silentgearSalvaging(
        ["1x minecraft:copper_ingot", "2x minecraft:stick"],
        "everythingcopper:copper_shovel"
    )
  }

  if ($Platform.isLoaded("aether")) {
    // Aether gloves salvaging
    // Leather Gloves
    allthemods.recipes.silentgearSalvaging(
        ["2x minecraft:leather"],
        "aether:leather_gloves"
    )

    // Chainmail Gloves
    allthemods.recipes.silentgearSalvaging(
        ["4x minecraft:iron_nugget"],
        "aether:chainmail_gloves"
    )

    // Iron Gloves
    allthemods.recipes.silentgearSalvaging(
        ["2x minecraft:iron_ingot"],
        "aether:iron_gloves"
    )

    // Gold Gloves
    allthemods.recipes.silentgearSalvaging(
        ["2x minecraft:gold_ingot"],
        "aether:golden_gloves"
    )

    // Diamond Gloves
    allthemods.recipes.silentgearSalvaging(
        ["2x minecraft:diamond"],
        "aether:diamond_gloves"
    )

    // Netherite Gloves
    allthemods.recipes.silentgearSalvaging(
        ["2x minecraft:diamond", "1x minecraft:netherite_ingot"],
        "aether:netherite_gloves"
    )
  }

  if ($Platform.isLoaded("mekanismtools")) {
    //	MEKANISM
    //	LAPIS LAZULI TOOLS
    //	PAXEL
    allthemods.recipes.silentgearSalvaging(
        ["2x minecraft:lapis_lazuli", "1x minecraft:stick"],
        "mekanismtools:lapis_lazuli_paxel"
    )

    //	SWORD
    allthemods.recipes.silentgearSalvaging(
        ["2x minecraft:lapis_lazuli", "1x minecraft:stick"],
        "mekanismtools:lapis_lazuli_sword"
    )

    //	PICKAXE
    allthemods.recipes.silentgearSalvaging(
        ["3x minecraft:lapis_lazuli", "2x minecraft:stick"],
        "mekanismtools:lapis_lazuli_pickaxe"
    )

    //	AXE
    allthemods.recipes.silentgearSalvaging(
        ["3x minecraft:lapis_lazuli", "2x minecraft:stick"],
        "mekanismtools:lapis_lazuli_axe"
    )

    //	SHOVEL
    allthemods.recipes.silentgearSalvaging(
        ["1x minecraft:lapis_lazuli", "2x minecraft:stick"],
        "mekanismtools:lapis_lazuli_shovel"
    )

//	HOE
    allthemods.recipes.silentgearSalvaging(
        ["2x minecraft:lapis_lazuli", "2x minecraft:stick"],
        "mekanismtools:lapis_lazuli_hoe"
    )

    //	LAPIS LAZULI ARMOR
    //	HELMET
    allthemods.recipes.silentgearSalvaging(
        ["5x minecraft:lapis_lazuli"],
        "mekanismtools:lapis_lazuli_helmet"
    )

    //	CHESTPLATE
    allthemods.recipes.silentgearSalvaging(
        ["8x minecraft:lapis_lazuli"],
        "mekanismtools:lapis_lazuli_chestplate"
    )

    //	LEGGINS
    allthemods.recipes.silentgearSalvaging(
        ["7x minecraft:lapis_lazuli"],
        "mekanismtools:lapis_lazuli_leggings"
    )

    //	BOOTS
    allthemods.recipes.silentgearSalvaging(
        ["4x minecraft:lapis_lazuli"],
        "mekanismtools:lapis_lazuli_boots"
    )

    // BRONZE TOOLS
    allthemods.recipes.silentgearSalvaging(
        ["2x alltheores:bronze_ingot", "1x minecraft:stick"],
        "mekanismtools:bronze_paxel"
    )

    //	SWORD
    allthemods.recipes.silentgearSalvaging(
        ["2x alltheores:bronze_ingot", "1x minecraft:stick"],
        "mekanismtools:bronze_sword"
    )

    //	PICKAXE
    allthemods.recipes.silentgearSalvaging(
        ["3x alltheores:bronze_ingot", "2x minecraft:stick"],
        "mekanismtools:bronze_pickaxe"
    )

    //	AXE
    allthemods.recipes.silentgearSalvaging(
        ["3x alltheores:bronze_ingot", "2x minecraft:stick"],
        "mekanismtools:bronze_axe"
    )

    //	SHOVEL
    allthemods.recipes.silentgearSalvaging(
        ["1x alltheores:bronze_ingot", "2x minecraft:stick"],
        "mekanismtools:bronze_shovel"
    )

    //	HOE
    allthemods.recipes.silentgearSalvaging(
        ["2x alltheores:bronze_ingot", "2x minecraft:stick"],
        "mekanismtools:bronze_hoe"
    )

    // BRONZE ARMOR
    //	HELMET
    allthemods.recipes.silentgearSalvaging(
        ["5x alltheores:bronze_ingot"],
        "mekanismtools:bronze_helmet"
    )

    //	CHESTPLATE
    allthemods.recipes.silentgearSalvaging(
        ["8x alltheores:bronze_ingot"],
        "mekanismtools:bronze_chestplate"
    )

    //	LEGGINS
    allthemods.recipes.silentgearSalvaging(
        ["7x alltheores:bronze_ingot"],
        "mekanismtools:bronze_leggings"
    )

    //	BOOTS
    allthemods.recipes.silentgearSalvaging(
        ["4x alltheores:bronze_ingot"],
        "mekanismtools:bronze_boots"
    )

    // OSMIUM TOOLS
    allthemods.recipes.silentgearSalvaging(
        ["2x alltheores:osmium_ingot", "1x minecraft:stick"],
        "mekanismtools:osmium_paxel"
    )

    //	SWORD
    allthemods.recipes.silentgearSalvaging(
        ["2x alltheores:osmium_ingot", "1x minecraft:stick"],
        "mekanismtools:osmium_sword"
    )

    //	PICKAXE
    allthemods.recipes.silentgearSalvaging(
        ["3x alltheores:osmium_ingot", "2x minecraft:stick"],
        "mekanismtools:osmium_pickaxe"
    )

    //	AXE
    allthemods.recipes.silentgearSalvaging(
        ["3x alltheores:osmium_ingot", "2x minecraft:stick"],
        "mekanismtools:osmium_axe"
    )

    //	SHOVEL
    allthemods.recipes.silentgearSalvaging(
        ["1x alltheores:osmium_ingot", "2x minecraft:stick"],
        "mekanismtools:osmium_shovel"
    )

    //	HOE
    allthemods.recipes.silentgearSalvaging(
        ["2x alltheores:osmium_ingot", "2x minecraft:stick"],
        "mekanismtools:osmium_hoe"
    )

    // OSMIUM ARMOR
    //	HELMET
    allthemods.recipes.silentgearSalvaging(
        ["5x alltheores:osmium_ingot"],
        "mekanismtools:osmium_helmet"
    )

    //	CHESTPLATE
    allthemods.recipes.silentgearSalvaging(
        ["8x alltheores:osmium_ingot"],
        "mekanismtools:osmium_chestplate"
    )

    //	LEGGINS
    allthemods.recipes.silentgearSalvaging(
        ["7x alltheores:osmium_ingot"],
        "mekanismtools:osmium_leggings"
    )

    //	BOOTS
    allthemods.recipes.silentgearSalvaging(
        ["4x alltheores:osmium_ingot"],
        "mekanismtools:osmium_boots"
    )

    // REFINED OBSIDIAN TOOLS
    allthemods.recipes.silentgearSalvaging(
        ["2x mekanism:ingot_refined_obsidian", "1x minecraft:stick"],
        "mekanismtools:refined_obsidian_paxel"
    )

    //	SWORD
    allthemods.recipes.silentgearSalvaging(
        ["2x mekanism:ingot_refined_obsidian", "1x minecraft:stick"],
        "mekanismtools:refined_obsidian_sword"
    )

    //	PICKAXE
    allthemods.recipes.silentgearSalvaging(
        ["3x mekanism:ingot_refined_obsidian", "2x minecraft:stick"],
        "mekanismtools:refined_obsidian_pickaxe"
    )

    //	AXE
    allthemods.recipes.silentgearSalvaging(
        ["3x mekanism:ingot_refined_obsidian", "2x minecraft:stick"],
        "mekanismtools:refined_obsidian_axe"
    )

    //	SHOVEL
    allthemods.recipes.silentgearSalvaging(
        ["1x mekanism:ingot_refined_obsidian", "2x minecraft:stick"],
        "mekanismtools:refined_obsidian_shovel"
    )

    //	HOE
    allthemods.recipes.silentgearSalvaging(
        ["2x mekanism:ingot_refined_obsidian", "2x minecraft:stick"],
        "mekanismtools:refined_obsidian_hoe"
    )

    // REFINED OBSIDIAN ARMOR
    //	HELMET
    allthemods.recipes.silentgearSalvaging(
        ["5x mekanism:ingot_refined_obsidian"],
        "mekanismtools:refined_obsidian_helmet"
    )

    //	CHESTPLATE
    allthemods.recipes.silentgearSalvaging(
        ["8x mekanism:ingot_refined_obsidian"],
        "mekanismtools:refined_obsidian_chestplate"
    )

    //	LEGGINS
    allthemods.recipes.silentgearSalvaging(
        ["7x mekanism:ingot_refined_obsidian"],
        "mekanismtools:refined_obsidian_leggings"
    )

    //	BOOTS
    allthemods.recipes.silentgearSalvaging(
        ["4x mekanism:ingot_refined_obsidian"],
        "mekanismtools:refined_obsidian_boots"
    )

    // REFINED GLOWSTONE TOOLS
    allthemods.recipes.silentgearSalvaging(
        ["2x mekanism:ingot_refined_glowstone", "1x minecraft:stick"],
        "mekanismtools:refined_glowstone_paxel"
    )

    //	SWORD
    allthemods.recipes.silentgearSalvaging(
        ["2x mekanism:ingot_refined_glowstone", "1x minecraft:stick"],
        "mekanismtools:refined_glowstone_sword"
    )

    //	PICKAXE
    allthemods.recipes.silentgearSalvaging(
        ["3x mekanism:ingot_refined_glowstone", "2x minecraft:stick"],
        "mekanismtools:refined_glowstone_pickaxe"
    )

    //	AXE
    allthemods.recipes.silentgearSalvaging(
        ["3x mekanism:ingot_refined_glowstone", "2x minecraft:stick"],
        "mekanismtools:refined_glowstone_axe"
    )

    //	SHOVEL
    allthemods.recipes.silentgearSalvaging(
        ["1x mekanism:ingot_refined_glowstone", "2x minecraft:stick"],
        "mekanismtools:refined_glowstone_shovel"
    )

    //	HOE
    allthemods.recipes.silentgearSalvaging(
        ["2x mekanism:ingot_refined_glowstone", "2x minecraft:stick"],
        "mekanismtools:refined_glowstone_hoe"
    )

    // REFINED GLOWSTONE ARMOR
    //	HELMET
    allthemods.recipes.silentgearSalvaging(
        ["5x mekanism:ingot_refined_glowstone"],
        "mekanismtools:refined_glowstone_helmet"
    )

    //	CHESTPLATE
    allthemods.recipes.silentgearSalvaging(
        ["8x mekanism:ingot_refined_glowstone"],
        "mekanismtools:refined_glowstone_chestplate"
    )

    //	LEGGINS
    allthemods.recipes.silentgearSalvaging(
        ["7x mekanism:ingot_refined_glowstone"],
        "mekanismtools:refined_glowstone_leggings"
    )

    //	BOOTS
    allthemods.recipes.silentgearSalvaging(
        ["4x mekanism:ingot_refined_glowstone"],
        "mekanismtools:refined_glowstone_boots"
    )

    // STEEL GLOWSTONE TOOLS
    //	PAXEL
    allthemods.recipes.silentgearSalvaging(
        ["2x mekanism:ingot_steel", "1x minecraft:stick"],
        "mekanismtools:steel_paxel"
    )

    //	SWORD
    allthemods.recipes.silentgearSalvaging(
        ["2x mekanism:ingot_steel", "1x minecraft:stick"],
        "mekanismtools:steel_sword"
    )

    //	PICKAXE
    allthemods.recipes.silentgearSalvaging(
        ["3x mekanism:ingot_steel", "2x minecraft:stick"],
        "mekanismtools:steel_pickaxe"
    )

    //	AXE
    allthemods.recipes.silentgearSalvaging(
        ["3x mekanism:ingot_steel", "2x minecraft:stick"],
        "mekanismtools:steel_axe"
    )

    //	SHOVEL
    allthemods.recipes.silentgearSalvaging(
        ["1x mekanism:ingot_steel", "2x minecraft:stick"],
        "mekanismtools:steel_shovel"
    )

    //	HOE
    allthemods.recipes.silentgearSalvaging(
        ["2x mekanism:ingot_steel", "2x minecraft:stick"],
        "mekanismtools:steel_hoe"
    )

    // STEEL ARMOR
    //	HELMET
    allthemods.recipes.silentgearSalvaging(
        ["5x mekanism:ingot_steel"],
        "mekanismtools:steel_helmet"
    )

    //	CHESTPLATE
    allthemods.recipes.silentgearSalvaging(
        ["8x mekanism:ingot_steel"],
        "mekanismtools:steel_chestplate"
    )

    //	LEGGINS
    allthemods.recipes.silentgearSalvaging(
        ["7x mekanism:ingot_steel"],
        "mekanismtools:steel_leggings"
    )

    //	BOOTS
    allthemods.recipes.silentgearSalvaging(
        ["4x mekanism:ingot_steel"],
        "mekanismtools:steel_boots"
    )
  }
})
