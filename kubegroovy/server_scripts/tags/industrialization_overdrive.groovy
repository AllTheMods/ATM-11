/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires industrialization_overdrive
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  allthemods.add("industrialization_overdrive:multi_processing_array_blacklist", [
      "modern_industrialization:auto_forge",
      "modern_industrialization:star_altar",
      "modern_industrialization:runic_crucible",
      "modern_industrialization:runic_enchanter"
  ])
})
