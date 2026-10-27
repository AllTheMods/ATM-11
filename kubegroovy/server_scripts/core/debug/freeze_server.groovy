/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package server_scripts.core.debug

def shouldFreeze = false // set this to true if you need to debug something on your world

if (shouldFreeze) {
  $ServerEvents.loaded((event) -> {
    event.server.tell("Starting server frozen...")
    event.server.runCommandSilent("tick freeze")
  })
}
