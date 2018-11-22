package gregtechmod.loaders.postload;

import gregtechmod.api.GregTech_API;
import gregtechmod.api.enums.GT_ConfigCategories;
import gregtechmod.api.util.GT_Log;
import gregtechmod.api.util.GT_ModHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GT_RecyclerBlacklistLoader implements Runnable {
	@Override
	public void run() {
        GT_Log.out.println("GT_Mod: Adding Stuff to the Recycler Blacklist.");
        
        if (GregTech_API.sConfiguration.addAdvConfig(GT_ConfigCategories.disabledrecipes, "easymobgrinderrecycling", true)) {
        	// Skeletons
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Items.arrow, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Items.bone, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Items.dyePowder, 1, 15));
			
			// Zombies
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Items.rottenFlesh, 1, 0));
			
			// Spiders
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Items.silk, 1, 0));
			
			// Chicken Eggs
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Items.egg, 1, 0));
        }
		if (GregTech_API.sConfiguration.addAdvConfig(GT_ConfigCategories.disabledrecipes, "easystonerecycling", true)) {
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.sand, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.sandStone, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.sandStone, 1, 1));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.sandStone, 1, 2));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.sandStone, 1, 3));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.sandStone, 1, 4));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.sandStone, 1, 5));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.sandStone, 1, 6));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.sandStone, 1, 7));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.glass, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Items.glassBottle, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Items.potion, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getSmeltingOutput(new ItemStack(Blocks.stone, 1, 0), false, null));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getRecipeOutput(new ItemStack[] {new ItemStack(Blocks.stone, 1, 0), null, null, new ItemStack(Blocks.stone, 1, 0)}));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getRecipeOutput(new ItemStack[] {new ItemStack(Blocks.cobblestone, 1, 0), null, null, new ItemStack(Blocks.cobblestone, 1, 0)}));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getRecipeOutput(new ItemStack[] {new ItemStack(Blocks.stone, 1, 0), null, new ItemStack(Blocks.stone, 1, 0), null, new ItemStack(Blocks.stone, 1, 0)}));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getRecipeOutput(new ItemStack[] {new ItemStack(Blocks.stone, 1, 0), new ItemStack(Blocks.glass, 1, 0), new ItemStack(Blocks.stone, 1, 0)}));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getRecipeOutput(new ItemStack[] {new ItemStack(Blocks.cobblestone, 1, 0), new ItemStack(Blocks.glass, 1, 0), new ItemStack(Blocks.cobblestone, 1, 0)}));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getRecipeOutput(new ItemStack[] {new ItemStack(Blocks.sandStone, 1, 0), new ItemStack(Blocks.glass, 1, 0), new ItemStack(Blocks.sandStone, 1, 0)}));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getRecipeOutput(new ItemStack[] {new ItemStack(Blocks.sand, 1, 0), new ItemStack(Blocks.glass, 1, 0), new ItemStack(Blocks.sand, 1, 0)}));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getRecipeOutput(new ItemStack[] {new ItemStack(Blocks.sandStone, 1, 0), new ItemStack(Blocks.sandStone, 1, 0), new ItemStack(Blocks.sandStone, 1, 0), new ItemStack(Blocks.sandStone, 1, 0), new ItemStack(Blocks.sandStone, 1, 0), new ItemStack(Blocks.sandStone, 1, 0)}));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getRecipeOutput(new ItemStack[] {new ItemStack(Blocks.glass, 1, 0)}));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getRecipeOutput(new ItemStack[] {new ItemStack(Blocks.glass, 1, 0), new ItemStack(Blocks.glass, 1, 0)}));
			GT_ModHandler.addToRecyclerBlackList(GT_ModHandler.getRecipeOutput(new ItemStack[] {new ItemStack(Blocks.glass, 1, 0), null, null, new ItemStack(Blocks.glass, 1, 0)}));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.thinGlass, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.cobblestone, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.cobblestoneWall, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stairsSandStone, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stairsCobblestone, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stairsStoneBrick, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.furnaceBurning, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.furnaceIdle, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneSingleSlab, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneDoubleSlab, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneSingleSlab, 1, 1));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneDoubleSlab, 1, 1));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneSingleSlab, 1, 3));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneDoubleSlab, 1, 3));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneSingleSlab, 1, 5));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneDoubleSlab, 1, 5));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneSingleSlab, 1, 7));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneDoubleSlab, 1, 7));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.pressurePlateStone, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneButton, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneBrick, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneBrick, 1, 1));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneBrick, 1, 2));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stoneBrick, 1, 3));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.stone, 1, 0));
			GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.lever, 1, 0));
		}
		GT_ModHandler.addToRecyclerBlackList(new ItemStack(Items.snowball, 1));
		GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.ice, 1));
		GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.snow, 1));
		GT_ModHandler.addToRecyclerBlackList(new ItemStack(Blocks.blockSnow, 1));
	}
}
