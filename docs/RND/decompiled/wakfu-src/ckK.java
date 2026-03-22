/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ckK
extends nv_0 {
    private long btF;
    private long lYw;
    private int lYl;
    private int lYm;
    private short lYn;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(26);
        byteBuffer.putLong(this.btF);
        byteBuffer.putLong(this.lYw);
        byteBuffer.putInt(this.lYl);
        byteBuffer.putInt(this.lYm);
        byteBuffer.putShort(this.lYn);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12274;
    }

    public void eY(long l) {
        this.btF = l;
    }

    public void nf(long l) {
        this.lYw = l;
    }

    public void aa(int n, int n2, short s) {
        this.lYl = n;
        this.lYm = n2;
        this.lYn = s;
    }
}

