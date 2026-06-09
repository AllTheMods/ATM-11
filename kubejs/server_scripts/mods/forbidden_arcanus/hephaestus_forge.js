if (Platform.isLoaded("forbidden_arcanus")) {
  ServerEvents.generateData("after_mods", (allthemods) => {
    const relics = {
      "forbidden_arcanus:artisan_relic": "forbidden_arcanus:deorum_ingot",
      "forbidden_arcanus:elementarium": "allthemodium:allthemodium_ingot",
      "forbidden_arcanus:crimson_stone": "allthemodium:vibranium_ingot",
      "forbidden_arcanus:divine_pact": "allthemodium:unobtainium_ingot"
    }

    Object.entries(relics).forEach(([relic, ingot]) => {
      allthemods.json(`atm:forbidden_arcanus/hephaestus_forge/ritual/${relic.split(":").pop()}.json`, {
        essences: {
          aureal: 1000,
          blood: 1000,
          souls: 100,
          experience: 100
        },
        forge_tier: 3,
        inputs: [
          {
            amount: 1,
            ingredient: "forbidden_arcanus:obsidiansteel_block"
          },
          {
            amount: 1,
            ingredient: ingot
          },
          {
            amount: 1,
            ingredient: "forbidden_arcanus:obsidiansteel_block"
          },
          {
            amount: 1,
            ingredient: ingot
          },
          {
            amount: 1,
            ingredient: "forbidden_arcanus:obsidiansteel_block"
          },
          {
            amount: 1,
            ingredient: ingot
          },
          {
            amount: 1,
            ingredient: "forbidden_arcanus:obsidiansteel_block"
          },
          {
            amount: 1,
            ingredient: ingot
          }
        ],
        magic_circle: "forbidden_arcanus:create_item",
        main_ingredient: relic,
        result: {
          type: "forbidden_arcanus:create_item",
          result_item: {
            count: 2,
            id: relic
          }
        }
      })
    })
  })
}
