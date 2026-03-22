/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqt
 */
public class cqt_0
extends nr_0 {
    private long btF;
    private byte lYb;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.btF = byteBuffer.getLong();
        this.lYb = byteBuffer.get();
        return true;
    }

    public final long eyw() {
        return this.btF;
    }

    public byte exZ() {
        return this.lYb;
    }

    @Override
    public int d() {
        return 13628;
    }

    @Override
    public String toString() {
        return "FightInvitationMessage{m_fighterId=" + this.btF + ", m_fightType=" + this.lYb + "}";
    }
}

