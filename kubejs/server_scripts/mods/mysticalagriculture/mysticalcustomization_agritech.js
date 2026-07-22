if (Platform.isLoaded("mysticalagriculture") && Platform.isLoaded("agritechevolved")) {

    ServerEvents.recipes(event => {
        
        // List of crops to add with tier
        const customCrops = [
            { name: "kivi", tier: "2" },
            { name: "unexplored_wood", tier: "2" },
            { name: "azure_silver", tier: "3" },
            { name: "black_quartz", tier: "3" },
            { name: "crimson_iron", tier: "3" },
            { name: "darkstone", tier: "3" },
            { name: "xychorium_gem", tier: "3" },
            { name: "entro", tier: "5" },
            { name: "sky_steel", tier: "5" }
        ];

        // Adding Agritech Planter compatibility with Mystical Customization crops
        customCrops.forEach(crop => {
            
            event.custom({
                "type": "agritechevolved:crop",
                "seed": `mysticalagriculture:${crop.name}_seeds`,
                "soils": [
                    `#agritechevolved:ma_tier${crop.tier}_soils`
                ],
                "drops": [
                    {
                        "item": `mysticalagriculture:${crop.name}_essence`,
                        "min": 1,
                        "max": 1,
                        "chance": 1.0
                    },
                    {
                        "item": `mysticalagriculture:${crop.name}_seeds`,
                        "min": 1,
                        "max": 1,
                        "chance": 0.2
                    },
                    {
                        "item": "mysticalagriculture:fertilized_essence",
                        "min": 1,
                        "max": 1,
                        "chance": 0.1
                    }
                ]
            });
            
        });

        // List of magical crops to add
        const customCropsMagical = [
            { name: "allthemodium" },
            { name: "vibranium" },
            { name: "unobtainium" }
        ];
        
        // Adding Agritech Planter compatibility with Mystical Customization magical crops
        customCropsMagical.forEach(crop => {
            
            event.custom({
                "type": "agritechevolved:crop",
                "seed": `mysticalagriculture:${crop.name}_seeds`,
                "soils": [
                    `kubejs:magical_soil`
                ],
                "drops": [
                    {
                        "item": `mysticalagriculture:${crop.name}_essence`,
                        "min": 1,
                        "max": 1,
                        "chance": 1.0
                    },
                    {
                        "item": `mysticalagriculture:${crop.name}_seeds`,
                        "min": 1,
                        "max": 1,
                        "chance": 0.2
                    },
                    {
                        "item": "mysticalagriculture:fertilized_essence",
                        "min": 1,
                        "max": 1,
                        "chance": 0.1
                    }
                ]
            });
            
        });
    });

}
