let stuckPlayers = Utils.newMap()

PlayerEvents.tick((allthemods) => {
    let player = allthemods.getPlayer();
	if (player.isFakePlayer()) return;
	if (player.tickCount % 60 != 0) return;
	let interaction = player.getFluidInteraction();
	let inFluid = interaction.getMaxHeightFluidType()
	if (inFluid.toString() == "minecraft:empty") return;
	let likeWater = inFluid.getIsWaterLike()
	let canMove = inFluid.move(player, [0,0,0], 0.08)
	if (!likeWater && !canMove) {
		let lastStuck = stuckPlayers.getOrDefault(player.uuid, 0)
		if (lastStuck == 0 || player.tickCount - lastStuck > 200) {
		   player.tell(Text.translatable(`You are stuck on fluid %s!`, Text.green(inFluid.getDescription())).red())
		   let identifier = Registry.of("neoforge:fluid_type").getId(inFluid)
		   let modInfo = Platform.getInfo(identifier.getNamespace())
		   if (modInfo != null) {
		     player.tell(Text.translate(`Report this issue to %s!`, Text.green(modInfo.getName())).red())				   
		   }
		   let message = Text.of("Click here to teleport to spawn").green().clickRunCommand("/spawn");
		   player.tell(message)
		   stuckPlayers.put(player.uuid, player.tickCount)
		}
	}
})