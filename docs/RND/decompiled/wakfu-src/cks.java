/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cks
extends nv_0 {
    private final int lYc;
    private final boolean lYd;

    public cks(int n, boolean bl) {
        this.lYc = n;
        this.lYd = bl;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        byteBuffer.putInt(this.lYc);
        byteBuffer.put(this.lYd ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13986;
    }
}

