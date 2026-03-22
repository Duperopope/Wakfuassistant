/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYI
 */
class cyi_1
implements Runnable {
    final /* synthetic */ cyh_2 nZe;

    cyi_1(cyh_2 cyh_22) {
        this.nZe = cyh_22;
    }

    @Override
    public void run() {
        if (this.nZe.bRH != null && !this.nZe.bRH.bqY()) {
            return;
        }
        abg_2.bUP().h(this.nZe.nZd);
        fse_1.gFu().f("isNewWorldReady", true);
    }
}

