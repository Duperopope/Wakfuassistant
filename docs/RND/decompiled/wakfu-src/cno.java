/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cno
extends nv_0 {
    private byte mbL;
    private byte mbi;
    private short mbj;

    public void dF(byte by) {
        this.mbL = by;
    }

    public void dx(byte by) {
        this.mbi = by;
    }

    public void cE(short s) {
        this.mbj = s;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.put(this.mbL);
        byteBuffer.put(this.mbi);
        byteBuffer.putShort(this.mbj);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12441;
    }
}

