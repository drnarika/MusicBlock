package com.bluetie.musicblock.block.half;

import com.bluetie.musicblock.MainMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import static com.bluetie.musicblock.block.BlockRegistry.modid;

public class BlockHalfIronMusicBlock {

    private static String BlockName = "halfironmusicblock";
    private static String TranslationKey =modid + "." + BlockName;


    private static Block DBlock = new Block(Material.SAND).setRegistryName(modid,BlockName).setTranslationKey(TranslationKey).setCreativeTab(MainMod.MUSIC_BLOCK);
    private static ItemBlock DItemBlock = new ItemBlock(DBlock);
    
    public static Block GetBlock(){return DBlock;}
    public static ItemBlock GetItemBlock(){return DItemBlock;}
    public static Item GetItem(){return Item.getItemFromBlock(DBlock);}

    public static void SetItemBlock(){
        DItemBlock.setRegistryName(modid,BlockName)
                .setCreativeTab(MainMod.MUSIC_BLOCK)
                .setTranslationKey(TranslationKey);
    }
}
