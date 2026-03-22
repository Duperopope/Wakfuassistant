/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnB
extends nv_0 {
    private int epK;
    private long jFF;
    private long lVH;

    public void Ck(int n) {
        this.epK = n;
    }

    public void nF(long l) {
        this.jFF = l;
    }

    public void mZ(long l) {
        this.lVH = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        byteBuffer.putInt(this.epK);
        byteBuffer.putLong(this.jFF);
        byteBuffer.putLong(this.lVH);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12836;
    }
}

