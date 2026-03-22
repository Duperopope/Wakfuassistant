/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZR
 */
public class czr_1
implements aaq_2 {
    public boolean a(aam_2 aam_22) {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (!bgt_02.dpO()) {
                return false;
            }
            ezn ezn2 = ezr.Pf(bgt_02.dpI().cmL() + 1);
            if (ezn2 == null) {
                return false;
            }
            ayf_22.d(new cwM(ezn2.fmw().d()));
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
        return false;
    }

    @Override
    public int bkq() {
        return 19357;
    }
}

