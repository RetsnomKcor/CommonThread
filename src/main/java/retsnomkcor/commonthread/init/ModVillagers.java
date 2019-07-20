package retsnomkcor.commonthread.init;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import retsnomkcor.commonthread.CommonThread;
import retsnomkcor.commonthread.config.VillageConfig;

@GameRegistry.ObjectHolder(CommonThread.modId)
public class ModVillagers {
    //create villager professions
    public static final VillagerRegistry.VillagerProfession decorator = null;
    public static final VillagerRegistry.VillagerProfession naturist = null;

    //create villager careers
    public static VillagerRegistry.VillagerCareer dye_merchant;
    public static VillagerRegistry.VillagerCareer designer;
    public static VillagerRegistry.VillagerCareer florist;

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

            registry.register(new VillagerRegistry.VillagerProfession(
                    CommonThread.modId+":naturist",
                    CommonThread.modId+":textures/entity/villager/naturist.png",
                    CommonThread.modId+"textures/entity/zombie_villager/zombie_naturist.png"
            ));
        }
    }

    public static void associateCareersAndTrades()
    {


        dye_merchant = (new VillagerRegistry.VillagerCareer(decorator, "dye_merchant"))
                .addTrade(1, new RandomTrades.RandTradesByMeta(new EntityVillager.PriceInfo(3,6), Items.DYE,3, "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","0"),
                        new RandomTrades.RandTradesByMeta(new EntityVillager.PriceInfo(4,7), Item.getItemFromBlock(Blocks.WOOL), 2, "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","0"),
                        new EntityVillager.EmeraldForItems(Items.DYE, new EntityVillager.PriceInfo(1,2)))
                .addTrade(2, new RandomTrades.RandTradesByMeta(new EntityVillager.PriceInfo(4, 8), Item.getItemFromBlock(Blocks.CARPET), 4, "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","0"),
                        new RandomTrades.RandTradesByMeta(new EntityVillager.PriceInfo(4, 8), Items.BED, 1, "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","0"))
                .addTrade(3, new RandomTrades.RandTradesByMeta(new EntityVillager.PriceInfo(5, 8), Items.BANNER, 1, "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","0"));

        designer = (new VillagerRegistry.VillagerCareer(decorator, "designer"))
                .addTrade(1, new EntityVillager.EmeraldForItems(Items.ITEM_FRAME, new EntityVillager.PriceInfo(1,3)))
                .addTrade(2, new EntityVillager.EmeraldForItems(Items.PAINTING, new EntityVillager.PriceInfo(3,7)));

        florist = (new VillagerRegistry.VillagerCareer(naturist, "florist"))
                .addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(Items.FLOWER_POT, 1), new EntityVillager.PriceInfo(1,2)),
                                   new EntityVillager.ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.YELLOW_FLOWER), 2), new EntityVillager.PriceInfo(1, 2)),
                                   new EntityVillager.ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.RED_FLOWER), 2, 0), new EntityVillager.PriceInfo(1, 2)))
                .addTrade(2, new RandomTrades.RandTradesByMeta(new EntityVillager.PriceInfo(2,4), Item.getItemFromBlock(Blocks.RED_FLOWER), 2, "1","2","3","4","5","6","7","8"))
                .addTrade(3, new RandomTrades.RandTradesByMeta(new EntityVillager.PriceInfo(3, 5), Item.getItemFromBlock(Blocks.DOUBLE_PLANT), 2, "0","1","4","5"));
    }


}
