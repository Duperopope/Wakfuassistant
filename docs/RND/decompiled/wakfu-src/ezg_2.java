/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eZG
 */
class ezg_2
implements ezk_1 {
    private static final Logger rMz = Logger.getLogger(ezg_2.class);
    private ezv_1 rLZ;

    ezg_2() {
    }

    ezg_2(ezv_1 ezv_12) {
        this.rLZ = ezv_12;
    }

    @Override
    public byte[] apI() {
        return eyk_2.n(this.rLZ);
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.rLZ = eyk_2.fL(byteBuffer);
    }

    @Override
    public void a(eyy_2 eyy_22) {
        try {
            eyy_22.d(this.rLZ.tJ(), this.rLZ.fPK());
        }
        catch (fae fae2) {
            rMz.error((Object)"Impossible de modifier le bonus", (Throwable)fae2);
        }
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMi;
    }

    public String toString() {
        return "ModifyBonusChange{m_bonus=" + String.valueOf(this.rLZ) + "}";
    }
}

