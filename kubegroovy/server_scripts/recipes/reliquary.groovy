/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires reliquary
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  if ($Platform.isLoaded("naturesaura")) {
    allthemods
        .shaped("reliquary:fertile_lily_pad", ["EME", "MLM", "EME"], [
            E: "reliquary:fertile_essence",
            L: "minecraft:lily_pad",
            M: 'naturesaura:effect_powder[naturesaura:effect_powder_data={effect:"naturesaura:plant_boost"}]'
        ])
        .id("reliquary:fertile_lily_pad")
  }
})
