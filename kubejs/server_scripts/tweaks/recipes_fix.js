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

  json = {
    "neoforge:conditions": [
      {
        "type": "neoforge:mod_loaded",
        "modid": "patchouli"
      }
    ],
    "type": "minecraft:crafting_shapeless",
    "ingredients": [
      "laserio:logic_chip",
      "minecraft:book"
    ],
    "result": {
      "id": "patchouli:guide_book",
      "components": {
        "patchouli:book": "laserio:laseriobook"
      }
    }
  }

  allthemods.json("laserio:recipe/my_book_recipe_shapeless.json", json)

  json = {
    "neoforge:conditions": [
      {
        "type": "productivebees:bee_exists",
        "bee": "productivebees:oritech/uranite_crystal"
      },
      {
        "type": "neoforge:mod_loaded",
        "modid": "oritech"
      }
    ],
    "type": "productivebees:centrifuge",
    "ingredient": {
      "neoforge:ingredient_type": "productivebees:component",
      "components": {
        "productivebees:bee_type": "productivebees:oritech/uranite_crystal"
      },
      "items": "productivebees:configurable_honeycomb"
    },
    "outputs": [
      {
        "chance": 0.75,
        "item": "oritech:uranite_crystal"
      }
    ]
  }

  allthemods.json("productivebees:recipe/centrifuge/oritech/honeycomb_uranite_crystal.json", json)

  // TODO: Temp remove
  let jsonDisable = { "neoforge:conditions": [{ "type": "neoforge:never" }] }

  if (Platform.getInfo("advanced_ae").version == "26.1.5") { // bump if needed
    let recipes = [
      "advanced_ae:recipe/wt_combine_crafting",
      "advanced_ae:recipe/wt_combine_encoding",
      "advanced_ae:recipe/wt_combine_access",
      "advanced_ae:recipe/wt_upgrade_quantum_crafter_terminal",
    ]
    recipes.forEach(recipe => {
      allthemods.json(recipe + ".json", jsonDisable)
    })
  }

  if (Platform.getInfo("advanced_ae").version == "26.1.6") { // bump if needed
    json = {
      "type": "ae2wtlib:combine",
      "terminalA": "ae2wtlib:wireless_pattern_access_terminal",
      "terminalB": "advanced_ae:wireless_quantum_crafter_terminal",
      "terminalAName": "pattern_access",
      "terminalBName": "quantum_crafter"
    }
    allthemods.json("advanced_ae:recipe/wt_combine_access.json", json)

    json = {
      "type": "ae2wtlib:combine",
      "terminalA": "ae2:wireless_crafting_terminal",
      "terminalB": "advanced_ae:wireless_quantum_crafter_terminal",
      "terminalAName": "crafting",
      "terminalBName": "quantum_crafter"
    }
    allthemods.json("advanced_ae:recipe/wt_combine_crafting.json", json)

    json = {
      "type": "ae2wtlib:combine",
      "terminalA": "ae2wtlib:wireless_pattern_encoding_terminal",
      "terminalB": "advanced_ae:wireless_quantum_crafter_terminal",
      "terminalAName": "pattern_encoding",
      "terminalBName": "quantum_crafter"
    }
    allthemods.json("advanced_ae:recipe/wt_combine_encoding.json", json)

    json = {
      "type": "ae2wtlib:upgrade",
      "terminal": "advanced_ae:wireless_quantum_crafter_terminal",
      "terminalName": "quantum_crafter"
    }
    allthemods.json("advanced_ae:recipe/wt_upgrade_quantum_crafter_terminal.json", json)
  }

  json = {
    "type": "minecraft:crafting_shapeless",
    "ingredients": [
      "laserbridges:laser_source_block"
    ],
    "result": {
      "count": 1,
      "id": "laserbridges:laser_fence_source_block"
    }
  }
  allthemods.json("laserbridges:recipe/bridge_to_fence.json", json)

  json = {
    "type": "minecraft:crafting_shapeless",
    "ingredients": [
      "laserbridges:laser_fence_source_block"
    ],
    "result": {
      "count": 1,
      "id": "laserbridges:laser_source_block"
    }
  }
  allthemods.json("laserbridges:recipe/fence_to_bridge.json", json)

  json = {
    "type": "minecraft:crafting_shaped",
    "pattern": [
      "IGI",
      "IEI",
      "III"
    ],
    "key": {
      "I": "minecraft:iron_ingot",
      "G": "minecraft:glass",
      "E": "minecraft:end_crystal"
    },
    "result": {
      "id": "laserbridges:laser_source_block",
      "count": 2
    }
  }
  allthemods.json("laserbridges:recipe/laser_source_block.json", json)

})