/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagriculture
package server_scripts.tags.mysticalagriculture

def seedID = [
    "mysticalagriculture:allthemodium_seeds",
    "mysticalagriculture:darkstone_seeds",
    "mysticalagriculture:kivi_seeds",
    "mysticalagriculture:unexplored_wood_seeds",
    "mysticalagriculture:unobtainium_seeds",
    "mysticalagriculture:vibranium_seeds",
    "mysticalagriculture:crimson_iron_seeds",
    "mysticalagriculture:azure_silver_seeds",
    "mysticalagriculture:entro_seeds",
    "mysticalagriculture:sky_steel_seeds",
    "mysticalagriculture:xychorium_gem_seeds",
    "mysticalagriculture:black_quartz_seeds"
]

$ServerEvents.tags("item", (allthemods) -> {
  for (def seeds : seedID) {
    allthemods.add("c:seeds", seeds)
    allthemods.add("mysticalagriculture:seeds", seeds)
    allthemods.add("extended_industrialization:farmer_plantable", seeds)
    allthemods.add("ars_nouveau:whirlisprig/denied_drop", seeds)
  }
  allthemods.add("mysticalagriculture:essences", [
      "mysticalagriculture:allthemodium_essence",
      "mysticalagriculture:darkstone_essence",
      "mysticalagriculture:kivi_essence",
      "mysticalagriculture:unexplored_wood_essence",
      "mysticalagriculture:unobtainium_essence",
      "mysticalagriculture:vibranium_essence",
      "mysticalagriculture:crimson_iron_essence",
      "mysticalagriculture:azure_silver_essence",
      "mysticalagriculture:entro_essence",
      "mysticalagriculture:sky_steel_essence",
      "mysticalagriculture:xychorium_gem_essence"
  ])

  allthemods.add("kubegroovy:dragon_scale", [
      "forbidden_arcanus:dragon_scale",
      "mysticalagradditions:dragon_scale"
  ])

  // Not unbreakable
  allthemods.remove("kubegroovy:unbreakable", [
      "mysticalagriculture:awakened_supremium_spear",
      "mysticalagriculture:awakened_supremium_shears",
      "mysticalagriculture:awakened_supremium_fishing_rod",
      "mysticalagriculture:awakened_supremium_sickle",
      "mysticalagriculture:awakened_supremium_scythe",
      "mysticalagriculture:supremium_helmet",
      "mysticalagriculture:supremium_chestplate",
      "mysticalagriculture:supremium_leggings",
      "mysticalagriculture:supremium_boots",
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
      "mysticalagriculture:awakened_supremium_boots"
  ])
})

$ServerEvents.tags("block", (allthemods) -> {
  for (def seeds : seedID) {
    allthemods.add("cucumber:mineable/sickle", seeds.replace("seeds", "crop"))
    allthemods.add("silentgear:mineable/sickle", seeds.replace("seeds", "crop"))
    allthemods.add("minecraft:crops", seeds.replace("seeds", "crop"))
    allthemods.add("computercraft:turtle_hoe_harvestable", seeds.replace("seeds", "crop"))
    allthemods.add("the_bumblezone:essence/life/grow_plants", seeds.replace("seeds", "crop"))
    allthemods.add("minecraft:bee_growables", seeds.replace("seeds", "crop"))
    allthemods.add("mysticalagriculture:crops", seeds.replace("seeds", "crop"))
    allthemods.add("pneumaticcraft:crop_support_growable", seeds.replace("seeds", "crop"))
    allthemods.add("ae2:growth_acceleratable", seeds.replace("seeds", "crop"))
    allthemods.add("minecraft:sword_efficient", seeds.replace("seeds", "crop"))
  }
})
