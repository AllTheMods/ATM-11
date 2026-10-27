/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires megacells
package server_scripts.tags

$ServerEvents.tags("item", (event) -> {
  if ($Platform.isLoaded("evilcraft")) {
    event.add("megacells:compression_overrides", "evilcraft:dark_gem")
    event.add("megacells:compression_overrides", "evilcraft:dark_block")
    event.add("megacells:compression_overrides", "evilcraft:dark_power_gem")
    event.add("megacells:compression_overrides", "evilcraft:dark_power_gem_block")
  }

  event.add("megacells:compression_overrides", ["minecraft:string", "minecraft:honeycomb"])
})
