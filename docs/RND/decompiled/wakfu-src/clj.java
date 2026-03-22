/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class clj
extends nv_0 {
    private byte lZc;
    private long bxr;

    @Override
    public byte[] aVX() {
        int n = 9;
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.bxr);
        byteBuffer.put(this.lZc);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13260;
    }

    public void dr(byte by) {
        this.lZc = by;
    }

    public void nj(long l) {
        this.bxr = l;
    }
}

