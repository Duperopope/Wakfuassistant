/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csB
 */
public class csb_0
extends nr_0 {
    private long duS;
    private boolean mhw;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.duS = byteBuffer.getLong();
        this.mhw = byteBuffer.get() == 1;
        return true;
    }

    public long bSZ() {
        return this.duS;
    }

    public boolean eBm() {
        return this.mhw;
    }

    @Override
    public int d() {
        return 13742;
    }

    @Override
    public String toString() {
        return "ItemBindMessage{m_itemId=" + this.duS + ", m_applied=" + this.mhw + "}";
    }
}

