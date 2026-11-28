/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires croptopia
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.remove([id: "croptopia:knife"])
  allthemods.shaped(
      $Item.of('croptopia:knife'),
      [
          ' I ',
          ' I ',
          'S  '
      ],
      [
          S: '#c:rods/wooden',
          I: '#c:ingots/iron',
      ]
  ).id("croptopia:knife")

  allthemods.replaceInput([id: "croptopia:cooking_oil"], "#croptopia:converts_to_cooking_oil",
      $Ingredient.of("#croptopia:converts_to_cooking_oil").except("#c:olives"))

  if ($Platform.isLoaded("productivetrees")) {
    def ptNuts = ["almond", "beechnut", "brazil_nut", "butternut", "candlenut", "cashew", "chestnut",
                  "ginkgo_nut", "hazelnut", "pecan", "pistachio", "walnut"]
    def ptItems = ptNuts.collect { "productivetrees:${it}".toString() } +
        (ptNuts + "coffee_bean").collect { "productivetrees:roasted_${it}".toString() }
    allthemods.replaceInput([[id: "croptopia:roasted_nuts_from_smelting"], [id: "croptopia:roasted_nuts_from_smoking"]], "#c:nuts",
        $Ingredient.of("#c:nuts").except($Ingredient.of(ptItems)))
  }
})
