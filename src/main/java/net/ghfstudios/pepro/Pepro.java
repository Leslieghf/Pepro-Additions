package net.ghfstudios.pepro;

import net.fabricmc.api.ModInitializer;
import net.ghfstudios.pepro.block.PeproBlocks;
import net.ghfstudios.pepro.item.PeproItems;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Pepro implements ModInitializer {

    public static PeproBlocks peproBlocks;
    public static PeproItems peproItems;

    @SuppressWarnings("InstantiationOfUtilityClass")
    @Override
    public void onInitialize() {
        peproBlocks = new PeproBlocks();
        peproItems = new PeproItems();
    }
}
