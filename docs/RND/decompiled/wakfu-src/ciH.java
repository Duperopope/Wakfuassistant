/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ciH
extends nv_0 {
    private final int lVa;
    private final long lVb;

    public ciH(int n, long l) {
        this.lVa = n;
        this.lVb = l;
    }

    @Override
    public byte[] aVX() {
        int n = 12;
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putInt(this.lVa);
        byteBuffer.putLong(this.lVb);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13120;
    }
}

