/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYd
 */
class cyd_1
implements fig_2 {
    final /* synthetic */ cya_2 nXH;

    cyd_1(cya_2 cya_22) {
        this.nXH = cya_22;
    }

    @Override
    public fif_2 onDialogCloseRequest(String string) {
        if (string.equals("shukruteRewardDialog")) {
            this.nXH.eUE();
            return fif_2.uAy;
        }
        return fif_2.uAv;
    }
}

