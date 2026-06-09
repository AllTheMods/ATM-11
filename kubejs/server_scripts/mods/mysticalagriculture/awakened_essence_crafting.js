// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
if (Platform.isLoaded("mysticalagriculture")) {
  ServerEvents.recipes((allthemods) => {
    function awakenedEssenceCrafting(essenceCount, input, ingredients, result) {
      allthemods
        .custom({
          type: "mysticalagriculture:awakening",
          essences: [
            {
              ingredient: "mysticalagriculture:air_essence",
              count: essenceCount
            },
            {
              ingredient: "mysticalagriculture:earth_essence",
              count: essenceCount
            },
            {
              ingredient: "mysticalagriculture:water_essence",
              count: essenceCount
            },
            {
              ingredient: "mysticalagriculture:fire_essence",
              count: essenceCount
            }
          ],
          input: input,
          ingredients: ingredients,
          result: {
            id: result
          }
        })
        .id("allthemods:mysticalagriculture/awakening/" + result.split(":").pop())
    }

    allthemods.remove({ output: "reliquary:fertile_lily_pad" })
    awakenedEssenceCrafting(
      40,
      "minecraft:lily_pad",
      [
        "allthemodium:vibranium_plate",
        "reliquary:fertile_essence",
        "reliquary:fertile_essence",
        "reliquary:fertile_essence"
      ],
      "reliquary:fertile_lily_pad"
    )
  })
}

// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
