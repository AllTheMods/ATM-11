/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package server_scripts.core.player_fixes

$PlayerEvents.loggedIn((event) -> {
  if (event.player.getHealth().toString() == "NaN") event.player.setHealth(event.player.getMaxHealth())
  if (event.player.getAbsorptionAmount().toString() == "NaN") event.player.setAbsorptionAmount(0)
})
