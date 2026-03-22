/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwi
 */
public abstract class cwi_0
extends nr_0 {
    protected static final int mkO = 8;
    private int dJT;
    private int mfB = -1;

    public abstract int avZ();

    public abstract fsn eEH();

    protected void fk(ByteBuffer byteBuffer) {
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

