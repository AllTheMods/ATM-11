/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires enderio
package server_scripts.recipes.enderio

$ServerEvents.recipes((allthemods) -> {
  def sagMill = allthemods.recipes.enderio.sag_milling

  // sagMill(input, energy, output{item, count})
  if ($Platform.isLoaded("ae2")) {
    sagMill([[item: "ae2:certus_quartz_dust"]], "#ae2:all_certus_quartz", 2400)
    sagMill([[item: "ae2:fluix_dust"]], "ae2:fluix_crystal", 2400)
    sagMill([[item: "ae2:sky_dust"]], "ae2:sky_stone_block", 2400)
    sagMill([[item: "ae2:ender_dust"]], "#c:ender_pearls", 2400)
//      sagMill("#ae2:all_certus_quartz", 2400, [ item: "ae2:certus_quartz_dust", count: 1 ])
//      sagMill("ae2:fluix_crystal", 2400, [ item: "ae2:fluix_dust", count: 1 ])
//      sagMill("ae2:sky_stone_block", 2400, [ item: "ae2:sky_dust", count: 1 ])
//      sagMill("#c:ender_pearls", 2400, [ item: "ae2:ender_dust", count: 1 ])
  }

  if ($Platform.isLoaded("irons_spellbooks")) {
    sagMill([[item: "4x irons_spellbooks:raw_mithril"]], "#c:ores/mithril", 2400)
  }

  if ($Platform.isLoaded("actuallyadditions")) {
    sagMill([[item: "2x actuallyadditions:black_quartz"]], "#c:ores/black_quartz", 2400)
  }
  if ($Platform.isLoaded("powah")) {
    sagMill([[item: "2x powah:uraninite_raw"]], "#c:ores/uraninite_poor", 2400)//.id("enderio:kgy/powah_uraninite_raw_from_poor")
    sagMill([[item: "4x powah:uraninite_raw"]], "#c:ores/uraninite_regular", 2400)//.id("enderio:kgy/powah_uraninite_raw_from_regular")
    sagMill([[item: "6x powah:uraninite_raw"]], "#c:ores/uraninite_dense", 2400)//.id("enderio:kgy/powah_uraninite_raw_from_dense")
  }
  if ($Platform.isLoaded("silentgear")) {
    sagMill([[item: "3x silentgear:bort"]], "#c:ores/bort", 2400)
  }
  if ($Platform.isLoaded("xycraft_world")) {
    global.xycraftColours.forEach((colour) -> {
      sagMill([[item: "4x xycraft_world:xychorium_gem_${colour}"]], "#c:ores/xychorium_${colour}", 2400)
    })
  }

  allthemods.remove([id: "enderio:sag_milling/ender_pearl"])
})
