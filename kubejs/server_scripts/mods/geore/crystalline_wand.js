// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.

ServerEvents.recipes(allthemods => {

    let geore = [
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

    for (let mat of geore) {
      allthemods.custom({
        type: "inworldrecipes:world_recipe",
        triggers: [
          {
            type: "inworldrecipes:click_type",
            click_type: "right_click"
          },
          {
            type: "inworldrecipes:block_target",
            target_block: {
              Name: mat
            }
          }
        ],
        conditions: [
          {
            type: "inworldrecipes:held_item",
            ingredient: {
              ingredient: "kubejs:crystalline_wand",
              count: 1
            }
          }
        ],
        results: [
          {
            type: "inworldrecipes:block_state",
            block_state: {
              Name: "minecraft:air"
            }
          },
          {
            type: "inworldrecipes:chance_results",
            add_to_inventory: false,
            results: [
              {
                item: {
                  id: mat,
                  count: 1
                },
                chance: 0.5
              }
            ]
          }
        ],
        options: [
          {
            show_in_jei: true,
            only_visual_recipe: false
          }
        ]
      })

      allthemods.custom({
        type: "inworldrecipes:world_recipe",
        triggers: [
          {
            type: "inworldrecipes:click_type",
            click_type: "right_click"
          },
          {
            type: "inworldrecipes:block_target",
            target_block: {
              Name: mat
            }
          }
        ],
        conditions: [
          {
            type: "inworldrecipes:held_item",
            ingredient: {
              ingredient: "kubejs:perfected_crystalline_wand",
              count: 1
            }
          }
        ],
        results: [
          {
            type: "inworldrecipes:block_state",
            block_state: {
              Name: "minecraft:air"
            }
          },
          {
            type: "inworldrecipes:chance_results",
            add_to_inventory: false,
            results: [
              {
                item: {
                  id: mat,
                  count: 1
                },
                chance: 1.0
              }
            ]
          }
        ],
        options: [
          {
            show_in_jei: true,
            only_visual_recipe: false
          }
        ]
      })
    }  

    allthemods.custom({
      type: "occultism:ritual",
      activation_item: Ingredient.of('constructionstick:iron_stick[constructionstick:unbreakable=true,unbreakable={}]'),
      duration: 100,
      ingredients: [
        'kubejs:allthemodium_catalyst',
        'occultism:spirit_attuned_crystal',
        'occultism:book_of_binding_bound_foliot',
        'kubejs:vibranium_catalyst',
        'occultism:book_of_binding_bound_djinni',
        'minecraft:amethyst_cluster', 
        'kubejs:unobtainium_catalyst', 
        'occultism:book_of_binding_bound_afrit', 
        'occultism:divination_rod',
        'occultism:spirit_attuned_crystal', 
        'occultism:book_of_binding_bound_marid'
    ],
      pentacle_id: "occultism:crystalline_infusion",
      result: {
        id: 'kubejs:crystalline_wand',
      },
      ritual_dummy: {
        id: "occultism:ritual_dummy/crystalline_infusion",
      },
      ritual_type: "occultism:craft",
    }).id('allthemods:crystalline_infusion/crystalline_wand')

    allthemods.custom({
      type: "occultism:ritual",
      activation_item: 'kubejs:crystalline_wand',
      duration: 100,
      ingredients: [
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
      ],
      pentacle_id: "occultism:crystalline_infusion",
      result: {
        id: 'kubejs:perfected_crystalline_wand',
      },
      ritual_dummy: {
        id: "occultism:ritual_dummy/crystalline_infusion",
      },
      ritual_type: "occultism:craft",
    }).id('allthemods:crystalline_infusion/perfect_crystalline_wand')
})

// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
