/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJj
 */
public class bjj_0
extends bjo_0 {
    @Nullable
    private bke_2 hKo;

    public bjj_0(bhJ bhJ2, fnl_0 fnl_02) {
        super(bhJ2, fnl_02);
    }

    @Override
    protected void aPg() {
        bdj_2 bdj_22 = this.klr.ddI();
        this.kle = new bjk_0(this.kls, bdj_22);
        int n = this.kls.agK();
        this.kle.lf(bjn_0.b(this.kls));
        this.kle.a(bdj_22.bcB());
        this.kle.dT("AnimStatique");
        this.kle.a(aeB.bww());
        this.kle.qR(afX.csq.byy());
        this.kle.at((byte)8);
        this.kle.setVisible(true);
        this.kle.a(this.kls.geM());
        Object r = fgD.fXh().Vd(n);
        if (r != null) {
            this.kle.Bx(((fhc_0)r).aVt());
        }
        this.kle.bpC();
        this.C(bdj_22);
    }

    public void C(bdj_2 bdj_22) {
        this.hKo = new bke_2(bjj_0.a(this.kls), ((for_0)this.kls.geL()).gfy(), bdj_22);
    }

    @Override
    public void eag() {
        adj_0 adj_02 = this.kle.bvb();
        if (adj_02 != null) {
            adj_02.e(this.kle);
        }
        adn_0.bvh().fL(this.kle.Sn());
        this.kle.bpI();
        this.kle = null;
        if (this.klr.dkO()) {
            bdj_2 bdj_22 = this.klr.ddI();
            bdj_22.b(this.klt);
            bdj_22.c(this.klt);
        }
        this.klt = null;
    }

    private static fos_0 a(fnl_0 fnl_02) {
        int n = fnl_02.agK();
        fos_0 fos_02 = fou_0.sLB.aA(n);
        if (fos_02 != null) {
            return fos_02;
        }
        return fou_0.sLB.az(fnl_02.geL().aVt());
    }

    @Nullable
    public bke_2 eah() {
        return this.hKo;
    }
}

