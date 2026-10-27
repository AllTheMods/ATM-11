/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires railcraft
package server_scripts.tags

$ServerEvents.tags("block", (allthemods) -> {
  allthemods.add("c:stones", ["railcraft:abyssal_stone", "railcraft:quarried_stone"])
})

$ServerEvents.tags("item", (allthemods) -> {
  allthemods.add("c:stones", ["railcraft:abyssal_stone", "railcraft:quarried_stone"])
})
