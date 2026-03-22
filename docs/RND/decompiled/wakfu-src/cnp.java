/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnp
extends nv_0 {
    private String aFD;
    private byte mbL;
    private short mbj;

    public void dm(String string) {
        this.aFD = string;
    }

    public void dF(byte by) {
        this.mbL = by;
    }

    public void cE(short s) {
        this.mbj = s;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.aFD);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.put(this.mbL);
        byteBuffer.putShort(this.mbj);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12656;
    }
}

