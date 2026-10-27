/**
 * SPDX-FileCopyrightText: 2024 klikli-dev
 *
 * SPDX-License-Identifier: MIT
 *
 * Reference: https://github.com/klikli-dev/theurgy-kubejs/blob/version/26.1.2/src/main/java/com/klikli_dev/theurgykubejs/AlchemicalDerivativeItemType.java
 */

// priority 2
// requires theurgy
package startup_scripts.item_types
import com.google.gson.JsonObject
import com.klikli_dev.theurgy.content.item.derivative.AlchemicalDerivativeTier
import com.klikli_dev.theurgy.registry.DataComponentRegistry
import dev.uncandango.kubegroovy.client.LangKubeEvent
import dev.uncandango.kubegroovy.generator.KubeAssetGenerator
import dev.uncandango.kubegroovy.item.ItemBuilder
import net.minecraft.core.Holder
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.Identifier
import net.minecraft.tags.ItemTags
import net.minecraft.world.item.Item

abstract class AlchemicalDerivativeItemType extends ItemBuilder {
  public transient Identifier sourceItem
  public transient Identifier sourceTag
  public transient Identifier jarIcon
  public transient String sourceName
  public transient AlchemicalDerivativeTier derivativeTier

  public transient boolean generateTooltipLangEntry
  public transient boolean generateNameLangEntry
  public transient boolean provideDerivativeInformationAsTooltipParam
  public transient boolean provideDerivativeInformationAsNameParam

  static main(String... args) {}

  AlchemicalDerivativeItemType(Identifier id) {
    super(id)

    this.sourceItem = Identifier.fromNamespaceAndPath("minecraft", "stone")
    this.jarIcon = Identifier.fromNamespaceAndPath("theurgy", "empty_jar_icon")
    this.sourceName = ""
    this.derivativeTier = AlchemicalDerivativeTier.ABUNDANT
    this.generateTooltipLangEntry = true
    this.generateNameLangEntry = true
    this.provideDerivativeInformationAsTooltipParam = true
    this.provideDerivativeInformationAsNameParam = true
  }

  @Override
  void generateItemModels(KubeAssetGenerator generator) {

    JsonObject model = new JsonObject()
    model.addProperty("type", "minecraft:special")
    model.addProperty("base", "theurgy:item/derivative_base")

    JsonObject specialModel = new JsonObject()
    specialModel.addProperty("type", "theurgy:alchemical_derivative")
    model.add("model", specialModel)

    JsonObject itemDef = new JsonObject()
    itemDef.add("model", model)

    // Write the item definition to assets/<ns>/items/<path>.json
    var itemDefPath = this.id.withPath($ID.ITEM_DEFINITION)
    generator.json(itemDefPath, itemDef)
  }

  protected Item.Properties decorateWithSource(Item.Properties properties) {
    if (this.sourceItem != null) {
      var item = (Holder<Item>) BuiltInRegistries.ITEM.wrapAsHolder($Item.getItem(this.sourceItem))
      properties.component(
          DataComponentRegistry.SOURCE_ITEM,
          item
      )
    } else if (this.sourceTag != null) {
      properties.component(
          DataComponentRegistry.SOURCE_TAG,
          ItemTags.create(this.sourceTag)
      )
    }
    return properties;
  }

  ItemBuilder generateTooltipLangEntry(boolean value) {
    this.generateTooltipLangEntry = value;
    return this;
  }

  ItemBuilder generateNameLangEntry(boolean value) {
    this.generateNameLangEntry = value;
    return this;
  }

  ItemBuilder provideDerivativeInformationAsTooltipParam(boolean value) {
    this.provideDerivativeInformationAsTooltipParam = value;
    return this;
  }

  ItemBuilder provideDerivativeInformationAsNameParam(boolean value) {
    this.provideDerivativeInformationAsNameParam = value;
    return this;
  }

  ItemBuilder jarIcon(Identifier id) {
    this.jarIcon = id;
    return this;
  }

  ItemBuilder sourceItem(Identifier id) {
    this.sourceItem = id;
    return this;
  }

  ItemBuilder sourceTag(Identifier id) {
    this.sourceTag = id;
    return this;
  }

  ItemBuilder sourceName(String name) {
    this.sourceName = name;
    return this;
  }


  ItemBuilder derivativeTier(AlchemicalDerivativeTier tier) {
    this.derivativeTier = tier;
    return this;
  }

  @Override
  void generateLang(LangKubeEvent lang) {
    // call super as we still use the display name for the 'upgrade description'
    // we don't use a custom lang key for that as vanillas format depends on it being an upgrade or trim, and we don't know which it is
    super.generateLang(lang);
  }
}
