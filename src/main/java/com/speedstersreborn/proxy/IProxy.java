package com.speedstersreborn.proxy;


import net.minecraft.item.Item;

public interface IProxy {
    void preInit();

    void init();

    void registerItemRenderer(Item item, int meta, String id);
}
