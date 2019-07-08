package retsnomkcor.commonthread.init;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import retsnomkcor.commonthread.CommonThread;

import java.util.Random;

@GameRegistry.ObjectHolder(CommonThread.modId)
public class ModVillagers {
    //create villager professions
    public static final VillagerRegistry.VillagerProfession decorator = null;

    //create villager careers
    public static VillagerRegistry.VillagerCareer dye_merchant;

    @Mod.EventBusSubscriber(modid = CommonThread.modId)
    public static class RegistrationHandler
    {

        @SubscribeEvent
        public static void onEvent(final RegistryEvent.Register<VillagerRegistry.VillagerProfession> event)
        {
            final IForgeRegistry<VillagerRegistry.VillagerProfession> registry = event.getRegistry();

            registry.register(new VillagerRegistry.VillagerProfession(
                    CommonThread.modId+":decorator",
                    CommonThread.modId+":textures/entity/villager/dyer.png",
                    CommonThread.modId+":textures/entity/zombie_villager/zombie_dyer.png"));
        }
    }

    public static void associateCareersAndTrades()
    {

        //int x = ThreadLocalRandom.current().nextInt(0,7 + 1);
        //int y = ThreadLocalRandom.current().nextInt(8,15 + 1);
        dye_merchant = (new VillagerRegistry.VillagerCareer(decorator, "dye_merchant"))
                .addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(Items.DYE, 8,1), new EntityVillager.PriceInfo(3,7)),
                        new EntityVillager.ListItemForEmeralds(new ItemStack(Items.DYE, 8,6), new EntityVillager.PriceInfo(3,7)),
                        new EntityVillager.EmeraldForItems(Items.DYE, new EntityVillager.PriceInfo(5,8)))
                .addTrade(2, new EntityVillager.ListItemForEmeralds(new ItemStack(Items.BANNER, 1, 3), new EntityVillager.PriceInfo(5,9)),
                        new EntityVillager.ListItemForEmeralds(new ItemStack(Items.BANNER, 1, 8), new EntityVillager.PriceInfo(5,9)));
    }


}
