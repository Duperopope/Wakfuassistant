/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZc
 */
class bzc_1
extends bzo_1 {
    private int lBL;

    bzc_1() {
    }

    @Override
    void i(afV afV2) {
        super.i(afV2);
        this.hNy = true;
    }

    private void epL() {
        if (this.lBL != 0) {
            return;
        }
        abW abW2 = new abW(aIz.cgO() + "freeze.cgfx", "freeze");
        aIz.a(abW2, new bzd_1(this, 0.0f));
        this.lBL = abW2.d();
    }

    private void epM() {
        if (this.lBL == 0) {
            return;
        }
        aIz.yD(this.lBL);
        this.lBL = 0;
    }

    @Override
    void bhk() {
        super.bhk();
        this.epM();
        this.hNy = false;
    }

    @Override
    void b(afV afV2, float f2, float f3) {
        if (!this.hNy) {
            return;
        }
        float f4 = this.lCH.epJ();
        if (f4 == 0.0f) {
            this.bhk();
            return;
        }
        this.epL();
    }
}

