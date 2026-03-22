/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coH
 */
public class coh_0
extends nr_0 {
    private long aDh;
    private int jbV;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.jbV = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13193;
    }

    public long KU() {
        return this.aDh;
    }

    public int ewy() {
        return this.jbV;
    }

    @Override
    public String toString() {
        return "AchievementObjectiveResetMessage{m_characterId=" + this.aDh + ", m_objectiveId=" + this.jbV + "}";
    }
}

