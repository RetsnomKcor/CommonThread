package retsnomkcor.commonthread.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import retsnomkcor.commonthread.CommonThread;

public class LiquidQuickSand extends Fluid {
    public LiquidQuickSand(){
        //assign the new fluid a name
        super("quicksand",
                //assign the fluid two textures
                //one for still and one for flowing
                new ResourceLocation(CommonThread.modId, "blocks/quick_sand_still"),
                new ResourceLocation(CommonThread.modId, "blocks/quick_sand_flow"));
    }
}
