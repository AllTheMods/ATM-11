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

  if (Platform.getInfo("cookingforblockheads").version == "26.1.2.4") { // bump if needed
    let recipes = [
      "railcraft:recipe/patchouli_book_crafting"
    ]
    recipes.forEach(recipe => {
      allthemods.json(recipe + ".json", jsonDisable)
    })
  }

  if (Platform.getInfo("arsmagicalegacy").version == "1.7.0") { // bump if needed
    json = {
      "type": "integrateddynamics:squeezer",
      "input_item": "arsmagicalegacy:desert_nova",
      "output_items": [{
        "item": {
          "count": 4,
          "id": "minecraft:red_dye"
        }
      }]
    }
    allthemods.json("arsmagicalegacy:recipe/compat/integrateddynamics/squeezer/desert_nova.json", json)

    json = {
      "type": "integrateddynamics:squeezer",
      "input_item": "arsmagicalegacy:cerublossom",
      "output_items": [{
        "item": {
          "count": 4,
          "id": "minecraft:blue_dye"
        }
      }]
    }
    allthemods.json("arsmagicalegacy:recipe/compat/integrateddynamics/squeezer/cerublossom.json", json)

    json = {
      "type": "integrateddynamics:mechanical_squeezer",
      "duration": 5,
      "input_item": "arsmagicalegacy:aum",
      "output_items": [{
        "item": {
          "count": 4,
          "id": "minecraft:pink_dye"
        }
      }, {
        "item": {
          "count": 2,
          "id": "minecraft:pink_dye"
        },
        "chance": 0.5
      }]
    }
    allthemods.json("arsmagicalegacy:recipe/compat/integrateddynamics/mechanical_squeezer/aum", json)

    json = {
      "type": "integrateddynamics:mechanical_squeezer",
      "duration": 5,
      "input_item": "arsmagicalegacy:tarma_root",
      "output_items": [{
        "item": {
          "count": 4,
          "id": "minecraft:brown_dye"
        }
      }, {
        "item": {
          "count": 2,
          "id": "minecraft:brown_dye"
        },
        "chance": 0.5
      }]
    }
    allthemods.json("arsmagicalegacy:recipe/compat/integrateddynamics/mechanical_squeezer/tarma_root", json)

    json = {
      "type": "integrateddynamics:mechanical_squeezer",
      "duration": 5,
      "input_item": "arsmagicalegacy:cerublossom",
      "output_items": [{
        "item": {
          "count": 4,
          "id": "minecraft:blue_dye"
        }
      }, {
        "item": {
          "count": 2,
          "id": "minecraft:blue_dye"
        },
        "chance": 0.5
      }]
    }
    allthemods.json("arsmagicalegacy:recipe/compat/integrateddynamics/mechanical_squeezer/cerublossom", json)

    json = {
      "type": "integrateddynamics:mechanical_squeezer",
      "duration": 5,
      "input_item": "arsmagicalegacy:desert_nova",
      "output_items": [{
        "item": {
          "count": 4,
          "id": "minecraft:red_dye"
        }
      }, {
        "item": {
          "count": 2,
          "id": "minecraft:red_dye"
        },
        "chance": 0.5
      }]
    }
    allthemods.json("arsmagicalegacy:recipe/compat/integrateddynamics/mechanical_squeezer/desert_nova", json)

    json = {
      "type": "integrateddynamics:squeezer",
      "input_item": "arsmagicalegacy:aum",
      "output_items": [{
        "item": {
          "count": 4,
          "id": "minecraft:pink_dye"
        }
      }]
    }
    allthemods.json("arsmagicalegacy:recipe/compat/integrateddynamics/squeezer/aum", json)

    json = {
      "type": "integrateddynamics:mechanical_squeezer",
      "duration": 5,
      "input_item": "arsmagicalegacy:wakebloom",
      "output_items": [{
        "item": {
          "count": 4,
          "id": "minecraft:magenta_dye"
        }
      }, {
        "item": {
          "count": 2,
          "id": "minecraft:magenta_dye"
        },
        "chance": 0.5
      }]
    }
    allthemods.json("arsmagicalegacy:recipe/compat/integrateddynamics/mechanical_squeezer/wakebloom", json)

    json = {
      "type": "integrateddynamics:squeezer",
      "input_item": "arsmagicalegacy:tarma_root",
      "output_items": [{
        "item": {
          "count": 4,
          "id": "minecraft:brown_dye"
        }
      }]
    }
    allthemods.json("arsmagicalegacy:recipe/compat/integrateddynamics/squeezer/tarma_root", json)

    json = {
      "type": "integrateddynamics:squeezer",
      "input_item": "arsmagicalegacy:wakebloom",
      "output_items": [{
        "item": {
          "count": 4,
          "id": "minecraft:magenta_dye"
        }
      }]
    }
    allthemods.json("arsmagicalegacy:recipe/compat/integrateddynamics/squeezer/wakebloom", json)
  }

})