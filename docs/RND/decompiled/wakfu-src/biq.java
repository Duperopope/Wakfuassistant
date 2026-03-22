/*
 * Decompiled with CFR 0.152.
 */
class biq
implements fig_2 {
    biq(bio_0 bio_02) {
    }

    @Override
    public fif_2 onDialogCloseRequest(String string) {
        if (string.startsWith("questActivationDialog")) {
            return fif_2.uAy;
        }
        return fif_2.uAv;
    }
}

