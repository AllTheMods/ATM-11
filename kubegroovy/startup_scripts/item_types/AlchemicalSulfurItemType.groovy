/**
 * SPDX-FileCopyrightText: 2024 klikli-dev
 *
 * SPDX-License-Identifier: MIT
 *
 * Reference: https://github.com/klikli-dev/theurgy-kubejs/blob/version/26.1.2/src/main/java/com/klikli_dev/theurgykubejs/AlchemicalSulfurItemType.java
 */

// priority 1
// requires theurgy
package startup_scripts.item_types
import com.google.common.base.Suppliers
import com.klikli_dev.theurgy.TheurgyConstants
import com.klikli_dev.theurgy.content.item.sulfur.AlchemicalSulfurItem
import com.klikli_dev.theurgy.content.item.sulfur.AlchemicalSulfurType
import dev.uncandango.kubegroovy.client.LangKubeEvent
import dev.uncandango.kubegroovy.item.ItemBuilder
import net.minecraft.ChatFormatting
import net.minecraft.resources.Identifier
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack

class AlchemicalSulfurItemType extends AlchemicalDerivativeItemType {
  public transient AlchemicalSulfurType sulfurType

  AlchemicalSulfurItemType(Identifier id) {
    super(id)
  }

  @Override
  Item createObject() {
    var item = new AlchemicalSulfurItem(
        this.decorateWithSource(this.createItemProperties())
    )

    item.useCustomSourceName(true)
        .autoTooltip(this.provideDerivativeInformationAsTooltipParam, false)
        .autoName(this.provideDerivativeInformationAsNameParam, false)
        .withJarIcon(Suppliers.memoize(() -> new ItemStack($Item.getItem(this.jarIcon))))
        .tier(this.derivativeTier)
    item.type(this.sulfurType)

    return item
  }

  ItemBuilder sulfurType(AlchemicalSulfurType type) {
    this.sulfurType = type;
    return this;
  }

  void generateLang(LangKubeEvent lang) {
    // call super as we still use the display name for the 'upgrade description'
    // we don't use a custom lang key for that as vanillas format depends on it being an upgrade or trim, and we don't know which it is
    super.generateLang(lang);

    if (this.generateNameLangEntry) {
      lang.add(this.id.getNamespace(), this.getBuilderTranslationKey(), "Alchemical Sulfur %s");
      lang.add(this.id.getNamespace(), this.getBuilderTranslationKey() + TheurgyConstants.I18n.Item.ALCHEMICAL_DERIVATIVE_SOURCE_SUFFIX, this.sourceName);
    }
    if (this.generateTooltipLangEntry) {
      lang.add(this.id.getNamespace(), this.getBuilderTranslationKey() + TheurgyConstants.I18n.Tooltip.SUFFIX, "Alchemical Sulfur crafted from %s %s %s.");
      lang.add(this.id.getNamespace(), this.getBuilderTranslationKey() + TheurgyConstants.I18n.Tooltip.EXTENDED_SUFFIX, "Sulfur represents the \"idea\" or \"soul\" of an object");
      lang.add(this.id.getNamespace(), this.getBuilderTranslationKey() + TheurgyConstants.I18n.Tooltip.USAGE_SUFFIX, "Sulfur is the central element used in Spagyrics processes." +
          "\n\n" + ChatFormatting.ITALIC + "Hint: Sulfurs crafted from different states of the same material (such as from Ore or Ingots) are interchangeable." + ChatFormatting.RESET);
    }
  }
}
