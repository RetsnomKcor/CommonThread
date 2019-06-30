package retsnomkcor.commonthread;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import retsnomkcor.commonthread.handler.MobDropHandler;
import retsnomkcor.commonthread.proxy.CommonProxy;
import retsnomkcor.commonthread.recipe.ModRecipes;

@Mod(modid = CommonThread.modId, name = CommonThread.name, version = CommonThread.version, acceptedMinecraftVersions = "[1.12.2]")
public class CommonThread {

    public static final String modId = "commonthread";
    public static final String name = "Common Thread";
    public static final String version = "0.0.2.1";

    @SidedProxy(clientSide = "retsnomkcor.commonthread.proxy.ClientProxy", serverSide = "retsnomkcor.commonthread.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs creativeTab = new CreativeTabs(  "commonthread") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.itemBleedingStar);
        }
    };

    public static final Item.ToolMaterial clawToolMaterial = EnumHelper.addToolMaterial("CLAW", 1, 100, 7, 1, 6);

    public CommonThread() {
        FluidRegistry.enableUniversalBucket();
    }

    @Mod.Instance(modId)
    public static CommonThread instance;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        System.out.println(name + " is loading!");
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
        ModRecipes.init();
        MinecraftForge.EVENT_BUS.register(new MobDropHandler());

        //Add trades to villagers
        VillagerRegistry.FARMER.getCareer(0).addTrade(1, new EntityVillager.EmeraldForItems(ModItems.itemLettuce, new EntityVillager.PriceInfo(17, 23)));

        //Add seed drops to grass
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.itemLettuceSeeds), 7);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }

}

