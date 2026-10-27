/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires geore
package server_scripts.recipes

$ServerEvents.recipes(allthemods -> {

  def geore = [
      'geore:budding_copper',
      'geore:budding_iron',
      'geore:budding_tin',
      'geore:budding_gold',
      'geore:budding_nickel',
      'geore:budding_coal',
      'geore:budding_zinc',
      'geore:budding_lead',
      'geore:budding_silver',
      'geore:budding_redstone',
      'geore:budding_lapis',
      'geore:budding_osmium',
      'geore:budding_quartz',
      'geore:budding_aluminum',
      'geore:budding_uraninite',
      'geore:budding_platinum',
      'geore:budding_diamond',
      'geore:budding_emerald',
      'geore:budding_ancient_debris',
      'geore:budding_allthemodium',
      'geore:budding_vibranium',
      'geore:budding_unobtainium',
      'ae2:flawless_budding_quartz',
      'minecraft:budding_amethyst'
  ]

  for (def mat : geore) {
    allthemods.recipes.inworldrecipesWorldRecipe(
        [
            [
                type       : "inworldrecipes:block_state",
                block_state: "air"
            ],
            [
                type            : "inworldrecipes:chance_results",
                add_to_inventory: false,
                results         : [
                    [
                        item  : mat,
                        chance: 0.5
                    ]
                ]
            ]
        ],
        [
            [
                type      : "inworldrecipes:click_type",
                click_type: "right_click"
            ],
            [
                type        : "inworldrecipes:block_target",
                target_block: mat
            ]
        ],
        [
            [
                type      : "inworldrecipes:held_item",
                ingredient: "kubegroovy:crystalline_wand"
            ]
        ]
    ).options([
        [
            show_in_jei       : true,
            only_visual_recipe: false
        ]
    ]).id("inworldrecipes:kgy/world_recipe/${mat.replace(':','_')}")

    allthemods.recipes.inworldrecipesWorldRecipe([
        [
            type       : "inworldrecipes:block_state",
            block_state: "air"
        ],
        [
            type            : "inworldrecipes:chance_results",
            add_to_inventory: false,
            results         : [
                [
                    item  : mat,
                    chance: 1.0
                ]
            ]
        ]
    ],
        [
            [
                type      : "inworldrecipes:click_type",
                click_type: "right_click"
            ],
            [
                type        : "inworldrecipes:block_target",
                target_block: mat
            ]
        ],
        [
            [
                type      : "inworldrecipes:held_item",
                ingredient: "kubegroovy:perfected_crystalline_wand"
            ]
        ]
    ).options([
        [
            show_in_jei       : true,
            only_visual_recipe: false
        ]
    ]).id("inworldrecipes:kgy/world_recipe/${mat.replace(':','_')}_with_perfected_wand")
  }

  allthemods.recipes.occultismRitual("occultism:craft", "occultism:crystalline_infusion", [
      'kubegroovy:allthemodium_catalyst',
      'occultism:spirit_attuned_crystal',
      'occultism:book_of_binding_bound_foliot',
      'kubegroovy:vibranium_catalyst',
      'occultism:book_of_binding_bound_djinni',
      'minecraft:amethyst_cluster',
      'kubegroovy:unobtainium_catalyst',
      'occultism:book_of_binding_bound_afrit',
      'occultism:divination_rod',
      'occultism:spirit_attuned_crystal',
      'occultism:book_of_binding_bound_marid'
  ],
      $Item.of('constructionstick:iron_stick[constructionstick:unbreakable=true,unbreakable={}]').asIngredient(),
      "occultism:ritual_dummy/crystalline_infusion")
  .result("kubegroovy:crystalline_wand")
  .duration(100)
    .id('allthemods:crystalline_infusion/crystalline_wand')

  allthemods.recipes.occultismRitual("occultism:craft", "occultism:crystalline_infusion", [
      'geore:budding_allthemodium',
      'occultism:book_of_binding_bound_foliot',
      'geore:budding_vibranium',
      'occultism:book_of_binding_bound_djinni',
      'geore:budding_unobtainium',
      'occultism:spirit_attuned_crystal',
      'neovitae:teleposer',
      'occultism:book_of_binding_bound_afrit',
      'energizedpower:teleporter_processing_unit',
      'occultism:book_of_binding_bound_marid',
      'waystones:warp_stone',
      'occultism:spirit_attuned_crystal'
  ], "kubegroovy:crystalline_wand", "occultism:ritual_dummy/crystalline_infusion")
  .result("kubegroovy:perfected_crystalline_wand")
  .duration(100)
  .id('allthemods:crystalline_infusion/perfect_crystalline_wand')
})
