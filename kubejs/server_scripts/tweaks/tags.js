// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.

ServerEvents.tags("block", (allthemods) => {
  // Waystones
  allthemods.add("ftbchunks:interact_whitelist", ["@waystones"])

  // Extreme Reactors
  allthemods.add("c:storage_blocks/yellorium", "alltheores:uranium_block")

  // Essence Blocks
  // allthemods.add('c:storage_blocks/air_essence', 'kubejs:air_essence_block')
  // allthemods.add('c:storage_blocks/earth_essence', 'kubejs:earth_essence_block')
  // allthemods.add('c:storage_blocks/fire_essence', 'kubejs:fire_essence_block')
  // allthemods.add('c:storage_blocks/water_essence', 'kubejs:water_essence_block')
  // allthemods.add('c:storage_blocks', [
  //   '#c:storage_blocks/air_essence',
  //   '#c:storage_blocks/earth_essence',
  //   '#c:storage_blocks/fire_essence',
  //   '#c:storage_blocks/water_essence'
  // ])

  // Entangled
  allthemods.add("entangled:invalid_targets", [
    "@ae2",
    "@advancedae",
    "@extendedae",
    "@megacells",
    "@appflux",
    "@appmek"
  ])

  // Just Dire Things
  // allthemods.add('justdirethings:lawnmowerable', '#c:grass')
  allthemods.add("justdirethings:tick_speed_deny", "@industrialforegoingsouls")
  // Saltpeter Block
  // allthemods.add("c:storage_blocks/niter", "kubejs:saltpeter_block")
  allthemods.add("c:storage_blocks/saltpeter", "kubejs:saltpeter_block")
  allthemods.add("c:storage_blocks/niter", "#c:storage_blocks/saltpeter")
  allthemods.add("c:storage_blocks", "#c:storage_blocks/niter")
  // Crystalline Infusion Altar Materials
  allthemods.add("occultism:pentacle_materials", [
	"occultism:sacrificial_bowl",
	"occultism:otherstone_pedestal",
	"neovitae:air_ritual_stone",
	"neovitae:dusk_ritual_stone",
	"neovitae:fire_ritual_stone",
	"neovitae:water_ritual_stone",
	"neovitae:master_ritual_stone",
	"minecraft:soul_lantern",
	"ae2:controller",
    "ae2:smooth_sky_stone_block",
    "ae2:sky_stone_block",
    "ae2:sky_stone_small_brick",
    "ae2:quartz_vibrant_glass",
    "occultism:otherstone_pedestal",
    "ae2:not_so_mysterious_cube",
    "ae2:dense_energy_cell",
  ])
})

ServerEvents.tags("fluid", (allthemods) => {
  // Pneumaticcraft
  allthemods.add("c:ethanol", "pneumaticcraft:ethanol")
  allthemods.add("c:experience", "create_enchantment_industry:experience")
})

