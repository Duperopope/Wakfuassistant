/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Oy
extends nv_0 {
    private final long aZQ;

    public Oy(long l) {
        this.aZQ = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.aZQ);
        return this.a((byte)2, byteBuffer.array());
    }

    public long aXb() {
        return this.aZQ;
    }

    @Override
    public int d() {
        return 1051;
    }
}

