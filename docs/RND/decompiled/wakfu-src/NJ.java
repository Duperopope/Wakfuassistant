/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class NJ
extends nv_0 {
    private Long aYQ;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.aYQ);
        return this.a((byte)4, byteBuffer.array());
    }

    @Override
    public int d() {
        return 639;
    }

    public void v(Long l) {
        this.aYQ = l;
    }
}

