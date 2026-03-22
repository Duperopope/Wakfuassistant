/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqG
 */
public final class cqg_0
extends nr_0 {
    private long lTK;
    private int bIl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lTK = byteBuffer.getLong();
        this.bIl = byteBuffer.getInt();
        return true;
    }

    public int bku() {
        return this.bIl;
    }

    @Override
    public int d() {
        return 12091;
    }

    public long eyN() {
        return this.lTK;
    }

    @Override
    public String toString() {
        return "HeroJoinFightErrorMessage{m_heroId=" + this.lTK + ", m_errorCode=" + this.bIl + "}";
    }
}

