/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagriculture
package server_scripts.recipes.mysticalagriculture

if ($Platform.isLoaded("agritechevolved")) {
  $ServerEvents.recipes(event -> {
    // List of crops to add with their soil
    def customCrops = [
        [name: "kivi", soil: "#agritechevolved:ma_tier2_soils"],
        [name: "unexplored_wood", soil: "#agritechevolved:ma_tier2_soils"],
        [name: "azure_silver", soil: "#agritechevolved:ma_tier3_soils"],
        [name: "black_quartz", soil: "#agritechevolved:ma_tier3_soils"],
        [name: "crimson_iron", soil: "#agritechevolved:ma_tier3_soils"],
        [name: "darkstone", soil: "#agritechevolved:ma_tier3_soils"],
        [name: "xychorium_gem", soil: "#agritechevolved:ma_tier3_soils"],
        [name: "entro", soil: "#agritechevolved:ma_tier5_soils"],
        [name: "sky_steel", soil: "#agritechevolved:ma_tier5_soils"],
        [name: "allthemodium", soil: "kubegroovy:magical_soil"],
        [name: "vibranium", soil: "kubegroovy:magical_soil"],
        [name: "unobtainium", soil: "kubegroovy:magical_soil"]
    ];

    // Adding Agritech Planter compatibility with Mystical Customization crops
    customCrops.forEach(crop -> {
      if (!$Item.exists("mysticalagriculture:${crop.name}_seeds")) return
      event.recipes.agritechevolvedCrop([
          [
              "item"  : "mysticalagriculture:${crop.name}_essence",
              "min"   : 1,
              "max"   : 1,
              "chance": 1.0
          ],
          [
              "item"  : "mysticalagriculture:${crop.name}_seeds",
              "min"   : 1,
              "max"   : 1,
              "chance": 0.2
          ],
          [
              "item"  : "mysticalagriculture:fertilized_essence",
              "min"   : 1,
              "max"   : 1,
              "chance": 0.1
          ]
      ],
          "mysticalagriculture:${crop.name}_seeds",
          [crop.soil]
      ).id("agritechevolved:kgy/${crop.name}_seeds")
    })
  })
}
