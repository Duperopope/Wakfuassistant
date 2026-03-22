/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmV
extends nv_0 {
    private long mbl;

    public void nz(long l) {
        this.mbl = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.mbl);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12438;
    }
}

