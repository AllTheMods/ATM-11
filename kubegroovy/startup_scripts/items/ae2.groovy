/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires ae2
package startup_scripts.items

$StartupEvents.registry("item") { allthemods ->
  allthemods.create("universal_press").with {
    texture("kubegroovy:item/universal_press")
    maxStackSize(64)
    displayName("Inscriber Universal Press")
  }
  allthemods.addAlias("kubejs:universal_press", "kubegroovy:universal_press")
}
