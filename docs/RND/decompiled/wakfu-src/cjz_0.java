/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cjZ
 */
public class cjz_0
extends nv_0 {
    private long duS;
    private long lXG;
    private short euw;

    @Override
    public byte[] aVX() {
        int n = 18;
        ByteBuffer byteBuffer = ByteBuffer.allocate(18);
        byteBuffer.putLong(this.duS);
        byteBuffer.putLong(this.lXG);
        byteBuffer.putShort(this.euw);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12026;
    }

    public void nb(long l) {
        this.duS = l;
    }

    public void setExchangeId(long l) {
        this.lXG = l;
    }

    public void cA(short s) {
        this.euw = s;
    }
}

