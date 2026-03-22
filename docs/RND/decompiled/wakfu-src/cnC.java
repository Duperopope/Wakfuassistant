/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnC
extends nv_0 {
    private int epK;
    private int eiB;
    private boolean mbR;

    public void Ck(int n) {
        this.epK = n;
    }

    public void HJ(int n) {
        this.eiB = n;
    }

    public void jt(boolean bl) {
        this.mbR = bl;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putInt(this.epK);
        byteBuffer.putInt(this.eiB);
        byteBuffer.put(this.mbR ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13171;
    }
}

