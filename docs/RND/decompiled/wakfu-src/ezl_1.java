/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eZL
 */
class ezl_1
implements ezk_1 {
    private static final Logger rMD = Logger.getLogger(ezl_1.class);
    private int egM;

    ezl_1() {
    }

    ezl_1(ezv_1 ezv_12) {
        this.egM = ezv_12.tJ();
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.egM);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.egM = byteBuffer.getInt();
    }

    @Override
    public void a(eyy_2 eyy_22) {
        try {
            eyy_22.Tl(this.egM);
        }
        catch (fae fae2) {
            rMD.error((Object)"Impossible de retirer le bonus", (Throwable)fae2);
        }
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMh;
    }

    public String toString() {
        return "RemoveBonusChange{m_bonusId=" + this.egM + "}";
    }
}

