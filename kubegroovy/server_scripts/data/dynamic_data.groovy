/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package server_scripts.data

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import net.minecraft.resources.Identifier
import java.nio.file.Path

$ServerEvents.generateData('after_mods') { event ->
  def index = $JsonIO.readJson('kubegroovy/dynamic_data/index.json' as Object)
  if (index instanceof JsonObject indexObject) {
    def entries = indexObject.getAsJsonArray('index')
    if (entries == null) return
    for (int i = 0; i < entries.size(); i++) {
      def file = entries.get(i).asJsonPrimitive.asString
      def slash = file.indexOf('/')
      if (slash < 0) continue
      def modId = file.substring(0, slash)
      if (modId != 'atm' && !$Platform.isLoaded(modId)) continue
      def rl = (modId + ':' + file.substring(slash + 1)) as Identifier
      def data = $JsonIO.readJson(('kubegroovy/dynamic_data/' + file) as Path)
      if (data == null || !data.isJsonObject()) continue
      def obj = data.getAsJsonObject()
      if (rl.path.contains('tags/')) {
        def values = obj.getAsJsonArray('values')
        if (values != null) {
          def fixed = new JsonArray()
          def changed = false
          for (int j = 0; j < values.size(); j++) {
            def value = values.get(j)
            if (value.isJsonPrimitive() && value.getAsJsonPrimitive().isString()) {
              def entry = new JsonObject()
              entry.addProperty('id', value.getAsString())
              entry.addProperty('required', false)
              fixed.add(entry)
              changed = true
            } else {
              fixed.add(value)
            }
          }
          if (changed) obj.add('values', fixed)
        }
      }
      event.json(rl, data)
    }
  }
}
