/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from czu
 */
public final class czu_0
implements aaq_2<cof_0> {
    @Override
    public boolean a(cof_0 cof_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bgt_02.dmV() != null) {
            aVi.cWF().a(bsj_02, (aft_2)new avv_0(() -> czu_0.c(cof_02.KU(), cof_02.apw(), cof_02.dcc())));
            aVi.cWF().m(bsj_02);
        } else {
            czu_0.c(cof_02.KU(), cof_02.apw(), cof_02.dcc());
        }
        return false;
    }

    private static void c(long l, int n, boolean bl) {
        bcd_2 bcd_22 = bbw_2.hCq.je(l);
        if (bcd_22 != null) {
            bcd_22.a(n, bl);
        }
    }

    @Override
    public int bkq() {
        return 13154;
    }
}

