/*
 * Decompiled with CFR 0.152.
 */
public final class czq
implements aaq_2<coB> {
    @Override
    public boolean a(coB coB2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bgt_02.dmV() != null) {
            aVi.cWF().a(bsj_02, (aft_2)new avv_0(() -> czq.F(coB2.KU(), coB2.apw())));
            aVi.cWF().m(bsj_02);
        } else {
            czq.F(coB2.KU(), coB2.apw());
        }
        return false;
    }

    private static void F(long l, int n) {
        bcd_2 bcd_22 = bbw_2.hCq.je(l);
        if (bcd_22 != null) {
            bcd_22.AY(n);
        }
    }

    @Override
    public int bkq() {
        return 12339;
    }
}

