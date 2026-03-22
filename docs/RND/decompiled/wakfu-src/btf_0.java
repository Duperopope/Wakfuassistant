/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from btf
 */
public final class btf_0 {
    private static final Logger jkO = Logger.getLogger(btf_0.class);
    private final bsS jkP;
    private final crp jkQ;

    public btf_0(bsS bsS2, crp crp2) {
        this.jkP = bsS2;
        this.jkQ = crp2;
    }

    public void bGy() {
        if (this.jkP == null) {
            jkO.error((Object)("[FIGHT] On veut executer un sort sur un combat inconnu " + this.jkQ.bha()));
            return;
        }
        bgy bgy2 = this.jkP.kq(this.jkQ.Qw());
        if (bgy2 == null) {
            return;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.ddf();
        bmx_0 bmx_02 = this.bv(bgy2);
        if (bmx_02 == null) {
            return;
        }
        btn_0.b(this.jkQ.caO(), this.jkQ.avZ(), this.jkQ.bha(), bgy2);
        this.b(this.jkQ.ezy());
    }

    private bmx_0 bv(bgy bgy2) {
        bmx_0 bmx_02;
        fqP<bmx_0> fqP2 = bgy2.dkB();
        if (fqP2 != null && fqP2.beS() != null) {
            bmx_02 = (bmx_0)fqP2.beS().x(this.jkQ.ezy());
        } else {
            bmz_0 bmz_02 = new bmz_0(bgy2);
            bmx_02 = bmz_02.c(this.jkQ.ezy());
        }
        return bmx_02;
    }

    private void b(ym_1 ym_12) {
        aWt aWt2 = new aWt(this.jkQ.caO(), this.jkQ.eza().aJr(), this.jkQ.avZ(), this.jkQ.bha(), ym_12, this.jkQ.cWw(), this.jkQ.cWx(), this.jkQ.Qw(), this.jkQ.ezK(), this.jkQ.ezL(), this.jkQ.ezM());
        afw_2 afw_22 = aVi.cWF().a(this.jkQ.bha(), (aft_2)aWt2);
        aWt2.f(new bwn_1(afw_22), new aga_1(afw_22));
    }
}

