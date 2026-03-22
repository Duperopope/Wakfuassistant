/*
 * Decompiled with CFR 0.152.
 */
class aID
extends abW {
    int bUi;
    final /* synthetic */ asl_1 dYN;

    aID(String string, String string2, asl_1 asl_12, asl_1 asl_13) {
        this.dYN = asl_13;
        super(string, string2, asl_12);
        this.bUi = 0;
    }

    @Override
    public void qF(int n) {
        this.bUi += n;
        super.qF(n);
        float f2 = GC.H((float)Math.PI / 180 * (float)this.bUi / 271.0f);
        float f3 = GC.G((float)Math.PI / 180 * (float)this.bUi / 233.0f);
        float f4 = 2.0f * GC.H((float)Math.PI / 180 * (float)this.bUi / 2503.0f);
        float f5 = 2.0f * GC.G((float)Math.PI / 180 * (float)this.bUi / 3373.0f);
        this.dYN.a("gDistordLow", f2, f3);
        this.dYN.a("gDistordHigh", f4, f5);
    }
}

