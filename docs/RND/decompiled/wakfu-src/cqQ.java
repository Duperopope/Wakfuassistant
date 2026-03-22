/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public abstract class cqQ
extends cqf {
    protected static final int mfA = 12;
    private int dJT;
    private int mfB = -1;

    public abstract int avZ();

    public abstract eui_1 eza();

    protected void fi(ByteBuffer byteBuffer) {
        this.fg(byteBuffer);
        this.dJT = byteBuffer.getInt();
        this.mfB = byteBuffer.getInt();
    }

    public int caO() {
        return this.dJT;
    }

    public int ezb() {
        return this.mfB;
    }
}

