/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVD
 */
class cvd_2
implements fig_2 {
    final /* synthetic */ cva_2 nQg;

    cvd_2(cva_2 cva_22) {
        this.nQg = cva_22;
    }

    @Override
    public fif_2 onDialogCloseRequest(String string) {
        if (string.equals("infoDialog")) {
            this.nQg.eUE();
            return fif_2.uAy;
        }
        return fif_2.uAv;
    }
}

