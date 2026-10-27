/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires apothic_spawners
package server_scripts.tags

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("apothic_spawners:blacklisted_from_spawners", "#kubegroovy:entity_blacklist")
})
