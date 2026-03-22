/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwx
extends nv_0 {
    public static final byte mkZ = 0;
    public static final byte mla = 1;
    private long mlb;
    private byte mlc;

    public void nH(long l) {
        this.mlb = l;
    }

    public void dM(byte by) {
        this.mlc = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.mlb);
        byteBuffer.put(this.mlc);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 1005;
    }
}

