/*
 * Decompiled with CFR 0.152.
 */
class aIH
extends abW {
    float dYI;
    float dYJ;
    float dYQ;
    float dYR;
    long bUm;
    final /* synthetic */ aca dYU;
    final /* synthetic */ asl_1 dYV;

    aIH(String string, String string2, asl_1 asl_12, aca aca2, asl_1 asl_13) {
        this.dYU = aca2;
        this.dYV = asl_13;
        super(string, string2, asl_12);
        this.dYI = 0.0f;
        this.dYJ = 0.0f;
        this.dYQ = 0.0f;
        this.dYR = 0.0f;
        this.bUm = 0L;
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        this.bUm += (long)n;
        float f2 = this.dYU.bnY();
        float f3 = 7.0f * (float)n;
        float f4 = 20.0f * f2 * (float)n;
        float f5 = this.cgZ();
        this.dYI += f4 * 0.0011f;
        this.dYJ += f4 * 0.0013f;
        this.dYQ += f3 * 0.05f;
        this.dYR += f3 * 0.06f;
        float f6 = GC.F((float)Math.PI / 180 * this.dYQ * 0.13f) * 0.2f;
        float f7 = GC.E((float)Math.PI / 180 * this.dYQ * 0.11f) * 0.2f;
        float f8 = GC.F((float)Math.PI / 180 * this.dYR * -0.34f) * 0.2f;
        float f9 = GC.E((float)Math.PI / 180 * this.dYR * 0.2f) * 0.2f;
        this.dYV.c("gStrength", f2);
        this.dYV.c("caniculeToTemporal", f5);
        this.dYV.a("gDistordLow", this.dYI * 0.0013f, this.dYI * 0.0011f);
        this.dYV.a("gDistordHigh", -(this.dYJ * 0.011f + this.dYJ * 0.023f), 1.5f * this.dYJ * 0.013f);
        this.dYV.a("gHeatDistordLow", f6, f7);
        this.dYV.a("gHeatDistordHigh", f8, f9);
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        this.dYV.a("camera", aag_02.bsh() / 1024.0f, aag_02.bsi() / 1024.0f, aag_02.getZoomFactor());
    }

    private float cgZ() {
        long l = this.bUm % 141000L;
        if (l < 70000L) {
            return 0.0f;
        }
        if (l < 85000L) {
            return (float)(l - 70000L) / 15000.0f;
        }
        if (l < 135000L) {
            return 1.0f;
        }
        long l2 = l - 70000L - 15000L - 50000L;
        return 1.0f - (float)l2 / 6000.0f;
    }
}

