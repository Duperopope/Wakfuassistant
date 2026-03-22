/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cny
extends nv_0 {
    private final int mbO;

    public cny(int n) {
        this.mbO = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.mbO);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13472;
    }
}

