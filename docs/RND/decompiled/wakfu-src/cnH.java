/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnH
extends nv_0 {
    private int epK;

    public void Ck(int n) {
        this.epK = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.epK);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13787;
    }
}

