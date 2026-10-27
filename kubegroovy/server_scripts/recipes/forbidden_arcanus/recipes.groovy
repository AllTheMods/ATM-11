/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires forbidden_arcanus
package server_scripts.recipes.forbidden_arcanus

$ServerEvents.recipes((allthemods) -> {
  allthemods.remove([ id: "forbidden_arcanus:smelting/dark_matter" ])
  allthemods.smelting("forbidden_arcanus:dark_matter", "forbidden_arcanus:edelwood_log")
  allthemods.remove("forbidden_arcanus:apply_modifier/eternal")
})
