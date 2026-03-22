/*
 * Decompiled with CFR 0.152.
 */
class aIJ
extends abW {
    float dYI;
    float dYJ;
    float dYQ;
    float dYR;
    float dYY;
    long bUm;
    final /* synthetic */ aca dYZ;
    final /* synthetic */ asl_1 dZa;

    aIJ(String string, String string2, asl_1 asl_12, aca aca2, asl_1 asl_13) {
        this.dYZ = aca2;
        this.dZa = asl_13;
        super(string, string2, asl_12);
        this.dYI = 0.0f;
        this.dYJ = 0.0f;
        this.dYQ = 0.0f;
        this.dYR = 0.0f;
        this.dYY = 0.0f;
        this.bUm = 0L;
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        this.bUm += (long)n;
        float f2 = this.dYZ.bnY();
        float f3 = 7.0f * (float)n;
        float f4 = 20.0f * f2 * (float)n;
        float f5 = 5.0f * (float)n;
        this.dYI += f4 * 0.0011f;
        this.dYJ += f4 * 0.0013f;
        this.dYQ += f3 * 0.02f;
        this.dYR += f3 * 0.09f;
        this.dYY += f5 * 0.02f;
        float f6 = GC.F((float)Math.PI / 180 * this.dYQ * -0.34f) * 0.2f;
        float f7 = GC.E((float)Math.PI / 180 * this.dYQ * 0.2f) * 0.2f;
        float f8 = GC.F((float)Math.PI / 180 * this.dYR * -0.34f) * 0.2f;
        float f9 = GC.E((float)Math.PI / 180 * this.dYR * 0.2f) * 0.2f;
        float f10 = GC.F((float)Math.PI / 180 * this.dYY * -0.1f) * 0.1f;
        float f11 = GC.F((float)Math.PI / 180 * this.dYY * -0.4f) * 0.1f;
        float f12 = GC.F((float)Math.PI / 180 * this.dYY * -0.7f) * 0.1f;
        this.dZa.c("gStrength", f2);
        this.dZa.a("gDistordLow", this.dYI * 0.0013f, this.dYI * 0.0011f);
        this.dZa.a("gDistordHigh", -(this.dYJ * 0.011f + this.dYJ * 0.023f), 1.5f * this.dYJ * 0.013f);
        this.dZa.a("gHeatDistordLow", f6, f7);
        this.dZa.a("gHeatDistordHigh", f8, f9);
        this.dZa.a("gColorVariation", f10, f11, f12);
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        this.dZa.a("camera", aag_02.bsh() / 1024.0f, aag_02.bsi() / 1024.0f, aag_02.getZoomFactor());
    }
}

