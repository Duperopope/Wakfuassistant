/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eZH
 */
class ezh_1
implements ezk_1 {
    private static final Logger rMA = Logger.getLogger(ezh_1.class);
    private ezz_1 rMa;

    ezh_1() {
    }

    ezh_1(ezz_1 ezz_12) {
        this.rMa = ezz_12;
    }

    @Override
    public byte[] apI() {
        return eyk_2.u(this.rMa);
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.rMa = eyk_2.fM(byteBuffer);
    }

    @Override
    public void a(eyy_2 eyy_22) {
        try {
            eyy_22.l(this.rMa.Sn(), this.rMa.getName());
            eyy_22.B(this.rMa.Sn(), this.rMa.Xk());
            eyy_22.W(this.rMa.Sn(), this.rMa.pf());
            eyy_22.t(this.rMa.Sn(), this.rMa.Xm());
            eyy_22.w(this.rMa.Sn(), this.rMa.bSr());
            eyy_22.e(this.rMa.Sn(), this.rMa.dJY());
            eyy_22.ad(this.rMa.Sn(), this.rMa.Xt());
            eyy_22.a(this.rMa.Sn(), this.rMa.dxI(), this.rMa.dxH());
        }
        catch (fae fae2) {
            rMA.error((Object)"Impossible de modifier le membre", (Throwable)fae2);
        }
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMf;
    }

    public String toString() {
        return "ModifyMemberChange{m_member=" + String.valueOf(this.rMa) + "}";
    }
}

