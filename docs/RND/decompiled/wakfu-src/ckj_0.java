/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckJ
 */
public class ckj_0
extends nv_0 {
    private long btF;
    private long lVH;
    private byte lVI;
    private long lYw;
    private int lYl;
    private int lYm;
    private short lYn;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(35);
        byteBuffer.putLong(this.btF);
        byteBuffer.putLong(this.lYw);
        byteBuffer.putLong(this.lVH);
        byteBuffer.put(this.lVI);
        byteBuffer.putInt(this.lYl);
        byteBuffer.putInt(this.lYm);
        byteBuffer.putShort(this.lYn);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13139;
    }

    public void eY(long l) {
        this.btF = l;
    }

    public void nf(long l) {
        this.lYw = l;
    }

    public void mZ(long l) {
        this.lVH = l;
    }

    public void dh(byte by) {
        this.lVI = by;
    }

    public void aa(int n, int n2, short s) {
        this.lYl = n;
        this.lYm = n2;
        this.lYn = s;
    }
}

