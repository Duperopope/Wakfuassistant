/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cwM
extends nv_0 {
    private final int mlj;

    public cwM(int n) {
        this.mlj = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.mlj);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14913;
    }
}

