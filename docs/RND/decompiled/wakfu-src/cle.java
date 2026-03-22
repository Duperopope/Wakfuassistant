/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cle
extends nv_0 {
    private long lYW;
    private acd_1 lYX;

    public void nh(long l) {
        this.lYW = l;
    }

    public void ad(acd_1 acd_12) {
        this.lYX = acd_12;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(18);
        byteBuffer.putLong(this.lYW);
        byteBuffer.putInt(this.lYX.getX());
        byteBuffer.putInt(this.lYX.getY());
        byteBuffer.putShort(this.lYX.bdi());
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12489;
    }
}

