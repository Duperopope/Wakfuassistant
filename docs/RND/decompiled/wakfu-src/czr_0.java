/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from czR
 */
public final class czr_0
implements aaq_2<ctx> {
    @Override
    public boolean a(ctx ctx2) {
        bhx_0 bhx_02 = (bhx_0)bgg_0.dlO().ju(ctx2.KU());
        bjc_2 bjc_22 = bjd_2.drM().Dv(ctx2.eCj());
        cph_1 cph_12 = cwd_2.eVe().eVf();
        if (cph_12 != null) {
            int n = cph_12.eLr();
            for (int i = 0; i < n; ++i) {
                crd_1 crd_12 = cph_12.Mh(i);
                if (!(crd_12 instanceof bhx_0) || ((bhx_0)crd_12).Sn() != bhx_02.Sn()) continue;
                cwd_2.eVe().eVg();
                break;
            }
        }
        awd_0 awd_02 = new awd_0(agb_1.cbm(), 0, 0, bjc_22.cbt(), ctx2.KU(), bjc_22.cXf(), ctx2.eCk());
        awb_0.htX.h(awd_02);
        awb_0.htX.cbb();
        return false;
    }

    @Override
    public int bkq() {
        return 12301;
    }
}

