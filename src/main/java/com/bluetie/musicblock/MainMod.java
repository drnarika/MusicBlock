package com.bluetie.musicblock;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;


@Mod(modid = "musicblock", name = "MusicBlock", version = "1.0.0", useMetadata = true)
public enum MainMod {
        INSTANCE;

        //构造工厂
        @Mod.InstanceFactory
        public static MainMod getInstance() {
            return INSTANCE;
        }

        // 一个入口方法。
        // Mod的加载大致分为 6 个阶段，每个阶段均有一个事件代表，
        // 而 @Mod.EventHandler 注解则标记该方法将订阅此事件。
        // Mod 加载时的六个阶段对应的事件，以时间顺序排列：
        //    FMLConstructionEvent
        //    FMLPreInitializationEvent
        //    FMLInitializationEvent
        //    FMLInterModComms.IMCEvent
        //    FMLPostInitializationEvent
        //    FMLLoadCompleteEvent
        // 其中，PreInit.、Init.、IMCEvent 和 PostInit. 是最常用的四个事件，
        // 剩下两个事件只有在相当少见的情况下才会用到，大可暂时无视。
        @Mod.EventHandler
        public void preLoad(FMLPreInitializationEvent event) {

                    }
}