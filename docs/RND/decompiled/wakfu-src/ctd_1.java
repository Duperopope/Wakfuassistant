/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTd
 */
class ctd_1
implements Runnable {
    private final int nIe;
    private final boolean nIf;
    final /* synthetic */ csz_1 nIg;

    ctd_1(csz_1 csz_12, int n, boolean bl) {
        this.nIg = csz_12;
        this.nIe = n;
        this.nIf = bl;
    }

    @Override
    public void run() {
        this.nIg.e(this.nIf, this.nIe);
        if (this.nIf) {
            csz_1.nHV.put(this.nIe, null);
        } else {
            csz_1.nHW.put(this.nIe, null);
        }
    }
}

