/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bvH
 */
public final class bvh_0
implements eyu_1 {
    @Override
    public void a(eyt_1 eyt_12, exz_1 exz_12) {
        bgy bgy2 = bvz_0.ju(exz_12.KU());
        if (bgy2 != null) {
            bgy2.djo();
        }
        cts_1.ePE();
        bgt_0 bgt_02 = fcI.fSM() ? bvz_0.dLl() : aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        if (exz_12.aXd()) {
            return;
        }
        if (exz_12.dmc()) {
            return;
        }
        acd_1 acd_12 = exz_12.aZw();
        if (acd_12 != null && exz_12.KU() != bgt_02.Sn()) {
            big_2.a(exz_12.KU(), 0, acd_12.getX(), acd_12.getY(), acd_12.bdi(), exz_12.aqZ(), exz_12, bit_2.kgo, exz_12.getName(), aid_0.dUO, bif_2.dYO());
        }
    }

    @Override
    public void a(eyt_1 eyt_12, exz_1 exz_12, boolean bl) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgy bgy2 = bvz_0.ju(exz_12.KU());
        cts_1.ePE();
        cvu_2.eTO().ot(exz_12.KU());
        if (bgy2 != null && !bgy2.bvY()) {
            bgy2.djo();
        }
        if (exz_12.KU() != bgt_02.Sn()) {
            bif_2.dYO().w(0, exz_12.KU());
            bir_1.dZt().k(0, exz_12.KU());
        }
    }

    @Override
    public void a(eyt_1 eyt_12, long l, long l2) {
    }
}