ServerEvents.tags("item", (allthemods) => {
//Occultism Unbreakable Ritual

    allthemods.add("atm:unbreakable", [
        "energizedpower:gear_press_mold",
        "energizedpower:hardened_gear_press_mold",
        "energizedpower:advanced_gear_press_mold",
        "energizedpower:elite_gear_press_mold",
        "energizedpower:rod_press_mold",
        "energizedpower:hardened_rod_press_mold",
        "energizedpower:advanced_rod_press_mold",
        "energizedpower:elite_rod_press_mold",
        "energizedpower:wire_press_mold",
        "energizedpower:hardened_wire_press_mold",
        "energizedpower:advanced_wire_press_mold",
        "energizedpower:elite_wire_press_mold",
    ]);
	
    allthemods.remove("atm:unbreakable", [
        "allthemodium:unobtainium_shovel",
        "allthemodium:unobtainium_hoe",
        "allthemodium:unobtainium_mace",
        "allthemodium:alloy_sword",
        "allthemodium:alloy_axe",
        "allthemodium:alloy_shovel",
        "allthemodium:alloy_paxel",
        "allthemodium:alloy_mace",
        "allthemodium:allthemodium_bow",
        "allthemodium:allthemodium_helmet",
        "allthemodium:allthemodium_chestplate",
        "allthemodium:allthemodium_leggings",
        "allthemodium:allthemodium_boots",
        "allthemodium:vibranium_helmet",
        "allthemodium:vibranium_chestplate",
        "allthemodium:vibranium_leggings",
        "allthemodium:vibranium_boots",
        "allthemodium:unobtainium_helmet",
        "allthemodium:unobtainium_chestplate",
        "allthemodium:unobtainium_leggings",
        "allthemodium:unobtainium_boots",
        "allthemodium:allthemodium_sword",
        "allthemodium:allthemodium_pickaxe",
        "allthemodium:allthemodium_axe",
        "allthemodium:allthemodium_shovel",
        "allthemodium:allthemodium_hoe",
        "allthemodium:allthemodium_mace",
        "allthemodium:vibranium_sword",
        "allthemodium:vibranium_pickaxe",
        "allthemodium:vibranium_axe",
        "allthemodium:vibranium_shovel",
        "allthemodium:vibranium_hoe",
        "allthemodium:vibranium_mace",
        "allthemodium:unobtainium_sword",
        "allthemodium:unobtainium_pickaxe",
        "allthemodium:unobtainium_axe",
        "mysticalagriculture:awakened_supremium_spear",
        "mysticalagriculture:awakened_supremium_shears",
        "mysticalagriculture:awakened_supremium_fishing_rod",
        "mysticalagriculture:awakened_supremium_sickle",
        "mysticalagriculture:awakened_supremium_scythe",
        "mysticalagriculture:supremium_helmet",
        "mysticalagriculture:supremium_chestplate",
        "mysticalagriculture:supremium_leggings",
        "mysticalagriculture:supremium_boots",
        "allthemodium:vibranium_shield",
        "allthemodium:unobtainium_crossbow",
        "allthemodium:alloy_trident",
        "ae2:annihilation_plane",
        "mysticalagradditions:supremium_paxel",
        "mysticalagradditions:awakened_supremium_paxel",
        "kubejs:allthemodium_mesh",
        "mysticalagriculture:supremium_sword",
        "mysticalagriculture:supremium_pickaxe",
        "mysticalagriculture:supremium_shovel",
        "mysticalagriculture:supremium_axe",
        "mysticalagriculture:supremium_hoe",
        "mysticalagriculture:supremium_bow",
        "mysticalagriculture:supremium_crossbow",
        "mysticalagriculture:supremium_spear",
        "mysticalagriculture:supremium_shears",
        "mysticalagriculture:supremium_fishing_rod",
        "mysticalagriculture:supremium_sickle",
        "mysticalagriculture:supremium_scythe",
        "mysticalagriculture:awakened_supremium_sword",
        "mysticalagriculture:awakened_supremium_pickaxe",
        "mysticalagriculture:awakened_supremium_shovel",
        "mysticalagriculture:awakened_supremium_axe",
        "mysticalagriculture:awakened_supremium_hoe",
        "mysticalagriculture:awakened_supremium_bow",
        "mysticalagriculture:awakened_supremium_crossbow",
        "mysticalagriculture:awakened_supremium_helmet",
        "mysticalagriculture:awakened_supremium_chestplate",
        "mysticalagriculture:awakened_supremium_leggings",
        "mysticalagriculture:awakened_supremium_boots",
    ]);
	
  // Extreme Reactors (using config/almostunified/tags.json)
  // allthemods.add('c:ingots/yellorium', 'alltheores:uranium_ingot')
  allthemods.add("c:storage_blocks/raw_yellorium", "bigreactors:raw_yellorium_block")
  allthemods.add("c:storage_blocks/saltpeter", "kubejs:saltpeter_block")
  allthemods.add("c:storage_blocks/niter", "#c:storage_blocks/saltpeter")
  allthemods.add("c:storage_blocks", "#c:storage_blocks/niter")

  // Tiny Coal
  allthemods.add("atm10:tiny_coals", ["utilitarian:tiny_coal", "actuallyadditions:tiny_coal"])
  allthemods.add("atm10:tiny_charcoals", ["utilitarian:tiny_charcoal", "actuallyadditions:tiny_charcoal"])

  // Allthemodium Alloy Dusts
  allthemods.add("c:dusts/unobtainium_allthemodium_alloy", "allthemodium:unobtainium_allthemodium_alloy_dust")
  allthemods.add("c:dusts/unobtainium_vibranium_alloy", "allthemodium:unobtainium_vibranium_alloy_dust")
  allthemods.add("c:dusts/vibranium_allthemodium_alloy", "allthemodium:vibranium_allthemodium_alloy_dust")
  allthemods.add("c:dusts", [
    "#c:dusts/unobtainium_allthemodium_alloy",
    "#c:dusts/unobtainium_vibranium_alloy",
    "#c:dusts/vibranium_allthemodium_alloy"
  ])

  // allthemods.add('c:storage_blocks', '#c:storage_blocks/raw_crimson_iron')
  // allthemods.add('c:storage_blocks', '#c:storage_blocks/raw_azure_silver')

  // Essence Blocks
  if (Item.exists("kubejs:air_essence_block")) {
    allthemods.add("c:storage_blocks/air_essence", "kubejs:air_essence_block")
    allthemods.add("c:storage_blocks", ["#c:storage_blocks/air_essence"])
  }
  if (Item.exists("kubejs:earth_essence_block")) {
    allthemods.add("c:storage_blocks/earth_essence", "kubejs:earth_essence_block")
    allthemods.add("c:storage_blocks", ["#c:storage_blocks/earth_essence"])
  }
  if (Item.exists("kubejs:fire_essence_block")) {
    allthemods.add("c:storage_blocks/fire_essence", "kubejs:fire_essence_block")
    allthemods.add("c:storage_blocks", ["#c:storage_blocks/fire_essence"])
  }
  if (Item.exists("kubejs:water_essence_block")) {
    allthemods.add("c:storage_blocks/water_essence", "kubejs:water_essence_block")
    allthemods.add("c:storage_blocks", ["#c:storage_blocks/water_essence"])
  }

  // Bibliocraft compat
  // Ars Elemental Books
  allthemods.add("minecraft:bookshelf_books", "ars_elemental:air_caster_tome")
  allthemods.add("minecraft:bookshelf_books", "ars_elemental:fire_caster_tome")
  allthemods.add("minecraft:bookshelf_books", "ars_elemental:water_caster_tome")
  allthemods.add("minecraft:bookshelf_books", "ars_elemental:earth_caster_tome")
  allthemods.add("minecraft:bookshelf_books", "ars_elemental:anima_caster_tome")
  allthemods.add("minecraft:bookshelf_books", "ars_elemental:manipulation_caster_tome")

  // More books
  allthemods.add("minecraft:bookshelf_books", "patchouli:guide_book")
  allthemods.add("minecraft:bookshelf_books", "evilcraft:origins_of_darkness")
  allthemods.add("minecraft:bookshelf_books", "ae2:guide")
  allthemods.add("minecraft:bookshelf_books", "powah:book")
  allthemods.add("minecraft:bookshelf_books", "actuallyadditions:booklet")

  // Forbiden Arcanus Stellar Blacklist
  allthemods.add("forbidden_arcanus:modifier/eternal_incompatible", [
    "ars_additions:undying_charm",
    "modularbees:electrode_copper",
    "modularbees:electrode_iron",
    "modularbees:electrode_gold",
    "modularbees:electrode_netherite",
    "modern_industrialization:forge_hammer",
    "modern_industrialization:iron_hammer",
    "modern_industrialization:steel_hammer",
    "modern_industrialization:netherite_hammer",
    "modern_industrialization:diamond_hammer"
  ])

  // Overdrive
  allthemods.add("industrialization_overdrive:multi_processing_array_blacklist", [
    "modern_industrialization:auto_forge",
    "modern_industrialization:star_altar",
    "modern_industrialization:runic_crucible",
    "modern_industrialization:runic_enchanter"
  ])

  // Trial Vault Repeatability for Decrepit Keys
  allthemods.add("repeatable_trial_vaults:can_reset_trial_vaults", "irons_spellbooks:decrepit_key")
  
  // Crystalline Infusion Altar Materials
  allthemods.add("occultism:pentacle_materials", [
    "occultism:sacrificial_bowl",
    "occultism:otherstone_pedestal",
    "neovitae:air_ritual_stone",
    "neovitae:dusk_ritual_stone",
    "neovitae:fire_ritual_stone",
    "neovitae:water_ritual_stone",
    "neovitae:master_ritual_stone",
    "minecraft:soul_lantern",
    "ae2:controller",
    "ae2:smooth_sky_stone_block",
    "ae2:sky_stone_block",
    "ae2:sky_stone_small_brick",
    "ae2:quartz_vibrant_glass",
    "occultism:otherstone_pedestal",
    "ae2:not_so_mysterious_cube",
    "ae2:dense_energy_cell",
  ])
})

