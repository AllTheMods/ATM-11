/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires iceandfire
package startup_scripts.items

import dev.uncandango.kubegroovy.item.ItemBehavior

$StartupEvents.registry("item") { allthemods ->
  allthemods.create("fire_eye").with {
    use((level, player, hand) -> ((ItemBehavior.UseCallback) global.iceAndFirePearls).use(level, player, hand))
    texture("kubegroovy:item/fire_eye")
  }
  allthemods.addAlias("kubejs:fire_eye", "kubegroovy:fire_eye")

  allthemods.create("fire_pearl").texture("kubegroovy:item/fire_pearl")
  allthemods.addAlias("kubejs:fire_pearl", "kubegroovy:fire_pearl")

  allthemods.create("lightning_eye").with {
    use((level, player, hand) -> ((ItemBehavior.UseCallback) global.iceAndFirePearls).use(level, player, hand))
    texture("kubegroovy:item/lightning_eye")
  }
  allthemods.addAlias("kubejs:lightning_eye", "kubegroovy:lightning_eye")

  allthemods.create("lightning_pearl").texture("kubegroovy:item/lightning_pearl")
  allthemods.addAlias("kubejs:lightning_pearl", "kubegroovy:lightning_pearl")

  allthemods.create("ice_eye").with {
    use((level, player, hand) -> ((ItemBehavior.UseCallback) global.iceAndFirePearls).use(level, player, hand))
    texture("kubegroovy:item/ice_eye")
  }
  allthemods.addAlias("kubejs:ice_eye", "kubegroovy:ice_eye")

  allthemods.create("ice_pearl").texture("kubegroovy:item/ice_pearl")
  allthemods.addAlias("kubejs:ice_pearl", "kubegroovy:ice_pearl")
}
