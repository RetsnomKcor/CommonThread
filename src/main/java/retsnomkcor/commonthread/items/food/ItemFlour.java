package retsnomkcor.commonthread.items.food;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import retsnomkcor.commonthread.CommonThread;

public class ItemFlour  extends Item {
    public ItemFlour() {
        setTranslationKey(CommonThread.modId + ".flour");
        setRegistryName(new ResourceLocation(CommonThread.modId, "flour"));
        setCreativeTab(CommonThread.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    public void initOreDict() {

        OreDictionary.registerOre("foodFlour", this);
    }
}
