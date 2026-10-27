/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires allthemodium
package client_scripts.tooltips

$ItemEvents.modifyTooltips((allthemods) -> {
  // AllTheModium

  allthemods.add(
      ["allthemodium:allthemodium_ore", "allthemodium:deepslate_allthemodium_ore"],
      [
          $Text.of("§7Needs at least Netherite to be mined"),
          $Text.of("§6Found in the Deep Dark Biome and will always spawn air exposed"),
          $Text.of("§6Also found in the Deep Slate Layer of Mining Dimension")
      ]
  )
  allthemods.add(
      ["allthemodium:vibranium_ore", "allthemodium:other_vibranium_ore"],
      [
          $Text.of("§7Needs at least AllTheModium to be mined"),
          $Text.of("§bFound in any Nether biome"),
          $Text.of("§bAlso found in The Other")
      ]
  )
  allthemods.add("allthemodium:unobtainium_ore", [
      $Text.of("§7Needs at least Vibranium to be mined"),
      $Text.of("§dFound in the End Highlands")
  ])

  allthemods.add("kubegroovy:silent_allthemodium_plate", [$Text.of("§7§oIt's less... talkative now")])
  allthemods.add("kubegroovy:silent_vibranium_plate", [$Text.of("§7§oIt's less... talkative now")])
  allthemods.add("kubegroovy:silent_unobtainium_plate", [$Text.of("§7§oIt's less... talkative now")])

  allthemods.add("allthemodium:allthemodium_ingot", [
      $Text.of("§7§oSilent Gear users, these aren\'t the ingots you are looking for"),
      $Text.of("§6Look for the [Silent Allthemodium Plate]")
  ])
  allthemods.add("allthemodium:vibranium_ingot", [
      $Text.of("§7§oSilent Gear users, these aren\'t the ingots you are looking for"),
      $Text.of("§6Look for the [Silent Vibranium Plate]")
  ])
  allthemods.add("allthemodium:unobtainium_ingot", [
      $Text.of("§7§oSilent Gear users, these aren\'t the ingots you are looking for"),
      $Text.of("§6Look for the [Silent Unobtainium Plate]")
  ])

  allthemods.add("allthemodium:allthemodium_upgrade_smithing_template", [
      $Text.of("§6Found in Suspicious Clay in Ancient Cities")
  ])
  allthemods.add("allthemodium:vibranium_upgrade_smithing_template", [
      $Text.of("§bFound in Suspicious Soul Sand in Bastions")
  ])
  allthemods.add("allthemodium:unobtainium_upgrade_smithing_template", [
      $Text.of("§dDropped by the Trial Spawner in the Library of the Dungeon within The Other")
  ])
})
