/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clt
 */
public final class clt_0
extends nv_0 {
    private final int lZu;
    private final long lZv;

    public clt_0(int n, long l) {
        this.lZu = n;
        this.lZv = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putInt(this.lZu);
        byteBuffer.putLong(this.lZv);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12395;
    }
}

