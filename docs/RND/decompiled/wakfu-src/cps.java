/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cps
extends nr_0 {
    private long igQ;
    private boolean mdS;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.igQ = byteBuffer.getLong();
        this.mdS = byteBuffer.get() == 1;
        return true;
    }

    public long doL() {
        return this.igQ;
    }

    public boolean efO() {
        return this.mdS;
    }

    @Override
    public int d() {
        return 12251;
    }

    @Override
    public String toString() {
        return "CompanionUpdateUnlockedMessage{m_companionId=" + this.igQ + ", m_isUnlocked=" + this.mdS + "}";
    }
}

