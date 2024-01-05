package com.geoffreygx.coffeeshop.item;

import com.geoffreygx.coffeeshop.CoffeeShop;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CARDBOARD_CUP_SMALL = registerItems("cardboard_cup_small", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_MEDIUM = registerItems("cardboard_cup_medium", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_LARGE = registerItems("cardboard_cup_large", new Item(new FabricItemSettings()));

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CoffeeShop.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CoffeeShop.LOGGER.info("Registering Items for " + CoffeeShop.MOD_ID);
    }
}
