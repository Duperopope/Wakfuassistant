/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctf
extends nr_0 {
    private long duS;
    private long aZl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.duS = byteBuffer.getLong();
        this.aZl = byteBuffer.getLong();
        return true;
    }

    public long bSZ() {
        return this.duS;
    }

    public long pf() {
        return this.aZl;
    }

    @Override
    public int d() {
        return 12173;
    }

    @Override
    public String toString() {
        return "ItemXpChangeMessage{m_itemId=" + this.duS + ", m_xp=" + this.aZl + "}";
    }
}

