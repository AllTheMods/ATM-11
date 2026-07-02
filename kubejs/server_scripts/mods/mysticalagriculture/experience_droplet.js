// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.

if (Platform.isLoaded("mysticalagriculture") && Platform.isLoaded("justdirethings")) {
	ServerEvents.recipes((allthemods) => {
		// ID Squeezers
		if(Platform.isLoaded("integrateddynamics")) {
			allthemods.custom({
				  "type": "integrateddynamics:squeezer",
				  "input_item": "mysticalagriculture:experience_droplet",
				  "output_fluid": {
					"id": "justdirethings:xp_fluid_source",
					"amount": 250
				  }
			})
			allthemods.custom({
				  "type": "integrateddynamics:mechanical_squeezer",
				  "input_item": "mysticalagriculture:experience_droplet",
				  "output_fluid": {
					"id": "justdirethings:xp_fluid_source",
					"amount": 250
				  },
				  "duration": 20
				})
		}
	})
}

// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
