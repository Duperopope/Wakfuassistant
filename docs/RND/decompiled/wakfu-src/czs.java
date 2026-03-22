/*
 * Decompiled with CFR 0.152.
 */
public final class czs
implements aaq_2<cod_0> {
    @Override
    public boolean a(cod_0 cod_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = cod_02.KU();
        int n = cod_02.apw();
        long l2 = cod_02.apx();
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bsj_02 != null) {
            aVi.cWF().a(bgt_02.dmW(), (aft_2)new avv_0(() -> czs.b(l, n, l2)));
            aVi.cWF().m(bsj_02);
        } else {
            czs.b(l, n, l2);
        }
        return false;
    }

    private static void b(long l, int n, long l2) {
        bcd_2 bcd_22 = bbw_2.hCq.je(l);
        if (bcd_22 != null) {
            bcd_22.q(n, l2);
            bqm_0.jbp.b(new bra_1(n));
        }
    }

    @Override
    public int bkq() {
        return 12342;
    }
}

