/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class ckE
extends nv_0 {
    private final int lYo;

    public ckE(int n) {
        this.lYo = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.lYo);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12080;
    }
}

