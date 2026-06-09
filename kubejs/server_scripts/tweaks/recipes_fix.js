ServerEvents.generateData("after_mods", (allthemods) => {
  let json = {
    "type": "crafting_shaped",
    "neoforge:conditions": [
      {
        "type": "neoforge:mod_loaded",
        "modid": "ae2"
      },
      {
        "type": "mysticalagriculture:crop_enabled",
        "crop": "mysticalagriculture:certus_quartz"
      }
    ],
    "pattern": [
      "EEE",
      "EME",
      "EEE"
    ],
    "key": {
      "E": "mysticalagriculture:certus_quartz_essence",
      "M": "#c:gems/diamond"
    },
    "result": {
      "id": "ae2:engineering_processor_press",
      "count": 1
    }
  }
  
  allthemods.json("mysticalagriculture:recipe/essence/appliedenergistics2/engineering_press.json", json)

  json = {
    "type": "crafting_shaped",
    "neoforge:conditions": [
      {
        "type": "neoforge:mod_loaded",
        "modid": "ae2"
      },
      {
        "type": "mysticalagriculture:crop_enabled",
        "crop": "mysticalagriculture:certus_quartz"
      }
    ],
    "pattern": [
      "EEE",
      "EME",
      "EEE"
    ],
    "key": {
      "E": "mysticalagriculture:certus_quartz_essence",
      "M": "#c:ingots/gold"
    },
    "result": {
      "id": "ae2:logic_processor_press",
      "count": 1
    }
  }
  
  allthemods.json("mysticalagriculture:recipe/essence/appliedenergistics2/logic_press.json", json)

  json = {
    "neoforge:conditions": [
      {
        "type": "productivebees:bee_exists",
        "bee": "productivebees:forbidden_arcanus/stellarite"
      },
      {
        "type": "neoforge:mod_loaded",
        "modid": "forbidden_arcanus"
      }
    ],
    "type": "productivebees:centrifuge",
    "ingredient": {
      "neoforge:ingredient_type": "productivebees:component",
      "components": {
        "productivebees:bee_type": "productivebees:forbidden_arcanus/stellarite"
      },
      "items": "productivebees:configurable_honeycomb"
    },
    "outputs": [
      {
        "chance": 0.3,
        "item": "forbidden_arcanus:condensed_experience"
      },
      {
        "chance": 0.1,
        "item": "forbidden_arcanus:stellarite_piece"
      },
      {
        "item": "productivebees:wax"
      }
    ]
  }

  allthemods.json("productivebees:recipe/centrifuge/forbidden_arcanus/honeycomb_stellarite.json", json)

  json = {
    "type": "forbidden_arcanus:clibano_combustion",
    "category": "misc",
    "cooking_time": 150,
    "experience": 1,
    "fire_type": "soul_fire",
    "ingredient": "minecraft:bee_spawn_egg",
    "residue": {
      "chance": 0.65,
      "type": "forbidden_arcanus:gold"
    },
    "result": {
      "type": "kubejs:deorum_bee",
      "amount": 1
    },
    "neoforge:conditions": [
      {
        "type": "productivebees:bee_exists",
        "bee": "productivebees:raw_materials/gold"
      },
      {
        "type": "productivebees:bee_exists",
        "bee": "productivebees:forbidden_arcanus/deorum"
      },
      {
        "type": "neoforge:mod_loaded",
        "modid": "forbidden_arcanus"
      }
    ]
  }

  allthemods.json("productivebees:recipe/forbidden_arcanus/clibano_combustion/deorum_bee.json", json)

})