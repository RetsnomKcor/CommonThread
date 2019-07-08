package retsnomkcor.commonthread.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import retsnomkcor.commonthread.CommonThread;
import retsnomkcor.commonthread.ModLiquids;

public class BlockQuickSand extends BlockFluidClassic {
    public static final ResourceLocation QUICKSAND = new ResourceLocation(CommonThread.modId, "quicksand");

    public BlockQuickSand() {
        super(ModLiquids.quicksand, Material.WATER);
        this.setLightOpacity(255);
        this.renderLayer = BlockRenderLayer.SOLID;
        this.setHardness(0.5F);

        setCreativeTab(CommonThread.creativeTab);
        setTranslationKey(CommonThread.modId + ".quicksand");
        setRegistryName(QUICKSAND);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelResourceLocation fluidLocation = new ModelResourceLocation(QUICKSAND, "fluid");

        StateMapperBase customState = new StateMapperBase() {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState iBlockState) {
                return fluidLocation;
            }
        };
        ModelLoader.setCustomStateMapper(this, customState);
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(QUICKSAND, "inventory"));
    }

    @Override
    public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity) {
        entity.setInWeb();
    }
}
