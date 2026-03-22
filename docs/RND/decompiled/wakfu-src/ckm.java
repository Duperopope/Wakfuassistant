/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ckm
extends nv_0 {
    private acd_1 lXV;

    public void Z(acd_1 acd_12) {
        this.lXV = acd_12;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putInt(this.lXV.getX());
        byteBuffer.putInt(this.lXV.getY());
        byteBuffer.putShort(this.lXV.bdi());
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13242;
    }
}

