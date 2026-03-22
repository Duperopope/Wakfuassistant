/*
 * Decompiled with CFR 0.152.
 */
class aII
extends abW {
    float dYI;
    float dYJ;
    final /* synthetic */ aca dYW;
    final /* synthetic */ asl_1 dYX;

    aII(String string, String string2, asl_1 asl_12, aca aca2, asl_1 asl_13) {
        this.dYW = aca2;
        this.dYX = asl_13;
        super(string, string2, asl_12);
        this.dYI = 0.0f;
        this.dYJ = 0.0f;
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        float f2 = this.dYW.bnY();
        float f3 = 20.0f * f2 * (float)n;
        this.dYI += f3 * 0.0011f;
        this.dYJ += f3 * 0.0013f;
        this.dYX.c("gStrength", f2);
        this.dYX.a("gDistordLow", this.dYI * 0.0013f, this.dYI * 0.0011f);
        this.dYX.a("gDistordHigh", -(this.dYJ * 0.011f + this.dYJ * 0.023f), 1.5f * this.dYJ * 0.013f);
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        this.dYX.a("camera", aag_02.bsh() / 1024.0f, aag_02.bsi() / 1024.0f, aag_02.getZoomFactor());
    }
}

