/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires extendedae
package startup_scripts.items

import startup_scripts.item_types.InfinityCellItemBuilder
import dev.uncandango.kubegroovy.registry.RegistryKubeEvent
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.world.item.Item

static void registerItemCell(RegistryKubeEvent<Item> reg, String cellId, String itemId) {
  def builder = new InfinityCellItemBuilder($ID.of(cellId, true))
  builder.with {
    texture("kubegroovy:item/$cellId")
    itemType(itemId as Identifier)
    cellModel("kubegroovy:block/drive/$cellId" as Identifier)
  }
  reg.add(Registries.ITEM, builder)
}

static void registerFluidCell(RegistryKubeEvent<Item> reg, String cellId, String fluidId) {
  def builder = new InfinityCellItemBuilder($ID.of(cellId, true))
  builder.with {
    texture("kubegroovy:item/$cellId")
    fluidType(fluidId as Identifier)
    cellModel("kubegroovy:block/drive/$cellId" as Identifier)
  }
  reg.add(Registries.ITEM, builder)
}

$StartupEvents.registry("item", (allthemods) -> {

  registerFluidCell(allthemods, "lava_cell", "minecraft:lava")
  allthemods.addAlias("kubejs:lava_cell", "kubegroovy:lava_cell")

  // Basic stone / terrain / misc cells
  [
      dirt             : "minecraft:dirt",
      moss             : "minecraft:moss_block",
      andesite         : "minecraft:andesite",
      diorite          : "minecraft:diorite",
      granite          : "minecraft:granite",
      tuff             : "minecraft:tuff",
      gravel           : "minecraft:gravel",
      sand             : "minecraft:sand",
      red_sand         : "minecraft:red_sand",
      end_stone        : "minecraft:end_stone",
      netherrack       : "minecraft:netherrack",
      clay             : "minecraft:clay",
      blackstone       : "minecraft:blackstone",
      basalt           : "minecraft:basalt",
      calcite          : "minecraft:calcite",
      cobbled_deepslate: "minecraft:cobbled_deepslate",
      soul_sand        : "minecraft:soul_sand",
      sky_stone        : "ae2:sky_stone_block",
      ancient_stone    : "allthemodium:ancient_stone",
  ].each { name, item ->
    registerItemCell(allthemods, "${name}_cell", item)
    allthemods.addAlias("kubejs:${name}_cell", "kubegroovy:${name}_cell")
  }

  // Kivi (only when XyCraft World is present)
  if ($Platform.isLoaded("xycraft_world")) {
    registerItemCell(allthemods, "kivi_cell", "xycraft_world:kivi")
    allthemods.addAlias("kubejs:kivi_cell", "kubegroovy:kivi_cell")
  }

  // Dye cells (cell name is the color, item is <color>_dye)
  ["white", "light_gray", "gray", "black", "brown", "red", "orange", "yellow",
   "lime", "green", "cyan", "light_blue", "blue", "purple", "magenta", "pink"].each { color ->
    registerItemCell(allthemods, "${color}_cell", "minecraft:${color}_dye")
    allthemods.addAlias("kubejs:${color}_cell", "kubegroovy:${color}_cell")
  }
})
