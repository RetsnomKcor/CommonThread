package retsnomkcor.commonthread;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import retsnomkcor.commonthread.blocks.Crops.BlockCropLettuce;
import retsnomkcor.commonthread.config.FarmingConfig;
import retsnomkcor.commonthread.fluids.BlockQuickSand;

public class ModBlocks {

    //how to add the blocks

    //@GameRegistry.ObjectHolder("commonthread:oil")
    //public static BlockOil blockOil;

    @GameRegistry.ObjectHolder("commonthread:crop_lettuce")
    public static BlockCropLettuce blockCropLettuce;

    @GameRegistry.ObjectHolder("commonthread:quicksand")
    public static BlockQuickSand blockQuickSand;



    @SideOnly(Side.CLIENT)
    public static void initModels() {
        //how to register the block model
        //blockFastFurnace.initModel();
        //blockOil.initModel();
        System.out.println("Moon Shoes");
        blockQuickSand.initModel();
    }

    public static void register(IForgeRegistry<Block> registry) {
        //register blocks
        //registry.register(new BlockFastFurnace());
        //register tile entities
        //GameRegistry.registerTileEntity(TileFastFurnace.class, MyMod.MODID + "_fast_furnace");
        if (FarmingConfig.enableLettuce){
            registry.register(new BlockCropLettuce());
        }

        registry.register(new BlockQuickSand());


    }
}
