/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCh
 */
public final class ach_1
extends abf_1 {
    public ach_1() {
    }

    public ach_1(ach_1 ach_12) {
        super(ach_12);
    }

    public ach_1(float f2, float f3, float f4, float f5) {
        super(f2, f3, f4, f5);
    }

    public ach_1(acp_1 acp_12, float f2) {
        this.a(acp_12, f2);
    }

    public float bWC() {
        return (float)Math.sqrt(this.bVA() * this.bVA() + this.bVB() * this.bVB() + this.bVC() * this.bVC() + this.bVD() * this.bVD());
    }

    public void bjt() {
        assert (this.bWC() > 0.0f) : "Unable to normalize the quaternion since the norme is null";
        float f2 = this.bWC();
        this.aPY /= f2;
        this.aPZ /= f2;
        this.aQa /= f2;
        this.dyY /= f2;
    }

    public void bPx() {
        this.y(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public void a(acp_1 acp_12, float f2) {
        float f3 = f2 * 0.5f;
        float f4 = GC.E(f3);
        this.y(acp_12.aSc() * f4, acp_12.aSd() * f4, acp_12.aSe() * f4, GC.F(f3));
        this.bjt();
    }

    public void m(float f2, float f3, float f4) {
        ach_1 ach_12 = new ach_1(new acp_1(GC.E(f2 * 0.5f), 0.0f, 0.0f), GC.F(f2 * 0.5f));
        ach_1 ach_13 = new ach_1(new acp_1(0.0f, GC.E(f3 * 0.5f), 0.0f), GC.F(f3 * 0.5f));
        ach_1 ach_14 = new ach_1(new acp_1(0.0f, 0.0f, GC.E(f4 * 0.5f)), GC.F(f4 * 0.5f));
        this.a(ach_12.d(ach_13).d(ach_14));
    }

    public ach_1 bWD() {
        return new ach_1(-this.bVA(), -this.bVB(), -this.bVC(), this.bVD());
    }

    public ach_1 bWE() {
        ach_1 ach_12 = this.bWD();
        float f2 = ach_12.bVA() * ach_12.bVA() + ach_12.bVB() * ach_12.bVB() + ach_12.bVC() * ach_12.bVC() + ach_12.bVD() * ach_12.bVD();
        ach_12.aPY /= f2;
        ach_12.aPZ /= f2;
        ach_12.aQa /= f2;
        ach_12.dyY /= f2;
        return ach_12;
    }

    public ach_1 d(ach_1 ach_12) {
        return new ach_1(this.bVD() * ach_12.bVA() + this.bVA() * ach_12.bVD() + this.bVB() * ach_12.bVC() - this.bVC() * ach_12.bVB(), this.bVD() * ach_12.bVB() + this.bVB() * ach_12.bVD() + this.bVC() * ach_12.bVA() - this.bVA() * ach_12.bVC(), this.bVD() * ach_12.bVC() + this.bVC() * ach_12.bVD() + this.bVA() * ach_12.bVB() - this.bVB() * ach_12.bVA(), this.bVD() * ach_12.bVD() - this.bVA() * ach_12.bVA() - this.bVB() * ach_12.bVB() - this.bVC() * ach_12.bVC());
    }

    public ach_1 e(ach_1 ach_12) {
        return this.d(ach_12.bWE());
    }

    public void f(ach_1 ach_12) {
        this.a(this.d(ach_12));
    }

    public void g(ach_1 ach_12) {
        this.a(this.e(ach_12));
    }

    public void a(ach_1 ach_12, ach_1 ach_13, float f2) {
        float f3 = ach_12.bVA() * ach_13.bVA() + ach_12.bVB() * ach_13.bVB() + ach_12.bVC() * ach_13.bVC() + ach_12.bVD() * ach_13.bVD();
        if (1.0f + f3 > 1.0E-5f) {
            float f4;
            float f5;
            if (1.0f - f3 > 1.0E-5f) {
                float f6 = GC.I(f3);
                float f7 = GC.E(f6);
                f5 = GC.E((1.0f - f2) * f6) / f7;
                f4 = GC.E(f2 * f6) / f7;
            } else {
                f5 = 1.0f - f2;
                f4 = f2;
            }
            this.y(f5 * ach_12.bVA() + f4 * ach_13.bVA(), f5 * ach_12.bVB() + f4 * ach_13.bVB(), f5 * ach_12.bVC() + f4 * ach_13.bVC(), f5 * ach_12.bVD() + f4 * ach_13.bVD());
        } else {
            float f8 = GC.E((1.0f - f2) * 1.5707964f);
            float f9 = GC.E(f2 * 1.5707964f);
            this.y(f8 * ach_12.bVA() - f9 * ach_13.bVB(), f8 * ach_12.bVB() + f9 * ach_13.bVA(), f8 * ach_12.bVC() - f9 * ach_13.bVD(), f8 * ach_12.bVD() + f9 * ach_13.bVC());
        }
    }
}

