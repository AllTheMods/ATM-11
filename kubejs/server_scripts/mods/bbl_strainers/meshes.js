// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
ServerEvents.tags('item', allthemods => {
    allthemods.add('strainers:tier_12_meshes', 'kubejs:allthemodium_mesh')
})

ServerEvents.recipes(allthemods => {
    allthemods.custom({
      type: "bblcore:shaped_component_copy",
      category: "misc",
      copy_components: ["minecraft:enchantments"],
      key: {
        A: "allthemodium:allthemodium_ingot",
        B: "strainers:netherite_mesh",
      },
      pattern: [" A ", "ABA", " A "],
      result: "kubejs:allthemodium_mesh",
      source: "strainers:netherite_mesh",
    });
})
// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
