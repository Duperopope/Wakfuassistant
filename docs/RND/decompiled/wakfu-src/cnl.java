/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnl
extends nv_0 {
    private String mbE;

    public void oy(String string) {
        this.mbE = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.mbE);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12382;
    }
}

