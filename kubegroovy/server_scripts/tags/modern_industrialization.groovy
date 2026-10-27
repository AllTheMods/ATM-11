/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires modern_industrialization
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  allthemods.add("c:coal_coke", "modern_industrialization:coke")

  allthemods.add("c:dusts/coal_coke", "modern_industrialization:coke_dust")

  allthemods.add("c:storage_blocks/coal_coke", "modern_industrialization:coke_block")
})

$ServerEvents.tags("fluid", (allthemods) -> {
  allthemods.add("c:crude_oil", "modern_industrialization:crude_oil")
  allthemods.add("c:fuels/crude_oil", "modern_industrialization:crude_oil")
})
