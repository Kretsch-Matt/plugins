package net.runelite.client.plugins.specialattackuser;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("specialattackuser")
public interface SpecialAttackUserConfig extends Config
{
	@ConfigItem(
		keyName = "specialPercent",
		name = "Percent",
		description = "The special percent to enable special attack at.",
		position = 1
	)
	default int specialPercent()
	{
		return 100;
	}

	@ConfigItem(
			keyName = "Tick delay min",
			name = "Min tick delay",
			description = "The minimum tick delay",
			position = 1
	)
	default int delayMin()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "Tick delay max",
			name = "Max tick delay",
			description = "The maximum tick delay",
			position = 1
	)
	default int delayMax()
	{
		return 1;
	}
}
