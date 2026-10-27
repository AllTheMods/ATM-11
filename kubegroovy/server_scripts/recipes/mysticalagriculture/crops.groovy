/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires mysticalagriculture
package server_scripts.recipes.mysticalagriculture

import com.blakebr0.mysticalagriculture.registry.CropRegistry

$ServerEvents.recipes((allthemods) -> {
  def JsonExport = [enabled: [], disabled: []]
  def CropRegistryInstance = CropRegistry.getInstance()
  def CropList = CropRegistryInstance.getCrops()
  for (def Crop : CropList) {
    def CropName = Crop.getName()
    if (Crop.isEnabled()) {
      JsonExport.enabled.push(CropName)
    } else {
      JsonExport.disabled.push(CropName)
    }
  }
  // $JsonIO.write("kubegroovy/server_scripts/debug/mysticalagriculture/cropInfo.json", JsonExport)

  // Immersive Engineering Cloche
  if ($Platform.isLoaded("immersiveengineering")) {
    JsonExport.enabled.forEach((cropName) -> {
      def Crop = CropRegistryInstance.getCropByName(cropName)
      allthemods
          .custom([
              type   : "immersiveengineering:cloche",
              results: [
                  [
                      basePredicate: [
                          item: Crop.getEssenceItem().getId()
                      ],
                      count        : 2
                  ]
              ],
              input  : $Ingredient.of(Crop.getSeedsItem()).toJson(),
              soil   : $Ingredient.of(
                  Crop.getCruxBlock() ?:
                      "#kubegroovy:farmland/${Crop.getTier().getFarmlandBlock().getIdLocation().getPath().replace("_farmland", "")}"
              ).toJson(),
              time   : 250 + 750 * Crop.getTier().getValue(),
              render : [
                  type : "immersiveengineering:crop",
                  block: Crop.getCropBlock().idLocation.toString()
              ]
          ])
          .id("allthemods:immersiveengineering/cloche/mysticalagriculture/${cropName}")
    })
  }
})
