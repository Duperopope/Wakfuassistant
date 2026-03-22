/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwN
extends nv_0 {
    private final String mlk;

    public cwN(String string) {
        this.mlk = string;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.mlk);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15247;
    }
}

