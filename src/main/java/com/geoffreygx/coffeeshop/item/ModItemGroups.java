package com.geoffreygx.coffeeshop.item;

import com.geoffreygx.coffeeshop.CoffeeShop;
import com.geoffreygx.coffeeshop.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COFFEE_SHOP_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CARDBOARD_CUP_MEDIUM))
            .displayName(Text.translatable("itemGroup.coffeeshop"))
            .entries((context, entries) -> {
                entries.add(ModBlocks.COFFEE_MACHINE);
                entries.add(ModItems.CARDBOARD_CUP_SMALL);
                entries.add(ModItems.CARDBOARD_CUP_MEDIUM);
                entries.add(ModItems.CARDBOARD_CUP_LARGE);
                entries.add(ModItems.CARDBOARD_CUP_WHITE);
                entries.add(ModItems.CARDBOARD_CUP_LIGHT_GRAY);
                entries.add(ModItems.CARDBOARD_CUP_GRAY);
                entries.add(ModItems.CARDBOARD_CUP_BLACK);
                entries.add(ModItems.CARDBOARD_CUP_BROWN);
                entries.add(ModItems.CARDBOARD_CUP_RED);
                entries.add(ModItems.CARDBOARD_CUP_ORANGE);
                entries.add(ModItems.CARDBOARD_CUP_YELLOW);
                entries.add(ModItems.CARDBOARD_CUP_LIME);
                entries.add(ModItems.CARDBOARD_CUP_GREEN);
                entries.add(ModItems.CARDBOARD_CUP_CYAN);
                entries.add(ModItems.CARDBOARD_CUP_LIGHT_BLUE);
                entries.add(ModItems.CARDBOARD_CUP_BLUE);
                entries.add(ModItems.CARDBOARD_CUP_PURPLE);
                entries.add(ModItems.CARDBOARD_CUP_MAGENTA);
                entries.add(ModItems.CARDBOARD_CUP_PINK);
                entries.add(ModItems.WHIPPED_CREAM);
            })
            .build();

    public static void registerItemGroups() {
        CoffeeShop.LOGGER.info("Registering Item Group for " + CoffeeShop.MOD_ID);
        Registry.register(Registries.ITEM_GROUP, new Identifier("coffeeshop", "coffeeshop_group"), COFFEE_SHOP_ITEM_GROUP);
    }
}
