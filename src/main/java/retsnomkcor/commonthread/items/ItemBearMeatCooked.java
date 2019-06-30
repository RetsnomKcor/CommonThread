package retsnomkcor.commonthread.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import retsnomkcor.commonthread.CommonThread;

public class ItemBearMeatCooked extends ItemFood {

    public ItemBearMeatCooked() {
        super(4,0.6f,true);
        setTranslationKey(CommonThread.modId + ".bear_meat_cooked");
        setRegistryName(new ResourceLocation(CommonThread.modId, "bear_meat_cooked"));
        setCreativeTab(CommonThread.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    public void initOreDict() {

        OreDictionary.registerOre("listAllMeatCooked", this);
    }
}
