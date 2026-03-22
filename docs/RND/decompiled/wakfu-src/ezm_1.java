/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eZM
 */
class ezm_1
implements ezk_1 {
    private static final Logger rME = Logger.getLogger(ezm_1.class);
    private long rMF;

    ezm_1() {
    }

    ezm_1(ezz_1 ezz_12) {
        this.rMF = ezz_12.Sn();
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.rMF);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.rMF = byteBuffer.getLong();
    }

    @Override
    public void a(eyy_2 eyy_22) {
        try {
            eyy_22.rx(this.rMF);
        }
        catch (fae fae2) {
            rME.error((Object)"Impossible de retirer le membre", (Throwable)fae2);
        }
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMe;
    }

    public String toString() {
        return "RemoveMemberChange{m_memberId=" + this.rMF + "}";
    }
}

