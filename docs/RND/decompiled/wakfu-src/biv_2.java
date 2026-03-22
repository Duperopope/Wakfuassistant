/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIv
 */
class biv_2
extends biu_2 {
    biv_2() {
    }

    @Override
    public void a(fsn_1 fsn_12) {
        if (!biu_2.b(fsn_12)) {
            fsn_12.setVisible(false);
            return;
        }
        long l = aue_0.cVJ().cVO().xl();
        boolean bl = false;
        if (fsn_12.getValue() instanceof adq) {
            adq adq2 = (adq)fsn_12.getValue();
            switch (adq2.aXy) {
                case 16: {
                    fqk_0 fqk_02 = aue_0.cVJ().cVK().dng();
                    bl = !fqk_02.YV((int)adq2.aXv);
                    break;
                }
                case 47: {
                    Object Info2 = frb_0.sYO.a(fre_0.sZa, adq2.aXv);
                    biv_2.a(fsn_12, ((frk_0)Info2).gkp());
                    bl = !frz.a(l, zd_2.aoD, (int)adq2.aXv);
                    break;
                }
                case 26: {
                    Object Info3 = frb_0.sYO.a(fre_0.sYZ, adq2.aXv);
                    bl = !frz.a(l, zd_2.aoC, (int)adq2.aXv);
                    biv_2.a(fsn_12, ((frk_0)Info3).gkp());
                    break;
                }
                case 49: {
                    Object Info4 = frb_0.sYO.a(fre_0.sZb, adq2.aXv);
                    biv_2.a(fsn_12, ((frk_0)Info4).gkp());
                    break;
                }
                case 48: {
                    Object Info5 = frb_0.sYO.a(fre_0.sZc, adq2.aXv);
                    biv_2.a(fsn_12, ((frk_0)Info5).gkp());
                    break;
                }
            }
        }
        fsn_12.setVisible(true);
        fsn_12.ps(false);
        fsn_12.pt(fsn_12.gGr() || bl);
    }
}

