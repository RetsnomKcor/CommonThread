package retsnomkcor.commonthread.config;

import net.minecraftforge.common.config.Config;
import retsnomkcor.commonthread.CommonThread;

@Config(modid = CommonThread.modId, category = "village")
public class VillageConfig {

    @Config.Comment(value = "Enable or disable all villagers and village changes")
    public static boolean enableVillage = true;

    @Config.Comment(value = "Enable or disable new villagers")
    public static boolean enableVillagers = true;

    @Config.Comment(value = "Enable Decorator Villagers")
    public static boolean enableDecorators = true;

    @Config.Comment(value = "Enable Naturist Villagers")
    public static boolean enableNaturist = true;
}
