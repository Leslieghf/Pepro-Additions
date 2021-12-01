package net.ghfstudios.pepro;

import com.google.gson.*;
import net.fabricmc.api.ModInitializer;
import net.ghfstudios.pepro.block.PeproBlocks;
import net.ghfstudios.pepro.block.entity.PeproBlockEntities;
import net.ghfstudios.pepro.item.PeproItems;
import net.ghfstudios.pepro.particle.PeproParticleTypes;
import net.ghfstudios.pepro.world.gen.feature.PeproConfiguredFeatures;
import net.ghfstudios.pepro.world.gen.feature.PeproStructurePieceTypes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

//Todo: Add PeproBlockWithEntity and have ConduitBlock extend it
public class Pepro implements ModInitializer {

    public static PeproBlocks peproBlocks;
    public static PeproItems peproItems;
    public static PeproParticleTypes peproParticleTypes;
    public static PeproConfiguredFeatures peproConfiguredFeatures;
    public static PeproStructurePieceTypes peproStructurePieceTypes;
    public static PeproBlockEntities peproBlockEntities;

    @SuppressWarnings("InstantiationOfUtilityClass")
    @Override
    public void onInitialize() {
        //ResourceBuilder resourceBuilder = new ResourceBuilder(ResourceBuilder.ResourceType.BLOCK_BLOCKSTATE);
        //resourceBuilder.CreateResource("block", "test_block", new Identifier("pepro", "block/test_block"));
        peproBlocks = new PeproBlocks();
        peproItems = new PeproItems();
        peproParticleTypes = new PeproParticleTypes();
        peproConfiguredFeatures = new PeproConfiguredFeatures();
        peproStructurePieceTypes = new PeproStructurePieceTypes();
        peproBlockEntities = new PeproBlockEntities();
    }

    private static void doMagic() {
        for (int a = 0; a < 6; a++) {
            JsonArray array = new JsonArray();
            for (int b = 0; b < 2; b++) {
                for (int c = 0; c < 2; c++) {
                    for (int d = 0; d < 2; d++) {
                        for (int e = 0; e < 2; e++) {
                            for (int f = 0; f < 2; f++) {
                                for (int g = 0; g < 2; g++) {
                                    JsonObject caseObject = new JsonObject();
                                    for (int h = 0; h < 6; h++) {
                                        caseObject.addProperty(getDir(h), isCurrentDirection(a, b, c, d, e, f, g, h));
                                    }
                                    //CUSTOM BEHAVIOUR ADDED AFTER HERE
                                    if (isDirectionTrue(caseObject, 0) && !isDirectionTrue(caseObject, 1) && isDirectionTrue(caseObject, 2) && !isDirectionTrue(caseObject, 3) && !isDirectionTrue(caseObject, 4) && !isDirectionTrue(caseObject, 5)) {
                                        break;
                                    }
                                    if (!isDirectionTrue(caseObject, 0) && isDirectionTrue(caseObject, 1) && !isDirectionTrue(caseObject, 2) && isDirectionTrue(caseObject, 3) && !isDirectionTrue(caseObject, 4) && !isDirectionTrue(caseObject, 5)) {
                                        break;
                                    }
                                    if (!isDirectionTrue(caseObject, 0) && !isDirectionTrue(caseObject, 1) && !isDirectionTrue(caseObject, 2) && !isDirectionTrue(caseObject, 3) && isDirectionTrue(caseObject, 4) && isDirectionTrue(caseObject, 5)) {
                                        break;
                                    }
                                    array.add(caseObject);
                                }
                            }
                        }
                    }
                }
            }
            try {
                Files.writeString(new File("C:\\Users\\Minecraft.cool\\IdeaProjects\\Pepro-Additions\\src\\temp\\", "conduit_" + getDir(a) + ".json").toPath(), new GsonBuilder().setPrettyPrinting().create().toJson(array));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String isCurrentDirection(int a, int b, int c, int d, int e, int f, int g, int h) {
        int[] inputs = {b, c, d, e, f, g};
        if (a==h) return "true";
        return intToStringBool(inputs[h]);
    }

    private static String intToStringBool(int value) {
        if (value==0) return "false";
        return "true";
    }

    private static boolean isDirectionTrue(JsonObject caseObject, int intDir) {
        Gson gson = new Gson();
        return Boolean.parseBoolean(gson.fromJson(caseObject.get(getDir(intDir)), String.class));
    }

    private static String getDir(int i) {
        return switch (i) {
            case 0 -> "north";
            case 1 -> "east";
            case 2 -> "south";
            case 3 -> "west";
            case 4 -> "up";
            case 5 -> "down";
            default -> null;
        };
    }
}
