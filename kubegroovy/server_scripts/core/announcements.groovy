/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires bcc
package server_scripts.core

// files related:
// kubejs/assets/atm/lang/en_us.json

import dev.wuffs.bcc.BetterCompatibilityChecker as $BccInstance
import net.minecraft.network.chat.MutableComponent
import org.apache.maven.artifact.versioning.DefaultArtifactVersion

def announcements = new TreeMap<DefaultArtifactVersion, List<MutableComponent>>()
def currentVersion = null

def addAnnouncement = { String version, MutableComponent component ->
  announcements
      .computeIfAbsent(new DefaultArtifactVersion(version), (key) -> new ArrayList<>())
      .addLast(component)
}

def initAnnouncements = {
  addAnnouncement("0.13.0-beta", $Text.of("KubeJS was replaced with KubeGroovy, items and blocks should migrate automatically"))
  addAnnouncement("0.13.0-beta", $Text.of("But some AE2 recipe patterns might need to be created again"))
}

$ServerEvents.loaded((event) -> {
  announcements.clear()
  currentVersion = new DefaultArtifactVersion($BccInstance.betterStatus.version())
  initAnnouncements()
})

$PlayerEvents.loggedIn((event) -> {
  if (currentVersion == null) return
  def currentDismissed = (String) event.player.kgy$getPersistentData().getStringOr("LastDismissedAnnouncementVersion", null)
  if (currentDismissed == null) {
    currentDismissed = new DefaultArtifactVersion("0.0.0")
  } else {
    currentDismissed = new DefaultArtifactVersion(currentDismissed)
  }
  def ableToDismiss = false
  def printHeader = true
  announcements.forEach((key, listComponents) -> {
    if (currentDismissed.compareTo(key) < 0 && currentVersion.compareTo(key) >= 0) {
      ableToDismiss = true
      if (printHeader) {
        event.player.tell(
            $Text.translatable("=====[  %s  ]=====", $Text.yellow("All The Mods Announcements").bold()).gold().bold()
        )
        printHeader = false
      }
      for (def component : listComponents) {
        def message = $Text.translatable("[%s] - %s", $Text.gold(key.toString()), component.yellow()).yellow()
        event.player.tell(message)
      }
    }
  })

  if (ableToDismiss) {
    def message = $Text.translatable("announcements.atm.dismiss_up_to_version", $Text.blue(currentVersion.toString()))
        .green()
        .hover($Text.translatable("kubegroovy.atm.click_here"))
        .clickRunCommand("/dismiss_announcements")

    event.player.tell(message)
  }
})

$ServerEvents.basicPublicCommand("dismiss_announcements", (event) -> {
  def player = event.player
  if (player == null) {
    event.cancel("Player was not found!")
  } else {
    def pData = player.getPersistentData()
    if (event.input == "clear") {
      pData.putString("LastDismissedAnnouncementVersion", "0.0.0")
      event.respond($Text.yellow("Cleared dismissed version!"))
    } else {
      if (currentVersion == null) {
        event.cancel("Current version of the modpack is null, is BetterCompatibilityCheck installed?")
      } else {
        pData.putString("LastDismissedAnnouncementVersion", currentVersion.toString())
        event.respond(
            $Text.translatable("announcements.atm.dismissed_up_to_version", currentVersion.toString()).yellow()
        )
      }
    }
  }
})
