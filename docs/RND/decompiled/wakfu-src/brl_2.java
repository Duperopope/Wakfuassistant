/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRL
 */
public final class brl_2 {
    private brl_2() {
    }

    public static axb_2 a(fjn_0 fjn_02, fjo_0 fjo_02) {
        if (fjt.syH.WG(fjn_02.Xt()).gbD().WO(fjo_02.Xt()) == fkc_0.sAo) {
            return bJN.kmA;
        }
        return bJN.kmz;
    }

    public static axb_2 a(bgt_0 bgt_02, bgy bgy2) {
        int n;
        int n2;
        int n3 = bgt_02.a(ezj_0.puz) ? 0 : (n2 = bgt_02.a(ezj_0.puA) ? 1 : -1);
        int n4 = bgy2.a(ezj_0.puz) ? 0 : (n = bgy2.a(ezj_0.puA) ? 1 : -1);
        if (n == -1 || n2 == -1) {
            return bJN.kmC;
        }
        return n2 == n ? bJN.kmz : bJN.kmA;
    }
}

