/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDL
 */
class fdl_1
implements fis_1 {
    final /* synthetic */ fdk_2 uig;

    fdl_1(fdk_2 fdk_22) {
        this.uig = fdk_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flw_2 flw_22 = (flw_2)fiq_12;
        this.uig.setListOffset(this.uig.fA(flw_22.getValue()));
        return false;
    }
}

