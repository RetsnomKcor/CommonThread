package retsnomkcor.commonthread.items.food;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import retsnomkcor.commonthread.CommonThread;

public class ItemGardenSalad extends ItemFood {

    public ItemGardenSalad() {
        super(4,0.4f,false);
        setTranslationKey(CommonThread.modId + ".garden_salad");
        setRegistryName(new ResourceLocation(CommonThread.modId, "garden_salad"));
        setCreativeTab(CommonThread.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
