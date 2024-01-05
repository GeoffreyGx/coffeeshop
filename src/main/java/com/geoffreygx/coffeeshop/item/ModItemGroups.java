package com.geoffreygx.coffeeshop.item;

import com.geoffreygx.coffeeshop.CoffeeShop;
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
                entries.add(ModItems.CARDBOARD_CUP_SMALL);
                entries.add(ModItems.CARDBOARD_CUP_MEDIUM);
                entries.add(ModItems.CARDBOARD_CUP_LARGE);
            })
            .build();

    public static void registerItemGroups() {
        CoffeeShop.LOGGER.info("Registering Item Group for " + CoffeeShop.MOD_ID);
        Registry.register(Registries.ITEM_GROUP, new Identifier("coffeeshop", "coffeeshop_group"), COFFEE_SHOP_ITEM_GROUP);
    }
}
