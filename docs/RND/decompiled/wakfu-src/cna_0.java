/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cna
 */
public class cna_0
extends nv_0 {
    private long mbm;
    private long mbn;
    private byte mbo;

    public void nA(long l) {
        this.mbm = l;
    }

    public void nB(long l) {
        this.mbn = l;
    }

    public void dy(byte by) {
        this.mbo = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(17);
        byteBuffer.putLong(this.mbm);
        byteBuffer.putLong(this.mbn);
        byteBuffer.put(this.mbo);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12988;
    }
}

