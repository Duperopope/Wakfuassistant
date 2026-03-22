/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clx
 */
public class clx_0
extends nv_0 {
    private long lVH;
    private byte lZz;
    private byte lZA;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.lVH);
        byteBuffer.put(this.lZz);
        byteBuffer.put(this.lZA);
        return this.a((byte)3, byteBuffer.array());
    }

    public void mZ(long l) {
        this.lVH = l;
    }

    public void ds(byte by) {
        this.lZz = by;
    }

    public void dt(byte by) {
        this.lZA = by;
    }

    @Override
    public int d() {
        return 13831;
    }
}

