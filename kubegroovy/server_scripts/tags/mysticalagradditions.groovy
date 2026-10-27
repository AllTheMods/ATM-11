/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagradditions
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  // Not unbreakable
  allthemods.remove("kubegroovy:unbreakable", [
      "mysticalagradditions:supremium_paxel",
      "mysticalagradditions:awakened_supremium_paxel"
  ])
})
