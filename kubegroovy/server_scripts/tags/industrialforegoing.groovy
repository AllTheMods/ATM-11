/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires industrialforegoing
package server_scripts.tags

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("industrialforegoing:mob_duplicator_blacklist", "#kubegroovy:entity_blacklist")
  allthemods.add("industrialforegoing:mob_crusher_blacklist", "#kubegroovy:entity_blacklist")
})
