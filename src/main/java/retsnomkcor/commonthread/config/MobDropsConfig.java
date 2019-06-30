package retsnomkcor.commonthread.config;

import net.minecraftforge.common.config.Config;
import retsnomkcor.commonthread.CommonThread;

@Config(modid = CommonThread.modId, category = "mobdrops")
public class MobDropsConfig {

    @Config.Comment(value = "Enable new mobs drops for vanilla mobs?")
    public static boolean enableDrops = true;

    @Config.Comment(value = "Enable bear meat to drop from Polar Bears?")
    public static boolean enableBearMeat = true;

    @Config.Comment(value = "Enable bear claws to drop from Polar Bears?")
    public static boolean enableBearClaws = true;
}
