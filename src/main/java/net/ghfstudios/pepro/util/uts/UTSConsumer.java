package net.ghfstudios.pepro.util.uts;

import net.minecraft.util.math.BlockPos;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class UTSConsumer extends UTSNetworkMember {
    public BlockPos position;
    public int distance;
    public float maxTransferVelocity;
    public float maxTransferCapacity;

    public UTSConsumer(BlockPos position, int distance, float maxTransferVelocity, float maxTransferCapacity) {
        this.position = position;
        this.distance = distance;
        this.maxTransferVelocity = maxTransferVelocity;
        this.maxTransferCapacity = maxTransferCapacity;
    }
}
