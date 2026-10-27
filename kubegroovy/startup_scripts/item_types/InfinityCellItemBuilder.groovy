/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// priority 1
// requires extendedae
package startup_scripts.item_types

import appeng.api.client.StorageCellModels
import appeng.api.stacks.AEFluidKey
import appeng.api.stacks.AEItemKey
import appeng.api.stacks.AEKey
import com.glodblock.github.extendedae.common.items.ItemInfinityCell
import dev.uncandango.kubegroovy.KubeGroovy
import dev.uncandango.kubegroovy.item.ItemBuilder
import net.minecraft.resources.Identifier
import net.minecraft.world.item.Item
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.neoforge.client.event.RegisterBlockStateModels
import org.jspecify.annotations.NonNull
import java.util.function.Supplier

class InfinityCellItemBuilder extends ItemBuilder {

  InfinityCellItemBuilder(Identifier id) {
    super(id)
  }

  // entrypoint
  static main(String... args) {
    def eventBus = KubeGroovy.modEventBus
    eventBus.register(InfinityCellItemBuilder.class)
  }

  @SubscribeEvent
  static void registerModels(RegisterBlockStateModels event) {
    TO_REGISTER_MODEL.forEach(Runnable::run)
  }

  private static final List<Runnable> TO_REGISTER_MODEL = new ArrayList<>();
  private Supplier<AEKey> aeKey;
  private Identifier model;

  InfinityCellItemBuilder type(Supplier<AEKey> key) {
    this.aeKey = key;
    return this;
  }

  InfinityCellItemBuilder itemType(Identifier id) {
    this.aeKey = () -> AEItemKey.of($Item.getItem(id))
    return this;
  }

  InfinityCellItemBuilder fluidType(Identifier id) {
    this.aeKey = () -> AEFluidKey.of($Fluid.getType(id))
    return this;
  }

  InfinityCellItemBuilder cellModel(Identifier model) {
    this.model = model;
    return this;
  }

  @Override
  @NonNull
  Item createObject() {
    var cell = new ItemInfinityCell(this.aeKey, this.createItemProperties().stacksTo(1));
    if (this.model != null) {
      TO_REGISTER_MODEL.add(() -> StorageCellModels.registerModel(cell, this.model));
    }
    return cell;
  }
}
