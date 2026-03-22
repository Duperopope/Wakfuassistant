/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXy
 */
class cxy_2
implements Runnable {
    final /* synthetic */ cxx_1 nWt;

    cxy_2(cxx_1 cxx_12) {
        this.nWt = cxx_12;
    }

    @Override
    public void run() {
        if (this.nWt.nWq == null) {
            return;
        }
        bjm_0 bjm_02 = (bjm_0)fse_1.gFu().aW("pet", this.nWt.nWq);
        bjm_02.I((ux_0)null);
        bjm_02.Hm(-1);
        bjm_0 bjm_03 = (bjm_0)fse_1.gFu().aW("pet", "inventoryDialog");
        if (bjm_03 == null) {
            return;
        }
        bjm_03.I((ux_0)null);
    }
}

