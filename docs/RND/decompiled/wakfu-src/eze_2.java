/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eZE
 */
class eze_2
implements ezk_1 {
    private static final Logger rMx = Logger.getLogger(eze_2.class);
    private int asE;

    eze_2() {
    }

    eze_2(int n) {
        this.asE = n;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.asE);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.asE = byteBuffer.getInt();
    }

    @Override
    public void a(eyy_2 eyy_22) {
        try {
            if (this.asE > 0) {
                eyy_22.To(this.asE);
            } else {
                eyy_22.Tm(Math.abs(this.asE));
            }
        }
        catch (fae fae2) {
            rMx.error((Object)"Impossible de retirer le membre", (Throwable)fae2);
        }
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMn;
    }

    public String toString() {
        return "GuildPointsChange{m_guildPoints=" + this.asE + "}";
    }
}

