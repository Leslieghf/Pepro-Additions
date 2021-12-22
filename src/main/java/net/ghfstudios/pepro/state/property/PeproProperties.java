package net.ghfstudios.pepro.state.property;

import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class PeproProperties {
    /**
     * A property that specifies if a conduit is neighbouring exactly 2 opposite conduits along the X-Axis
     */
    public static final BooleanProperty STRAIGHT_X = BooleanProperty.of("straight_x");
    /**
     * A property that specifies if a conduit is neighbouring exactly 2 opposite conduits along the Y-Axis
     */
    public static final BooleanProperty STRAIGHT_Y = BooleanProperty.of("straight_y");
    /**
     * A property that specifies if a conduit is neighbouring exactly 2 opposite conduits along the Z-Axis
     */
    public static final BooleanProperty STRAIGHT_Z = BooleanProperty.of("straight_z");
    /**
     * A property that specifies if a conduit has a central hub and is not straight
     */
    public static final BooleanProperty HUB = BooleanProperty.of("hub");
}
