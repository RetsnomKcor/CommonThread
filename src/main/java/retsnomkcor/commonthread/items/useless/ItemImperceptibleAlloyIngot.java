package retsnomkcor.commonthread.items.useless;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import retsnomkcor.commonthread.CommonThread;

public class ItemImperceptibleAlloyIngot extends Item {

    public ItemImperceptibleAlloyIngot() {
        setTranslationKey(CommonThread.modId + ".imperceptible_alloy_ingot");
        setRegistryName(new ResourceLocation(CommonThread.modId, "imperceptible_alloy_ingot"));
        setCreativeTab(CommonThread.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
