/*
 * Decompiled with CFR 0.152.
 */
public final class cfx
extends ceK<cql, bsj_0> {
    public boolean a(cql cql2) {
        long l = cql2.KU();
        byte[] byArray = cql2.aKU();
        bgy bgy2 = (bgy)((bsj_0)this.jkR).qJ(l);
        if (bgy2 == null) {
            return false;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        aex aex2 = bdj_22.bvD();
        bdj_22.a(aez.bwu());
        bgy2.as(byArray);
        exx_2[] exx_2Array = exP.pfT;
        for (int i = 0; i < exx_2Array.length; ++i) {
            exx_2 exx_22 = exx_2Array[i];
            exf_2 exf_22 = bgy2.e(exx_22);
            exf_22.aYT();
        }
        if (((bsj_0)this.jkR).dGp() == etw_0.rqT) {
            ((bsj_0)this.jkR).dGQ().bhI();
            bgy2.fgm();
        }
        bdj_22.a(aex2);
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cql)aam_22);
    }
}

