package com.magmaguy.elitemobs.config.dungeonpackager.premade;

import com.magmaguy.elitemobs.config.dungeonpackager.DungeonPackagerConfigFields;
import com.magmaguy.elitemobs.utils.DiscordLinks;
import org.bukkit.World;

import java.util.ArrayList;
import java.util.List;

public class InvasionMinidungeon extends DungeonPackagerConfigFields {
    public InvasionMinidungeon() {
        super("invasion_minidungeon",
                true,
                "&2[lvl 035-045] &2The Invasion",
                new ArrayList<>(List.of("&fThe Halloween Minidungeon!",
                        "&6Credits: MagmaGuy & 69OzCanOfBepis")),
                DiscordLinks.freeMinidungeons,
                DungeonSizeCategory.MINIDUNGEON,
                "em_invasion",
                World.Environment.NORMAL,
                true,
                "em_invasion,-8.5,13.2,19.5,80,0",
                0,
                "Difficulty: &6Medium\n" +
                        "$bossCount aliens, from level $lowestTier to $highestTier\n" +
                        "&6Don't get abducted!",
                "&8[EM] &7Alien invasion in progress! Defeat the Mothership!",
                "&8[EM] &7You have escaped the alien abductions! No one will ever believe you.",
                "invasion",
                false);
    }
}
