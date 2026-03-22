/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from czv
 */
public final class czv_0
implements aaq_2<cog_0> {
    @Override
    public boolean a(cog_0 cog_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = cog_02.KU();
        int n = cog_02.ewy();
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bgt_02.dmV() != null) {
            aVi.cWF().a(bsj_02, (aft_2)new avv_0(() -> czv_0.G(l, n)));
            aVi.cWF().m(bsj_02);
        } else {
            czv_0.G(l, n);
        }
        return false;
    }

    private static void G(long l, int n) {
        bcd_2 bcd_22 = bbw_2.hCq.je(l);
        if (bcd_22 != null) {
            bcd_22.AW(n);
            bcj_1 bcj_12 = bcb_1.hDb.AN(n);
            bqm_0.jbp.b(new bqz_1(n, bcj_12.daS().d()));
        }
    }

    @Override
    public int bkq() {
        return 12545;
    }
}

