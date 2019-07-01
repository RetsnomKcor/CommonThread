package retsnomkcor.commonthread;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import retsnomkcor.commonthread.items.*;
import retsnomkcor.commonthread.items.crops.ItemLettuce;
import retsnomkcor.commonthread.items.crops.ItemLettuceSeeds;
import retsnomkcor.commonthread.items.food.ItemCaesarSalad;
import retsnomkcor.commonthread.items.food.ItemChickenSalad;
import retsnomkcor.commonthread.items.food.ItemGardenSalad;
import retsnomkcor.commonthread.items.tool.ItemSword;
import retsnomkcor.commonthread.items.useless.*;


public class ModItems {

    @GameRegistry.ObjectHolder("commonthread:bleeding_star")
    public static ItemBleedingStar itemBleedingStar;

    @GameRegistry.ObjectHolder("commonthread:crystal_sphere")
    public static ItemCrystalSphere itemCrystalSphere;

    @GameRegistry.ObjectHolder("commonthread:dense_power_core")
    public static ItemDensePowerCore itemDensePowerCore;

    @GameRegistry.ObjectHolder("commonthread:effervescent_ink")
    public static ItemEffervescentInk itemEffervescentInk;

    @GameRegistry.ObjectHolder("commonthread:fauna_essence")
    public static ItemFaunaEssence itemFaunaEssence;

    @GameRegistry.ObjectHolder("commonthread:flora_essence")
    public static ItemFloraEssence itemFloraEssence;

    @GameRegistry.ObjectHolder("commonthread:immutable_alloy_ingot")
    public static ItemImmutableAlloyIngot itemImmutableAlloyIngot;

    @GameRegistry.ObjectHolder("commonthread:imperceptible_alloy_ingot")
    public static ItemImperceptibleAlloyIngot itemImperceptibleAlloyIngot;

    @GameRegistry.ObjectHolder("commonthread:magic_paper")
    public static ItemMagicPaper itemMagicPaper;

    @GameRegistry.ObjectHolder("commonthread:phoenix_quill")
    public static ItemPhoenixQuill itemPhoenixQuill;

    @GameRegistry.ObjectHolder("commonthread:power_core")
    public static ItemPowerCore itemPowerCore;

    @GameRegistry.ObjectHolder("commonthread:sun_orb")
    public static ItemSunOrb itemSunOrb;

    @GameRegistry.ObjectHolder("commonthread:vellum_binding")
    public static ItemVellumBinding itemVellumBinding;

    @GameRegistry.ObjectHolder("commonthread:bear_claw")
    public static ItemBearClaw itemBearClaw;

    @GameRegistry.ObjectHolder("commonthread:bear_meat_raw")
    public static ItemBearMeat itemBearMeat;

    @GameRegistry.ObjectHolder("commonthread:bear_meat_cooked")
    public static ItemBearMeatCooked itemBearMeatCooked;

    @GameRegistry.ObjectHolder("commonthread:lettuce")
    public static ItemLettuce itemLettuce;

    @GameRegistry.ObjectHolder("commonthread:lettuce_seeds")
    public static ItemLettuceSeeds itemLettuceSeeds;

    @GameRegistry.ObjectHolder("commonthread:caesar_salad")
    public static ItemCaesarSalad itemCaesarSalad;

    @GameRegistry.ObjectHolder("commonthread:chicken_salad")
    public static ItemChickenSalad itemChickenSalad;

    @GameRegistry.ObjectHolder("commonthread:garden_salad")
    public static ItemGardenSalad itemGardenSalad;

    public static ItemSword clawDagger = new ItemSword(CommonThread.clawToolMaterial, "claw_dagger");

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemBleedingStar.initModel();
        itemCrystalSphere.initModel();
        itemDensePowerCore.initModel();
        itemEffervescentInk.initModel();
        itemFaunaEssence.initModel();
        itemFloraEssence.initModel();
        itemImmutableAlloyIngot.initModel();
        itemImperceptibleAlloyIngot.initModel();
        itemMagicPaper.initModel();
        itemPhoenixQuill.initModel();
        itemPowerCore.initModel();
        itemSunOrb.initModel();
        itemVellumBinding.initModel();
        clawDagger.initModel();
        itemBearClaw.initModel();
        itemBearMeat.initModel();
        itemBearMeatCooked.initModel();
        itemLettuce.initModel();
        itemLettuceSeeds.initModel();
        itemCaesarSalad.initModel();
        itemChickenSalad.initModel();
        itemGardenSalad.initModel();

    }

    public static void register(IForgeRegistry<Item> registry) {
        //registry.register(new ItemRuby());
        //registry.register(new ItemBlock(ModBlocks.blockFrigidOre).setRegistryName(BlockFrigidOre.FRIGID_ORE));

        registry.register(new ItemBleedingStar());
        registry.register(new ItemCrystalSphere());
        registry.register(new ItemDensePowerCore());
        registry.register(new ItemEffervescentInk());
        registry.register(new ItemFaunaEssence());
        registry.register(new ItemFloraEssence());
        registry.register(new ItemImmutableAlloyIngot());
        registry.register(new ItemImperceptibleAlloyIngot());
        registry.register(new ItemMagicPaper());
        registry.register(new ItemPhoenixQuill());
        registry.register(new ItemPowerCore());
        registry.register(new ItemSunOrb());
        registry.register(new ItemVellumBinding());
        registry.register(clawDagger);
        registry.register(new ItemBearClaw());
        registry.register(new ItemBearMeat());
        registry.register(new ItemBearMeatCooked());
        registry.register(new ItemLettuce());
        registry.register(new ItemLettuceSeeds());
        registry.register(new ItemCaesarSalad());
        registry.register(new ItemChickenSalad());
        registry.register(new ItemGardenSalad());
    }
}
