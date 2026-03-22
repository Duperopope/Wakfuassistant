/*
 * Decompiled with CFR 0.152.
 */
public final class bNZ
extends bOa {
    @Override
    public String a(bco_0 bco_02) {
        return aum_0.cWf().c("haven.world.zaap.name", new Object[0]);
    }

    @Override
    public boolean a(bgt_0 bgt_02, bco_0 bco_02) {
        return !bgt_02.a(ezj_0.pun);
    }

    @Override
    public void a(RH rH, exP exP2) {
    }

    @Override
    public void b(RH rH, exP exP2) {
        czl_2.eYY().c((bco_0)rH);
    }

    @Override
    public fry a(exP exP2, RH rH, long l) {
        if (!(rH instanceof bat_0)) {
            return fry.sYF;
        }
        if (!(exP2 instanceof bgt_0)) {
            return fry.sYF;
        }
        frn_0 frn_02 = (frn_0)frb_0.sYO.a(fre_0.sYZ, l);
        if (!frn_02.bZ(exP2)) {
            return fry.sYC;
        }
        if (bNZ.L((bgt_0)exP2) && fcI.aa(frn_02.clw(), frn_02.clw()) != eww.oHf) {
            return fry.sYI;
        }
        return fry.sYz;
    }

    private static boolean L(bgt_0 bgt_02) {
        if (fcL.rUh.sA(bgt_02.Xi()) > 1) {
            return true;
        }
        return bgt_02.dnQ().dKL() != null && !bgt_02.dnQ().dKL().pP(bgt_02.Xi()).isEmpty();
    }

    @Override
    public fre_0 egC() {
        return fre_0.sZd;
    }
}

