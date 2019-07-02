package retsnomkcor.commonthread.recipe;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import retsnomkcor.commonthread.ModItems;
import retsnomkcor.commonthread.items.ItemBearMeat;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModItems.itemBearMeat, new ItemStack(ModItems.itemBearMeatCooked), 0.5f);
        GameRegistry.addSmelting(ModItems.itemFlour, new ItemStack(Items.BREAD), 0.1f);

        ModItems.itemBearMeat.initOreDict();
        ModItems.itemBearMeatCooked.initOreDict();
        ModItems.itemLettuce.initOreDict();
        ModItems.itemFlour.initOreDict();
        ModItems.itemLettuceSeeds.initOreDict();
    }
}
