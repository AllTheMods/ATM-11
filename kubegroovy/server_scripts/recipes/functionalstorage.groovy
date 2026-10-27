/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires functionalstorage
package server_scripts.recipes

import net.minecraft.world.item.ItemStackTemplate

$ServerEvents.recipes((allthemods) -> {
  def compacting = { LowerItem, HigherItem ->
    allthemods.recipes.functionalstorageCustomCompacting(LowerItem as ItemStackTemplate, HigherItem as ItemStackTemplate)
  }
  compacting("8x utilitarian:tiny_charcoal", "minecraft:charcoal")
  compacting("8x utilitarian:tiny_coal", "minecraft:coal")
})
