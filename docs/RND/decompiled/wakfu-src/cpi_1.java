/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cPI
 */
class cpi_1
extends fmz_1 {
    final /* synthetic */ cpm_1 nid;

    cpi_1(cph_1 cph_12, cpm_1 cpm_12) {
        this.nid = cpm_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        this.nid.run();
        return false;
    }
}

