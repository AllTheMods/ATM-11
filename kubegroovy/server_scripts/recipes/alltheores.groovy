/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires alltheores
package server_scripts.recipes

import java.util.HashSet as $HashSet

def getDustFromMaterial = { mod, resource ->
  return ["alltheores:${resource}_dust", "${mod}:${resource}_dust", "${mod}:dust_${resource}"]
      .stream()
      .map(Objects::toString)
      .filter((str) -> $Item.exists(str))
      .findFirst()
      .orElse(null)
}

$ServerEvents.recipes((allthemods) -> {
  // Snow Fixes
  allthemods.remove([id: "allthecompressed:compress/snow_1x"])
  allthemods.remove([id: "allthecompressed:decompress/snow_1x"])
  if ($Platform.isLoaded("allthecompressed")) {
    allthemods.shapeless("9x minecraft:snow_block", ["allthecompressed:snow_1x"])
    allthemods
        .shapeless("allthecompressed:snow_1x", ["9x minecraft:snow_block"])
        .id("allthecompressed:compress/snow_1x_manual_only")
  }

  // Fix fluorite recipe conflict
  allthemods.remove([id: "alltheores:processing/fluorite/dust/from_ore"])

  def blockedMods = new $HashSet([
      "modern_industrialization",
      "mysticalagriculture",
      "mysticalagradditions",
      "extendedae",
      "mekanism"
  ])
  def materials = $Utils.newMap()

  $Ingredient.of("#c:ingots")
      .getValues()
      .stream()
      .forEach((holder) -> {
        def id = holder.unwrapKey().get().identifier()
        def resource = id.path
        if (!blockedMods.contains(id.namespace)) {
          resource = resource.replace("ingot_", "")
          resource = resource.replace("_ingot", "")

          def dust = getDustFromMaterial(id.namespace, resource)
          if (dust == null) return
          if (resource == "awakened_draconium") resource = "draconium_awakened" // flip draconium name because :shrug:
          materials.putIfAbsent(resource, dust)
        }
      })

  materials.forEach((resource, dust) -> {
    if (
        !allthemods.countRecipes([
            type  : "minecraft:crafting_shapeless",
            input : "#c:ingots/${resource}",
            output: "#c:dusts/${resource}",
        ])
    ) {
      def finalDust = $Platform.isLoaded("almostunified")
          ? $AlmostUnified.getTagTargetItem("c:dusts/${resource}")
          : $Item.getEmpty()
      if (finalDust.isEmpty()) finalDust = $Item.of(dust)
      console.log("Adding dust recipe: ${dust} with resource: ${resource}")
      allthemods
          .shapeless(dust, ["#c:ingots/${resource}", "#alltheores:ore_hammers"])
          .id("alltheores:processing/ore_hammer/${resource}_dust_from_ingot")
    }
  })
})
