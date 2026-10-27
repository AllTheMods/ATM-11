/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires cataclysm
package server_scripts.tags

$ServerEvents.tags("worldgen/structure", (allthemods) -> {
  allthemods.add("cataclysm:berserker_spawn", "betterfortresses:fortress")
})

$ServerEvents.tags("entity_type", (allthemods) -> {
  allthemods.add("c:bosses", [
      "cataclysm:amethyst_crab",
      "cataclysm:ancient_remnant",
      "cataclysm:coralssus",
      "cataclysm:ender_golem",
      "cataclysm:ender_guardian",
      "cataclysm:ignis",
      "cataclysm:ignited_revenant",
      "cataclysm:kobolediator",
      "cataclysm:maledictus",
      "cataclysm:modern_remnant",
      "cataclysm:netherite_monstrosity",
      "cataclysm:the_baby_leviathan",
      "cataclysm:the_harbinger",
      "cataclysm:the_leviathan",
      "cataclysm:the_prowler",
      "cataclysm:wadjet"
  ])
})
