/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwz
extends nv_0 {
    private byte mle;

    public void dN(byte by) {
        this.mle = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byteBuffer.put(this.mle);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 1128;
    }
}

