/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public abstract class cqf
extends nr_0 {
    protected static final int mev = 4;
    private int bsx = -1;

    protected void fg(ByteBuffer byteBuffer) {
        this.bsx = byteBuffer.getInt();
    }

    public int bha() {
        return this.bsx;
    }
}

