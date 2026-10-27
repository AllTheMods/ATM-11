/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package client_scripts.recipe_viewer

import net.minecraft.world.item.DyeColor
import net.minecraft.world.item.ItemStack

def SilverYEET = ["sword", "shovel", "pickaxe", "axe", "hoe", "helmet", "chestplate", "leggings", "boots"]

def runicYEET = ["modern_industrialization:runic_energy_output_hatch",
                 "extended_industrialization:runic_tesla_receiver_hatch",
                 "modern_industrialization:superconductor_runic_transformer",
                 "modern_industrialization:runic_superconductor_transformer",
                 "modern_industrialization:runic_ev_transformer",
                 "modern_industrialization:runic_storage_unit",
                 "modern_industrialization:ev_runic_transformer",
                 "forbidden_arcanus:corrupted_arcane_crystal_block"]

def YEET = ['appflux:core_1m',
            'appflux:core_4m',
            'appflux:core_16m',
            'appflux:core_64m',
            'appflux:core_256m',
            'appflux:fe_1m_cell',
            'appflux:fe_4m_cell',
            'appflux:fe_16m_cell',
            'appflux:fe_64m_cell',
            'appflux:fe_256m_cell',
            'appflux:fe_1m_portable_cell',
            'appflux:fe_4m_portable_cell',
            'appflux:fe_16m_portable_cell',
            'appflux:fe_64m_portable_cell',
            'appflux:fe_256m_portable_cell']

$RecipeViewerEvents.removeEntriesCompletely("item", (allthemods) -> {
  allthemods.remove("quarryplus:adv_quarry")
  allthemods.remove("allthetweaks:greg_star")
  allthemods.remove("allthetweaks:greg_star_block")

  if ($Platform.isLoaded("allthecompressed")) {
    for (def i = 1; i < 10; i++) {
      allthemods.remove("allthecompressed:greg_star_block_${i}x")
    }
  }

  if ($Platform.isLoaded("extradisks")) {
    // allthemods.remove('relics:researching_table')
    if ($Platform.isLoaded("mekanism")) {
      allthemods.remove("extradisks:infinite_chemical_storage_block")
      allthemods.remove("extradisks:infinite_chemical_storage_disk")
      allthemods.remove("extradisks:infinite_chemical_storage_part")
    }
    allthemods.remove("extradisks:infinite_fluid_storage_block")
    allthemods.remove("extradisks:infinite_fluid_storage_disk")
    allthemods.remove("extradisks:infinite_fluid_storage_part")
    allthemods.remove("extradisks:infinite_item_storage_block")
    allthemods.remove("extradisks:infinite_item_storage_disk")
    allthemods.remove("extradisks:infinite_item_storage_part")
  }

  for (def color : DyeColor.values()) {
    allthemods.remove("/refinedstorage:${color}_.*/")
  }

  if ($Platform.isLoaded("mekmm")) {
    allthemods.remove("mekmm:scrap")
    allthemods.remove("mekmm:scrap_box")
    allthemods.remove("mekmm:empty_crystal")
    allthemods.remove("mekmm:uu_matter")
    allthemods.remove("mekmm:ambient_gas_collector")
    allthemods.remove(/mekmm:.*replicat.*/)
    allthemods.remove(/mekmm:.*recycl.*/)
    allthemods.remove(/mekmm:.*planting.*/)
    allthemods.remove("mekmm:cnc_lathe")
    allthemods.remove(/mekmm:.*lathing.*/)
    allthemods.remove(/mekmm:.*rolling_mill.*/)
  }

  if ($Platform.isLoaded("supplementaries")) {
    allthemods.remove("supplementaries:faucet")
  }
})

// RecipeViewerEvents.removeEntriesCompletely('mekanism:chemical', allthemods => {
//
//     allthemods.remove('mekmm:uu_matter')
//     allthemods.remove('mekmm:unstable_dimensional_gas')
// })

