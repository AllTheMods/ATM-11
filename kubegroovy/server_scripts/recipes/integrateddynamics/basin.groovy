/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires integrateddynamics
package server_scripts.recipes.integrateddynamics

// TODO: fix schema?
$ServerEvents.recipes((allthemods) -> {
  def basin = { output, input, Integer duration = 300 ->
    def fluidStack = $Fluid.of(input)
    def itemStack = $Item.of(output)
    allthemods.custom([
        type       : "integrateddynamics:drying_basin",
        input_fluid: [
            id    : fluidStack.id,
            amount: fluidStack.amount
        ],
        duration   : duration,
        output_item: [
            id   : itemStack.id,
            count: itemStack.count
        ]
    ])
  }

  def mechanicalBasin = { output, input, duration ->
    def fluidStack = $Fluid.of(input)
    def itemStack = $Item.of(output)
    allthemods.custom([
        type       : "integrateddynamics:mechanical_drying_basin",
        input_fluid: [
            id    : fluidStack.id,
            amount: fluidStack.amount
        ],
        duration   : duration ?: 30,
        output_item: [
            id   : itemStack.id,
            count: itemStack.count
        ]
    ])
  }

  if ($Platform.isLoaded("xycraft_machines")) {
    // basin(output, input, duration)
    basin("xycraft_machines:resin_block", "1B x xycraft_machines:resin")
    // mechanicalBasin(output, input, duration)
    mechanicalBasin("xycraft_machines:resin_block", "1B x xycraft_machines:resin")
  }
})
