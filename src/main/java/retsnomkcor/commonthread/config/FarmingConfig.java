package retsnomkcor.commonthread.config;

import net.minecraftforge.common.config.Config;
import retsnomkcor.commonthread.CommonThread;

@Config(modid = CommonThread.modId, category = "farming")
public class FarmingConfig {
    @Config.Comment(value = "Rate at which new seeds drop from grass. Set to zero to disable.")
    public static int seedsGrassDrops = 7;

    @Config.Comment(value = "Enable villager trades for new crops?")
    public static boolean enableCropTrades = true;

    @Config.Comment(value = "Enable lettuce")
    public static boolean enableLettuce = true;
}
