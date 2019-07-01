package retsnomkcor.commonthread.items.useless;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import retsnomkcor.commonthread.CommonThread;

public class ItemEffervescentInk extends Item {

    public ItemEffervescentInk() {
        setTranslationKey(CommonThread.modId + ".effervescent_ink");
        setRegistryName(new ResourceLocation(CommonThread.modId, "effervescent_ink"));
        setCreativeTab(CommonThread.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
