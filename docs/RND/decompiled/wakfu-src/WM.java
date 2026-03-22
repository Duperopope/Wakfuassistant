/*
 * Decompiled with CFR 0.152.
 */
class WM
implements alu_2 {
    final /* synthetic */ boolean bPG;
    final /* synthetic */ boolean bPH;
    final /* synthetic */ WL bPI;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    WM(WL wL, boolean bl, boolean bl2) {
        this.bPI = wL;
        this.bPG = bl;
        this.bPH = bl2;
    }

    @Override
    public void a(alt_2 alt_22, int n) {
        if (this.bPG) {
            this.bPI.bmP();
        }
        if (this.bPH) {
            this.bPI.bmQ();
        }
        alt_22.b(this);
        this.bPI.bmR();
    }
}

