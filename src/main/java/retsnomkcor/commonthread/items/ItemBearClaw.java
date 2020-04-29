package retsnomkcor.commonthread.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import retsnomkcor.commonthread.CommonThread;

public class ItemBearClaw extends Item {

    public ItemBearClaw() {
        setTranslationKey(CommonThread.modId + ".bear_claw");
        setRegistryName(new ResourceLocation(CommonThread.modId, "bear_claw"));
        setCreativeTab(CommonThread.creativeTab);
    }

    //testing hold that thought
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
