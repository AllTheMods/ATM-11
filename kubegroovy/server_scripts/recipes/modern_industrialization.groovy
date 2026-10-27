/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires modern_industrialization
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
    allthemods
        .custom([
            type         : "modern_industrialization:mixer",
            eu           : 2,
            duration     : 100,
            item_inputs  : [
                amount: 1,
                tag   : "c:dusts/redstone"
            ],
            fluid_inputs : [
                tag   : "c:creosote",
                amount: 500
            ],
            fluid_outputs: [
                fluid : "modern_industrialization:lubricant",
                amount: 500
            ]
        ])
        .id("modern_industrialization:materials/mixer/lubricant")

    allthemods
        .custom([
            type        : "modern_industrialization:assembler",
            eu          : 8,
            duration    : 200,
            item_inputs : [
                [
                    tag   : "c:rods/gold",
                    amount: 6
                ],
                [
                    item  : "minecraft:stick",
                    amount: 1
                ],
                [
                    amount: 1,
                    tag   : "c:dusts/redstone"
                ]
            ],
            fluid_inputs: [
                [
                    tag   : "c:creosote",
                    amount: 100
                ]
            ],
            item_outputs: [
                [
                    item  : "minecraft:powered_rail",
                    amount: 8
                ]
            ]
        ])
        .id("modern_industrialization:vanilla_recipes/assembler/powered_rail")

    allthemods
        .custom([
            type        : "modern_industrialization:assembler",
            eu          : 8,
            duration    : 200,
            item_inputs : [
                [
                    tag   : "c:rods/steel",
                    amount: 6
                ],
                [
                    item  : "minecraft:stick",
                    amount: 1
                ]
            ],
            fluid_inputs: [
                [
                    tag   : "c:creosote",
                    amount: 100
                ]
            ],
            item_outputs: [
                [
                    item  : "minecraft:rail",
                    amount: 16
                ]
            ]
        ])
        .id("modern_industrialization:vanilla_recipes/assembler/rail")

  def toRemoveRecipes = [
      "modern_industrialization:materials/aluminum/craft/gear",
      "modern_industrialization:materials/tin/craft/gear",
      "modern_industrialization:materials/steel/craft/gear",
      "modern_industrialization:materials/invar/craft/gear",
      "modern_industrialization:materials/bronze/craft/gear",
      "modern_industrialization:materials/iron/craft/gear",
      "modern_industrialization:materials/copper/craft/gear",
      "modern_industrialization:materials/gold/craft/gear"
  ]
  toRemoveRecipes.each { allthemods.remove([id: it]) }

  allthemods.remove([id: "modern_industrialization:materials/bronze_dust"])
})
