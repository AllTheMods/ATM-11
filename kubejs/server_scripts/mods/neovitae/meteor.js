// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
Serverallthemodss.recipes(allthemods => {
  allthemods.custom({
        type: "neovitae:meteor",
        input: "#c:gems/certus_quartz",
        syphon: 500000,
        explosion: 0.0,
        layers: [
            {
                radius: 3,
                fill: "ae2:fluix_block",
                shell: "ae2:sky_stone_block",
            },
            {
                radius: 7,
                additionalWeight: 200,
                minWeight: 0,
                fill: "ae2:quartz_block",
                shell: "ae2:sky_stone_block",
                weighted: [
                    {
                        entry: "ae2:quartz_block",
                        weight: 100,
                    },
                    {
                        entry: "ae2:flawless_budding_quartz",
                        weight: 10,
                    },
                ],
            },
        ],
    }).id("neovitae:meteor/ae2");

    let georeMeteor = [
        {
            ore: 'copper',
            drain: 500000
        },
        {
            ore: 'iron',
            drain: 500000
        },
        {
            ore: 'tin',
            drain: 500000
        },
        {
            ore: 'gold',
            drain: 750000
        },
        {
            ore: 'nickel',
            drain: 500000
        },
        {
            ore: 'coal',
            drain: 500000
        },
        {
            ore: 'zinc',
            drain: 500000
        },
        {
            ore: 'lead',
            drain: 750000
        },
        {
            ore: 'silver',
            drain: 750000
        },
        {
            ore: 'redstone',
            drain: 750000
        },
        {
            ore: 'lapis',
            drain: 750000
        },
        {
            ore: 'osmium',
            drain: 750000
        },
        {
            ore: 'quartz',
            drain: 750000
        },
        {
            ore: 'aluminum',
            drain: 750000
        },
        {
            ore: 'uraninite',
            drain: 750000
        },
        {
            ore: 'platinum',
            drain: 1000000
        },
        {
            ore: 'diamond',
            drain: 1000000
        },
        {
            ore: 'emerald',
            drain: 1000000
        },
        {
            ore: 'ancient_debris',
            drain: 1000000
        },
        {
            ore: 'allthemodium',
            drain: 5000000
        },
        {
            ore: 'vibranium',
            drain: 5000000
        },
        {
            ore: 'unobtainium',
            drain: 5000000
        }
    ]

    for (let geore of georeMeteor) {
        allthemods.custom(
            {
                type: 'neovitae:meteor',
                input: `kubejs:${geore.ore}_catalyst`,
                syphon: geore.drain,
                explosion: 0.0,
                layers: [
                    {
                        radius: 5,
                        additionalWeight: 150,
                        minWeight: 0,
                        fill: `geore:${geore.ore}_block`,
                        shell: 'minecraft:smooth_basalt',
                        weighted: [
                            {
                                entry: `geore:${geore.ore}_block`,
                                weight: 100
                            },
                            {
                                entry: `geore:budding_${geore.ore}`,
                                weight: 5
                            }
                        ]
                    }
                ]
            }
        )
    }

    //meteor catalysts
    let georeCats = [
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

    for (let cat of georeCats) {
        allthemods.custom({
            type: 'occultism:ritual',
            activation_item: `geore:${cat}_shard`,
            duration: 100,
            ingredients: [ 
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
            ],
            pentacle_id: 'occultism:crystalline_infusion',
            result: {
                id: `kubejs:${cat}_catalyst`,
            },
            ritual_dummy: {
                id: 'occultism:ritual_dummy/crystalline_infusion',
            },
            ritual_type: 'occultism:craft',
        }).id(`occultism:${cat}_catalyst`)
    }

    let georeMats = [
        {
            mat: 'copper',
            id: '#c:ingots/copper'
        },
        {
            mat: 'iron',
            id: '#c:ingots/iron'
        },
        {
            mat: 'tin',
            id: '#c:ingots/tin'
        },
        {
            mat: 'gold',
            id: '#c:ingots/gold'
        },
        {
            mat: 'nickel',
            id: '#c:ingots/nickel'
        },
        {
            mat: 'coal',
            id: '#minecraft:coals'
        },
        {
            mat: 'zinc',
            id: '#c:ingots/zinc'
        },
        {
            mat: 'lead',
            id: '#c:ingots/lead'
        },
        {
            mat: 'silver',
            id: '#c:ingots/silver'
        },
        {
            mat: 'redstone',
            id: '#c:dusts/redstone'
        },
        {
            mat: 'lapis',
            id: '#c:gems/lapis'
        },
        {
            mat: 'osmium',
            id: '#c:ingots/osmium'
        },
        {
            mat: 'quartz',
            id: '#c:gems/quartz'
        },
        {
            mat: 'aluminum',
            id: '#c:ingots/aluminum'
        },
        {
            mat: 'uraninite',
            id: '#c:ingots/uraninite'
        },
        {
            mat: 'platinum',
            id: '#c:ingots/platinum'
        },
        {
            mat: 'diamond',
            id: '#c:gems/diamond'
        },
        {
            mat: 'emerald',
            id: '#c:gems/emerald'
        },
        {
            mat: 'ancient_debris',
            id: '#c:ingots/netherite'
        },
        {
            mat: 'allthemodium',
            id: '#c:ingots/allthemodium'
        },
        {
            mat: 'vibranium',
            id: '#c:ingots/vibranium'
        },
        {
            mat: 'unobtainium',
            id: '#c:ingots/unobtainium'
        }
    ]

    for (let mat of georeMats) {
        allthemods.custom({
            type: 'occultism:ritual',
            activation_item: '#geore:geore_shards',
            duration: 100,
            ingredients: [ 
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
            ],
            pentacle_id: 'occultism:crystalline_infusion',
            result: {
                id: `geore:${mat.mat}_shard`,
            },
            ritual_dummy: {
                id: 'occultism:ritual_dummy/crystalline_infusion',
            },
            ritual_type: 'occultism:craft',
        }).id(`occultism:${mat.mat}_transumtation`)
    }
})
// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
