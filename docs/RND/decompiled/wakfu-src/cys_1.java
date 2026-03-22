/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYS
 */
class cys_1
implements Runnable {
    final /* synthetic */ cyr_2 nZF;

    cys_1(cyr_2 cyr_22) {
        this.nZF = cyr_22;
    }

    @Override
    public void run() {
        if (this.nZF.kSK != null) {
            try {
                this.nZF.kSK.ejf();
            }
            catch (Exception exception) {
                cyr_2.nZq.warn((Object)exception.getMessage(), (Throwable)exception);
            }
        }
    }
}

