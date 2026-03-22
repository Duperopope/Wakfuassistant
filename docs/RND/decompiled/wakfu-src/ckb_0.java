/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckb
 */
public class ckb_0
extends nv_0 {
    private long lXG;

    @Override
    public byte[] aVX() {
        int n = 8;
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.lXG);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12237;
    }

    public void setExchangeId(long l) {
        this.lXG = l;
    }
}

