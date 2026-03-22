/*
 * Decompiled with CFR 0.152.
 */
class aIE
extends abW {
    int bUi;
    final /* synthetic */ asl_1 dYO;

    aIE(String string, String string2, asl_1 asl_12, asl_1 asl_13) {
        this.dYO = asl_13;
        super(string, string2, asl_12);
        this.bUi = 0;
    }

    @Override
    public void qF(int n) {
        this.bUi += n;
        super.qF(n);
        float f2 = (float)this.bUi * 0.0011f;
        float f3 = (float)this.bUi * 0.0013f;
        this.dYO.a("gDistordLow", -f2 * 0.0013f, f2 * 0.0011f);
        this.dYO.a("gDistordHigh", f3 * 0.011f + f3 * 0.023f, f3 * 0.013f);
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        this.dYO.a("camera", aag_02.bsh() / 1024.0f, aag_02.bsi() / 1024.0f, aag_02.getZoomFactor());
    }
}

