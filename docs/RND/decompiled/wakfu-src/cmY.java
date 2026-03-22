/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmY
extends nv_0 {
    private String aFD;

    public void dm(String string) {
        this.aFD = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.aFD);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12639;
    }
}

