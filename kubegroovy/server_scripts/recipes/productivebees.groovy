/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires productivebees
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.shaped("productivelib:upgrade_productivity_4", ["UHU", "NBN", "UHU"], [
      U: "productivelib:upgrade_productivity_3",
      B: "productivelib:upgrade_block",
      H: "minecraft:heart_of_the_sea",
      N: "#c:nuggets/unobtainium"
  ]).id("productivelib:upgrades/productivity_4")

  if ($Platform.isLoaded("the_bumblezone")) {
    allthemods.remove([id: "productivebees:honey_bucket"])
    allthemods.remove([id: "productivebees:honey_bucket_from_block"])
  }
})
