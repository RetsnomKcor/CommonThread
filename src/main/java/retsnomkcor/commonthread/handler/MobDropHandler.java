package retsnomkcor.commonthread.handler;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import retsnomkcor.commonthread.ModItems;

public class MobDropHandler {

    //The event called for drops on mob death
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event){

        //If the entity's name contains "Bear" the new drop will be added
        if (event.getEntity().getClass().toString().contains("Bear"))
        {

            //removes previously existing drops
            event.getDrops().clear();

            //Items to drop
            ItemStack stack = new ItemStack(ModItems.itemBearClaw);
            EntityItem drop = new EntityItem(event.getEntity().getEntityWorld(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);

            event.getDrops().add(drop);
        }

        if (event.getEntity().getClass().toString().contains("Bear"))
        {
            //Items to drop
            ItemStack stack = new ItemStack(ModItems.itemBearMeat);
            EntityItem drop = new EntityItem(event.getEntity().getEntityWorld(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);

            event.getDrops().add(drop);
        }
    }
}
