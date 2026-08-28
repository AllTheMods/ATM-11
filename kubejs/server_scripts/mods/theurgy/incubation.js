if (Platform.isLoaded("theurgy_kubejs")) {
  ServerEvents.recipes((event) => {
    let incubation = (output, sulfur) => {
      let json = {
        type: "theurgy:incubation",
        category: "misc",
        mercury: "theurgy:mercury_shard",
        result: {
          type: "theurgy:item",
          count: 1,
          id: output
        },
        salt: "theurgy:alchemical_salt_mineral",
        sulfur: sulfur,
        time: 100
      }
      event.custom(json)
    }

    if (Platform.isLoaded("forbidden_arcanus")) {
      incubation("forbidden_arcanus:arcane_crystal", "kubejs:arcane_sulfur")
      incubation("forbidden_arcanus:rune", "kubejs:runic_sulfur")
      incubation("forbidden_arcanus:stellarite_piece", "kubejs:stellarite_sulfur")
    }

    if (Platform.isLoaded("silentgear")) {
      incubation("silentgear:bort", "kubejs:bort_sulfur")
    }

    if (Platform.isLoaded("occultism")) {
      incubation("occultism:iesnium_ingot", "kubejs:iesnium_sulfur")
    }

    if (Platform.isLoaded("irons_spellbooks")) {
      incubation("irons_spellbooks:mithril_ingot", "kubejs:mithril_sulfur")
    }

    if (Platform.isLoaded("mysticalagriculture")) {
      incubation("mysticalagriculture:prosperity_shard", "kubejs:prosperity_sulfur")
    }

    incubation("alltheores:salt_dust", "kubejs:salt_sulfur")
    incubation("alltheores:sulfur_dust", "kubejs:sulfur_sulfur")
  })
}
