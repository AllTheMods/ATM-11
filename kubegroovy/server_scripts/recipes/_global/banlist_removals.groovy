/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// priority 10
package server_scripts.recipes._global

if (config) {
  def recipesToRemove = (List<String>) config?.server?.remove_recipes_by

  if (!recipesToRemove.isEmpty()) {
    $ServerEvents.recipes((event) -> {
      recipesToRemove.forEach((item) -> {
        event.remove(item)
      })
    })
  }
}
