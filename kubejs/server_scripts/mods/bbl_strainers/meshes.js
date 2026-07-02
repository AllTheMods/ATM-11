// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
ServerEvents.tags('item', allthemods => {
    allthemods.add('strainers:tier_12_meshes', 'kubejs:allthemodium_mesh')
})

ServerEvents.recipes(allthemods => {
    allthemods.shaped('kubejs:allthemodium_mesh', [' i ', 'imi', ' i '], {i: 'allthemodium:allthemodium_ingot', m: 'strainers:netherite_mesh'})
})
// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
