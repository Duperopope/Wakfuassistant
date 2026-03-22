/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cld
extends nv_0 {
    private long htO;
    private short lrQ;

    public void ng(long l) {
        this.htO = l;
    }

    public void cB(short s) {
        this.lrQ = s;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putLong(this.htO);
        byteBuffer.putShort(this.lrQ);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12526;
    }
}

