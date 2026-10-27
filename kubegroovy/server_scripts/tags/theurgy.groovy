/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires theurgy
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  def sulfurData = [
      stellarite_sulfur: [derivativeTier: "precious", sulfurType: "metals"],
      arcane_sulfur    : [derivativeTier: "rare", sulfurType: "gems"],
      runic_sulfur     : [derivativeTier: "common", sulfurType: "metals"],
      salt_sulfur      : [derivativeTier: "abundant", sulfurType: "earthen_matters"],
      sulfur_sulfur    : [derivativeTier: "common", sulfurType: "misc"],
      prosperity_sulfur: [derivativeTier: "common", sulfurType: "misc"],
      iesnium_sulfur   : [derivativeTier: "precious", sulfurType: "metals"],
      mithril_sulfur   : [derivativeTier: "precious", sulfurType: "metals"],
      bort_sulfur      : [derivativeTier: "rare", sulfurType: "earthen_matters"]
  ]

  for (def entry in sulfurData) {
    allthemods.add("theurgy:alchemical_sulfurs", "kubegroovy:${entry.key}")
    allthemods.add("theurgy:alchemical_sulfurs_and_niters", "kubegroovy:${entry.key}")
    allthemods.add("theurgy:alchemical_sulfurs/${entry.value.sulfurType}", "kubegroovy:${entry.key}")
    allthemods.add(
        "theurgy:alchemical_sulfurs/${entry.value.sulfurType}/${entry.value.derivativeTier}",
        "kubegroovy:${entry.key}"
    )
  }
})
