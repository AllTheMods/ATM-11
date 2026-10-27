/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires theurgy
package startup_scripts.items

import startup_scripts.item_types.AlchemicalSulfurItemType
import com.klikli_dev.theurgy.content.item.derivative.AlchemicalDerivativeTier
import com.klikli_dev.theurgy.content.item.sulfur.AlchemicalSulfurType
import dev.uncandango.kubegroovy.registry.RegistryKubeEvent
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.world.item.Item
import java.util.function.Consumer

static void consumeBuilder(RegistryKubeEvent<Item> reg, String id, Consumer<AlchemicalSulfurItemType> consumer) {
  def builder = new AlchemicalSulfurItemType($ID.of(id, true))
  consumer.accept(builder)
  reg.add(Registries.ITEM, builder)
}

$StartupEvents.registry("item", (allthemods) -> {
  if ($Platform.isLoaded("forbidden_arcanus")) {
    // Forbidden Arcanus
    consumeBuilder(allthemods, "stellarite_sulfur") { builder ->
      builder.with {
        sourceItem("forbidden_arcanus:stellarite_piece" as Identifier)
        sourceName("Stellarite Piece")
        derivativeTier(AlchemicalDerivativeTier.valueOf("PRECIOUS"))
        sulfurType(AlchemicalSulfurType.valueOf("METALS"))
      }
    }
    allthemods.addAlias("kubejs:stellarite_sulfur", "kubegroovy:stellarite_sulfur")

    consumeBuilder(allthemods, "arcane_sulfur") { builder ->
      builder.with {
        sourceItem("forbidden_arcanus:arcane_crystal" as Identifier)
        sourceName("Arcane Crystal")
        derivativeTier(AlchemicalDerivativeTier.valueOf("RARE"))
        sulfurType(AlchemicalSulfurType.valueOf("GEMS"))
      }
    }
    allthemods.addAlias("kubejs:arcane_sulfur", "kubegroovy:arcane_sulfur")

    consumeBuilder(allthemods, "runic_sulfur") { builder ->
      builder.with {
        sourceItem("forbidden_arcanus:rune" as Identifier)
        sourceName("Rune")
        derivativeTier(AlchemicalDerivativeTier.valueOf("COMMON"))
        sulfurType(AlchemicalSulfurType.valueOf("METALS"))
      }
    }
    allthemods.addAlias("kubejs:runic_sulfur", "kubegroovy:runic_sulfur")
  }

  // AllTheOres
  consumeBuilder(allthemods, "salt_sulfur") { builder ->
    builder.with {
      sourceItem("alltheores:salt_dust" as Identifier)
      sourceName("Salt")
      derivativeTier(AlchemicalDerivativeTier.valueOf("ABUNDANT"))
      sulfurType(AlchemicalSulfurType.valueOf("EARTHEN_MATTERS"))
    }
  }
  allthemods.addAlias("kubejs:salt_sulfur", "kubegroovy:salt_sulfur")

  consumeBuilder(allthemods, "sulfur_sulfur") { builder ->
    builder.with {
      sourceItem("alltheores:sulfur_dust" as Identifier)
      sourceName("Sulfur")
      derivativeTier(AlchemicalDerivativeTier.valueOf("COMMON"))
      sulfurType(AlchemicalSulfurType.valueOf("MISC"))
    }
  }
  allthemods.addAlias("kubejs:sulfur_sulfur", "kubegroovy:sulfur_sulfur")

  // Mystical Agriculture
  if ($Platform.isLoaded("mysticalagriculture")) {
    consumeBuilder(allthemods, "prosperity_sulfur") { builder ->
      builder.with {
        sourceItem("mysticalagriculture:prosperity_shard" as Identifier)
        sourceName("Prosperity Shard")
        derivativeTier(AlchemicalDerivativeTier.valueOf("COMMON"))
        sulfurType(AlchemicalSulfurType.valueOf("MISC"))
      }
    }
    allthemods.addAlias("kubejs:prosperity_sulfur", "kubegroovy:prosperity_sulfur")
  }

  // Occultism
  if ($Platform.isLoaded("occultism")) {
    consumeBuilder(allthemods, "iesnium_sulfur") { builder ->
      builder.with {
        sourceItem("occultism:iesnium_ingot" as Identifier)
        sourceName("Iesnium")
        derivativeTier(AlchemicalDerivativeTier.valueOf("PRECIOUS"))
        sulfurType(AlchemicalSulfurType.valueOf("METALS"))
      }
    }
    allthemods.addAlias("kubejs:iesnium_sulfur", "kubegroovy:iesnium_sulfur")
  }

  // Irons
  if ($Platform.isLoaded("irons_spellbooks")) {
    consumeBuilder(allthemods, "mithril_sulfur") { builder ->
      builder.with {
        sourceItem("irons_spellbooks:mithril_ingot" as Identifier)
        sourceName("Mithril")
        derivativeTier(AlchemicalDerivativeTier.valueOf("PRECIOUS"))
        sulfurType(AlchemicalSulfurType.valueOf("METALS"))
      }
    }
    allthemods.addAlias("kubejs:mithril_sulfur", "kubegroovy:mithril_sulfur")
  }

  // Silent
  if ($Platform.isLoaded("silentgear")) {
    consumeBuilder(allthemods, "bort_sulfur") { builder ->
      builder.with {
        sourceItem("silentgear:bort" as Identifier)
        sourceName("Bort")
        derivativeTier(AlchemicalDerivativeTier.valueOf("RARE"))
        sulfurType(AlchemicalSulfurType.valueOf("EARTHEN_MATTERS"))
      }
    }
    allthemods.addAlias("kubejs:bort_sulfur", "kubegroovy:bort_sulfur")
  }
})
