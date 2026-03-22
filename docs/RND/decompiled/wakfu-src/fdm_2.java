/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDM
 */
class fdm_2
implements fis_1 {
    final /* synthetic */ fdk_2 uih;

    fdm_2(fdk_2 fdk_22) {
        this.uih = fdk_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flp_2 flp_22 = (flp_2)fiq_12;
        this.uih.setOffset(this.uih.crT + flp_22.gEo());
        return false;
    }
}

