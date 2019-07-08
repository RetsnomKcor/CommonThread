package retsnomkcor.commonthread.blocks.Crops;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import retsnomkcor.commonthread.ModItems;

public class BlockCropLettuce extends BlockCrops {

    public static final PropertyInteger LETTUCE_AGE = PropertyInteger.create("age", 0, 3);

    public BlockCropLettuce() {
        setTranslationKey("crop_lettuce");
        setRegistryName("crop_lettuce");
        this.setSoundType(SoundType.PLANT);
    }

    public int getMaxAge(){
        return 3;
    }
    //Specify the seed for the crop
    @Override
    protected Item getSeed() {
        return ModItems.itemLettuceSeeds;
    }

    //Specify the crop drop
    @Override
    protected Item getCrop() {
        return ModItems.itemLettuce;
    }

    protected int getBonemealAgeIncrease(World worldIn)
    {
        return super.getBonemealAgeIncrease(worldIn) / 3;
    }



}
