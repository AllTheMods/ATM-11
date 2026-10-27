/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// priority 0
package client_scripts.integrations

import net.minecraft.nbt.StringTag

// Don't try to be hacker and disable this script
// All logic is made on server side
// And disabling this will only cause visual bug

def bannedItems = (Set<String>) new HashSet()

$NetworkEvents.dataReceived("banned_items", (event) -> {
  console.log("Received banned items...")
  event.data.getListOrEmpty("banned_items").forEach((value) -> {
    if (value instanceof StringTag st) {
      console.log("Adding item " + st.value() + " to banned list")
      bannedItems.add(st.value())
    }
  })
})

// When aiming at air
$ItemEvents.rightClicked((event) -> {
  if (bannedItems.contains(event.item.id)) {
    // event.entity.setStatusMessage(Text.gold("You are not allowed to use this item"))
    event.cancel()
  }
})

// When aiming at any block
$BlockEvents.rightClicked((event) -> {
  if (bannedItems.contains(event.item.id)) {
    // event.entity.setStatusMessage(Text.gold("You are not allowed to use this item"))
    event.cancel()
  }
})
