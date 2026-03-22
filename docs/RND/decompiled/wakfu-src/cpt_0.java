/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpt
 */
public final class cpt_0
extends nr_0 {
    private long igQ;
    private long aZl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.igQ = byteBuffer.getLong();
        this.aZl = byteBuffer.getLong();
        return false;
    }

    public long pf() {
        return this.aZl;
    }

    public long doL() {
        return this.igQ;
    }

    @Override
    public int d() {
        return 13663;
    }

    @Override
    public String toString() {
        return "CompanionUpdateXpMessage{m_companionId=" + this.igQ + ", m_xp=" + this.aZl + "}";
    }
}

