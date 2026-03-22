/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cns
extends nv_0 {
    private long mbm;

    public void nA(long l) {
        this.mbm = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.mbm);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12769;
    }
}

