/**
 * This File has been authored by AllTheMods Staff, or a Community contributor for use in AllTheMods.
 * As all AllTheMods packs are licensed under All Rights Reserved, this file is not allowed to be used in any public packs not released by the AllTheMods Team, without explicit permission.
 */

// requires extradisks
package server_scripts.recipes

$ServerEvents.recipes((allthemods) -> {
  allthemods.remove([id: $Utils.regex(/extradisks:blocks\/infinite_.*/)])
  allthemods.remove([id: $Utils.regex(/extradisks:disk\/shaped\/infinite_.*/)])
  allthemods.remove([id: $Utils.regex(/extradisks:disk\/shapeless\/infinite_.*/)])
  allthemods.remove([id: $Utils.regex(/extradisks:part\/infinite_.*/)])
})
