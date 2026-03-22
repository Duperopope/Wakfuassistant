/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from czw
 */
public final class czw_0
implements aaq_2<coh_0> {
    @Override
    public boolean a(coh_0 coh_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = coh_02.KU();
        int n = coh_02.ewy();
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bgt_02.dmV() != null) {
            aVi.cWF().a(bsj_02, (aft_2)new avv_0(() -> czw_0.I(l, n)));
            aVi.cWF().m(bsj_02);
        } else {
            czw_0.I(l, n);
        }
        return false;
    }

    private static void I(long l, int n) {
        bcd_2 bcd_22 = bbw_2.hCq.je(l);
        if (bcd_22 != null) {
            bcd_22.AX(n);
        }
    }

    @Override
    public int bkq() {
        return 13193;
    }
}

