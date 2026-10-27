/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires geore
package startup_scripts.items

$StartupEvents.registry("item") { allthemods ->

  def georeCat = [
      'copper',
      'iron',
      'tin',
      'gold',
      'nickel',
      'coal',
      'zinc',
      'lead',
      'silver',
      'redstone',
      'lapis',
      'osmium',
      'quartz',
      'aluminum',
      'uraninite',
      'platinum',
      'diamond',
      'emerald',
      'ancient_debris',
      'allthemodium',
      'vibranium',
      'unobtainium'
  ]

  for (def mat : georeCat) {
    allthemods.create("${mat}_catalyst").with {
      texture("geore:item/${mat}_shard")
      glow(true)
    }
    allthemods.addAlias("kubejs:${mat}_catalyst", "kubegroovy:${mat}_catalyst")
  }

  allthemods.create('crystalline_wand').with {
    displayName('Imperfect Crystalline Resonance Wand')
    unstackable()
  }
  allthemods.addAlias("kubejs:crystalline_wand", "kubegroovy:crystalline_wand")

  allthemods.create('perfected_crystalline_wand').with {
    glow(true)
    texture('kubegroovy:item/crystalline_wand')
    unstackable()
    displayName('Perfected Crystalline Resonance Wand')
  }
  allthemods.addAlias("kubejs:perfected_crystalline_wand", "kubegroovy:perfected_crystalline_wand")
}
