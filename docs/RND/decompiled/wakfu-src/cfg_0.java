/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfg
 */
final class cfg_0
extends ceK<csa, bsj_0> {
    cfg_0() {
    }

    public boolean a(csa csa2) {
        long l = csa2.evy();
        bCA bCA2 = (bCA)bzj_2.eqi().my(l);
        if (bCA2 == null) {
            return true;
        }
        if (bCA2.Gh(((bsj_0)this.jkR).d())) {
            aVX aVX2 = aVX.a(agb_1.cbm(), eui_1.rsR.aJr(), 0, csa2.evy(), csa2.eAx());
            aVi.cWF().a((bsj_0)this.jkR, (aft_2)aVX2);
            return false;
        }
        return true;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((csa)aam_22);
    }
}

