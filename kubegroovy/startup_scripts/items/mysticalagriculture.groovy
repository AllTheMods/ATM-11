/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagriculture
package startup_scripts.items

$StartupEvents.registry("item") {allthemods ->
  // from the block aliases
  allthemods.addAlias("kubejs:magical_soil", "kubegroovy:magical_soil")

  allthemods.create("inferium_enchanting_base").with {
    texture("minecraft:item/enchanted_book")
    color(0x55ff55)
  }
  allthemods.addAlias("kubejs:inferium_enchanting_base", "kubegroovy:inferium_enchanting_base")
  allthemods.create("prudentium_enchanting_base").with {
    texture("minecraft:item/enchanted_book")
    color(0x00aa00)
  }
  allthemods.addAlias("kubejs:prudentium_enchanting_base", "kubegroovy:prudentium_enchanting_base")
  allthemods.create("tertium_enchanting_base").with {
    texture("minecraft:item/enchanted_book")
    color(0xeb7114)
  }
  allthemods.addAlias("kubejs:tertium_enchanting_base", "kubegroovy:tertium_enchanting_base")
  allthemods.create("imperium_enchanting_base").with {
    texture("minecraft:item/enchanted_book")
    color(0x5555ff)
  }
  allthemods.addAlias("kubejs:imperium_enchanting_base", "kubegroovy:imperium_enchanting_base")
  allthemods.create("supremium_enchanting_base").with {
    texture("minecraft:item/enchanted_book")
    color(0xff5555)
  }
}
