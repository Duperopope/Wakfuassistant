/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ckv
extends nv_0 {
    private acd_1 lYg;
    private eVi jmD;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(11);
        byteBuffer.putInt(this.lYg.getX());
        byteBuffer.putInt(this.lYg.getY());
        byteBuffer.putShort(this.lYg.bdi());
        byteBuffer.put(this.jmD.aJr());
        return this.a((byte)3, byteBuffer.array());
    }

    public void Z(acd_1 acd_12) {
        this.lYg = acd_12;
    }

    public void c(eVi eVi2) {
        this.jmD = eVi2;
    }

    @Override
    public int d() {
        return 12951;
    }
}

