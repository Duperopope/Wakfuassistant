/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwC
extends nv_0 {
    long mlb;

    public void nH(long l) {
        this.mlb = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.mlb);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 1185;
    }
}

