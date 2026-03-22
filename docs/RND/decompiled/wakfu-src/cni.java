/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cni
extends nv_0 {
    private byte mbv;
    private boolean mbw;
    private long mbx;
    private byte mby;

    public void dB(byte by) {
        this.mbv = by;
    }

    public void jq(boolean bl) {
        this.mbw = bl;
    }

    public void nD(long l) {
        this.mbx = l;
    }

    public void dC(byte by) {
        this.mby = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(11);
        byteBuffer.putLong(this.mbx);
        byteBuffer.put(this.mby);
        byteBuffer.put(this.mbv);
        byteBuffer.put((byte)(this.mbw ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12901;
    }
}

