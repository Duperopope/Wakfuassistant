/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckg
 */
public class ckg_0
extends nv_0 {
    private long lXM;
    private long lXG;

    @Override
    public byte[] aVX() {
        int n = 16;
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.lXG);
        byteBuffer.putLong(this.lXM);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13733;
    }

    public void ne(long l) {
        this.lXM = l;
    }

    public void setExchangeId(long l) {
        this.lXG = l;
    }
}

