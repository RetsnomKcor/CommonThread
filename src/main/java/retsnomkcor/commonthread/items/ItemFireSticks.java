package retsnomkcor.commonthread.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemFlintAndSteel;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import retsnomkcor.commonthread.CommonThread;

public class ItemFireSticks extends ItemFlintAndSteel{

    public ItemFireSticks() {
        setTranslationKey(CommonThread.modId + ".fire_sticks");
        setRegistryName(new ResourceLocation(CommonThread.modId, "fire_sticks"));
        setCreativeTab(CommonThread.creativeTab);
        this.setMaxStackSize(1);
        this.setMaxDamage(3);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


}
