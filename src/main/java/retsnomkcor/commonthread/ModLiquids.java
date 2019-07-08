package retsnomkcor.commonthread;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import retsnomkcor.commonthread.fluids.LiquidOil;
import retsnomkcor.commonthread.fluids.LiquidQuickSand;

public class ModLiquids {
    public static final Fluid oil = new LiquidOil();
    public static final Fluid quicksand = new LiquidQuickSand();

    public static void init() {
        //FluidRegistry.registerFluid(oil);
        //FluidRegistry.addBucketForFluid(oil);

        FluidRegistry.registerFluid(quicksand);
        FluidRegistry.addBucketForFluid(quicksand);
    }

    public static boolean isValidOilStack(FluidStack stack){
        return getFluidFromStack(stack) == oil;
    }
    public static boolean isValidQuicksandStack(FluidStack stack){
        return getFluidFromStack(stack) == quicksand;
    }

    public static Fluid getFluidFromStack(FluidStack stack){
        return stack == null ? null : stack.getFluid();
    }

    public static String getFluidName(FluidStack stack){
        Fluid fluid = getFluidFromStack(stack);
        return getFluidName(fluid);
    }

    public static String getFluidName(Fluid fluid){
        return fluid == null ? "null" : fluid.getName();
    }

    public static int getAmount(FluidStack stack){
        return stack == null ? 0 : stack.amount;
    }
}
