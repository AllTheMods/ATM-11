/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires neovitae
package server_scripts.recipes

$ServerEvents.recipes(allthemods -> {
  allthemods.recipes.neovitaeMeteor([
      [
          radius: 3,
          fill  : "ae2:fluix_block",
          shell : "ae2:sky_stone_block",
      ],
      [
          radius          : 7,
          additionalWeight: 200,
          minWeight       : 0,
          fill            : "ae2:quartz_block",
          shell           : "ae2:sky_stone_block",
          weighted        : [
              [
                  entry : "ae2:quartz_block",
                  weight: 100,
              ],
              [
                  entry : "ae2:flawless_budding_quartz",
                  weight: 10,
              ],
          ],
      ],
  ],
  "#c:gems/certus_quartz",
      500_000,
      0.0
  ).id("neovitae:meteor/ae2");

  def georeMeteor = [
      [
          ore  : 'copper',
          drain: 500_000
      ],
      [
          ore  : 'iron',
          drain: 500_000
      ],
      [
          ore  : 'tin',
          drain: 500_000
      ],
      [
          ore  : 'gold',
          drain: 750_000
      ],
      [
          ore  : 'nickel',
          drain: 500_000
      ],
      [
          ore  : 'coal',
          drain: 500_000
      ],
      [
          ore  : 'zinc',
          drain: 500_000
      ],
      [
          ore  : 'lead',
          drain: 750_000
      ],
      [
          ore  : 'silver',
          drain: 750_000
      ],
      [
          ore  : 'redstone',
          drain: 750_000
      ],
      [
          ore  : 'lapis',
          drain: 750_000
      ],
      [
          ore  : 'osmium',
          drain: 750_000
      ],
      [
          ore  : 'quartz',
          drain: 750_000
      ],
      [
          ore  : 'aluminum',
          drain: 750_000
      ],
      [
          ore  : 'uraninite',
          drain: 750_000
      ],
      [
          ore  : 'platinum',
          drain: 1_000_000
      ],
      [
          ore  : 'diamond',
          drain: 1_000_000
      ],
      [
          ore  : 'emerald',
          drain: 1_000_000
      ],
      [
          ore  : 'ancient_debris',
          drain: 1_000_000
      ],
      [
          ore  : 'allthemodium',
          drain: 5_000_000
      ],
      [
          ore  : 'vibranium',
          drain: 5_000_000
      ],
      [
          ore  : 'unobtainium',
          drain: 5_000_000
      ]
  ]

  for (def geore : georeMeteor) {
    allthemods.recipes.neovitaeMeteor([
        [
            radius          : 5,
            additionalWeight: 150,
            minWeight       : 0,
            fill            : "geore:${geore.ore}_block",
            shell           : 'minecraft:smooth_basalt',
            weighted        : [
                [
                    entry : "geore:${geore.ore}_block",
                    weight: 100
                ],
                [
                    entry : "geore:budding_${geore.ore}",
                    weight: 5
                ]
            ]
        ]
    ],
    "kubegroovy:${geore.ore}_catalyst",
        geore.drain,
        0.0
    ).id("neovitae:kgy/meteor/geore_${geore.ore}_block")
  }

  //meteor catalysts
  def georeCats = [
      'copper',
      'iron',
      'tin',
      'gold',
      'nickel',
      'coal',
      'zinc',
      'lead',
      'silver',
      'redstone',
      'lapis',
      'osmium',
      'quartz',
      'aluminum',
      'uraninite',
      'platinum',
      'diamond',
      'emerald',
      'ancient_debris',
      'allthemodium',
      'vibranium',
      'unobtainium'
  ]

  for (def cat : georeCats) {
    allthemods.recipes.occultismRitual('occultism:craft', 'occultism:crystalline_infusion',[
        'occultism:book_of_binding_bound_foliot',
        'occultism:spirit_attuned_crystal',
        'minecraft:amethyst_cluster',
        'occultism:book_of_binding_bound_djinni',
        'occultism:spirit_attuned_crystal',
        'forbidden_arcanus:arcane_crystal',
        'occultism:book_of_binding_bound_afrit',
        'occultism:spirit_attuned_crystal',
        'minecraft:amethyst_cluster',
        'occultism:book_of_binding_bound_marid',
        'occultism:spirit_attuned_crystal',
        'forbidden_arcanus:arcane_crystal'
    ],"geore:${cat}_shard",'occultism:ritual_dummy/crystalline_infusion')
    .result("kubegroovy:${cat}_catalyst")
    .duration(100)
    .id("occultism:${cat}_catalyst")
  }

  def georeMats = [
      [
          mat: 'copper',
          id : '#c:ingots/copper'
      ],
      [
          mat: 'iron',
          id : '#c:ingots/iron'
      ],
      [
          mat: 'tin',
          id : '#c:ingots/tin'
      ],
      [
          mat: 'gold',
          id : '#c:ingots/gold'
      ],
      [
          mat: 'nickel',
          id : '#c:ingots/nickel'
      ],
      [
          mat: 'coal',
          id : '#minecraft:coals'
      ],
      [
          mat: 'zinc',
          id : '#c:ingots/zinc'
      ],
      [
          mat: 'lead',
          id : '#c:ingots/lead'
      ],
      [
          mat: 'silver',
          id : '#c:ingots/silver'
      ],
      [
          mat: 'redstone',
          id : '#c:dusts/redstone'
      ],
      [
          mat: 'lapis',
          id : '#c:gems/lapis'
      ],
      [
          mat: 'osmium',
          id : '#c:ingots/osmium'
      ],
      [
          mat: 'quartz',
          id : '#c:gems/quartz'
      ],
      [
          mat: 'aluminum',
          id : '#c:ingots/aluminum'
      ],
      [
          mat: 'uraninite',
          id : '#c:ingots/uraninite'
      ],
      [
          mat: 'platinum',
          id : '#c:ingots/platinum'
      ],
      [
          mat: 'diamond',
          id : '#c:gems/diamond'
      ],
      [
          mat: 'emerald',
          id : '#c:gems/emerald'
      ],
      [
          mat: 'ancient_debris',
          id : '#c:ingots/netherite'
      ],
      [
          mat: 'allthemodium',
          id : '#c:ingots/allthemodium'
      ],
      [
          mat: 'vibranium',
          id : '#c:ingots/vibranium'
      ],
      [
          mat: 'unobtainium',
          id : '#c:ingots/unobtainium'
      ]
  ]

  for (def mat : georeMats) {
    allthemods.recipes.occultismRitual('occultism:craft', 'occultism:crystalline_infusion', [
        'occultism:book_of_binding_bound_foliot',
        'occultism:spirit_attuned_crystal',
        mat.id,
        'occultism:book_of_binding_bound_djinni',
        'occultism:spirit_attuned_crystal',
        mat.id,
        'occultism:book_of_binding_bound_afrit',
        'occultism:spirit_attuned_crystal',
        mat.id,
        'occultism:book_of_binding_bound_marid',
        'occultism:spirit_attuned_crystal',
        mat.id
    ], '#geore:geore_shards', 'occultism:ritual_dummy/crystalline_infusion')
    .result("geore:${mat.mat}_shard")
    .duration(100)
    .id("occultism:${mat.mat}_transumtation")
  }

  // Saltpeter Block Recipes
  if ($Item.exists("kubegroovy:saltpeter_block")) {
    allthemods
        .shapeless($Item.of("neovitae:saltpeter", 9), ["kubegroovy:saltpeter_block"])
        .id("allthemods:saltpeter_dust_from_block")
  }
})
