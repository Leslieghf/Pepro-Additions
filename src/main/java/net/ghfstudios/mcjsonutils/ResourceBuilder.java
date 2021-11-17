package net.ghfstudios.mcjsonutils;

import net.minecraft.util.Identifier;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class ResourceBuilder {
    private File RESOURCE_ROOT;
    private File TEMPLATE_ROOT;
    private final ResourceType RESOURCE_TYPE;

    public ResourceBuilder(ResourceType resourceType) {
        this.RESOURCE_TYPE = resourceType;
        switch (RESOURCE_TYPE) {
            case BLOCK_BLOCKSTATE -> {
                RESOURCE_ROOT = new File(Constants.ASSETS_ROOT, "blockstates\\");
                TEMPLATE_ROOT = new File(Constants.TEMPLATES_ROOT, "blockstates\\");
            }
            case ITEM_MODEL -> {
                RESOURCE_ROOT = new File(Constants.ASSETS_ROOT, "models\\item\\");
                TEMPLATE_ROOT = new File(Constants.TEMPLATES_ROOT, "models\\item\\");
            }
            case BLOCK_MODEL -> {
                RESOURCE_ROOT = new File(Constants.ASSETS_ROOT, "models\\block\\");
                TEMPLATE_ROOT = new File(Constants.TEMPLATES_ROOT, "models\\block\\");
            }
            case BLOCK_LOOTTABLE -> {
                RESOURCE_ROOT = new File(Constants.DATA_ROOT, "loot_tables\\blocks\\");
                TEMPLATE_ROOT = new File(Constants.TEMPLATES_ROOT, "loot_tables\\blocks\\");
            }
        }
    }

    public void CreateResource(String templateName, String targetName, Identifier identifier) {
        try {
            RESOURCE_ROOT.mkdirs();
            File target = new File(RESOURCE_ROOT, targetName + ".json");
            if (target.exists()) {
                throw new IOException("Error creating resource '" + target.getPath() + "': File already exists!");
            }
            String template = Files.readString((new File(TEMPLATE_ROOT, templateName + ".json")).toPath());
            template = template.replace("MODID", identifier.getNamespace());
            template = template.replace("PATH", identifier.getPath());
            Files.writeString(target.toPath(), template);
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public enum ResourceType {
        BLOCK_BLOCKSTATE,
        ITEM_MODEL,
        BLOCK_MODEL,
        BLOCK_LOOTTABLE
    }
}
