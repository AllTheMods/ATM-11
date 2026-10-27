/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires repeatable_trial_vaults
package server_scripts.tags

$ServerEvents.tags("item", (allthemods) -> {
  // Trial Vault Repeatability for Decrepit Keys
  allthemods.add("repeatable_trial_vaults:can_reset_trial_vaults", "irons_spellbooks:decrepit_key")
})
