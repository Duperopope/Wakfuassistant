/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnw
 */
public class cnw_0
extends nv_0 {
    private long mbM;
    private int asA;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.mbM);
        byteBuffer.putInt(this.asA);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12785;
    }

    public void nE(long l) {
        this.mbM = l;
    }

    public void lP(int n) {
        this.asA = n;
    }
}

