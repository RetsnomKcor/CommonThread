package retsnomkcor.commonthread.items.crops;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import retsnomkcor.commonthread.CommonThread;

public class ItemLettuce extends ItemFood {

    public ItemLettuce() {
        super(1,0.2f,false);
        setTranslationKey(CommonThread.modId + ".lettuce");
        setRegistryName(new ResourceLocation(CommonThread.modId, "lettuce"));
        setCreativeTab(CommonThread.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    public void initOreDict() {

        OreDictionary.registerOre("cropLettuce", this);
        OreDictionary.registerOre("listAllVeggie", this);
    }
}
