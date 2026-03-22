/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ddu
 */
final class ddu_0
implements Xe {
    ddu_0() {
    }

    @Override
    public void a(xb_0 xb_02) {
        assert (xb_02 != null) : "Event null at BubbleText.onAdviserEvent";
        if (xb_02.bnt() != Xc.bQP) {
            return;
        }
        int n = xb_02.bns().d();
        ddr_0 ddr_02 = dds_0.fcD().NU(n);
        if (ddr_02 == null) {
            return;
        }
        ddr_02.bAs();
        dds_0.fcD().NT(n);
    }
}

