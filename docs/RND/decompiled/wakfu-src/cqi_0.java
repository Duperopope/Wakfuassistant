/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqI
 */
public final class cqi_0
extends cqf {
    private long aZQ;
    private byte mfq;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.aZQ = byteBuffer.getLong();
        this.mfq = byteBuffer.get();
        return false;
    }

    public long aXb() {
        return this.aZQ;
    }

    public byte eyP() {
        return this.mfq;
    }

    @Override
    public int d() {
        return 12703;
    }

    @Override
    public String toString() {
        return "PlayerChangeConnectionStateMessage{m_playerId=" + this.aZQ + ", m_connectionState=" + this.mfq + "}";
    }
}

