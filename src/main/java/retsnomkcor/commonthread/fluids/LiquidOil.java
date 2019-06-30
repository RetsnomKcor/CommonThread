package retsnomkcor.commonthread.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import retsnomkcor.commonthread.CommonThread;

public class LiquidOil extends Fluid {

    public LiquidOil() {
        super("oil",
                new ResourceLocation(CommonThread.modId, "blocks/oil_still"),
                new ResourceLocation(CommonThread.modId, "blocks/oil_flow"));
    }
}
