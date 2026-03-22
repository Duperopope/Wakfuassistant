/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnu
 */
public class cnu_0
extends nv_0 {
    private long mbM;
    private int mbN;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putLong(this.mbM);
        byteBuffer.putInt(this.mbN);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12535;
    }

    public void nE(long l) {
        this.mbM = l;
    }

    public void Lf(int n) {
        this.mbN = n;
    }
}

