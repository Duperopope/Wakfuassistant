/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnc
 */
public class cnc_0
extends nv_0 {
    private long mbm;
    private long mbn;
    private byte mbp;

    public void nA(long l) {
        this.mbm = l;
    }

    public void nB(long l) {
        this.mbn = l;
    }

    public void dz(byte by) {
        this.mbp = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.mbm);
        byteBuffer.putLong(this.mbn);
        byteBuffer.put(this.mbp);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12736;
    }
}

