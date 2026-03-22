/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJa
 */
class bja_0
implements Runnable {
    final /* synthetic */ cyf_1 kjZ;
    final /* synthetic */ bIZ kka;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bja_0(bIZ bIZ2, cyf_1 cyf_12) {
        this.kka = bIZ2;
        this.kjZ = cyf_12;
    }

    @Override
    public void run() {
        if (this.kka.kjY == this.kjZ) {
            this.kka.dZU();
        }
    }
}

