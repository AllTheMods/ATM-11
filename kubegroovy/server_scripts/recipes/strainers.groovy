/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires strainers
package server_scripts.recipes

$ServerEvents.recipes(allthemods -> {
  allthemods.recipes.bblcoreShapedComponentCopy(
      "kubegroovy:allthemodium_mesh",
      [" A ", "ABA", " A "],
      [
        A: "allthemodium:allthemodium_ingot",
        B: "strainers:netherite_mesh",
      ],
      "strainers:netherite_mesh",
      ["minecraft:enchantments"]
  )
})
