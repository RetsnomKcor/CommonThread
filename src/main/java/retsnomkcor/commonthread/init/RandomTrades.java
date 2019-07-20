package retsnomkcor.commonthread.init;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import java.util.Random;

public class RandomTrades {
    //Add these in

    public static class RandTradesByMeta implements EntityVillager.ITradeList{
        /** The  item stack to buy */
        public ItemStack stack;
        /** The price info determining the amount of emeralds to trade in for the enchanted item */
        public EntityVillager.PriceInfo priceInfo;
        private String[] meta;
        private Item item;
        private int amount;

        /**
         * Instantiates a new trade emeralds for enchanted boots.
         */
        public RandTradesByMeta(EntityVillager.PriceInfo priceAmount, Item item, int quantity, String... metadata)
        {

            this.meta = metadata;
            this.item = item;
            this.amount=quantity;

            priceInfo = priceAmount;
        }


        @Override
        public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
        {
            int actualPrice = 1;

            if (priceInfo != null)
            {
                actualPrice = priceInfo.getPrice(random);
            }

            int x = random.nextInt(meta.length);
            stack = new ItemStack(item, amount, x);
            ItemStack stackToPay = new ItemStack(Items.EMERALD, actualPrice, 0);
            recipeList.add(new MerchantRecipe(stackToPay, stack));

            // DEBUG
            System.out.println("Merchant recipe list = "+recipeList.getRecipiesAsTags());
        }
    }

    public static class RandTradesByItem implements EntityVillager.ITradeList{
        /** The  item stack to buy */
        public ItemStack stack;
        /** The price info determining the amount of emeralds to trade in for the enchanted item */
        public EntityVillager.PriceInfo priceInfo;
        private Item[] items;
        private int amount;

        /**
         * Instantiates a new trade emeralds for enchanted boots.
         */
        public RandTradesByItem(EntityVillager.PriceInfo priceAmount, int quantity, Item... specItems)
        {

            this.items = specItems;
            this.amount=quantity;

            priceInfo = priceAmount;
        }


        @Override
        public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
        {
            int actualPrice = 1;

            if (priceInfo != null)
            {
                actualPrice = priceInfo.getPrice(random);
            }

            Item item = items[random.nextInt(items.length)];
            stack = new ItemStack(item, amount, 0);
            ItemStack stackToPay = new ItemStack(Items.EMERALD, actualPrice, 0);
            recipeList.add(new MerchantRecipe(stackToPay, stack));

            // DEBUG
            System.out.println("Merchant recipe list = "+recipeList.getRecipiesAsTags());
        }
    }
}
