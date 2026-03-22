/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bNY
extends bNW {
    @Override
    public void a(RH rH, exP exP2) {
        int n = (int)rH.Sn();
        long l = exP2.Xi();
        if (frz.a(l, fre_0.sZa, n)) {
            return;
        }
        ((bCA)rH).c(rw_0.blh);
    }

    @Override
    public void b(RH rH, exP exP2) {
        ctw_1.eRl().c((bco_0)rH);
        ((rx_0)((Object)rH)).c(rw_0.bkJ);
    }

    @Override
    public fry a(exP exP2, RH rH, long l) {
        if (!evg_1.osP.a((eve_2)((Object)exP2))) {
            return fry.sYE;
        }
        if (!(exP2 instanceof bgt_0) || ((bgt_0)exP2).dkC() != fpu_0.sRd) {
            return fry.sYJ;
        }
        frj_0 frj_02 = (frj_0)frb_0.sYO.a(this.egC(), rH.Sn());
        if (!frj_02.bZ(exP2)) {
            return fry.sYC;
        }
        return fry.sYz;
    }

    @Override
    protected void b(exP exP2, RH rH, long l) {
        coc_0 coc_02 = new coc_0(rH.Sn(), l);
        aue_0.cVJ().etu().d(coc_02);
    }

    @Override
    public boolean a(bgt_0 bgt_02, bco_0 bco_02) {
        return this.a(bgt_02, bco_02, -1L) == fry.sYz;
    }

    @Override
    public fre_0 egC() {
        return fre_0.sZa;
    }

    @Override
    public String a(bco_0 bco_02) {
        return aum_0.cWf().a(82, (long)((int)bco_02.Sn()), new Object[0]);
    }

    @Override
    @Nullable
    public String b(bco_0 bco_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ahv_2 ahv_22 = new ahv_2();
        fry fry2 = this.a(bgt_02, bco_02, -1L);
        ahv_22.ih((fry2 == fry.sYz ? awx_2.dnL : awx_2.dnJ).bQk());
        if (fry2 == fry.sYC) {
            ahv_22.ceH().c(aum_0.cWf().c("chat.travel.invalidCriterion", new Object[0]));
        }
        return ahv_22.ceL();
    }
}

