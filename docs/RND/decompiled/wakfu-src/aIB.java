/*
 * Decompiled with CFR 0.152.
 */
class aIB
extends abW {
    float dYI;
    float dYJ;
    final /* synthetic */ aca dYK;
    final /* synthetic */ asl_1 dYL;

    aIB(String string, String string2, asl_1 asl_12, aca aca2, asl_1 asl_13) {
        this.dYK = aca2;
        this.dYL = asl_13;
        super(string, string2, asl_12);
        this.dYI = 0.0f;
        this.dYJ = 0.0f;
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        float f2 = this.dYK.bnY();
        float f3 = 1.0f * f2 * (float)n;
        this.dYI += f3 * 0.0011f;
        this.dYJ += f3 * 0.0013f;
        this.dYL.c("gStrength", f2);
        this.dYL.a("gDistordLow", this.dYI * 0.0013f, this.dYI * 0.0011f);
        this.dYL.a("gDistordHigh", -(this.dYJ * 0.011f + this.dYJ * 0.023f), 1.5f * this.dYJ * 0.013f);
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        this.dYL.a("camera", aag_02.bsh() / 1024.0f, aag_02.bsi() / 1024.0f, aag_02.getZoomFactor());
    }
}

