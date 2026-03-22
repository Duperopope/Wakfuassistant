/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckc
 */
public class ckc_0
extends nv_0 {
    private long lXG;
    private byte lXI;

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.lXG);
        byteBuffer.put(this.lXI);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12507;
    }

    public void dl(byte by) {
        this.lXI = by;
    }

    public void setExchangeId(long l) {
        this.lXG = l;
    }
}

