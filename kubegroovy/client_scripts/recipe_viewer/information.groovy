/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package client_scripts.recipe_viewer

$RecipeViewerEvents.addInformation("item", (allthemods) -> {
  allthemods.add("justdirethings:polymorphic_catalyst", ["§8Drop a §cPolymorphic Catalyst§8 into §1Water§8 to get Polymorphic Fluid"])
  allthemods.add("justdirethings:portal_fluid_catalyst", ["§8Drop a §dPortal Fluid Catalyst§8 into Polymorphic Fluid§8 in t§dThe End§8 to get §5Unstable Portal Fluid"])
})

$RecipeViewerEvents.addInformation("fluid", (allthemods) -> {
  allthemods.add("advanced_ae:quantum_infusion_source", ["§8In the Reaction Chamber: §e4000mb of Water§8 + §e1x Quantum Infused Dust§8 = §b1000mb of Quantum Infusion"])
  allthemods.add("justdirethings:polymorphic_fluid_source", ["§8Drop a §cPolymorphic Catalyst§8 into §bWater§8 to get Polymorphic Fluid"])
  allthemods.add("justdirethings:unstable_portal_fluid_source", ["§8Drop a §dPortal Fluid Catalyst§8 into §dPolymorphic Fluid§8 in §5The End§8 to get §5Unstable Portal Fluid"])
})
