/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZa
 */
class cza_1
implements Runnable {
    boolean nZT = true;
    final /* synthetic */ cyr_2 nZU;

    cza_1(cyr_2 cyr_22) {
        this.nZU = cyr_22;
    }

    @Override
    public void run() {
        long l = System.currentTimeMillis();
        if (l - this.nZU.nZz < 10000L) {
            this.nZT = true;
            return;
        }
        if (l - this.nZU.nZy < 5000L) {
            this.nZT = true;
            return;
        }
        this.nZU.nZy = l;
        this.nZU.eT(this.nZU.nZx + 1, this.nZU.nZx);
        this.nZT = false;
    }
}

