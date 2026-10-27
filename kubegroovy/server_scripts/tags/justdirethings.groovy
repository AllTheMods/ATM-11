/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires justdirethings
package server_scripts.tags

$ServerEvents.tags("block", (allthemods) -> {
  allthemods.add("justdirethings:tick_speed_deny", "@industrialforegoingsouls")
})

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("justdirethings:paradox_deny", "#kubegroovy:entity_blacklist")
})

$ServerEvents.tags("worldgen/biome", (allthemods) -> {
  allthemods.add("justdirethings:unstable_portal_fluid_viable", [
      "nullscape:crystal_peaks",
      "nullscape:shadowlands",
      "nullscape:void_barrens"
  ])
})
