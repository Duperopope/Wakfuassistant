/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwP
extends nv_0 {
    private final long mlm;
    private final long mln;

    public cwP(long l, long l2) {
        this.mlm = l;
        this.mln = l2;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.mlm);
        byteBuffer.putLong(this.mln);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14862;
    }
}

