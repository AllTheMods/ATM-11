/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mob_grinding_utils
package server_scripts.tags

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("mob_grinding_utils:no_swab", "#kubegroovy:entity_blacklist")
  allthemods.add("mob_grinding_utils:no_spawn", "#kubegroovy:entity_blacklist")
})
