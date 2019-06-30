package retsnomkcor.commonthread;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import retsnomkcor.commonthread.blocks.Crops.BlockCropLettuce;

public class ModBlocks {

    //how to add the blocks
    //@GameRegistry.ObjectHolder("mymod:fast_furnace")
    //public static BlockFastFurnace blockFastFurnace;

    //@GameRegistry.ObjectHolder("mymod:oil")
    //public static BlockOil blockOil;

    @GameRegistry.ObjectHolder("commonthread:crop_lettuce")
    public static BlockCropLettuce blockCropLettuce;




    @SideOnly(Side.CLIENT)
    public static void initModels() {
        //how to register the block model
        //blockFastFurnace.initModel();
        //blockOil.initModel();
    }

    public static void register(IForgeRegistry<Block> registry) {
        //register blocks
        //registry.register(new BlockFastFurnace());
        //register tile entities
        //GameRegistry.registerTileEntity(TileFastFurnace.class, MyMod.MODID + "_fast_furnace");
        registry.register(new BlockCropLettuce());


    }
}
