package retsnomkcor.commonthread.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import retsnomkcor.commonthread.ModItems;
import retsnomkcor.commonthread.config.FarmingConfig;
import retsnomkcor.commonthread.config.MobDropsConfig;
import retsnomkcor.commonthread.config.TweaksConfig;

public class ModRecipes {

    public static void init() {

        if (MobDropsConfig.enableDrops && MobDropsConfig.enableBearMeat) {
            GameRegistry.addSmelting(ModItems.itemBearMeat, new ItemStack(ModItems.itemBearMeatCooked), 0.5f);
            ModItems.itemBearMeat.initOreDict();
            ModItems.itemBearMeatCooked.initOreDict();
        }

        if (TweaksConfig.enableFlour) {
            GameRegistry.addSmelting(ModItems.itemFlour, new ItemStack(Items.BREAD), 0.1f);
            ModItems.itemFlour.initOreDict();
        }

        if (FarmingConfig.enableLettuce){
            ModItems.itemLettuce.initOreDict();
            ModItems.itemLettuceSeeds.initOreDict();
        }

        OreDictionary.registerOre("listAllmushroom", Item.getItemFromBlock(Blocks.BROWN_MUSHROOM));
        OreDictionary.registerOre("listAllmushroom", Item.getItemFromBlock(Blocks.RED_MUSHROOM));




    }
}