ServerEvents.tags("entity_type", (allthemods) => {
  allthemods.add("c:bosses", [
    "allthemodium:piglich",
    "cataclysm:amethyst_crab",
    "cataclysm:ancient_remnant",
    "cataclysm:coralssus",
    "cataclysm:ender_golem",
    "cataclysm:ender_guardian",
    "cataclysm:ignis",
    "cataclysm:ignited_revenant",
    "cataclysm:kobolediator",
    "cataclysm:maledictus",
    "cataclysm:modern_remnant",
    "cataclysm:netherite_monstrosity",
    "cataclysm:the_baby_leviathan",
    "cataclysm:the_harbinger",
    "cataclysm:the_leviathan",
    "cataclysm:the_prowler",
    "cataclysm:wadjet"
  ])

  if (Platform.isLoaded("eternal_starlight")) {
    allthemods.add("c:bosses", ["eternal_starlight:starlight_golem", "eternal_starlight:the_gatekeeper"])
  }

  allthemods.add("allthemods:jank_blacklist", [
    "@iceandfire",
    "ars_nouveau:animated_block",
    "artifacts:mimic",
    "create:package",
    "mekanism:robit",
    "twilightforest:hedge_spider",
    "twilightforest:swarm_spider",
    "#c:bosses",
    "@occultism",
    "@productivebees",
    "forbidden_arcanus:corrupt_lost_soul",
    "forbidden_arcanus:lost_soul",
    "forbidden_arcanus:enchanted_lost_soul",
    "evilcraft:vengeance_spirit",
    "the_bumblezone:bee_queen"
  ])

  allthemods.add("ars_nouveau:jar_blacklist", "the_bumblezone:bee_queen")
  allthemods.add("apothic_spawners:blacklisted_from_spawners", "#allthemods:jank_blacklist")
  allthemods.add("enderio:soul_vial_blacklist", "#allthemods:jank_blacklist")
  allthemods.add("industrialforegoing:mob_duplicator_blacklist", "#allthemods:jank_blacklist")
  allthemods.add("industrialforegoing:mob_crusher_blacklist", "#allthemods:jank_blacklist")
  allthemods.add("justdirethings:paradox_deny", "#allthemods:jank_blacklist")
  allthemods.add("tombstone:unhandled_tamable", "#allthemods:jank_blacklist")
  allthemods.add("mob_grinding_utils:no_swab", "#allthemods:jank_blacklist")
  allthemods.add("mob_grinding_utils:no_spawn", "#allthemods:jank_blacklist")
  allthemods.add("enderio:spawner_blacklist", "#allthemods:jank_blacklist")
  allthemods.add("ars_additions:source_spawner_denylist", "#allthemods:jank_blacklist")
  allthemods.add("oritech:spawner_blacklist", "#allthemods:jank_blacklist")
})

