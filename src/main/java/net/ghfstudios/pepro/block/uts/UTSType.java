package net.ghfstudios.pepro.block.uts;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public enum UTSType {
    NULL(0),
    PRODUCER(1),
    TRADER(2),
    CONSUMER(3),
    STORAGE(4);

    public final int value;

    UTSType(int value) {
        this.value = value;
    }
}
