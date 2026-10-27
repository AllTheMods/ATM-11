/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires theurgy
package server_scripts.recipes.theurgy

import net.minecraft.world.item.crafting.Ingredient

$ServerEvents.recipes((event) -> {
  def incubation = { String output, sulfur ->
    event.recipes.theurgyIncubation([
        type : "theurgy:item",
        count: 1,
        id   : output
    ],
        "theurgy:mercury_shard",
        "theurgy:alchemical_salt_mineral",
        sulfur as Ingredient,
        100
    ).id("theurgy:kgy/incubation/" + output.replace(':', '_'))
//      def json = [
//          type    : "theurgy:incubation",
//          category: "misc",
//          mercury : "theurgy:mercury_shard",
//          result  : [
//              type : "theurgy:item",
//              count: 1,
//              id   : output
//          ],
//          salt    : "theurgy:alchemical_salt_mineral",
//          sulfur  : sulfur,
//          time    : 100
//      ]
//      event.custom(json)
  }

  if ($Platform.isLoaded("forbidden_arcanus")) {
    incubation("forbidden_arcanus:arcane_crystal", "kubegroovy:arcane_sulfur")
    incubation("forbidden_arcanus:rune", "kubegroovy:runic_sulfur")
    incubation("forbidden_arcanus:stellarite_piece", "kubegroovy:stellarite_sulfur")
  }

  if ($Platform.isLoaded("silentgear")) {
    incubation("silentgear:bort", "kubegroovy:bort_sulfur")
  }

  if ($Platform.isLoaded("occultism")) {
    incubation("occultism:iesnium_ingot", "kubegroovy:iesnium_sulfur")
  }

  if ($Platform.isLoaded("irons_spellbooks")) {
    incubation("irons_spellbooks:mithril_ingot", "kubegroovy:mithril_sulfur")
  }

  if ($Platform.isLoaded("mysticalagriculture")) {
    incubation("mysticalagriculture:prosperity_shard", "kubegroovy:prosperity_sulfur")
  }

  incubation("alltheores:salt_dust", "kubegroovy:salt_sulfur")
  incubation("alltheores:sulfur_dust", "kubegroovy:sulfur_sulfur")
})
