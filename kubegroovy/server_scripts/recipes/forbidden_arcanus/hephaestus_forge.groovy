/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires forbidden_arcanus
package server_scripts.recipes.forbidden_arcanus

$ServerEvents.generateData("after_mods", (allthemods) -> {
  def relics = [
      "forbidden_arcanus:artisan_relic": "forbidden_arcanus:deorum_ingot",
      "forbidden_arcanus:elementarium" : "allthemodium:allthemodium_ingot",
      "forbidden_arcanus:crimson_stone": "allthemodium:vibranium_ingot",
      "forbidden_arcanus:divine_pact"  : "allthemodium:unobtainium_ingot"
  ]
  relics.each { relic, ingot ->
    allthemods.json("atm:forbidden_arcanus/hephaestus_forge/ritual/${$ID.of(relic, false).path}.json", [
        essences       : [
            aureal    : 1000,
            blood     : 1000,
            souls     : 100,
            experience: 100
        ],
        forge_tier     : 3,
        inputs         : [
            [
                amount    : 1,
                ingredient: "forbidden_arcanus:obsidiansteel_block"
            ],
            [
                amount    : 1,
                ingredient: ingot
            ],
            [
                amount    : 1,
                ingredient: "forbidden_arcanus:obsidiansteel_block"
            ],
            [
                amount    : 1,
                ingredient: ingot
            ],
            [
                amount    : 1,
                ingredient: "forbidden_arcanus:obsidiansteel_block"
            ],
            [
                amount    : 1,
                ingredient: ingot
            ],
            [
                amount    : 1,
                ingredient: "forbidden_arcanus:obsidiansteel_block"
            ],
            [
                amount    : 1,
                ingredient: ingot
            ]
        ],
        magic_circle   : "forbidden_arcanus:create_item",
        main_ingredient: relic,
        result         : [
            type       : "forbidden_arcanus:create_item",
            result_item: [
                count: 2,
                id   : relic
            ]
        ]
    ])
  }
})
