/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires twilightforest
package server_scripts.tags

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("kubegroovy:entity_blacklist", [
      "twilightforest:hedge_spider",
      "twilightforest:swarm_spider"
  ])
})

$ServerEvents.tags("item", (allthemods) -> {
  def woods = ["canopy", "dark", "mangrove", "mining", "sorting", "time", "transformation", "twilight_oak"]
  allthemods.add("allthemods:planks_with_chest", woods.collect { "twilightforest:${it}_planks".toString() })
  allthemods.add("allthemods:chests_with_trapped_chest", woods.collect { "twilightforest:${it}_chest".toString() })
  allthemods.add("allthemods:planks_with_chiseled_bookshelf", "twilightforest:canopy_planks")
})
