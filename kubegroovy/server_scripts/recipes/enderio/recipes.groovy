/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires enderio
package server_scripts.recipes.enderio

import net.minecraft.world.item.ItemStackTemplate
import net.minecraft.world.item.crafting.Ingredient

def inputResource = [
    [material: "unobtainium", out3: null, modID: "allthemodium:"],
    [material: "vibranium", out3: null, modID: "allthemodium:"],
    [material: "allthemodium", out3: null, modID: "allthemodium:"],
    [material: "crimson_iron", out3: null, modID: "silentgear:"],
    [material: "azure_silver", out3: null, modID: "silentgear:"],
    [material: "blaze_gold", out3: null, modID: "silentgear:"],
    [material: "azure_electrum", out3: null, modID: "silentgear:"],
    [material: "crimson_steel", out3: null, modID: "silentgear:"]
]

$ServerEvents.recipes((allthemods) -> {
  inputResource.forEach((sag) -> {
    def outID = ""
    // raw material sagging with sideproducts
    if (sag.out3 !== null) {
      if ($Item.exists("${sag.modID}raw_${sag.material}") && $Item.exists("${sag.modID}${sag.material}_dust")) {
        if (!allthemods.countRecipes([input: "#c:raw_materials/${sag.material}", type: "enderio:sag_milling"])) {
          allthemods.recipes.enderio.sag_milling(
              [
                  [item: "${sag.modID}${sag.material}_dust"],
                  [item: "${sag.modID}${sag.material}_dust", chance: 0.25],
                  [item: "${sag.modID}${sag.out3.resource}", chance: sag.out3.chance]
              ],
              "#c:raw_materials/${sag.material}",
              2400
          ).id("enderio:kgy/sag_milling/raw_${sag.material}")
        }
      }
    } else {
      // raw material sagging without sideproducts
      if ($Item.exists("${sag.modID}raw_${sag.material}") && $Item.exists("${sag.modID}${sag.material}_dust")) {
        if (!allthemods.countRecipes([input: "#c:raw_materials/${sag.material}", type: "enderio:sag_milling"])) {
          allthemods.recipes.enderio.sag_milling(
              [
                  [item: "${sag.modID}${sag.material}_dust"],
                  [item: "${sag.modID}${sag.material}_dust", chance: 0.25]
              ],
              "#c:raw_materials/${sag.material}",
              2400
          ).id("enderio:kgy/sag_milling/raw_${sag.material}")
        }
      }
    }
    // ore sagging
    if ($Item.exists("${sag.modID}${sag.material}_ore") && $Item.exists("${sag.modID}raw_${sag.material}")) {
      if (!allthemods.countRecipes([input: "#c:ores/${sag.material}", type: "enderio:sag_milling"])) {
        allthemods.recipes.enderio.sag_milling(
            [
                [item: "${sag.modID}raw_${sag.material}"],
                [item: "${sag.modID}raw_${sag.material}", chance: 0.33],
                [item: "minecraft:cobblestone", chance: 0.15]
            ],
            "#c:ores/${sag.material}",
            2400
        ).id("enderio:kgy/sag_milling/${sag.material}_ore")
      }
    }
    // ingot sagging
    if ($Item.exists("${sag.modID}${sag.material}_ingot") && $Item.exists("${sag.modID}${sag.material}_dust")) {
      if (!allthemods.countRecipes([input: "#c:ingots/${sag.material}", type: "enderio:sag_milling"])) {
        allthemods.recipes.enderio.sag_milling(
            [[item: "${sag.modID}${sag.material}_dust"]],
            "#c:ingots/${sag.material}",
            2400
        ).id("enderio:kgy/sag_milling/${sag.material}_ingot")
      }
    }
  })
})
