/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwI
extends nv_0 {
    long mlb;

    public void nI(long l) {
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
        return 1104;
    }
}

