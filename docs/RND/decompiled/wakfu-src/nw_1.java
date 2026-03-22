/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Nw
 */
public class nw_1
extends nv_0 {
    protected final byte aYB;
    protected final int aYC;

    public byte aWj() {
        return this.aYB;
    }

    public nw_1(byte by, int n) {
        this.aYB = by;
        this.aYC = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(13);
        byteBuffer.put(this.aYB);
        byteBuffer.putInt(this.aYC);
        byteBuffer.putLong(System.nanoTime());
        return this.a(this.aYB, byteBuffer.array());
    }

    @Override
    public int d() {
        return 379;
    }
}

