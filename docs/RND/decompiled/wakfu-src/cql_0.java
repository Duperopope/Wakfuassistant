/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqL
 */
public final class cql_0
extends cqf {
    private long btF;
    private long huG;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.huG = byteBuffer.getLong();
        return true;
    }

    public long OO() {
        return this.btF;
    }

    public long eyT() {
        return this.huG;
    }

    @Override
    public int d() {
        return 13079;
    }

    @Override
    public String toString() {
        return "PointEffectSelectionActivationMessage{m_fighterId=" + this.btF + ", m_remainingMillis=" + this.huG + "}";
    }
}

