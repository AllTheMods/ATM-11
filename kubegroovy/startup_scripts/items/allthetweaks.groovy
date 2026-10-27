/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires allthetweaks
package startup_scripts.items

$StartupEvents.registry("item") {allthemods ->
  def shards = ["atm_star_shard_1", "atm_star_shard_2", "atm_star_shard_3", "atm_star_shard_4", "atm_star_shard_5"]
  for (var shard : shards) {
    allthemods.create(shard).displayName("ATM Star Fragment")
    allthemods.addAlias("kubejs:$shard", "kubegroovy:$shard")
  }
}
