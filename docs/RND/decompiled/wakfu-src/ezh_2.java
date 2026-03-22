/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eZh
 */
class ezh_2
implements ezk_1 {
    private static final Logger rMb = Logger.getLogger(ezh_2.class);
    private fab jrB;

    ezh_2() {
    }

    ezh_2(fab fab2) {
        this.jrB = fab2;
    }

    @Override
    public byte[] apI() {
        return eyk_2.l(this.jrB);
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.jrB = eyk_2.fK(byteBuffer);
    }

    @Override
    public void a(eyy_2 eyy_22) {
        try {
            eyy_22.g(this.jrB);
        }
        catch (fae fae2) {
            rMb.error((Object)"Impossible d'ajouter le rang", (Throwable)fae2);
        }
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMj;
    }

    public String toString() {
        return "AddRankChange{m_rank=" + String.valueOf(this.jrB) + "}";
    }
}

