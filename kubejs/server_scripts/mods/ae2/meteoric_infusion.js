// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.

ServerEvents.recipes((allthemods) => {
  function meteoricInfusion(id, time, input, catalysts, output) {
    allthemods
      .custom({
        type: "occultism:ritual",
        activation_item: input,
        duration: time,
        ingredients: catalysts,
        pentacle_id: "occultism:meteoric_infusion",
        result: {
          id: output,
        },
        ritual_dummy: {
          id: "occultism:ritual_dummy/meteoric_infusion",
        },
        ritual_type: "occultism:craft",
      })
      .id(`allthemods:meteoric_infusion/${id}`);
  }

  if (Platform.isLoaded("appflux")) {
    meteoricInfusion(
      "1k_flux_component",
      20,
      "ae2:cell_component_1k",
      [
        "powah:energy_cell_niotic",
        "appflux:energy_processor",
        "powah:energy_cell_spirited",
        "appflux:energy_processor",
        "powah:energy_cell_niotic",
        "appflux:energy_processor",
        "powah:energy_cell_spirited",
        "appflux:energy_processor",
      ],
      "appflux:core_1k",
    );

    let fluxComp = [
      {
        id: "4k",
        input: "1k",
      },
      {
        id: "16k",
        input: "4k",
      },
      {
        id: "64k",
        input: "16k",
      },
      {
        id: "256k",
        input: "64k",
      },
    ];

    for (let flux of fluxComp) {
      meteoricInfusion(
        `${flux.id}_flux_component`,
        20,
        "ae2:singularity",
        [
          `appflux:core_${flux.input}`,
          "appflux:energy_processor",
          `appflux:core_${flux.input}`,
          "appflux:energy_processor",
          `appflux:core_${flux.input}`,
          "appflux:energy_processor",
          `appflux:core_${flux.input}`,
          "appflux:energy_processor",
        ],
        `appflux:core_${flux.id}`,
      );
    }

    let fluxCell = ["1k", "4k", "16k", "64k", "256k"];

    for (let flux of fluxCell) {
      meteoricInfusion(
        `${flux}_flux_cell`,
        20,
        `appflux:core_${flux}`,
        [
          "ae2:singularity",
          "extendedae:concurrent_processor",
          "appflux:fe_cell_housing",
          "extendedae:concurrent_processor",
        ],
        `appflux:fe_${flux}_cell`,
      );

      meteoricInfusion(
        `${flux}_flux_portable`,
        20,
        `appflux:core_${flux}`,
        [
          "ae2:me_chest",
          "appflux:energy_processor",
          "appflux:fe_cell_housing",
          "extendedae:concurrent_processor",
          "extendedae:concurrent_processor",
          "ae2:dense_energy_cell",
          "appflux:energy_processor",
        ],
        `appflux:fe_${flux}_portable_cell`,
      );
    }

    meteoricInfusion(
      "flux_housing",
      20,
      "ae2:item_cell_housing",
      [
        "extendedae:concurrent_processor",
        "extendedae:entro_ingot",
        "appflux:energy_processor",
        "appflux:harden_insulating_resin",
        "extendedae:concurrent_processor",
        "extendedae:entro_ingot",
        "appflux:energy_processor",
        "appflux:harden_insulating_resin",
      ],
      "appflux:fe_cell_housing",
    );

    //YEET
    allthemods.remove([
      { id: "appflux:fe_cell_housing" },
      { id: "appflux:1k_fe_cell_assemble" },
      { id: "appflux:4k_fe_cell_assemble" },
      { id: "appflux:16k_fe_cell_assemble" },
      { id: "appflux:64k_fe_cell_assemble" },
      { id: "appflux:256k_fe_cell_assemble" },
      { id: "appflux:1m_fe_cell_assemble" },
      { id: "appflux:4m_fe_cell_assemble" },
      { id: "appflux:16m_fe_cell_assemble" },
      { id: "appflux:64m_fe_cell_assemble" },
      { id: "appflux:256m_fe_cell_assemble" },
      { id: "appflux:fe_1k_cell" },
      { id: "appflux:fe_4k_cell" },
      { id: "appflux:fe_16k_cell" },
      { id: "appflux:fe_64k_cell" },
      { id: "appflux:fe_256k_cell" },
      { id: "appflux:fe_1m_cell" },
      { id: "appflux:fe_4m_cell" },
      { id: "appflux:fe_16m_cell" },
      { id: "appflux:fe_64m_cell" },
      { id: "appflux:fe_256m_cell" },
      { id: "appflux:core_1k" },
      { id: "appflux:core_4k" },
      { id: "appflux:core_16k" },
      { id: "appflux:core_64k" },
      { id: "appflux:core_256k" },
      { id: "appflux:core_1m" },
      { id: "appflux:core_4m" },
      { id: "appflux:core_16m" },
      { id: "appflux:core_64m" },
      { id: "appflux:core_256m" },
      { id: "appflux:tools/fe_1k_portable_cell" },
      { id: "appflux:tools/fe_4k_portable_cell" },
      { id: "appflux:tools/fe_16k_portable_cell" },
      { id: "appflux:tools/fe_64k_portable_cell" },
      { id: "appflux:tools/fe_256k_portable_cell" },
      { id: "appflux:tools/fe_1m_portable_cell" },
      { id: "appflux:tools/fe_4m_portable_cell" },
      { id: "appflux:tools/fe_16m_portable_cell" },
      { id: "appflux:tools/fe_64m_portable_cell" },
      { id: "appflux:tools/fe_256m_portable_cell" },
    ]);
  }
});

ServerEvents.tags("item", (allthemods) => {
  allthemods.add("occultism:pentacle_materials", [
    "ae2:controller",
    "ae2:smooth_sky_stone_block",
    "ae2:sky_stone_block",
    "ae2:sky_stone_small_brick",
    "ae2:quartz_vibrant_glass",
    "occultism:otherstone_pedestal",
    "ae2:not_so_mysterious_cube",
    "ae2:dense_energy_cell",
    "occultism:sacrificial_bowl",
    "neovitae:air_ritual_stone",
    "neovitae:water_ritual_stone",
    "neovitae:fire_ritual_stone",
    "neovitae:dusk_ritual_stone",
    "minecraft:soul_lantern",
  ]);
});

// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
