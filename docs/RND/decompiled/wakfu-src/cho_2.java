/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHO
 */
class cho_2
implements fis_1 {
    final /* synthetic */ chm_2 nbn;

    cho_2(chm_2 chm_22) {
        this.nbn = chm_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        Object t = fiq_12.gBE();
        int n = this.nbn.naY.indexOf(t);
        if (n != -1) {
            fyd_0.closePopup(null);
        }
        return false;
    }
}

