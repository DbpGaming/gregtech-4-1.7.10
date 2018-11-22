package gregtechmod.loaders.postload;

import gregtechmod.GT_Mod;
import gregtechmod.api.util.GT_Utility;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.MinecraftForge;

public class GT_BlockResistanceLoader implements Runnable {
	@Override
	public void run() {
    	Blocks.brick_block.setResistance(20.0F);
    	Blocks.hardened_clay.setResistance(15.0F);
    	Blocks.stained_hardened_clay.setResistance(15.0F);
    	Blocks.iron_block.setResistance(30.0F);
    	Blocks.diamond_block.setResistance(60.0F);
    	
    	if (GT_Mod.sHardRock) {
    		//Blocks.stone.blockHardness = 16.0F;
    		//Blocks.brick.blockHardness = 32.0F;
    		//Blocks.hardened_clay.blockHardness = 32.0F;
    		//Blocks.stained_hardened_clay.blockHardness = 32.0F;
    		//Blocks.cobblestone.blockHardness = 12.0F;
    		//Blocks.stoneBrick.blockHardness = 24.0F;
    	}
    	
    	//MinecraftForge.setBlockHarvestLevel(Blocks.bed, "axe", 0);
    	//MinecraftForge.setBlockHarvestLevel(Blocks.hay_block, "axe", 0);
    	//MinecraftForge.setBlockHarvestLevel(Blocks.tnt, "pickaxe", 0);
    	//MinecraftForge.setBlockHarvestLevel(Blocks.sponge, "axe", 0);
    	//MinecraftForge.setBlockHarvestLevel(Blocks.monster_egg, "pickaxe", 0);
    	
    	GT_Utility.callMethod(Material.tnt, "func_85158_p", true, false, false);
    	GT_Utility.callMethod(Material.tnt, "setAdventureModeExempt", true, false, false);
    	
    	try {
	    	//ItemAxe.blocksEffectiveAgainst[0] = Blocks.bed;
	    	//ItemAxe.blocksEffectiveAgainst[1] = Blocks.hay_block;
	    	//ItemAxe.blocksEffectiveAgainst[2] = Blocks.sponge;
	    	
	    	//ItemPickaxe.blocksEffectiveAgainst[0] = Blocks.monster_egg;
	    	//ItemPickaxe.blocksEffectiveAgainst[3] = Blocks.tnt;
    	} catch(Throwable e) {}
	}
}
