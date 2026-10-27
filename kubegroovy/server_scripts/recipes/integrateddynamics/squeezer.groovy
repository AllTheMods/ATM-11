/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires integrateddynamics
package server_scripts.recipes.integrateddynamics

import net.minecraft.world.item.ItemStackTemplate
import net.minecraft.world.item.crafting.Ingredient

// TODO: fix schema?
$ServerEvents.recipes((allthemods) -> {
  def mechSqueezer = allthemods.recipes.integrateddynamics.mechanical_squeezer
  def squeezer = {input, output ->
    input = input as Ingredient
    output = output as ItemStackTemplate
    if (output.count() > 1) {
      mechSqueezer(input, 40, [[item: output]]).id("integrateddynamics:kgy/mechanical_squeezer/${output.item().value().id.replace(':','_')}")
    } else {
      mechSqueezer(input, 40, [[item: output.withCount(3)],[item: output, chance: 0.5],[item: output, chance: 0.5]]).id("integrateddynamics:kgy/mechanical_squeezer/${output.item().value().id.replace(':','_')}")
    }
  }

  // squeezer(input, output{item, count, bonus})
  if ($Platform.isLoaded("actuallyadditions")) {
    squeezer("#c:ores/black_quartz", "actuallyadditions:black_quartz")
  }

  if ($Platform.isLoaded("forbidden_arcanus")) {
    squeezer("#c:ores/arcane_crystal", "forbidden_arcanus:arcane_crystal")
    squeezer("#c:ores/runic", "forbidden_arcanus:rune")
  }
  if ($Platform.isLoaded("mysticalagriculture")) {
    squeezer("#c:ores/inferium", "mysticalagriculture:inferium_essence")
    squeezer("#c:ores/prosperity", "mysticalagriculture:prosperity_shard")
  }
  if ($Platform.isLoaded("silentgear")) {
    squeezer("#c:ores/bort", "silentgear:bort")
  }
  squeezer("#c:ores/cinnabar", "alltheores:cinnabar")
  squeezer("#c:ores/fluorite", "alltheores:fluorite")
  squeezer("#c:ores/peridot", "alltheores:peridot")
  squeezer("#c:ores/ruby", "alltheores:ruby")
  squeezer("#c:ores/sapphire", "alltheores:sapphire")
  squeezer("#c:ores/sulfur", "alltheores:sulfur_dust")
  if ($Platform.isLoaded("theurgy")) {
    squeezer("#c:ores/sal_ammoniac", "theurgy:sal_ammoniac_crystal")
  }

  // squeezer('#c:ores/uraninite', 'powah:uraninite_raw');

  if ($Platform.isLoaded("powah")) {
    squeezer("#c:ores/uraninite_poor", "2x powah:uraninite_raw").id("integrateddynamics:kgy/mechanical_squeezer/powah_uraninite_raw_from_poor")
    squeezer("#c:ores/uraninite_regular", "4x powah:uraninite_raw").id("integrateddynamics:kgy/mechanical_squeezer/powah_uraninite_raw_from_regular")
    squeezer("#c:ores/uraninite_dense", "6x powah:uraninite_raw").id("integrateddynamics:kgy/mechanical_squeezer/powah_uraninite_raw_from_dense")
  }

  allthemods.remove([output: "minecraft:lapis_lazuli", type: "integrateddynamics:mechanical_squeezer"])
  squeezer("#c:ores/lapis", "12x minecraft:lapis_lazuli")
  if ($Platform.isLoaded("xycraft_world")) {
    global.xycraftColours.forEach((colour) -> {
      squeezer("#c:ores/xychorium_${colour}", "4x xycraft_world:xychorium_gem_${colour}")
    })
  }
})
