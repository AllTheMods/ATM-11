/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires forbidden_arcanus
package server_scripts.registry

$ServerEvents.registry("forbidden_arcanus:molten_material_type", (allthemods) -> {
  allthemods.createFromJson("deorum_bee", [
      "max_amount": 2304,
      "result"    : [
          "components": [
              "minecraft:entity_data": [
                  "type": "productivebees:forbidden_arcanus/deorum",
                  "id"  : "productivebees:configurable_bee"
              ]
          ],
          "count"     : 1,
          "id"        : "productivebees:spawn_egg_configurable_bee"
      ]
  ])
})
