/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires forbidden_arcanus
package startup_scripts.fluids

$StartupEvents.registry("fluid") { allthemods ->
  allthemods.create("liquid_souls", "thin").with {
    tint(0xc9eaff)
    displayName("Liquid Souls")
    noBlock()
  }
  allthemods.addAlias("kubejs:liquid_souls", "kubegroovy:liquid_souls")
  allthemods.addAlias("kubejs:flowing_liquid_souls", "kubegroovy:flowing_liquid_souls")

  allthemods.create("unrefined_liquid_souls", "thin").with {
    tint(0xccebff)
    displayName("Unrefined Liquid Souls")
    noBlock()
  }
  allthemods.addAlias("kubejs:unrefined_liquid_souls", "kubegroovy:unrefined_liquid_souls")
  allthemods.addAlias("kubejs:flowing_unrefined_liquid_souls", "kubegroovy:flowing_unrefined_liquid_souls")

  allthemods.create("liquid_aureal", "thin").with {
    tint(0x7abaff)
    displayName("Liquid Aureal")
    noBlock()
  }
  allthemods.addAlias("kubejs:liquid_aureal", "kubegroovy:liquid_aureal")
  allthemods.addAlias("kubejs:flowing_liquid_aureal", "kubegroovy:flowing_liquid_aureal")
}
