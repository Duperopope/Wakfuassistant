/*
 * Decompiled with CFR 0.152.
 */
class aIA
extends abW {
    float cdW;

    aIA(String string, String string2, asl_1 asl_12) {
        super(string, string2, asl_12);
    }

    @Override
    public void qF(int n) {
        this.cdW += (float)n;
        super.qF(n);
        int n2 = 30000;
        if (this.cdW > 30000.0f) {
            this.bX(false);
            return;
        }
        if (this.cdW > 20000.0f) {
            this.cfp.c("radius", GC.b((this.cdW - 20000.0f) / 10000.0f, 0.4f, 1.0f));
            return;
        }
        this.cfp.c("gStrength", 1.0f);
        this.cfp.c("radius", GC.b(1.0f - this.cdW / 10000.0f, 0.4f, 1.0f));
    }
}

