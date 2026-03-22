/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class ckB
extends nv_0 {
    private final int lYk;

    public ckB(int n) {
        this.lYk = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.lYk);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12826;
    }
}

