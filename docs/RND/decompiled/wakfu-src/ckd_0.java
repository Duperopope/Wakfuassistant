/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckd
 */
public class ckd_0
extends nv_0 {
    private long lXJ;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.lXJ);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12844;
    }

    public void nd(long l) {
        this.lXJ = l;
    }
}

