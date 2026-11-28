/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// priority -100
package server_scripts.recipes._global.unification

def UNITS = [
  "ingots/brass": ["railcraft:brass_ingot", "thaumaturge:ingot_brass"],
  "ingots/bronze": ["railcraft:bronze_ingot", "silentgear:bronze_ingot"],
  "ingots/electrum": ["oritech:electrum_ingot"],
  "ingots/invar": ["railcraft:invar_ingot"],
  "ingots/lead": ["railcraft:lead_ingot"],
  "ingots/nickel": ["oritech:nickel_ingot", "railcraft:nickel_ingot"],
  "ingots/platinum": ["oritech:platinum_ingot"],
  "ingots/silver": ["iceandfire:silver_ingot", "occultism:silver_ingot", "railcraft:silver_ingot", "silentgems:silver_ingot"],
  "ingots/steel": ["energizedpower:steel_ingot", "mffs:steel_ingot", "oritech:steel_ingot", "railcraft:steel_ingot"],
  "ingots/tin": ["energizedpower:tin_ingot", "railcraft:tin_ingot"],
  "ingots/zinc": ["railcraft:zinc_ingot"],
  "nuggets/brass": ["railcraft:brass_nugget", "thaumaturge:nugget_brass"],
  "nuggets/bronze": ["railcraft:bronze_nugget"],
  "nuggets/invar": ["railcraft:invar_nugget"],
  "nuggets/lead": ["railcraft:lead_nugget"],
  "nuggets/nickel": ["oritech:nickel_nugget", "railcraft:nickel_nugget"],
  "nuggets/platinum": ["oritech:platinum_nugget"],
  "nuggets/silver": ["iceandfire:silver_nugget", "occultism:silver_nugget", "railcraft:silver_nugget", "silentgems:silver_nugget"],
  "nuggets/steel": ["energizedpower:steel_nugget", "railcraft:steel_nugget"],
  "nuggets/tin": ["energizedpower:tin_nugget", "railcraft:tin_nugget"],
  "nuggets/zinc": ["railcraft:zinc_nugget"],
  "dusts/aluminum": ["neovitae:aluminum_dust"],
  "dusts/cinnabar": ["neovitae:cinnabar_dust"],
  "dusts/copper": ["enderio:powdered_copper", "energizedpower:copper_dust", "neovitae:copper_dust", "occultism:copper_dust", "oritech:copper_dust"],
  "dusts/diamond": ["neovitae:diamond_dust"],
  "dusts/electrum": ["oritech:electrum_dust"],
  "dusts/fluorite": ["neovitae:fluorite_dust"],
  "dusts/gold": ["enderio:powdered_gold", "energizedpower:gold_dust", "neovitae:gold_dust", "occultism:gold_dust", "oritech:gold_dust"],
  "dusts/iridium": ["neovitae:iridium_dust"],
  "dusts/iron": ["enderio:powdered_iron", "energizedpower:iron_dust", "neovitae:iron_dust", "occultism:iron_dust", "oritech:iron_dust"],
  "dusts/lead": ["neovitae:lead_dust"],
  "dusts/netherite": ["occultism:netherite_dust"],
  "dusts/nickel": ["neovitae:nickel_dust", "oritech:nickel_dust"],
  "dusts/osmium": ["neovitae:osmium_dust"],
  "dusts/peridot": ["neovitae:peridot_dust"],
  "dusts/platinum": ["neovitae:platinum_dust", "oritech:platinum_dust"],
  "dusts/ruby": ["neovitae:ruby_dust"],
  "dusts/sapphire": ["neovitae:sapphire_dust"],
  "dusts/silver": ["neovitae:silver_dust", "occultism:silver_dust"],
  "dusts/steel": ["oritech:steel_dust"],
  "dusts/sulfur": ["neovitae:sulfur", "railcraft:sulfur_dust"],
  "dusts/tin": ["enderio:powdered_tin", "energizedpower:tin_dust", "neovitae:tin_dust"],
  "dusts/uranium": ["neovitae:uranium_dust", "oritech:uranium_dust"],
  "dusts/zinc": ["neovitae:zinc_dust"],
  "gears/brass": ["railcraft:brass_gear"],
  "gears/bronze": ["railcraft:bronze_gear"],
  "gears/copper": ["railcraft:copper_gear"],
  "gears/gold": ["railcraft:gold_gear"],
  "gears/invar": ["railcraft:invar_gear"],
  "gears/iron": ["enderio:iron_gear", "energizedpower:iron_gear", "railcraft:iron_gear"],
  "gears/lead": ["railcraft:lead_gear"],
  "gears/nickel": ["railcraft:nickel_gear"],
  "gears/silver": ["railcraft:silver_gear"],
  "gears/steel": ["energizedpower:steel_gear", "railcraft:steel_gear"],
  "gears/tin": ["railcraft:tin_gear"],
  "gears/zinc": ["railcraft:zinc_gear"],
  "plates/brass": ["railcraft:brass_plate", "thaumaturge:plate_brass"],
  "plates/bronze": ["railcraft:bronze_plate"],
  "plates/copper": ["energizedpower:copper_plate", "railcraft:copper_plate"],
  "plates/gold": ["energizedpower:gold_plate", "railcraft:gold_plate"],
  "plates/invar": ["railcraft:invar_plate"],
  "plates/iron": ["energizedpower:iron_plate", "railcraft:iron_plate", "thaumaturge:plate_iron"],
  "plates/lead": ["railcraft:lead_plate"],
  "plates/nickel": ["railcraft:nickel_plate"],
  "plates/silver": ["railcraft:silver_plate"],
  "plates/steel": ["energizedpower:steel_plate", "railcraft:steel_plate"],
  "plates/tin": ["energizedpower:tin_plate", "railcraft:tin_plate"],
  "plates/zinc": ["railcraft:zinc_plate"],
  "rods/iron": ["energizedpower:iron_rod", "silentgear:iron_rod"],
  "rods/silver": ["silentgems:silver_rod"],
  "rods/steel": ["energizedpower:steel_rod"],
  "gems/peridot": ["irons_jewelry:peridot", "silentgems:peridot"],
  "gems/ruby": ["irons_jewelry:ruby", "silentgems:ruby"],
  "gems/sapphire": ["iceandfire:sapphire_gem", "irons_jewelry:sapphire", "silentgems:sapphire"],
  "raw_materials/lead": ["railcraft:lead_raw"],
  "raw_materials/nickel": ["oritech:raw_nickel", "railcraft:nickel_raw"],
  "raw_materials/platinum": ["oritech:raw_platinum"],
  "raw_materials/silver": ["iceandfire:raw_silver", "occultism:raw_silver", "railcraft:silver_raw"],
  "raw_materials/tin": ["energizedpower:raw_tin", "railcraft:tin_raw"],
  "raw_materials/uranium": ["oritech:raw_uranium"],
  "raw_materials/zinc": ["railcraft:zinc_raw"],
  "storage_blocks/brass": ["railcraft:brass_block", "thaumaturge:metal_brass"],
  "storage_blocks/bronze": ["railcraft:bronze_block"],
  "storage_blocks/electrum": ["oritech:electrum"],
  "storage_blocks/invar": ["railcraft:invar_block"],
  "storage_blocks/lead": ["railcraft:lead_block"],
  "storage_blocks/nickel": ["oritech:nickel", "railcraft:nickel_block"],
  "storage_blocks/peridot": ["silentgems:peridot_block"],
  "storage_blocks/platinum": ["oritech:platinum"],
  "storage_blocks/raw_nickel": ["oritech:raw_nickel_block"],
  "storage_blocks/raw_platinum": ["oritech:raw_platinum_block"],
  "storage_blocks/raw_silver": ["iceandfire:raw_silver_block", "occultism:raw_silver_block"],
  "storage_blocks/raw_tin": ["energizedpower:raw_tin_block"],
  "storage_blocks/raw_uranium": ["oritech:raw_uranium_block"],
  "storage_blocks/ruby": ["silentgems:ruby_block"],
  "storage_blocks/sapphire": ["iceandfire:sapphire_block", "silentgems:sapphire_block"],
  "storage_blocks/silver": ["iceandfire:silver_block", "occultism:silver_block", "railcraft:silver_block", "silentgems:silver_block"],
  "storage_blocks/steel": ["energizedpower:steel_block", "oritech:steel", "railcraft:steel_block"],
  "storage_blocks/tin": ["energizedpower:tin_block", "railcraft:tin_block"],
  "storage_blocks/zinc": ["railcraft:zinc_block"],
  "silicon": ["enderio:silicon", "energizedpower:silicon", "oritech:silicon", "refinedstorage:silicon", "stellaris:silicon"],
  "storage_blocks/silicon": ["energizedpower:silicon_block", "oritech:silicon_block"],
  "gems/topaz": ["irons_jewelry:topaz", "silentgems:topaz"],
  "storage_blocks/topaz": ["silentgems:topaz_block"]
]