ServerEvents.tags("worldgen/structure", (allthemods) => {
  // Cataclysm
  allthemods.add("cataclysm:berserker_spawn", "betterfortresses:fortress")
})

ServerEvents.tags("enchantment", (allthemods) => {
  // Apoth Enchanting
  allthemods.remove("minecraft:non_treasure", "apothic_enchanting:miners_fervor")
})

ServerEvents.tags("block_entity_type", (allthemods) => {
  // Apoth Enchanting
  allthemods.remove("packingtape:blacklist/problematic", [
    "extrastorage:block_16384k_fluid",
    "extrastorage:block_65536k_fluid",
    "extrastorage:block_262144k_fluid",
    "extrastorage:block_1048576k_fluid"
  ])
})

ServerEvents.tags("item", (allthemods) => {
  // Fix dyenamicandfriends

  allthemods.remove("c:crops/pumpkin", [
    "dyenamicsandfriends:chromacarvings_cherenkov_pumpkin",
    "dyenamicsandfriends:chromacarvings_navy_pumpkin",
    "dyenamicsandfriends:chromacarvings_rose_pumpkin",
    "dyenamicsandfriends:chromacarvings_amber_pumpkin",
    "dyenamicsandfriends:chromacarvings_persimmon_pumpkin",
    "dyenamicsandfriends:chromacarvings_conifer_pumpkin",
    "dyenamicsandfriends:chromacarvings_maroon_pumpkin",
    "dyenamicsandfriends:chromacarvings_bubblegum_pumpkin",
    "dyenamicsandfriends:chromacarvings_ultramarine_pumpkin",
    "dyenamicsandfriends:chromacarvings_fluorescent_pumpkin",
    "dyenamicsandfriends:chromacarvings_peach_pumpkin",
    "dyenamicsandfriends:chromacarvings_mint_pumpkin",
    "dyenamicsandfriends:chromacarvings_lavender_pumpkin",
    "dyenamicsandfriends:chromacarvings_honey_pumpkin",
    "dyenamicsandfriends:chromacarvings_aquamarine_pumpkin",
    "dyenamicsandfriends:chromacarvings_spring_green_pumpkin",
    "dyenamicsandfriends:chromacarvings_icy_blue_pumpkin",
    "dyenamicsandfriends:chromacarvings_wine_pumpkin"
  ])

  allthemods.remove("c:pumpkins/carved", [
    "dyenamicsandfriends:chromacarvings_cherenkov_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_navy_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_rose_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_amber_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_persimmon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_conifer_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_maroon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_bubblegum_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_ultramarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_fluorescent_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_peach_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_mint_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_lavender_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_honey_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_aquamarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_spring_green_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_icy_blue_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_wine_carved_pumpkin"
  ])

  allthemods.remove("c:pumpkins/jack_o_lanterns", [
    "dyenamicsandfriends:chromacarvings_cherenkov_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_navy_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_rose_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_amber_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_persimmon_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_conifer_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_maroon_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_bubblegum_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_ultramarine_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_fluorescent_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_peach_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_mint_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_lavender_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_honey_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_aquamarine_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_spring_green_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_icy_blue_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_wine_jack_o_lantern"
  ])

  allthemods.remove("c:pumpkins", [
    "dyenamicsandfriends:chromacarvings_cherenkov_pumpkin",
    "dyenamicsandfriends:chromacarvings_navy_pumpkin",
    "dyenamicsandfriends:chromacarvings_rose_pumpkin",
    "dyenamicsandfriends:chromacarvings_amber_pumpkin",
    "dyenamicsandfriends:chromacarvings_persimmon_pumpkin",
    "dyenamicsandfriends:chromacarvings_conifer_pumpkin",
    "dyenamicsandfriends:chromacarvings_maroon_pumpkin",
    "dyenamicsandfriends:chromacarvings_bubblegum_pumpkin",
    "dyenamicsandfriends:chromacarvings_ultramarine_pumpkin",
    "dyenamicsandfriends:chromacarvings_fluorescent_pumpkin",
    "dyenamicsandfriends:chromacarvings_peach_pumpkin",
    "dyenamicsandfriends:chromacarvings_mint_pumpkin",
    "dyenamicsandfriends:chromacarvings_lavender_pumpkin",
    "dyenamicsandfriends:chromacarvings_honey_pumpkin",
    "dyenamicsandfriends:chromacarvings_aquamarine_pumpkin",
    "dyenamicsandfriends:chromacarvings_spring_green_pumpkin",
    "dyenamicsandfriends:chromacarvings_icy_blue_pumpkin",
    "dyenamicsandfriends:chromacarvings_wine_pumpkin"
  ])

  allthemods.remove("minecraft:enchantable/equippable", [
    "dyenamicsandfriends:chromacarvings_cherenkov_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_navy_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_rose_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_amber_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_persimmon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_conifer_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_maroon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_bubblegum_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_ultramarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_fluorescent_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_peach_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_mint_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_lavender_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_honey_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_aquamarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_spring_green_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_icy_blue_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_wine_carved_pumpkin"
  ])

  allthemods.remove("minecraft:enchantable/vanishing", [
    "dyenamicsandfriends:chromacarvings_cherenkov_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_navy_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_rose_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_amber_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_persimmon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_conifer_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_maroon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_bubblegum_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_ultramarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_fluorescent_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_peach_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_mint_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_lavender_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_honey_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_aquamarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_spring_green_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_icy_blue_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_wine_carved_pumpkin"
  ])
})

