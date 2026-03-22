/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ciZ
extends nv_0 {
    private long aZQ;
    private long lVH;
    private byte lVI;
    private int jTZ;
    private int jUa;
    private short lVJ;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(27);
        byteBuffer.putLong(this.aZQ);
        byteBuffer.putLong(this.lVH);
        byteBuffer.put(this.lVI);
        byteBuffer.putInt(this.jTZ);
        byteBuffer.putInt(this.jUa);
        byteBuffer.putShort(this.lVJ);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13199;
    }

    public void mY(long l) {
        this.aZQ = l;
    }

    public void mZ(long l) {
        this.lVH = l;
    }

    public void dh(byte by) {
        this.lVI = by;
    }

    public void X(int n, int n2, short s) {
        this.jTZ = n;
        this.jUa = n2;
        this.lVJ = s;
    }
}

