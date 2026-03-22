/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwO
extends nv_0 {
    private final String mll;

    public cwO(String string) {
        this.mll = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.mll);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + byArray.length);
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15625;
    }
}