ServerEvents.tags("block", (allthemods) => {
  // Fix dyenamicandfriends

  allthemods.remove("c:pumpkins", [
    "dyenamicsandfriends:chromacarvings_cherenkov_pumpkin",
    "dyenamicsandfriends:chromacarvings_navy_pumpkin",
    "dyenamicsandfriends:chromacarvings_rose_pumpkin",
    "dyenamicsandfriends:chromacarvings_amber_pumpkin",
    "dyenamicsandfriends:chromacarvings_persimmon_pumpkin",
    "dyenamicsandfriends:chromacarvings_conifer_pumpkin",
    "dyenamicsandfriends:chromacarvings_maroon_pumpkin",
    "dyenamicsandfriends:chromacarvings_bubblegum_pumpkin",
    "dyenamicsandfriends:chromacarvings_ultramarine_pumpkin",
    "dyenamicsandfriends:chromacarvings_fluorescent_pumpkin",
    "dyenamicsandfriends:chromacarvings_peach_pumpkin",
    "dyenamicsandfriends:chromacarvings_mint_pumpkin",
    "dyenamicsandfriends:chromacarvings_lavender_pumpkin",
    "dyenamicsandfriends:chromacarvings_honey_pumpkin",
    "dyenamicsandfriends:chromacarvings_aquamarine_pumpkin",
    "dyenamicsandfriends:chromacarvings_spring_green_pumpkin",
    "dyenamicsandfriends:chromacarvings_icy_blue_pumpkin",
    "dyenamicsandfriends:chromacarvings_wine_pumpkin"
  ])

  allthemods.remove("c:pumpkins/carved", [
    "dyenamicsandfriends:chromacarvings_cherenkov_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_navy_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_rose_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_amber_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_persimmon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_conifer_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_maroon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_bubblegum_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_ultramarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_fluorescent_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_peach_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_mint_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_lavender_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_honey_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_aquamarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_spring_green_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_icy_blue_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_wine_carved_pumpkin"
  ])

  allthemods.remove("c:pumpkins/jack_o_lanterns", [
    "dyenamicsandfriends:chromacarvings_cherenkov_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_navy_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_rose_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_amber_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_persimmon_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_conifer_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_maroon_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_bubblegum_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_ultramarine_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_fluorescent_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_peach_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_mint_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_lavender_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_honey_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_aquamarine_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_spring_green_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_icy_blue_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_wine_jack_o_lantern"
  ])

  allthemods.remove("minecraft:mineable/axe", [
    "dyenamicsandfriends:chromacarvings_cherenkov_pumpkin",
    "dyenamicsandfriends:chromacarvings_navy_pumpkin",
    "dyenamicsandfriends:chromacarvings_rose_pumpkin",
    "dyenamicsandfriends:chromacarvings_amber_pumpkin",
    "dyenamicsandfriends:chromacarvings_persimmon_pumpkin",
    "dyenamicsandfriends:chromacarvings_conifer_pumpkin",
    "dyenamicsandfriends:chromacarvings_maroon_pumpkin",
    "dyenamicsandfriends:chromacarvings_bubblegum_pumpkin",
    "dyenamicsandfriends:chromacarvings_ultramarine_pumpkin",
    "dyenamicsandfriends:chromacarvings_fluorescent_pumpkin",
    "dyenamicsandfriends:chromacarvings_peach_pumpkin",
    "dyenamicsandfriends:chromacarvings_mint_pumpkin",
    "dyenamicsandfriends:chromacarvings_lavender_pumpkin",
    "dyenamicsandfriends:chromacarvings_honey_pumpkin",
    "dyenamicsandfriends:chromacarvings_aquamarine_pumpkin",
    "dyenamicsandfriends:chromacarvings_spring_green_pumpkin",
    "dyenamicsandfriends:chromacarvings_icy_blue_pumpkin",
    "dyenamicsandfriends:chromacarvings_wine_pumpkin",
    "dyenamicsandfriends:chromacarvings_cherenkov_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_navy_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_rose_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_amber_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_persimmon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_conifer_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_maroon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_bubblegum_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_ultramarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_fluorescent_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_peach_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_mint_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_lavender_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_honey_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_aquamarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_spring_green_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_icy_blue_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_wine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_cherenkov_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_navy_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_rose_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_amber_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_persimmon_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_conifer_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_maroon_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_bubblegum_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_ultramarine_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_fluorescent_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_peach_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_mint_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_lavender_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_honey_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_aquamarine_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_spring_green_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_icy_blue_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_wine_jack_o_lantern"
  ])

  allthemods.remove("minecraft:sword_efficient", [
    "dyenamicsandfriends:chromacarvings_cherenkov_pumpkin",
    "dyenamicsandfriends:chromacarvings_navy_pumpkin",
    "dyenamicsandfriends:chromacarvings_rose_pumpkin",
    "dyenamicsandfriends:chromacarvings_amber_pumpkin",
    "dyenamicsandfriends:chromacarvings_persimmon_pumpkin",
    "dyenamicsandfriends:chromacarvings_conifer_pumpkin",
    "dyenamicsandfriends:chromacarvings_maroon_pumpkin",
    "dyenamicsandfriends:chromacarvings_bubblegum_pumpkin",
    "dyenamicsandfriends:chromacarvings_ultramarine_pumpkin",
    "dyenamicsandfriends:chromacarvings_fluorescent_pumpkin",
    "dyenamicsandfriends:chromacarvings_peach_pumpkin",
    "dyenamicsandfriends:chromacarvings_mint_pumpkin",
    "dyenamicsandfriends:chromacarvings_lavender_pumpkin",
    "dyenamicsandfriends:chromacarvings_honey_pumpkin",
    "dyenamicsandfriends:chromacarvings_aquamarine_pumpkin",
    "dyenamicsandfriends:chromacarvings_spring_green_pumpkin",
    "dyenamicsandfriends:chromacarvings_icy_blue_pumpkin",
    "dyenamicsandfriends:chromacarvings_wine_pumpkin",
    "dyenamicsandfriends:chromacarvings_cherenkov_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_navy_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_rose_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_amber_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_persimmon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_conifer_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_maroon_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_bubblegum_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_ultramarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_fluorescent_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_peach_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_mint_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_lavender_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_honey_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_aquamarine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_spring_green_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_icy_blue_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_wine_carved_pumpkin",
    "dyenamicsandfriends:chromacarvings_cherenkov_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_navy_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_rose_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_amber_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_persimmon_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_conifer_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_maroon_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_bubblegum_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_ultramarine_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_fluorescent_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_peach_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_mint_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_lavender_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_honey_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_aquamarine_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_spring_green_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_icy_blue_jack_o_lantern",
    "dyenamicsandfriends:chromacarvings_wine_jack_o_lantern"
  ])
})

ServerEvents.tags("worldgen/biome", (allthemods) => {
  // JustDireThings
  allthemods.add("justdirethings:unstable_portal_fluid_viable", [
    "nullscape:crystal_peaks",
    "nullscape:shadowlands",
    "nullscape:void_barrens"
  ])
})

ServerEvents.tags("mob_effect", (allthemods) => {
  allthemods.add("irons_spellbooks:cleanse_immune", ["cataclysm:ghost_sickness"])
})

// cataclysm:ghost_sickness

// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
