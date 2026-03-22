/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnn
extends nv_0 {
    private byte mbL;
    private String aFD;

    public void dF(byte by) {
        this.mbL = by;
    }

    public void dm(String string) {
        this.aFD = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.aFD);
        ByteBuffer byteBuffer = ByteBuffer.allocate(2 + byArray.length);
        byteBuffer.put(this.mbL);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12249;
    }
}

