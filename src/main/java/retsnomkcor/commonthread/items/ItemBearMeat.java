package retsnomkcor.commonthread.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import retsnomkcor.commonthread.CommonThread;

public class ItemBearMeat extends ItemFood {

    public ItemBearMeat() {
        super(2,0.3f,true);
        setTranslationKey(CommonThread.modId + ".bear_meat_raw");
        setRegistryName(new ResourceLocation(CommonThread.modId, "bear_meat_raw"));
        setCreativeTab(CommonThread.creativeTab);
    }

    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 100, 2));
        }
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    public void initOreDict() {

        OreDictionary.registerOre("listAllMeatRaw", this);

    }
}
