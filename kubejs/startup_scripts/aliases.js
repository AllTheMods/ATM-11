// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.

NativeEvents.onEvent("net.neoforged.neoforge.registries.RegisterEvent", (allthemods) => {
	if (allthemods.registryKey == "minecraft:item") {
		allthemods.registry.addAlias("forbidden_arcanus:obsidiansteel_block", "forbidden_arcanus:stygian_steel_block")
		allthemods.registry.addAlias("forbidden_arcanus:obsidiansteel_ingot", "forbidden_arcanus:stygian_steel_ingot")
	}

	if (allthemods.registryKey == "minecraft:block") {
		allthemods.registry.addAlias("forbidden_arcanus:obsidiansteel_block", "forbidden_arcanus:stygian_steel_block")
	}
})

// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.