/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvu
extends nv_0 {
    private int asJ;

    @Override
    public byte[] aVX() {
        int n = 4;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.asJ);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12279;
    }

    public int aGD() {
        return this.asJ;
    }

    public void lW(int n) {
        this.asJ = n;
    }
}

