package net.ghfstudios.pepro.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class PeproItem extends Item {
    public PeproItem(FabricItemSettings settings) {
        super(settings);

        //Item specific functionality such as initialization, declaration, method calls, etc. to achieve the desired Gameplay regarding said Item
        //Look up block/PeproBlock.java's comments  for further information
        /*
        code 2.0
        more code 2.0
        meny more code 2.0
        IT'S OVER 9000 CODE 2.0


        lmao wtf 2.0
         */
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        // default white text
        tooltip.add( new TranslatableText("item.pepro.generic.tooltip") );

        // formatted red text
        tooltip.add( new TranslatableText("item.pepro.generic.tooltip_red").formatted(Formatting.RED) );
    }
}
