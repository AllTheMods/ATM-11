ServerEvents.generateData("after_mods", (event) => {
  let jsonIndex = JsonIO.read("kubejs/dynamic_data/index.json")
  if (jsonIndex == null) return
  let index = jsonIndex.index || []

  index.forEach((file) => {
    let modId = file.substring(0, file.indexOf("/"))
    if (modId == "atm" || Platform.isLoaded(modId)) {
      let rl = file.replace("/", ":")
      let json = JsonIO.readJson("kubejs/dynamic_data/" + file)
      if (json != null) {
        json = json.asJsonObject
        // TODO: need to find out why it is crashing...
        if (rl.includes("biome_modifier/")) {
          console.warn(`Skipping biome modifiers for mod ${modId}`)
          return
        }
        if (rl.includes("tags/")) {
          // console.warn(`Skipping Dynamic Data TAGS for mod ${modId} for now...`)
          let values = json.getAsJsonArray("values")
          let toAdd = JsonIO.toArray([])
          let it = values.iterator()
          while (it.hasNext()) {
            let value = it.next()
            if (value.isJsonPrimitive()) {
              toAdd["add(com.google.gson.JsonElement)"](JsonIO.toObject({ id: value.asString, required: false }))
              it.remove()
            }
          }
          values.addAll(toAdd)
          // console.log(values)
        } else {
          event.json(rl, json)
        }
      }
    }
  })
})
