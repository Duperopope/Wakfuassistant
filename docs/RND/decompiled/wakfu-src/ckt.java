/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ckt
extends nv_0 {
    private final long lYe;
    private final boolean lYf;

    public ckt(long l, boolean bl) {
        this.lYe = l;
        this.lYf = bl;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.lYe);
        byteBuffer.put(this.lYf ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12781;
    }
}

