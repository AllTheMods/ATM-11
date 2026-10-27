/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package server_scripts.data.worldgen

import com.google.gson.JsonArray

$ServerEvents.generateData("after_mods", (allthemods) -> {
  def ids = (JsonArray) $JsonIO.read("kubegroovy/server_scripts/data/worldgen/disable_biome_modifier_ids.json").ids

  for (def id : ids) {
    allthemods.json(id.asString + ".json", [
        "neoforge:conditions": [
            [
                type: "neoforge:never"
            ]
        ]
    ])
  }
})
