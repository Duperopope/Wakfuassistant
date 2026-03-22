/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZU
 */
public class czu_1
implements aaq_2 {
    @Override
    public int bkq() {
        return 18965;
    }

    public boolean a(aam_2 aam_22) {
        dbu dbu2 = (dbu)aam_22;
        long l = dbu2.KU();
        long l2 = dbu2.emG();
        ezz_1 ezz_12 = bvk.dJZ().jP(l);
        long l3 = bvk.dJZ().drj();
        if (l2 != l3 && ezz_12.Xm() != l3) {
            bvk.dJZ().u(l, l2);
            return false;
        }
        String string2 = null;
        long l4 = aue_0.cVJ().cVK().Sn();
        string2 = l != l4 ? aum_0.cWf().c("guild.warning.giveMasterRank", ezz_12.getName()) : aum_0.cWf().c("guild.warning.removeSelfMasterRank", ezz_12.getName());
        fik_2 fik_22 = fik_2.gCa().vE(string2).abQ(3).a((int n, String string) -> {
            if (n == 300) {
                bvk.dJZ().u(l, l2);
            } else {
                fse_1.gFu().a((aef_2)bvk.dJZ().kK(l), "rank");
            }
        });
        fiq_2.gCw().d(fik_22);
        return false;
    }
}

