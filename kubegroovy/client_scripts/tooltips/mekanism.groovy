/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mekanism
package client_scripts.tooltips

$ItemEvents.modifyTooltips((allthemods) -> {
  // ##### Gear #####
  // Mekasuit
  allthemods.add(/mekanism:mekasuit_/, [
      $Text.red("Increased Energy Consumption!"),
      $Text.green("Increased Energy Capacity")
  ])
  // Meka Tool
  allthemods.add("mekanism:meka_tool", [
      $Text.red("Increased Energy Consumption!"),
      $Text.green("Increased Energy Capacity!"),
      $Text.green("Increased Attack Speed & Damage!")
  ])
  // Boiler
  allthemods.add(/mekanism:boiler_/, [$Text.green("Increased Production Speed!")])

  // ##### Machines #####

  // Upgrades
  allthemods.add(/mekanism:upgrade_/, [$Text.green("Increased Machine Boost!")])
  // Waste Barrel
  allthemods.add("mekanism:radioactive_waste_barrel", [$Text.green("Increased Decay Rate!")])
  // Thermal Evaporation Tower
  allthemods.add(/mekanism:thermal_evaporation_/, [$Text.green("Increased Production Speed!")])
  // Solar Neutron Activator
  allthemods.add("mekanism:solar_neutron_activator", [
      $Text.green("Increased Production Speed!"),
      $Text.green("Waste -> Polonium buffed!")
  ])
  // Isotopic Centrifuge
  allthemods.add("mekanism:isotopic_centrifuge", [$Text.green("Waste -> Plutonium buffed!")])
  // Electric Pump
  allthemods.add("mekanism:electric_pump", [$Text.green("Increased Production Speed!")])
  // SPS
  allthemods.add(/mekanism:sps_/, [$Text.green("Decreased Energy Consumption!")])

  // ##### Generators #####

  if ($Platform.isLoaded("mekanismgenerators")) {
    // Solar Generator
    allthemods.add("mekanismgenerators:solar_generator", [$Text.green("Increased Energy Capacity & Production!")])
    // Advanced Solar Generator
    allthemods.add("mekanismgenerators:advanced_solar_generator", [
        $Text.green("Increased Energy Capacity & Production!")
    ])
    // Wind Generator
    allthemods.add("mekanismgenerators:wind_generator", [$Text.green("Increased Energy Capacity & Production!")])
    // Heat Generator
    allthemods.add("mekanismgenerators:heat_generator", [$Text.green("Increased Energy Capacity & Production!")])
    // Gas Burning Generator
    allthemods.add("mekanismgenerators:gas_burning_generator", [
        $Text.red("Decreased Energy Production!"),
        $Text.red("Increased Fuel Consumption!")
    ])
    // Fission Generator
    allthemods.add(/mekanismgenerators:fission_/, [$Text.red("Decreased Energy Production!")])
    // Fusion Generator
    allthemods.add(/mekanismgenerators:fusion_/, [
        $Text.red("Decreased Energy Production!"),
        $Text.green("Decreased Fuel Consumption!")
    ])
    // Turbine
    allthemods.add(/mekanismgenerators:turbine_/, [$Text.green("Increased Production Speed!")])
  }
})
