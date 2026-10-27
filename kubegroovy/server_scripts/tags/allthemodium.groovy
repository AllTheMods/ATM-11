/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires allthemodium
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  // allthemodium
  allthemods.add("allthemodium:ancient_logs", [
      "allthemodium:ancient_log_0",
      "allthemodium:ancient_log_1",
      "allthemodium:ancient_log_2",
      "allthemodium:stripped_ancient_log"
  ])
  allthemods.add("allthemodium:soul_logs", [
      "allthemodium:soul_log",
      "allthemodium:soul_log_0",
      "allthemodium:soul_log_1",
      "allthemodium:soul_log_2",
      "allthemodium:stripped_soul_log"
  ])
  allthemods.add("allthemodium:demonic_logs", ["allthemodium:demonic_log", "allthemodium:stripped_demonic_log"])

  // Not unbreakable
  allthemods.remove("kubegroovy:unbreakable", [
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
      "allthemodium:vibranium_shield",
      "allthemodium:unobtainium_crossbow",
      "allthemodium:alloy_trident"
  ])
})

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("c:bosses", "allthemodium:piglich")
})
