/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

package client_scripts.integrations

import dev.ftb.mods.ftbquests.api.neoforge.FTBQuestsEvent.QuestProgress
import dev.ftb.mods.ftbquests.client.ClientQuestFile
import dev.wuffs.bcc.BetterCompatibilityChecker
import net.allthemods.allthetweaks.api.ATTRpc
import net.minecraft.client.resources.language.I18n
import net.minecraft.util.Util
import net.minecraft.world.level.Level

def ARR_TAG = 'arr'

// Corner icon for the ATM Star, once the star is in the pack: set the id of the
// quest whose task is the star, then uncomment these and the block in pushQuestProgress
// let STAR_QUEST = ''
// let STAR_IMAGE = 'https://raw.githubusercontent.com/AllTheMods/AllTheTweaks/26.1/src/main/resources/assets/allthetweaks/textures/item/atm_star.png'

def ticks = 0
def sinceRecount = 0
def recountQueued = false
def hadLevel = false

//static String dimensionName(Level level) {
//	def id = level.dimension
//	def key = Util.makeDescriptionId("dimension", id)
//	if (I18n.exists(key)) return I18n.get(key)
//
//	def path = id.path
//	return $StringUtils.snakeCaseToTitleCase(path)
//}

def dimensionName = { Level level ->
  def id = level.dimension
  def key = Util.makeDescriptionId("dimension", id)
  if (I18n.exists(key)) return I18n.get(key)

  def path = id.path
  return $StringUtils.snakeCaseToTitleCase(path)
}

def pushQuestProgress = {
  // Quests not received from server yet
  if (!ClientQuestFile.exists()) return false

  def file = ClientQuestFile.getInstance()
  def data = file.selfTeamData
  // Quest player data not received from server yet
  if (!data) return false

  def done = 0
  def total = 0

  // getQuests() is a view on the live list, so a concurrent quest change can throw
  for (def chapter : file.getAllChapters()) {
    for (def quest : chapter.getQuests()) {
      if (quest.hasTag(ARR_TAG)) continue
      total++
      if (data.isCompleted(quest)) done++
    }
  }

  // let starQuest = file.getQuest(file.getID(STAR_QUEST))
  //
  // if (starQuest && data.isCompleted(starQuest)) {
  // 	$ATTRpc.setSmallImage(STAR_IMAGE)
  // } else {
  // 	$ATTRpc.setSmallImage('')
  // }

  if (done > 0) {
    ATTRpc.setState('Quests')
    ATTRpc.setProgress(done, total)
  } else {
    ATTRpc.clearState()
    ATTRpc.clearProgress()
  }

  return true
}

// Pulled by AllTheTweaks on its own refresh, so it also runs at the main menu
ATTRpc.setMenuStateProvider(() -> 'v' + BetterCompatibilityChecker.betterStatus.version())

$NativeEvents.onEvent(QuestProgress) {
  recountQueued = true
}

$ClientEvents.tick { event ->
  def level = event.level

  // Recalculate state on world join
  if (level && !hadLevel) recountQueued = true
  hadLevel = !!level

  if (recountQueued && pushQuestProgress()) {
    recountQueued = false
    sinceRecount = 0
  }

  // Only update every 2 seconds for non-event calculations
  ticks++
  if (ticks < 40) return
  ticks = 0

  if (!level) {
    recountQueued = false
    return
  }

  ATTRpc.setDetails('In ' + dimensionName(level))

  // Fallback update check every 30s
  sinceRecount++
  if (sinceRecount >= 15) {
    sinceRecount = 0
    pushQuestProgress()
  }
}
