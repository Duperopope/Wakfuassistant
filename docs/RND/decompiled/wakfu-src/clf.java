/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class clf
extends nv_0 {
    private long htO;
    private acd_1 lYX;
    private int lYY;

    public void ng(long l) {
        this.htO = l;
    }

    public void ad(acd_1 acd_12) {
        this.lYX = acd_12;
    }

    public void Lb(int n) {
        this.lYY = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(22);
        byteBuffer.putLong(this.htO);
        byteBuffer.putInt(this.lYX.getX());
        byteBuffer.putInt(this.lYX.getY());
        byteBuffer.putShort(this.lYX.bdi());
        byteBuffer.putInt(this.lYY);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12489;
    }
}

