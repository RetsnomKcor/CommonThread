package retsnomkcor.commonthread.items.crops;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import retsnomkcor.commonthread.CommonThread;
import retsnomkcor.commonthread.ModBlocks;

public class ItemLettuceSeeds extends ItemSeeds {

    public ItemLettuceSeeds() {
        super(ModBlocks.blockCropLettuce, Blocks.FARMLAND);
        setTranslationKey(CommonThread.modId + ".lettuce_seeds");
        setRegistryName(new ResourceLocation(CommonThread.modId, "lettuce_seeds"));
        setCreativeTab(CommonThread.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
