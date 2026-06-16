// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.

ServerEvents.recipes((allthemods) => {
  if (Item.exists("kubejs:silent_allthemodium_plate")) {
    allthemods.smithing(
      Item.of("kubejs:silent_allthemodium_plate"),
	  "allthemodium:allthemodium_upgrade_smithing_template",
      "#c:plates/allthemodium",
      "#c:ingots/netherite"
    )
  }
  if (Item.exists("kubejs:silent_vibranium_plate")) {
    allthemods.smithing(
      Item.of("kubejs:silent_vibranium_plate"),
      "allthemodium:vibranium_upgrade_smithing_template",
      "#c:plates/vibranium",
      "#c:ingots/allthemodium"
    )
  }
  if (Item.exists("kubejs:silent_unobtainium_plate")) {
    allthemods.smithing(
      Item.of("kubejs:silent_unobtainium_plate"),
      "allthemodium:unobtainium_upgrade_smithing_template",
      "#c:plates/unobtainium",
      "#c:ingots/vibranium"
    )
  }
})

// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
