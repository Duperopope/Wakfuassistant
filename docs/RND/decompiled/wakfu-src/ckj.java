/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ckj
extends nv_0 {
    private final long lXS;
    private final boolean lXT;

    public ckj(long l, boolean bl) {
        this.lXS = l;
        this.lXT = bl;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.lXS);
        byteBuffer.put(this.lXT ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13204;
    }
}

