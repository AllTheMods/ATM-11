/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package client_scripts.recipe_viewer

$RecipeViewerEvents.removeEntries("item", (allthemods) -> {
  [
      "enderio:iron_gear", "enderio:powdered_copper", "enderio:powdered_gold", "enderio:powdered_iron",
      "enderio:powdered_tin", "energizedpower:copper_dust", "energizedpower:copper_plate",
      "energizedpower:gold_dust", "energizedpower:gold_plate", "energizedpower:iron_dust",
      "energizedpower:iron_gear", "energizedpower:iron_plate", "energizedpower:iron_rod",
      "energizedpower:raw_tin", "energizedpower:raw_tin_block", "energizedpower:steel_block",
      "energizedpower:steel_gear", "energizedpower:steel_ingot", "energizedpower:steel_nugget",
      "energizedpower:steel_plate", "energizedpower:steel_rod", "energizedpower:tin_block",
      "energizedpower:tin_dust", "energizedpower:tin_ingot", "energizedpower:tin_nugget",
      "energizedpower:tin_plate", "iceandfire:raw_silver", "iceandfire:raw_silver_block",
      "iceandfire:sapphire_block", "iceandfire:sapphire_gem", "iceandfire:silver_block", "iceandfire:silver_ingot",
      "iceandfire:silver_nugget", "irons_jewelry:peridot", "irons_jewelry:ruby", "irons_jewelry:sapphire",
      "mffs:steel_ingot", "neovitae:aluminum_dust", "neovitae:cinnabar_dust", "neovitae:copper_dust",
      "neovitae:diamond_dust", "neovitae:fluorite_dust", "neovitae:gold_dust", "neovitae:iridium_dust",
      "neovitae:iron_dust", "neovitae:lead_dust", "neovitae:nickel_dust", "neovitae:osmium_dust",
      "neovitae:peridot_dust", "neovitae:platinum_dust", "neovitae:ruby_dust", "neovitae:sapphire_dust",
      "neovitae:silver_dust", "neovitae:sulfur", "neovitae:tin_dust", "neovitae:uranium_dust",
      "neovitae:zinc_dust", "occultism:copper_dust", "occultism:gold_dust", "occultism:iron_dust",
      "occultism:netherite_dust", "occultism:raw_silver", "occultism:raw_silver_block",
      "occultism:silver_block", "occultism:silver_dust", "occultism:silver_ingot", "occultism:silver_nugget",
      "oritech:copper_dust", "oritech:electrum", "oritech:electrum_dust", "oritech:electrum_ingot",
      "oritech:gold_dust", "oritech:iron_dust", "oritech:nickel", "oritech:nickel_dust", "oritech:nickel_ingot",
      "oritech:nickel_nugget", "oritech:platinum", "oritech:platinum_dust", "oritech:platinum_ingot",
      "oritech:platinum_nugget", "oritech:raw_nickel", "oritech:raw_nickel_block", "oritech:raw_platinum",
      "oritech:raw_platinum_block", "oritech:raw_uranium", "oritech:raw_uranium_block", "oritech:steel",
      "oritech:steel_dust", "oritech:steel_ingot", "oritech:uranium_dust", "railcraft:brass_block",
      "railcraft:brass_gear", "railcraft:brass_ingot", "railcraft:brass_nugget", "railcraft:brass_plate",
      "railcraft:bronze_block", "railcraft:bronze_gear", "railcraft:bronze_ingot", "railcraft:bronze_nugget",
      "railcraft:bronze_plate", "railcraft:copper_gear", "railcraft:copper_plate", "railcraft:gold_gear",
      "railcraft:gold_plate", "railcraft:invar_block", "railcraft:invar_gear", "railcraft:invar_ingot",
      "railcraft:invar_nugget", "railcraft:invar_plate", "railcraft:iron_gear", "railcraft:iron_plate",
      "railcraft:lead_block", "railcraft:lead_gear", "railcraft:lead_ingot", "railcraft:lead_nugget",
      "railcraft:lead_plate", "railcraft:lead_raw", "railcraft:nickel_block", "railcraft:nickel_gear",
      "railcraft:nickel_ingot", "railcraft:nickel_nugget", "railcraft:nickel_plate", "railcraft:nickel_raw",
      "railcraft:silver_block", "railcraft:silver_gear", "railcraft:silver_ingot", "railcraft:silver_nugget",
      "railcraft:silver_plate", "railcraft:silver_raw", "railcraft:steel_block", "railcraft:steel_gear",
      "railcraft:steel_ingot", "railcraft:steel_nugget", "railcraft:steel_plate", "railcraft:sulfur_dust",
      "railcraft:tin_block", "railcraft:tin_gear", "railcraft:tin_ingot", "railcraft:tin_nugget",
      "railcraft:tin_plate", "railcraft:tin_raw", "railcraft:zinc_block", "railcraft:zinc_gear",
      "railcraft:zinc_ingot", "railcraft:zinc_nugget", "railcraft:zinc_plate", "railcraft:zinc_raw",
      "silentgear:bronze_ingot", "silentgear:iron_rod", "silentgems:peridot", "silentgems:peridot_block",
      "silentgems:ruby", "silentgems:ruby_block", "silentgems:sapphire", "silentgems:sapphire_block",
      "silentgems:silver_block", "silentgems:silver_ingot", "silentgems:silver_nugget", "silentgems:silver_rod",
      "thaumaturge:ingot_brass", "thaumaturge:metal_brass", "thaumaturge:nugget_brass",
      "thaumaturge:plate_brass", "thaumaturge:plate_iron",
      "enderio:silicon", "energizedpower:silicon", "oritech:silicon", "refinedstorage:silicon", "stellaris:silicon",
      "energizedpower:silicon_block", "oritech:silicon_block",
      "irons_jewelry:topaz", "silentgems:topaz", "silentgems:topaz_block"
  ].each { item ->
    if ($Item.exists(item)) {
      allthemods.remove(item)
    }
  }
})
