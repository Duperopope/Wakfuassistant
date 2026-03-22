/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cwL
extends nv_0 {
    private final int mli;

    public cwL(int n) {
        this.mli = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.mli);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14747;
    }
}

