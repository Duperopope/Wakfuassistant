/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCE
 */
class fce_1
implements Runnable {
    final /* synthetic */ boolean tZI;
    final /* synthetic */ float tZJ;
    final /* synthetic */ short tZK;
    final /* synthetic */ float tZL;
    final /* synthetic */ int tZM;
    final /* synthetic */ fcd_2 tZN;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fce_1(fcd_2 fcd_22, boolean bl, float f2, short s, float f3, int n) {
        this.tZN = fcd_22;
        this.tZI = bl;
        this.tZJ = f2;
        this.tZK = s;
        this.tZL = f3;
        this.tZM = n;
    }

    @Override
    public void run() {
        float f2;
        if (this.tZN.tZC.isUnloading()) {
            return;
        }
        float f3 = this.tZN.tZC.getOffset();
        float f4 = f2 = this.tZI ? this.tZJ : -this.tZJ;
        if (this.tZN.tZH.tZs && this.a(f3, f2, this.tZI)) {
            return;
        }
        if (this.tZK != -1 && !this.tZN.tZH.tZs) {
            boolean bl;
            if (this.tZI) {
                bl = this.tZN.tZC.getOffset() - this.tZL + f2 >= (float)this.tZM;
            } else {
                boolean bl2 = bl = this.tZN.tZC.getOffset() - this.tZL + f2 <= (float)this.tZM;
            }
            if (bl) {
                this.a(f3, f2, this.tZI);
                return;
            }
        }
        this.tZN.setListOffset(f3 + f2);
        if (this.tZN.tZC.getRenderables().isEmpty()) {
            return;
        }
        fdz_1 fdz_12 = (fdz_1)this.tZN.tZC.getRenderableByOffset((int)this.tZN.tZC.getOffset()).getInnerElementMap().uH("text");
        String string = fdz_12.getText();
        if (string.length() == 0) {
            return;
        }
        Byte by = Byte.valueOf(string);
        boolean bl = by != this.tZN.tZG;
        this.tZN.tZG = by;
        if (bl && this.tZN.tZD == this.tZN.tZH.tZx - 1) {
            this.tZN.tZH.aaG(this.tZN.tZH.getCurrentValue());
        }
    }

    private boolean a(float f2, float f3, boolean bl) {
        boolean bl2;
        int n;
        if (bl) {
            n = GC.C(f2);
            bl2 = f2 + f3 >= (float)n;
        } else {
            n = GC.B(f2);
            boolean bl3 = bl2 = f2 + f3 <= (float)n;
        }
        if (bl2) {
            this.tZN.setListOffset(n);
            abg_2.bUP().h(this.tZN.tZB);
            this.tZN.tZB = null;
            this.tZN.jrp = this.tZK;
            if (this.tZN.tZH.tZy == this.tZN.tZD && this.tZN.tZF == this.tZN.jrp) {
                ++this.tZN.tZH.tZy;
                if (this.tZN.tZD == this.tZN.tZH.tZx - 1) {
                    this.tZN.tZH.cbz();
                }
                return true;
            }
            if (this.tZN.tZE != null && this.tZN.jrp == fcc_2.tZn.length) {
                if (this.tZN.tZH.tZy == this.tZN.tZD) {
                    this.tZN.gub();
                } else {
                    this.tZN.guc();
                    if (this.tZN.tZH.tZy == this.tZN.tZE.guf()) {
                        this.tZN.tZE.gub();
                    } else {
                        this.tZN.tZE.guc();
                    }
                }
            }
            return true;
        }
        return false;
    }
}

