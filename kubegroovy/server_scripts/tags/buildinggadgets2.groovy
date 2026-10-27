/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires buildinggadgets2
package server_scripts.tags

$ServerEvents.tags("block", (allthemods) -> {
  // Deny blocks
  allthemods.add("buildinggadgets2:deny", ["enderstorage:ender_tank", "enderstorage:ender_chest"])
})
