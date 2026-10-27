/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires botanypots
package client_scripts.tooltips

$ItemEvents.modifyTooltips((allthemods) -> {
  // Botany Pot Sculk
  allthemods.add(
      [
          "minecraft:sculk",
          "minecraft:sculk_sensor",
          "minecraft:sculk_catalyst",
          "minecraft:sculk_vein",
          "minecraft:sculk_shrieker"
      ],
      [$Text.of("§9In a Botany Pot: Requires a hoe enchanted with Silk Touch to be harvested")]
  )
  if ($Platform.isLoaded("deeperdarker")) {
    allthemods.add(
        [
            "deeperdarker:gloomy_sculk",
            "deeperdarker:gloomy_grass",
            "deeperdarker:glowing_flowers",
            "deeperdarker:sculk_vines",
            "deeperdarker:glowing_roots",
            "deeperdarker:bloom_berries",
            "deeperdarker:glowing_grass",
            "deeperdarker:sculk_tendrils"
        ],
        [$Text.of("§9In a Botany Pot: Requires a hoe enchanted with Silk Touch to be harvested")]
    )
  }
})
