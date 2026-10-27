/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires oritech
package server_scripts.tags

$ServerEvents.tags("fluid", (allthemods) -> {
  allthemods.add("c:fuels/crude_oil", "oritech:still_oil")
})

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("oritech:spawner_blacklist", "#kubegroovy:entity_blacklist")
})
