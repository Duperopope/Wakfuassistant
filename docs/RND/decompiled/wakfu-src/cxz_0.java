/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxZ
 */
public class cxz_0
extends nr_0 {
    private int egM;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.egM = byteBuffer.getInt();
        return true;
    }

    public int tJ() {
        return this.egM;
    }

    @Override
    public int d() {
        return 15697;
    }

    @Override
    public String toString() {
        return "GuildBonusLearnedMessage{m_bonusId=" + this.egM + "}";
    }
}

