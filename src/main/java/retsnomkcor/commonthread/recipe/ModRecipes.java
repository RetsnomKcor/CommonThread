package retsnomkcor.commonthread.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import retsnomkcor.commonthread.ModItems;
import retsnomkcor.commonthread.items.ItemBearMeat;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModItems.itemBearMeat, new ItemStack(ModItems.itemBearMeatCooked), 0.5f);

        ModItems.itemBearMeat.initOreDict();
        ModItems.itemBearMeatCooked.initOreDict();
        ModItems.itemLettuce.initOreDict();
    }
}
