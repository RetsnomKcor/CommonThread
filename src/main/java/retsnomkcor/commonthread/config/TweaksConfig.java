package retsnomkcor.commonthread.config;

import net.minecraftforge.common.config.Config;
import retsnomkcor.commonthread.CommonThread;

@Config(modid = CommonThread.modId, category = "tweaks")
public class TweaksConfig {
    @Config.Comment(value = "Enable flour, crafted from wheat and smelted to make bread")
    public static boolean enableFlour = true;
}
