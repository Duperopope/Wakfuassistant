/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eZf
 */
class ezf_1
implements ezk_1 {
    private static final Logger rLY = Logger.getLogger(ezf_1.class);
    private ezv_1 rLZ;

    ezf_1() {
    }

    ezf_1(ezv_1 ezv_12) {
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
            eyy_22.j(this.rLZ);
        }
        catch (fae fae2) {
            rLY.error((Object)"Impossible d'ajouter le bonus", (Throwable)fae2);
        }
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMg;
    }

    public String toString() {
        return "AddBonusChange{m_bonus=" + String.valueOf(this.rLZ) + "}";
    }
}

