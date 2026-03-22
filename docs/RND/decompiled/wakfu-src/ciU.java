/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ciU
extends nv_0 {
    private long aDh;
    private byte lVz;
    private String lVB;
    private boolean lVC;

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.lVB);
        ByteBuffer byteBuffer = ByteBuffer.allocate(10 + byArray.length + 1);
        byteBuffer.putLong(this.aDh);
        byteBuffer.put(this.lVz);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.put((byte)(this.lVC ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12985;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void dg(byte by) {
        this.lVz = by;
    }

    public void ou(String string) {
        this.lVB = string;
    }

    public void jh(boolean bl) {
        this.lVC = bl;
    }
}

