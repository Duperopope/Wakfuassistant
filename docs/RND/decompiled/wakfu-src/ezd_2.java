/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eZD
 */
class ezd_2
implements ezk_1 {
    private static final Logger rMv = Logger.getLogger(ezd_2.class);
    private short rMw;

    ezd_2() {
    }

    ezd_2(short s) {
        this.rMw = s;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        byteBuffer.putShort(this.rMw);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.rMw = byteBuffer.getShort();
    }

    @Override
    public void a(eyy_2 eyy_22) {
        try {
            eyy_22.ev(this.rMw);
        }
        catch (fae fae2) {
            rMv.error((Object)"Impossible de retirer le membre", (Throwable)fae2);
        }
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMo;
    }

    public String toString() {
        return "GuildPointsChange{m_guildLevel=" + this.rMw + "}";
    }
}

