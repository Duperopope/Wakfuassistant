/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from bdz
 */
public final class bdz_2 {
    private bdz_2() {
    }

    public static int aa(bgy bgy2) {
        int n = bgy2.Xt();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return -1;
        }
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_02.aqZ());
        if (bzq_22 != null && bzq_22.eqw()) {
            fpv fpv2 = cux_0.mjE.eDD();
            TIntArrayList tIntArrayList = fpv2.ggK();
            return tIntArrayList.contains(n) ? 800737 : 800738;
        }
        if (bgt_02.dkC() != fpu_0.sRd && bgy2.dkC() != fpu_0.sRd && !bgy2.i(ezj_0.pss)) {
            if (bgy2.ffF().elt()) {
                return 800880;
            }
            return 800870;
        }
        int n2 = bgy2.ffM();
        if (bgy2.ffF().WC(n2)) {
            return 800456;
        }
        return -1;
    }
}

