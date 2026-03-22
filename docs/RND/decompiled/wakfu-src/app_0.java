/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aPp
 */
final class app_0
implements Runnable {
    private fcq_2 eyw;
    final /* synthetic */ apn_0 eyx;

    app_0(apn_0 apn_02, fcq_2 fcq_22) {
        this.eyx = apn_02;
        this.eyw = fcq_22;
    }

    public void a(fcq_2 fcq_22) {
        this.eyw = fcq_22;
    }

    @Override
    public void run() {
        float f2 = fse_1.gFu().h("chat.scrollOffset", this.eyw.getElementMap());
        boolean bl = this.eyw.guo();
        if (bl && f2 == -1.0f) {
            fse_1.gFu().a("chat.scrollOffset", (Object)Float.valueOf(0.0f), this.eyw.getElementMap());
        } else if (!bl) {
            fse_1.gFu().a("chat.scrollOffset", (Object)Float.valueOf(-1.0f), this.eyw.getElementMap());
        } else if (f2 > 0.0f) {
            csz_1.ePn().Mz(aPt.cAg().c(this.eyx).czm());
        }
    }
}

