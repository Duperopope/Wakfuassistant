/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDP
 */
class cdp_1
implements Runnable {
    private fcq_2 mUh;
    private Boolean mUi;
    private boolean btq;

    cdp_1() {
    }

    public void b(fcq_2 fcq_22) {
        this.mUh = fcq_22;
    }

    public void i(Boolean bl) {
        this.mUi = bl;
    }

    @Override
    public void run() {
        fcj_2 fcj_22 = this.mUh.getVerticalScrollBar();
        float f2 = fcj_22.getValue();
        float f3 = fcj_22.getButtonJump();
        if (this.mUi.booleanValue()) {
            if (f2 == 1.0f) {
                cdc_1.eKb();
                return;
            }
            if ((f2 += f3) > 1.0f) {
                f2 = 1.0f;
            }
        } else {
            if (f2 == 0.0f) {
                cdc_1.eKb();
                return;
            }
            if ((f2 -= f3) < 0.0f) {
                f2 = 0.0f;
            }
        }
        this.mUh.setVerticalScrollBarPosition(f2);
        fse_1.gFu().b("chat.scrollOffset", Float.valueOf(fcj_22.getValue()), this.mUh.getElementMap().getId());
    }

    public boolean bhl() {
        return this.btq;
    }

    public void cL(boolean bl) {
        this.btq = bl;
    }
}

