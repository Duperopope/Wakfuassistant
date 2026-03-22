/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class ckH
extends nv_0 {
    private long btF;
    private int bfE;

    public void eY(long l) {
        this.btF = l;
    }

    public void KX(int n) {
        this.bfE = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putLong(this.btF);
        byteBuffer.putInt(this.bfE);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12555;
    }
}

