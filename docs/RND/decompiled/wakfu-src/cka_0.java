/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cka
 */
public class cka_0
extends nv_0 {
    private final List<Long> lXH = new ArrayList<Long>();
    private long lXG;

    @Override
    public byte[] aVX() {
        int n = this.lXH.size() * 8 + 8 + 4;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putLong(this.lXG);
        byteBuffer.putInt(this.lXH.size());
        for (Long l : this.lXH) {
            byteBuffer.putLong(l);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12331;
    }

    public void setExchangeId(long l) {
        this.lXG = l;
    }

    public void nc(long l) {
        if (l != 0L) {
            this.lXH.add(l);
        }
    }
}

