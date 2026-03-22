/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCT
 */
class fct_1
implements fis_1 {
    final /* synthetic */ fcq_2 ubk;

    fct_1(fcq_2 fcq_22) {
        this.ubk = fcq_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flw_2 flw_22 = (flw_2)fiq_12;
        double d2 = flw_22.getValue();
        this.ubk.af(d2);
        return false;
    }
}

