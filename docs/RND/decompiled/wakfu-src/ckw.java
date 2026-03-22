/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ckw
extends nv_0 {
    private int bsx = -1;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.bsx);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13958;
    }

    public void pu(int n) {
        this.bsx = n;
    }
}

