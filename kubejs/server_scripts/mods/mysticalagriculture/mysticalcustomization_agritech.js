if (Platform.isLoaded("mysticalagriculture") && Platform.isLoaded("agritechevolved")) {

    ServerEvents.recipes(event => {
        
        // List of crops to add with their soil
        const customCrops = [
            { name: "kivi", soil: "#agritechevolved:ma_tier2_soils" },
            { name: "unexplored_wood", soil: "#agritechevolved:ma_tier2_soils" },
            { name: "azure_silver", soil: "#agritechevolved:ma_tier3_soils" },
            { name: "black_quartz", soil: "#agritechevolved:ma_tier3_soils" },
            { name: "crimson_iron", soil: "#agritechevolved:ma_tier3_soils" },
            { name: "darkstone", soil: "#agritechevolved:ma_tier3_soils" },
            { name: "xychorium_gem", soil: "#agritechevolved:ma_tier3_soils" },
            { name: "entro", soil: "#agritechevolved:ma_tier5_soils" },
            { name: "sky_steel", soil: "#agritechevolved:ma_tier5_soils" },
            { name: "allthemodium", soil: "kubejs:magical_soil" },
            { name: "vibranium", soil: "kubejs:magical_soil" },
            { name: "unobtainium", soil: "kubejs:magical_soil" }
        ];

        // Adding Agritech Planter compatibility with Mystical Customization crops
        customCrops.forEach(crop => {
            
            event.custom({
                "type": "agritechevolved:crop",
                "seed": `mysticalagriculture:${crop.name}_seeds`,
                "soils": [
                    crop.soil
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
