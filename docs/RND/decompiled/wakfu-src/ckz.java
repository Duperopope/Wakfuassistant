/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ckz
extends nv_0 {
    private final long lYi;
    private final short lYj;

    public ckz(long l, short s) {
        this.lYi = l;
        this.lYj = s;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.lYi);
        byteBuffer.putShort(this.lYj);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13018;
    }
}

