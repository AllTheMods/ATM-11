/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires regions_unexplored
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  allthemods.add("regions_unexplored:magnolia_logs", [
      "regions_unexplored:magnolia_log",
      "regions_unexplored:stripped_magnolia_log",
      "regions_unexplored:magnolia_wood",
      "regions_unexplored:stripped_magnolia_wood"
  ])
  allthemods.add("regions_unexplored:alpha_logs", ["regions_unexplored:alpha_log"])
  allthemods.add("regions_unexplored:silver_birch_logs", [
      "regions_unexplored:silver_birch_log",
      "regions_unexplored:silver_birch_wood"
  ])
  allthemods.add("regions_unexplored:alpha_logs", ["regions_unexplored:alpha_log"])
})
