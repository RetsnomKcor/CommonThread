package retsnomkcor.commonthread.proxy;

import com.google.common.util.concurrent.ListenableFuture;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import retsnomkcor.commonthread.ModBlocks;
import retsnomkcor.commonthread.ModItems;
import retsnomkcor.commonthread.ModLiquids;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {

        ModLiquids.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }



    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.register(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModItems.register(event.getRegistry());
    }

    // These are basically a failsafe to ensure that these two methods are never called server side
    public ListenableFuture<Object> addScheduledTaskClient (Runnable runnableToSchedule) {
        throw new IllegalStateException("This should only be called from the client side");
    }

    public EntityPlayer getClientPlayer() {
        throw new IllegalStateException("This should only be called from the client side");
    }
}