$RecipeViewerEvents.removeEntries("item", (allthemods) -> {
  for (def yeet : runicYEET) {
    if ($Item.exists(yeet)) {
      allthemods.remove(yeet)
    }
  }

  for (def yeet : YEET) {
    if ($Item.exists(yeet)) {
      allthemods.remove(yeet)
    }
  }

  if ($Platform.isLoaded("iceandfire") && $Platform.isLoaded("occultism")) {
    SilverYEET.forEach(item -> {
      if ($Item.exists("occultism:silver_${item}")) {
        allthemods.remove("occultism:silver_${item}")
      }
    })
  }

  // From JEI blacklist.json
  ["immersiveengineering:pickaxe_steel",
   "immersiveengineering:shovel_steel",
   "immersiveengineering:axe_steel",
   "immersiveengineering:hoe_steel",
   "immersiveengineering:sword_steel",
   // "railcraft:steel_sword",
   // "railcraft:steel_hoe",
   // "railcraft:steel_axe",
   // "railcraft:steel_pickaxe",
   // "railcraft:steel_shovel",
   // "railcraft:steel_boots",
   // "railcraft:steel_chestplate",
   // "railcraft:steel_helmet",
   // "railcraft:steel_leggings",
   "immersiveengineering:armor_steel_boots",
   "immersiveengineering:armor_steel_leggings",
   "immersiveengineering:armor_steel_chestplate",
   "immersiveengineering:armor_steel_helmet",
   "mekanism:creative_chemical_tank",
   "mekanism:creative_fluid_tank",
   "mekanism:creative_bin",
   "bigreactors:reinforced_reactorcreativewatergenerator",
   "bigreactors:basic_turbinecreativesteamgenerator",
   "bigreactors:reinforced_turbinecreativesteamgenerator",
   "functionalstorage:creative_vending_upgrade",
   "enderio:creative_power",
   "ae2:creative_storage_cell",
   "mysticalagriculture:creative_soulium_dagger",
   "modularrouters:creative_module",
   "modern_industrialization:creative_tank",
   "modern_industrialization:creative_storage_unit",
   "pneumaticcraft:creative_upgrade",
   "quarryplus:creative_generator",
   "rftoolspower:dimensionalcell_creative",
   "xycraft_machines:item_selector",
   "xycraft_machines:fluid_selector",
   "stevescarts:module_creative_engine",
   "stevescarts:module_creative_hull",
   "stevescarts:upgrade_creative_mode",
   "ftbquests:stage_barrier",
   "ftbquests:barrier",
   "forbidden_arcanus:draco_arcanus_boots",
   "forbidden_arcanus:draco_arcanus_leggings",
   "forbidden_arcanus:draco_arcanus_chestplate",
   "forbidden_arcanus:draco_arcanus_helmet",
   "forbidden_arcanus:draco_arcanus_scepter",
   "forbidden_arcanus:draco_arcanus_hoe",
   "forbidden_arcanus:draco_arcanus_axe",
   "forbidden_arcanus:draco_arcanus_pickaxe",
   "forbidden_arcanus:draco_arcanus_shovel",
   "forbidden_arcanus:draco_arcanus_sword",
   "forbidden_arcanus:draco_arcanus_staff",
   "naturesaura:multiblock_maker",
   "modern_industrialization:creative_barrel",
   "mininggadgets:upgrade_battery_creative",
   "immersiveengineering:capacitor_creative",
   "twilightforest:uncrafting_table",
   "mifa:efficiency_addon_5",
   "mifa:efficiency_addon_6",
   "mifa:efficiency_addon_7",
   "mifa:efficiency_addon_8",
   "mifa:processing_addon_5",
   "mifa:processing_addon_6",
   "mifa:processing_addon_7",
   "mifa:processing_addon_8",
   "mifa:speed_addon_5",
   "mifa:speed_addon_6",
   "mifa:speed_addon_7",
   "mifa:speed_addon_8"].forEach(item -> {
    if ($Item.exists(item)) {
      allthemods.remove(item)
    }
  })

  if ($Platform.isLoaded("hyperbox")) {
    allthemods.remove("hyperbox:hyperbox")
  }

  allthemods.remove { ItemStack stack ->
    if (stack.id == "evilcraft:dark_tank") {
      // console.log("stack is: " + stack.id)
      def component = stack.get("cyclopscore:fluid_content")
      // console.log("component is: " + component)
      if (component) return true
    }
    return false
  }
})
