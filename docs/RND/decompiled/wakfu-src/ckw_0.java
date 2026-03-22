/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckW
 */
public class ckw_0
extends nv_0 {
    private final long lYO;

    public ckw_0(long l) {
        this.lYO = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.lYO);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12814;
    }
}

