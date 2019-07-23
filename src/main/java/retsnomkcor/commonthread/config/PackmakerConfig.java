package retsnomkcor.commonthread.config;

import net.minecraftforge.common.config.Config;
import retsnomkcor.commonthread.CommonThread;

@Config(modid = CommonThread.modId, category = "packmaker tools")
public class PackmakerConfig {

    @Config.Comment(value = "Enable or disable this module")
    public static boolean enablePackTools = false;
}
