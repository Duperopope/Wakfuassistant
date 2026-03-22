/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ckq
extends nv_0 {
    private long lXZ;
    private boolean lXT;
    private boolean bmT;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.lXZ);
        byteBuffer.put(this.lXT ? (byte)1 : 0);
        byteBuffer.put(this.bmT ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    public void mY(long l) {
        this.lXZ = l;
    }

    public void jk(boolean bl) {
        this.lXT = bl;
    }

    public void bl(boolean bl) {
        this.bmT = bl;
    }

    @Override
    public int d() {
        return 13671;
    }
}

