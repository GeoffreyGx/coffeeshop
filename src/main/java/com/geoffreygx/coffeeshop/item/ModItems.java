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
    public static final Item WHIPPED_CREAM = registerItems("whipped_cream", new Item(new FabricItemSettings()));

    // Colored cups

    public static final Item CARDBOARD_CUP_WHITE = registerItems("cardboard_cup_white", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_LIGHT_GRAY = registerItems("cardboard_cup_light_gray", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_GRAY = registerItems("cardboard_cup_gray", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_BLACK = registerItems("cardboard_cup_black", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_BROWN = registerItems("cardboard_cup_brown", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_RED = registerItems("cardboard_cup_red", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_ORANGE = registerItems("cardboard_cup_orange", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_YELLOW = registerItems("cardboard_cup_yellow", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_LIME = registerItems("cardboard_cup_lime", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_GREEN = registerItems("cardboard_cup_green", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_CYAN = registerItems("cardboard_cup_cyan", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_LIGHT_BLUE = registerItems("cardboard_cup_light_blue", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_BLUE = registerItems("cardboard_cup_blue", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_PURPLE = registerItems("cardboard_cup_purple", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_MAGENTA = registerItems("cardboard_cup_magenta", new Item(new FabricItemSettings()));
    public static final Item CARDBOARD_CUP_PINK = registerItems("cardboard_cup_pink", new Item(new FabricItemSettings()));

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CoffeeShop.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CoffeeShop.LOGGER.info("Registering Items for " + CoffeeShop.MOD_ID);
    }
}
