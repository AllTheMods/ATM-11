// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.

ServerEvents.recipes((allthemods) => {
  /**
   *
   * @param {string} input
   * @param {string} result
   * @param {number[]} percentages
   * @param {number} ticks
   */
  function crystal_growth_chamber(input, result, percentages, ticks) {
    let recipe = {
      type: "energizedpower:crystal_growth_chamber",
      ingredient: {
        ingredient: input
      },
      result: {
        percentages: percentages,
        result: {
          id: result
        }
      },
      ticks: ticks
    }
    allthemods.custom(recipe).id(`allthemods:energizedpower/crystal_growing/${result.split(":")[1]}`)
  }

  const COMMON = [1.0, 1.0, 0.67, 0.5, 0.25, 0.125]
  const UNCOMMON = [1.0, 0.8, 0.5, 0.25, 0.1, 0.05]
  const RARE = [1.0, 0.5, 0.25, 0.1, 0.05, 0.01]
  const VERY_RARE = [1.0, 0.25, 0.1, 0.03, 0.01]

  for (const [id, chances, ticks] of [
    ["iron", COMMON, 12000],
    ["gold", UNCOMMON, 18000],
    ["copper", COMMON, 12000],
    ["zinc", COMMON, 12000],
    ["uranium", RARE, 28000],
    ["tin", COMMON, 12000],
    ["silver", UNCOMMON, 18000],
    ["platinum", RARE, 32000],
    ["osmium", UNCOMMON, 22000],
    ["aluminum", COMMON, 12000],
    ["lead", COMMON, 14000],
    ["nickel", COMMON, 14000],
    ["tungsten", RARE, 18000],

    ["coal", COMMON, 10000],
    ["diamond", RARE, 36000],
    ["emerald", VERY_RARE, 48000],
    ["lapis", COMMON, 14000],
    ["quartz", COMMON, 12000],
    ["redstone", COMMON, 14000],

    ["ancient_debris", VERY_RARE, 64000],

    ["sapphire", UNCOMMON, 18000],
    ["ruby", UNCOMMON, 18000],
    ["topaz", COMMON, 14000],
    ["uraninite", RARE, 28000],
    ["monazite", RARE, 28000],
    ["black_quartz", COMMON, 12000],

    ["allthemodium", VERY_RARE, 96000],
    ["vibranium", VERY_RARE, 128000],
    ["unobtainium", VERY_RARE, 160000]
  ]) {
    crystal_growth_chamber(`#geore:geore_shards/${id}`, `geore:${id}_shard`, chances, ticks)
  }
})

// This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
// As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
