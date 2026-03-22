/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cpr
extends nr_0 {
    private long igQ;
    private String p;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.igQ = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.p = BH.dc(byArray2);
        return false;
    }

    public String getName() {
        return this.p;
    }

    public long doL() {
        return this.igQ;
    }

    @Override
    public int d() {
        return 12811;
    }

    @Override
    public String toString() {
        return "CompanionUpdateNameMessage{m_companionId=" + this.igQ + ", m_name='" + this.p + "'}";
    }
}