def TARGETS = [
  "silicon": "ae2:silicon",
  "storage_blocks/silicon": "extendedae:silicon_block",
  "gems/topaz": "arsmagicalegacy:topaz",
  "storage_blocks/topaz": "arsmagicalegacy:topaz_block"
]

def TAG_OUTPUTS = [
  "c:silicon": "ae2:silicon"
]

$ServerEvents.recipes((allthemods) -> {
  def target = { String tag ->
    if (TARGETS.containsKey(tag)) return TARGETS[tag]
    def (form, material) = tag.split("/") as List
    switch (form) {
      case "gems": return "alltheores:${material}".toString()
      case "raw_materials": return "alltheores:raw_${material}".toString()
      case "storage_blocks": return "alltheores:${material}_block".toString()
      default: return "alltheores:${material}_${form[0..-2]}".toString()
    }
  }

  Map<String, String> toTarget = [:]
  Map<String, String> toTag = [:]
  UNITS.each { String tag, List<String> strays ->
    def unified = target(tag)
    toTag[unified] = "#c:${tag}".toString()
    strays.each { toTarget[it] = unified; toTag[it] = toTag[unified] }
  }

  def outputs
  outputs = { element ->
    boolean changed = false
    if (element.isJsonArray()) {
      element.each { changed |= outputs(it) }
    } else if (element.isJsonObject()) {
      element.keySet().toList().each { String name ->
        def value = element.get(name)
        if (value.isJsonPrimitive()) {
          def text = value.asString
          if (name in ["id", "result", "icon", "item"] && toTarget.containsKey(text)) {
            element.addProperty(name, toTarget[text])
            changed = true
          } else if (name in ["result", "item"] && text.startsWith("#") && TAG_OUTPUTS.containsKey(text.substring(1))) {
            element.addProperty(name, TAG_OUTPUTS[text.substring(1)])
            changed = true
          } else if (name == "tag" && TAG_OUTPUTS.containsKey(text)) {
            element.remove("tag")
            element.addProperty("id", TAG_OUTPUTS[text])
            changed = true
          }
        } else {
          changed |= outputs(value)
        }
      }
    }
    changed
  }

  def inputs = { json ->
    boolean changed = false
    def ingredient = json.get("ingredient")
    if (ingredient?.isJsonPrimitive() && toTag.containsKey(ingredient.asString)) {
      json.addProperty("ingredient", toTag[ingredient.asString])
      changed = true
    }
    def key = json.get("key")
    if (key?.isJsonObject()) {
      key.keySet().toList().each { String name ->
        def value = key.get(name)
        if (value.isJsonPrimitive() && toTag.containsKey(value.asString)) {
          key.addProperty(name, toTag[value.asString])
          changed = true
        }
      }
    }
    def ingredients = json.get("ingredients")
    if (ingredients?.isJsonArray()) {
      for (int i = ingredients.size() - 1; i >= 0; i--) {
        def value = ingredients.get(i)
        if (value.isJsonPrimitive() && toTag.containsKey(value.asString)) {
          ingredients.remove(i)
          ingredients.add(toTag[value.asString])
          changed = true
        }
      }
    }
    changed
  }

  def ids = [
    "allthecompressed:compress/brass_block_1x", "allthecompressed:compress/bronze_block_1x",
    "allthecompressed:compress/electrum_block_1x", "allthecompressed:compress/invar_block_1x",
    "allthecompressed:compress/lead_block_1x", "allthecompressed:compress/nickel_block_1x",
    "allthecompressed:compress/peridot_block_1x", "allthecompressed:compress/platinum_block_1x",
    "allthecompressed:compress/raw_nickel_block_1x", "allthecompressed:compress/raw_platinum_block_1x",
    "allthecompressed:compress/raw_silver_block_1x", "allthecompressed:compress/raw_tin_block_1x",
    "allthecompressed:compress/raw_uranium_block_1x", "allthecompressed:compress/ruby_block_1x",
    "allthecompressed:compress/sapphire_block_1x", "allthecompressed:compress/silver_block_1x",
    "allthecompressed:compress/steel_block_1x", "allthecompressed:compress/tin_block_1x",
    "allthecompressed:compress/zinc_block_1x",
    "alltheores:crafting/alloy_blending/brass", "alltheores:crafting/alloy_blending/bronze",
    "alltheores:crafting/alloy_blending/constantan", "alltheores:crafting/alloy_blending/electrum",
    "alltheores:crafting/alloy_blending/enderium", "alltheores:crafting/alloy_blending/invar",
    "alltheores:crafting/alloy_blending/lumium", "alltheores:crafting/alloy_blending/signalum",
    "alltheores:crafting/alloy_blending/steel", "alltheores:railcraft/crusher/aluminum_ingot",
    "alltheores:railcraft/crusher/aluminum_ore", "alltheores:railcraft/crusher/aluminum_raw",
    "alltheores:railcraft/crusher/aluminum_raw_block", "alltheores:railcraft/crusher/cinnabar_gem",
    "alltheores:railcraft/crusher/electrum_ingot", "alltheores:railcraft/crusher/fluorite_gem",
    "alltheores:railcraft/crusher/iridium_ingot", "alltheores:railcraft/crusher/iridium_ore",
    "alltheores:railcraft/crusher/iridium_raw", "alltheores:railcraft/crusher/iridium_raw_block",
    "alltheores:railcraft/crusher/lead_raw", "alltheores:railcraft/crusher/osmium_ingot",
    "alltheores:railcraft/crusher/osmium_ore", "alltheores:railcraft/crusher/osmium_raw",
    "alltheores:railcraft/crusher/osmium_raw_block", "alltheores:railcraft/crusher/peridot_gem",
    "alltheores:railcraft/crusher/peridot_ore", "alltheores:railcraft/crusher/platinum_ingot",
    "alltheores:railcraft/crusher/platinum_ore", "alltheores:railcraft/crusher/platinum_raw",
    "alltheores:railcraft/crusher/platinum_raw_block", "alltheores:railcraft/crusher/ruby_gem",
    "alltheores:railcraft/crusher/ruby_ore", "alltheores:railcraft/crusher/sapphire_gem",
    "alltheores:railcraft/crusher/sapphire_ore", "alltheores:railcraft/crusher/tin_ore",
    "alltheores:railcraft/crusher/tin_raw", "alltheores:railcraft/crusher/tin_raw_block",
    "alltheores:railcraft/crusher/uranium_ingot", "alltheores:railcraft/crusher/uranium_ore",
    "alltheores:railcraft/crusher/uranium_raw", "alltheores:railcraft/crusher/uranium_raw_block",
    "alltheores:railcraft/crusher/zinc_ingot", "alltheores:railcraft/crusher/zinc_ore",
    "alltheores:railcraft/crusher/zinc_raw", "alltheores:railcraft/crusher/zinc_raw_block",
    "enderio:inhibitor_obelisk", "enderio:iron_gear", "enderio:item.minecraft.copper_ingot_from_blasting",
    "enderio:item.minecraft.copper_ingot_from_smelting", "enderio:item.minecraft.gold_ingot_from_blasting",
    "enderio:item.minecraft.gold_ingot_from_smelting", "enderio:item.minecraft.iron_ingot_from_blasting",
    "enderio:item.minecraft.iron_ingot_from_smelting", "enderio:sag_milling/copper", "enderio:sag_milling/gold",
    "enderio:sag_milling/iron", "enderio:sag_milling/raw_copper", "enderio:sag_milling/raw_gold",
    "enderio:sag_milling/raw_iron",
    "energizedpower:alloy_furnace/steel_ingot", "energizedpower:blasting/tin_ingot_from_blasting_raw_tin",
    "energizedpower:blasting/tin_ingot_from_blasting_tin_dust",
    "energizedpower:blasting/tin_ingot_from_blasting_tin_ores",
    "energizedpower:compressing/copper_plate_from_compressing_copper_block",
    "energizedpower:compressing/copper_plate_from_compressing_copper_ingot",
    "energizedpower:compressing/gold_plate_from_compressing_gold_block",
    "energizedpower:compressing/gold_plate_from_compressing_gold_ingot",
    "energizedpower:compressing/iron_plate_from_compressing_iron_block",
    "energizedpower:compressing/iron_plate_from_compressing_iron_ingot",
    "energizedpower:compressing/steel_plate_from_compressing_steel_block",
    "energizedpower:compressing/steel_plate_from_compressing_steel_ingot",
    "energizedpower:compressing/tin_plate_from_compressing_tin_block",
    "energizedpower:compressing/tin_plate_from_compressing_tin_ingot", "energizedpower:crafting/copper_plate",
    "energizedpower:crafting/gold_plate", "energizedpower:crafting/iron_plate", "energizedpower:crafting/raw_tin",
    "energizedpower:crafting/raw_tin_block", "energizedpower:crafting/steel_block",
    "energizedpower:crafting/steel_ingot_from_nuggets", "energizedpower:crafting/steel_ingot_from_steel_block",
    "energizedpower:crafting/steel_nugget", "energizedpower:crafting/steel_plate",
    "energizedpower:crafting/tin_block", "energizedpower:crafting/tin_ingot_from_nuggets",
    "energizedpower:crafting/tin_ingot_from_tin_block", "energizedpower:crafting/tin_nugget",
    "energizedpower:crafting/tin_plate", "energizedpower:filtration_plant/tin_ore_filtration",
    "energizedpower:metal_press/iron_gear", "energizedpower:metal_press/iron_rod",
    "energizedpower:metal_press/steel_gear", "energizedpower:metal_press/steel_rod",
    "energizedpower:pulverizer/copper_dust_from_pulverizer_copper_ingots",
    "energizedpower:pulverizer/copper_dust_from_pulverizer_copper_ores",
    "energizedpower:pulverizer/copper_dust_from_pulverizer_raw_copper",
    "energizedpower:pulverizer/copper_dust_from_pulverizer_raw_copper_blocks",
    "energizedpower:pulverizer/gold_dust_from_pulverizer_gold_ingots",
    "energizedpower:pulverizer/gold_dust_from_pulverizer_gold_ores",
    "energizedpower:pulverizer/gold_dust_from_pulverizer_raw_gold",
    "energizedpower:pulverizer/gold_dust_from_pulverizer_raw_gold_blocks",
    "energizedpower:pulverizer/iron_dust_from_pulverizer_iron_ingots",
    "energizedpower:pulverizer/iron_dust_from_pulverizer_iron_ores",
    "energizedpower:pulverizer/iron_dust_from_pulverizer_raw_iron",
    "energizedpower:pulverizer/iron_dust_from_pulverizer_raw_iron_blocks",
    "energizedpower:pulverizer/tin_dust_from_pulverizer_raw_tin",
    "energizedpower:pulverizer/tin_dust_from_pulverizer_raw_tin_blocks",
    "energizedpower:pulverizer/tin_dust_from_pulverizer_tin_ingots",
    "energizedpower:pulverizer/tin_dust_from_pulverizer_tin_ores",
    "energizedpower:smelting/tin_ingot_from_smelting_raw_tin",
    "energizedpower:smelting/tin_ingot_from_smelting_tin_dust",
    "energizedpower:smelting/tin_ingot_from_smelting_tin_ores",
    "iceandfire:furnace/deepslate_silver_ingot", "iceandfire:furnace/deepslate_silver_ingot_blasting",
    "iceandfire:furnace/sapphire", "iceandfire:furnace/sapphire_blasting", "iceandfire:furnace/silver_ingot",
    "iceandfire:furnace/silver_ingot_blasting", "iceandfire:furnace/silver_nugget",
    "iceandfire:furnace/silver_nugget_blasting", "iceandfire:raw_silver_block_to_raw_silver",
    "iceandfire:raw_silver_to_raw_silver_block", "iceandfire:sapphire_block_to_sapphire_gem",
    "iceandfire:sapphire_gem_to_sapphire_block", "iceandfire:silver_block_to_silver_ingot",
    "iceandfire:silver_ingot_from_blasting_raw_silver", "iceandfire:silver_ingot_from_smelting_raw_silver",
    "iceandfire:silver_ingot_to_silver_block", "iceandfire:silver_ingot_to_silver_nugget",
    "iceandfire:silver_nugget_to_silver_ingot",
    "minecraft:lead_ingot_from_blasting_deepslate_lead_ore", "minecraft:lead_ingot_from_blasting_lead_ore",
    "minecraft:lead_ingot_from_blasting_lead_raw", "minecraft:lead_ingot_from_smelting_deepslate_lead_ore",
    "minecraft:lead_ingot_from_smelting_lead_ore", "minecraft:lead_ingot_from_smelting_lead_raw",
    "minecraft:nickel_ingot_from_blasting_deepslate_nickel_ore",
    "minecraft:nickel_ingot_from_blasting_nickel_ore", "minecraft:nickel_ingot_from_blasting_nickel_raw",
    "minecraft:nickel_ingot_from_smelting_deepslate_nickel_ore",
    "minecraft:nickel_ingot_from_smelting_nickel_ore", "minecraft:nickel_ingot_from_smelting_nickel_raw",
    "minecraft:silver_ingot_from_blasting_deepslate_silver_ore",
    "minecraft:silver_ingot_from_blasting_silver_ore", "minecraft:silver_ingot_from_blasting_silver_raw",
    "minecraft:silver_ingot_from_smelting_deepslate_silver_ore",
    "minecraft:silver_ingot_from_smelting_silver_ore", "minecraft:silver_ingot_from_smelting_silver_raw",
    "minecraft:tin_ingot_from_blasting_deepslate_tin_ore", "minecraft:tin_ingot_from_blasting_tin_ore",
    "minecraft:tin_ingot_from_blasting_tin_raw", "minecraft:tin_ingot_from_smelting_deepslate_tin_ore",
    "minecraft:tin_ingot_from_smelting_tin_ore", "minecraft:tin_ingot_from_smelting_tin_raw",
    "minecraft:zinc_ingot_from_blasting_deepslate_zinc_ore", "minecraft:zinc_ingot_from_blasting_zinc_ore",
    "minecraft:zinc_ingot_from_blasting_zinc_raw", "minecraft:zinc_ingot_from_smelting_deepslate_zinc_ore",
    "minecraft:zinc_ingot_from_smelting_zinc_ore", "minecraft:zinc_ingot_from_smelting_zinc_raw",
    "neovitae:alchemytable/dust_aluminum", "neovitae:alchemytable/dust_cinnabar",
    "neovitae:alchemytable/dust_copper", "neovitae:alchemytable/dust_diamond",
    "neovitae:alchemytable/dust_fluorite", "neovitae:alchemytable/dust_gold",
    "neovitae:alchemytable/dust_iridium", "neovitae:alchemytable/dust_iron", "neovitae:alchemytable/dust_lead",
    "neovitae:alchemytable/dust_nickel", "neovitae:alchemytable/dust_osmium",
    "neovitae:alchemytable/dust_peridot", "neovitae:alchemytable/dust_platinum",
    "neovitae:alchemytable/dust_ruby", "neovitae:alchemytable/dust_sapphire", "neovitae:alchemytable/dust_silver",
    "neovitae:alchemytable/dust_tin", "neovitae:alchemytable/dust_uranium", "neovitae:alchemytable/dust_zinc",
    "neovitae:alchemytable/sulfur_from_lava", "neovitae:alchemytable/sulfur_from_sigil",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_aluminum",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_cinnabar",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_copper",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_diamond",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_fluorite",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_gold",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_iridium",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_iron",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_lead",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_nickel",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_osmium",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_peridot",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_platinum",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_ruby",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_sapphire",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_silver",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_tin",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_uranium",
    "neovitae:athanor/cutting_fluids/dusts_from_gravel_zinc",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_aluminum",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_cinnabar",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_copper",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_diamond",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_fluorite",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_gold",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_iridium",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_iron",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_lead",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_nickel",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_osmium",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_peridot",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_platinum",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_ruby",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_sapphire",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_silver",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_tin",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_uranium",
    "neovitae:athanor/cutting_fluids/dusts_from_ingot_zinc",
    "neovitae:athanor/cutting_fluids/netherrack_to_sulfur", "neovitae:materials/blasting_aluminum_dust",
    "neovitae:materials/blasting_cinnabar_dust", "neovitae:materials/blasting_copper_dust",
    "neovitae:materials/blasting_diamond_dust", "neovitae:materials/blasting_fluorite_dust",
    "neovitae:materials/blasting_gold_dust", "neovitae:materials/blasting_iridium_dust",
    "neovitae:materials/blasting_iron_dust", "neovitae:materials/blasting_lead_dust",
    "neovitae:materials/blasting_nickel_dust", "neovitae:materials/blasting_osmium_dust",
    "neovitae:materials/blasting_peridot_dust", "neovitae:materials/blasting_platinum_dust",
    "neovitae:materials/blasting_ruby_dust", "neovitae:materials/blasting_sapphire_dust",
    "neovitae:materials/blasting_silver_dust", "neovitae:materials/blasting_tin_dust",
    "neovitae:materials/blasting_uranium_dust", "neovitae:materials/blasting_zinc_dust",
    "neovitae:materials/smelting_aluminum_dust", "neovitae:materials/smelting_cinnabar_dust",
    "neovitae:materials/smelting_copper_dust", "neovitae:materials/smelting_diamond_dust",
    "neovitae:materials/smelting_fluorite_dust", "neovitae:materials/smelting_gold_dust",
    "neovitae:materials/smelting_iridium_dust", "neovitae:materials/smelting_iron_dust",
    "neovitae:materials/smelting_lead_dust", "neovitae:materials/smelting_nickel_dust",
    "neovitae:materials/smelting_osmium_dust", "neovitae:materials/smelting_peridot_dust",
    "neovitae:materials/smelting_platinum_dust", "neovitae:materials/smelting_ruby_dust",
    "neovitae:materials/smelting_sapphire_dust", "neovitae:materials/smelting_silver_dust",
    "neovitae:materials/smelting_tin_dust", "neovitae:materials/smelting_uranium_dust",
    "neovitae:materials/smelting_zinc_dust",
    "occultism:blasting/silver_ingot_from_dust", "occultism:blasting/silver_ingot_from_ore",
    "occultism:blasting/silver_ingot_from_raw", "occultism:crafting/netherite_dust",
    "occultism:crafting/raw_silver_block", "occultism:crafting/raw_silver_ingot_from_block",
    "occultism:crafting/silver_block", "occultism:crafting/silver_ingot_from_block",
    "occultism:crafting/silver_ingot_from_nuggets", "occultism:crafting/silver_nugget",
    "occultism:smelting/silver_ingot_from_dust", "occultism:smelting/silver_ingot_from_ore",
    "occultism:smelting/silver_ingot_from_raw",
    "oritech:atomicforge/dust/copper", "oritech:atomicforge/dust/gold", "oritech:atomicforge/dust/iron",
    "oritech:atomicforge/dust/nickel", "oritech:atomicforge/dust/platinum",
    "oritech:compat/ato/fragment_forge/ore/iridium", "oritech:compat/ato/fragment_forge/ore/osmium",
    "oritech:copper_ingot_from_blasting_copper_dust", "oritech:copper_ingot_from_smelting_copper_dust",
    "oritech:crafting/copper_dust_from_packing", "oritech:crafting/gold_dust_from_packing",
    "oritech:crafting/iron_dust_from_packing", "oritech:crafting/nickel_dust_from_packing",
    "oritech:crafting/nickel_ingot_from_packing", "oritech:crafting/nickel_nugget_from_unpacking",
    "oritech:crafting/platinum_dust_from_packing", "oritech:crafting/platinum_ingot_from_packing",
    "oritech:crafting/platinum_nugget_from_unpacking", "oritech:crafting/small_copper_dust_from_unpacking",
    "oritech:crafting/small_gold_dust_from_unpacking", "oritech:crafting/small_iron_dust_from_unpacking",
    "oritech:crafting/small_nickel_dust_from_unpacking", "oritech:crafting/small_platinum_dust_from_unpacking",
    "oritech:deepdrill/nickel", "oritech:deepdrill/platinum", "oritech:deepdrill/uranium",
    "oritech:electrum_ingot_from_blasting_electrum_dust", "oritech:electrum_ingot_from_smelting_electrum_dust",
    "oritech:electrumblock", "oritech:electrumblockinv", "oritech:foundry/alloy/electrum",
    "oritech:foundry/alloy/gem/nickel", "oritech:foundry/alloy/gem/platinum", "oritech:foundry/alloy/steel",
    "oritech:fragment_forge/dust/copper", "oritech:fragment_forge/dust/gold", "oritech:fragment_forge/dust/iron",
    "oritech:fragment_forge/dust/nickel", "oritech:fragment_forge/dust/platinum",
    "oritech:fragment_forge/electrum", "oritech:fragment_forge/ore/iron", "oritech:fragment_forge/ore/nickel",
    "oritech:fragment_forge/ore/platinum", "oritech:fragment_forge/recycle/iron_dust",
    "oritech:fragment_forge/steel", "oritech:fragment_forge/uranium", "oritech:fragment_forge/uraniumcrystal",
    "oritech:fragment_forge/uraniumore", "oritech:gold_ingot_from_blasting_gold_dust",
    "oritech:gold_ingot_from_smelting_gold_dust", "oritech:iron_ingot_from_blasting_iron_dust",
    "oritech:iron_ingot_from_smelting_iron_dust", "oritech:nickel_ingot_from_blasting_nickel_dust",
    "oritech:nickel_ingot_from_blasting_nickel_gem", "oritech:nickel_ingot_from_blasting_raw_nickel",
    "oritech:nickel_ingot_from_smelting_nickel_dust", "oritech:nickel_ingot_from_smelting_nickel_gem",
    "oritech:nickel_ingot_from_smelting_raw_nickel", "oritech:nickel_nugget",
    "oritech:nickel_nugget_from_blasting_small_nickel_dust",
    "oritech:nickel_nugget_from_smelting_small_nickel_dust", "oritech:nickelblock", "oritech:nickelblockinv",
    "oritech:particle/platinum_dust", "oritech:platinum_ingot_from_blasting_platinum_dust",
    "oritech:platinum_ingot_from_blasting_platinum_gem", "oritech:platinum_ingot_from_blasting_raw_platinum",
    "oritech:platinum_ingot_from_smelting_platinum_dust", "oritech:platinum_ingot_from_smelting_platinum_gem",
    "oritech:platinum_ingot_from_smelting_raw_platinum", "oritech:platinum_nugget",
    "oritech:platinum_nugget_from_blasting_small_platinum_dust",
    "oritech:platinum_nugget_from_smelting_small_platinum_dust", "oritech:platinumblock",
    "oritech:platinumblockinv", "oritech:pulverizer/dust/copper", "oritech:pulverizer/dust/gold",
    "oritech:pulverizer/dust/iron", "oritech:pulverizer/dust/nickel", "oritech:pulverizer/dust/platinum",
    "oritech:pulverizer/electrum", "oritech:pulverizer/ore/nickel", "oritech:pulverizer/ore/platinum",
    "oritech:pulverizer/raw/copper", "oritech:pulverizer/raw/gold", "oritech:pulverizer/raw/iron",
    "oritech:pulverizer/raw/nickel", "oritech:pulverizer/raw/platinum", "oritech:pulverizer/recycle/copper_dust",
    "oritech:pulverizer/recycle/gold_dust", "oritech:pulverizer/recycle/iron_dust", "oritech:pulverizer/steel",
    "oritech:pulverizer/uranium", "oritech:pulverizer/uraniumcrystal", "oritech:pulverizer/uraniumore",
    "oritech:raw_nickel_blockblock", "oritech:raw_nickel_blockblockinv", "oritech:raw_platinum_blockblock",
    "oritech:raw_platinum_blockblockinv", "oritech:raw_uranium_blockblock", "oritech:raw_uranium_blockblockinv",
    "oritech:steel_ingot_from_blasting_steel_dust", "oritech:steel_ingot_from_smelting_steel_dust",
    "oritech:steelblock", "oritech:steelblockinv", "oritech:uranium_dustblock", "oritech:uraniumblockinv",
    "productivemetalworks:casting/gems/peridot", "productivemetalworks:casting/gems/ruby",
    "productivemetalworks:casting/gems/sapphire", "productivemetalworks:casting/storage_blocks/peridot",
    "productivemetalworks:casting/storage_blocks/ruby", "productivemetalworks:casting/storage_blocks/sapphire",
    "railcraft:blast_furnace/blasting_bucket", "railcraft:blast_furnace/blasting_iron_axe",
    "railcraft:blast_furnace/blasting_iron_boots", "railcraft:blast_furnace/blasting_iron_chestplate",
    "railcraft:blast_furnace/blasting_iron_crowbar", "railcraft:blast_furnace/blasting_iron_door",
    "railcraft:blast_furnace/blasting_iron_helmet", "railcraft:blast_furnace/blasting_iron_hoe",
    "railcraft:blast_furnace/blasting_iron_horse_armor", "railcraft:blast_furnace/blasting_iron_ingot",
    "railcraft:blast_furnace/blasting_iron_leggings", "railcraft:blast_furnace/blasting_iron_pickaxe",
    "railcraft:blast_furnace/blasting_iron_shovel", "railcraft:blast_furnace/blasting_iron_sword",
    "railcraft:blast_furnace/blasting_iron_trapdoor", "railcraft:blast_furnace/blasting_shears",
    "railcraft:blast_furnace/blasting_steel_axe", "railcraft:blast_furnace/blasting_steel_block",
    "railcraft:blast_furnace/blasting_steel_boots", "railcraft:blast_furnace/blasting_steel_chestplate",
    "railcraft:blast_furnace/blasting_steel_helmet", "railcraft:blast_furnace/blasting_steel_hoe",
    "railcraft:blast_furnace/blasting_steel_leggings", "railcraft:blast_furnace/blasting_steel_pickaxe",
    "railcraft:blast_furnace/blasting_steel_shears", "railcraft:blast_furnace/blasting_steel_sword",
    "railcraft:brass_block_from_brass_ingot", "railcraft:brass_ingot", "railcraft:brass_ingot_from_brass_nugget",
    "railcraft:brass_nugget", "railcraft:bronze_block_from_bronze_ingot", "railcraft:bronze_ingot",
    "railcraft:bronze_ingot_from_bronze_nugget", "railcraft:bronze_nugget",
    "railcraft:crusher/crushing_blaze_rod", "railcraft:crusher/crushing_tags_ores_coal",
    "railcraft:crusher/crushing_tags_ores_lapis", "railcraft:crusher/crushing_tags_ores_quartz",
    "railcraft:crusher/crushing_tags_ores_sulfur", "railcraft:invar_block_from_invar_ingot",
    "railcraft:invar_ingot", "railcraft:invar_ingot_from_invar_nugget", "railcraft:invar_nugget",
    "railcraft:lead_block_from_lead_ingot", "railcraft:lead_ingot", "railcraft:lead_ingot_from_lead_nugget",
    "railcraft:lead_nugget", "railcraft:nickel_block_from_nickel_ingot", "railcraft:nickel_ingot",
    "railcraft:nickel_ingot_from_nickel_nugget", "railcraft:nickel_nugget", "railcraft:rolling/brass_plate",
    "railcraft:rolling/bronze_plate", "railcraft:rolling/copper_plate", "railcraft:rolling/gold_plate",
    "railcraft:rolling/invar_plate", "railcraft:rolling/iron_plate", "railcraft:rolling/lead_plate",
    "railcraft:rolling/nickel_plate", "railcraft:rolling/silver_plate", "railcraft:rolling/steel_plate",
    "railcraft:rolling/tin_plate", "railcraft:rolling/zinc_plate", "railcraft:silver_block_from_silver_ingot",
    "railcraft:silver_ingot", "railcraft:silver_ingot_from_silver_nugget", "railcraft:silver_nugget",
    "railcraft:steel_block_from_steel_ingot", "railcraft:steel_ingot", "railcraft:steel_ingot_from_steel_nugget",
    "railcraft:steel_nugget", "railcraft:tin_block_from_tin_ingot", "railcraft:tin_ingot",
    "railcraft:tin_ingot_from_tin_nugget", "railcraft:tin_nugget", "railcraft:zinc_block_from_zinc_ingot",
    "railcraft:zinc_ingot", "railcraft:zinc_ingot_from_zinc_nugget", "railcraft:zinc_nugget",
    "silentgear:iron_rod",
    "silentgems:blasting/peridot", "silentgems:blasting/ruby", "silentgems:blasting/sapphire",
    "silentgems:blasting/silver_ingot", "silentgems:peridot_block", "silentgems:peridot_from_block",
    "silentgems:ruby_block", "silentgems:ruby_from_block", "silentgems:sapphire_block",
    "silentgems:sapphire_from_block", "silentgems:silver_block", "silentgems:silver_ingot_from_block",
    "silentgems:silver_ingot_from_nugget", "silentgems:silver_nugget", "silentgems:silver_rod",
    "silentgems:smelting/peridot", "silentgems:smelting/ruby", "silentgems:smelting/sapphire",
    "silentgems:smelting/silver_ingot",
    "thaumaturge:crucible/ingot_brass", "thaumaturge:ingot_brass_from_block", "thaumaturge:metal_brass",
    "thaumaturge:nugget_brass", "thaumaturge:nugget_brass_from_nuggets",
    "allthecompressed:compress/silicon_block_1x", "enderio:sag_milling/clay", "enderio:sag_milling/redstone_ore",
    "enderio:sag_milling/sand", "energizedpower:blasting/silicon_from_blasting_nether_quartz",
    "energizedpower:smelting/silicon_from_smelting_nether_quartz", "energizedpower:crafting/silicon_from_silicon_block",
    "oritech:silicon_blockblockinv", "extendedae:silicon_compress",
    "extendedae:silicon_decompress", "extradisks:raw_withering_processor", "oritech:refinery/siliconwashing",
    "oritech:silicon_from_smelting_raw_silicon", "productivebees:centrifuge/materials/honeycomb_silicon",
    "refinedstorage:silicon", "stellaris:silicon_from_blending", "stellaris:silicon_from_moon_stone_dust",
    "neovitae:materials/blasting_topaz_dust", "neovitae:materials/smelting_topaz_dust",
    "productivemetalworks:casting/gems/topaz", "productivemetalworks:casting/storage_blocks/topaz",
    "silentgems:blasting/topaz", "silentgems:smelting/topaz", "silentgems:topaz_block", "silentgems:topaz_from_block"
  ]

  allthemods.remove([id: "energizedpower:crafting/silicon_block"])
  allthemods.remove([id: "oritech:silicon_blockblock"])

  if ($Platform.isLoaded("mysticalagriculture")) {
    allthemods.shaped("8x ae2:silicon", ["EEE"], [E: "mysticalagriculture:silicon_essence"])
        .id("mysticalagriculture:essence/common/silicon")
  }

  allthemods.forEachRecipe(ids.collect { [id: it] }, (recipe) -> {
    def json = recipe.json
    boolean changed = outputs(json)
    changed |= inputs(json)
    if (changed) {
      recipe.merge(json)
    }
  })
})
