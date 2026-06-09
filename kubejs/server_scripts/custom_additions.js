ServerEvents.registry("forbidden_arcanus:molten_material_type", (allthemods) => {
    allthemods.createFromJson("deorum_bee", {
        "components": {
          "minecraft:entity_data": {
            "type": "productivebees:forbidden_arcanus/deorum",
            "id": "productivebees:configurable_bee"
          }
        },
        "count": 1,
        "id": "productivebees:spawn_egg_configurable_bee"
    })
})