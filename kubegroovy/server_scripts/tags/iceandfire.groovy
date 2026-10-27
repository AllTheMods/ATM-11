/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires iceandfire
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  allthemods.add("c:wither_bones", "iceandfire:witherbone")
})

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("kubegroovy:entity_blacklist", "@iceandfire")
})
