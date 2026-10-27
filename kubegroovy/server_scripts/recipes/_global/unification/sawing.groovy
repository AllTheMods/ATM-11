/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package server_scripts.recipes._global.unification

import dev.uncandango.kubegroovy.recipe.KubeRecipe
import net.minecraft.world.item.ItemStackTemplate
import net.minecraft.world.item.crafting.Ingredient
import java.util.stream.Collectors as $Collectors

$ServerEvents.recipes((allthemods) -> {
  def logsTag = $Ingredient.of("#minecraft:logs")

  /** @type {$HashMap_<string, $UnknownKubeRecipe_>}} */
  Map<String, KubeRecipe> prodSawmillRecipes = allthemods
      .findRecipes([type: "productivetrees:sawmill"])
      .stream()
      //.peek(r -> console.info(r.json ? r : "${r} is null json"))
      .collect(
          $Collectors.<KubeRecipe, String, KubeRecipe> toMap(
              (r) -> r.json.asMap().output.get("id").asString,
              (r) -> r
          )
      )
  /** @type {$HashMap_<string, $UnknownKubeRecipe_>}} */
  Map<String, KubeRecipe> mekSawmillRecipes = allthemods
      .findRecipes([type: "mekanism:sawing"])
      .stream()
      .filter(
          (r) ->
              r.json.asMap().main_output != null &&
                  logsTag.matches(
                      null,
                      $Ingredient.of(
                          r.json.asMap().input.has("ingredient") ? r.json.asMap().input.get("ingredient") : r.json.asMap().input
                      ),
                      false
                  )
      )
      .collect(
          $Collectors.<KubeRecipe, String, KubeRecipe> toMap(
              (r) -> r.json.asMap().main_output.get("id").asString,
              (r) -> r
          )
      )

  def mekSawing = { output, input, extraOutput, id ->
    if (mekSawmillRecipes.containsKey(output.id)) {
      // console.info("Already exists a mek recipe for " + output.id)
      return
    }
    def recipe = [
        type            : "mekanism:sawing",
        input           : input,
        main_output     : output,
        secondary_chance: extraOutput.chance,
        secondary_output: $Item.of(extraOutput.item)
    ]

    allthemods.custom(recipe).id("allthemods:mekanism/sawing/${id}")
  }

  def prodSawing = { log, planks, secondary, id ->
    if (prodSawmillRecipes.containsKey(planks.id)) {
      // console.info("Already exists a prod tree recipe for " + planks.id)
      return
    }
    allthemods
        .custom([
            type     : "productivetrees:sawmill",
            input    : log,
            output   : planks,
            secondary: secondary
        ])
        .id("allthemods:productivetrees/sawing/${id}")
  }

  allthemods.forEachRecipe([type: "minecraft:crafting_shapeless", output: "#minecraft:planks"], (recipe) -> {
    def firstIngredient = ((Ingredient) ((List<Ingredient>) recipe.get("ingredients")).getFirst())

    if (firstIngredient.isEmpty()) {
      console.log("First ingredient is empty: " + recipe)
      return
    }

    def output = ((ItemStackTemplate) recipe.get("result")).create()
    if (
        !logsTag.matches(null, firstIngredient, false)
    ) {
      console.info("Ingredient is not a log tag: " + $Ingredient.of(firstIngredient).toJson())
      return
    }

    if ($Platform.isLoaded("mekanism")) {
      mekSawing(
          output.withCount(6),
          firstIngredient,
          [chance: 0.25, item: "mekanism:sawdust"],
          recipe.getId().split(":")[0] + "/" + recipe.getId().split(":")[1]
      )
    }
    if ($Platform.isLoaded("productivetrees")) {
      prodSawing(
          firstIngredient,
          output.withCount(6),
          $Item.of("2x productivetrees:sawdust"),
          recipe.getId().split(":")[0] + "/" + recipe.getId().split(":")[1]
      )
    }
  })
})
