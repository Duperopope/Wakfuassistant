/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cwR
extends nv_0 {
    private final String mlp;
    private final long mlq;

    public cwR(String string, long l) {
        this.mlp = string;
        this.mlq = l;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.mlp);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length + 8);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.putLong(this.mlq);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15320;
    }
}

