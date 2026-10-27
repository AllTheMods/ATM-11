/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  // Not unbreakable
  allthemods.remove("kubegroovy:unbreakable", "kubegroovy:allthemodium_mesh")

  allthemods.add("c:storage_blocks/niter", "#c:storage_blocks/saltpeter")
  allthemods.add("c:storage_blocks", "#c:storage_blocks/niter")
})

$ServerEvents.tags("block", (allthemods) -> {
  // Saltpeter Block
  allthemods.add("c:storage_blocks/niter", "#c:storage_blocks/saltpeter")
  allthemods.add("c:storage_blocks", "#c:storage_blocks/niter")
})

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("kubegroovy:entity_blacklist", "#c:bosses")
})
