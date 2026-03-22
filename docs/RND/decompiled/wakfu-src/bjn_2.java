/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjN
 */
public class bjn_2
extends ezv {
    private static final bjn_2 ipH = new bjn_2();

    private bjn_2() {
    }

    public static bjn_2 drQ() {
        return ipH;
    }

    public long a(bhx_0 bhx_02, ezj_0 ezj_02) {
        if (ezj_02 == ezj_0.psE) {
            bjn_2.h(bhx_02);
        }
        return super.a(bhx_02, ezj_02);
    }

    private static void h(bhx_0 bhx_02) {
        cph_1 cph_12 = cwd_2.eVe().eVf();
        if (cph_12 == null) {
            return;
        }
        int n = cph_12.eLr();
        for (int i = 0; i < n; ++i) {
            crd_1 crd_12 = cph_12.Mh(i);
            if (!(crd_12 instanceof bhx_0) || ((bhx_0)crd_12).Sn() != bhx_02.Sn()) continue;
            cwd_2.eVe().eVg();
            break;
        }
    }
}

