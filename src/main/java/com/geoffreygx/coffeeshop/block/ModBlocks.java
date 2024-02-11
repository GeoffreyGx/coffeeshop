package com.geoffreygx.coffeeshop.block;

import com.geoffreygx.coffeeshop.CoffeeShop;
import com.geoffreygx.coffeeshop.block.custom.CoffeeMachineBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block COFFEE_MACHINE = registerBlock("coffee_machine",
            new CoffeeMachineBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CoffeeShop.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new  Identifier(CoffeeShop.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CoffeeShop.LOGGER.info("Registering blocks for " + CoffeeShop.MOD_ID);
    }
}
