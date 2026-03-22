/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDH
 */
class fdh_2
implements fis_1 {
    final /* synthetic */ fdg_2 uhA;

    fdh_2(fdg_2 fdg_22) {
        this.uhA = fdg_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        fcv_1 fcv_12 = (fcv_1)fiq_12.gBD();
        if (fcv_12.getItemValue() != null) {
            this.uhA.tPE = this.uhA.ncz.indexOf(fcv_12);
        }
        return false;
    }
}

