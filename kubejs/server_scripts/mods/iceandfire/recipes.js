// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
if (Platform.isLoaded("iceandfire")) {
  ServerEvents.recipes((allthemods) => {
    allthemods.shapeless("8x kubejs:fire_eye", ["kubejs:fire_pearl", "iceandfire:dragonbone"])
    allthemods.shapeless("8x kubejs:ice_eye", ["kubejs:ice_pearl", "iceandfire:dragonbone"])
    allthemods.shapeless("8x kubejs:lightning_eye", ["kubejs:lightning_pearl", "iceandfire:dragonbone"])
	
	// To avoid conflicts with the Utrem Jar's recipe
	allthemods.replaceInput(
		{ output: "iceandfire:pixie_jar_empty" },
		"#minecraft:planks",
		Ingredient.of(["allthemodium:demonic_planks", "allthemodium:soul_planks", "allthemodium:ancient_planks"])
	)
  })
}

// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
