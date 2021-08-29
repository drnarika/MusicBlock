package com.bluetie.musicblock.block;

import com.bluetie.musicblock.block.half.BlockHalfGoldMusicBlock;
import com.bluetie.musicblock.block.half.BlockHalfIronMusicBlock;
import com.bluetie.musicblock.block.half.BlockHalfStoneMusicBlock;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = "musicblock")
public class BlockModelMapper {

    @SubscribeEvent
    public static void onModelReg(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(BlockHalfIronMusicBlock.GetItem(), 0, new ModelResourceLocation(BlockHalfIronMusicBlock.GetBlock().getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BlockHalfStoneMusicBlock.GetItem(), 0, new ModelResourceLocation(BlockHalfStoneMusicBlock.GetBlock().getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BlockHalfGoldMusicBlock.GetItem(), 0, new ModelResourceLocation(BlockHalfGoldMusicBlock.GetBlock().getRegistryName(), "inventory"));
    }
}
