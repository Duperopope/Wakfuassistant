/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnh
 */
public class cnh_0
extends nv_0 {
    private long mbt;
    private byte mbu;

    public void nC(long l) {
        this.mbt = l;
    }

    public void dA(byte by) {
        this.mbu = by;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putLong(this.mbt);
        byteBuffer.put(this.mbu);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12847;
    }
}

