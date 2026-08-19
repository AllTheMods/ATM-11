if (Platform.isLoaded("bcc") && Platform.isLoaded("simplerpc")) {
	let $CraterEventBus = Java.loadClass("com.hypherionmc.craterlib.core.event.CraterEventBus")
	let $PlaceholderEngine = Java.loadClass("com.hypherionmc.simplerpc.api.variables.PlaceholderEngine")
	let $BetterCompatibilityChecker = Java.loadClass("dev.wuffs.bcc.BetterCompatibilityChecker")

	$CraterEventBus.INSTANCE.registerListener((event) => {
		$PlaceholderEngine.INSTANCE.registerPlaceholder("bcc.version", "Unknown version", () => $BetterCompatibilityChecker.betterStatus.version());
		console.log("Registering BCC Version on Simple RPC...")
	}, "com.hypherionmc.simplerpc.api.events.RPCEvents$RegisterPlaceholders")	
}
