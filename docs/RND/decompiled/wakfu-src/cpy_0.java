/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpy
 */
public class cpy_0
extends nr_0 {
    private int mdW;
    private long cJM;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mdW = byteBuffer.getInt();
        this.cJM = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12601;
    }

    public int exq() {
        return this.mdW;
    }

    public long bDG() {
        return this.cJM;
    }
}

