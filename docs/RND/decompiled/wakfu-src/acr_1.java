/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCr
 */
public final class acr_1
extends abf_1 {
    public acr_1() {
    }

    public acr_1(acr_1 acr_12) {
        super(acr_12);
    }

    public acr_1(float f2, float f3, float f4) {
        this.m(f2, f3, f4);
    }

    public acr_1(float f2, float f3, float f4, float f5) {
        super(f2, f3, f4, f5);
    }

    public void m(float f2, float f3, float f4) {
        this.aPY = f2;
        this.aPZ = f3;
        this.aQa = f4;
    }

    public float bXg() {
        return this.bVA() * this.bVA() + this.bVB() * this.bVB() + this.bVC() * this.bVC();
    }

    public float bXh() {
        return this.bXg() + this.bVD() * this.bVD();
    }

    public float bWC() {
        return (float)Math.sqrt(this.bXg());
    }

    public float bXi() {
        return (float)Math.sqrt(this.bXh());
    }

    public float bXj() {
        float f2 = this.bWC();
        if (f2 != 0.0f) {
            float f3 = 1.0f / f2;
            this.aPY *= f3;
            this.aPZ *= f3;
            this.aQa *= f3;
            this.dyY *= f3;
        }
        return f2;
    }

    public float j(acr_1 acr_12) {
        return this.bVA() * acr_12.bVA() + this.bVB() * acr_12.bVB() + this.bVC() * acr_12.bVC();
    }

    public void c(acr_1 acr_12, acr_1 acr_13) {
        this.y(acr_12.bVB() * acr_13.bVC() - acr_12.bVC() * acr_13.bVB(), acr_12.bVC() * acr_13.bVA() - acr_12.bVA() * acr_13.bVC(), acr_12.bVA() * acr_13.bVB() - acr_12.bVB() * acr_13.bVA(), 0.0f);
    }

    public acr_1 dF(float f2) {
        return new acr_1(this.bVA() * f2, this.bVB() * f2, this.bVC() * f2, this.bVD() * f2);
    }

    public acr_1 dG(float f2) {
        assert (f2 != 0.0f);
        return new acr_1(this.bVA() / f2, this.bVB() / f2, this.bVC() / f2, this.bVD() / f2);
    }

    public acr_1 k(acr_1 acr_12) {
        return new acr_1(this.bVA() + acr_12.bVA(), this.bVB() + acr_12.bVB(), this.bVC() + acr_12.bVC(), this.bVD() + acr_12.bVD());
    }

    public acr_1 l(acr_1 acr_12) {
        return new acr_1(this.bVA() - acr_12.bVA(), this.bVB() - acr_12.bVB(), this.bVC() - acr_12.bVC(), this.bVD() - acr_12.bVD());
    }

    public acr_1 bXk() {
        return new acr_1(-this.bVA(), -this.bVB(), -this.bVC(), -this.bVD());
    }

    public void du(float f2) {
        this.y(this.bVA() * f2, this.bVB() * f2, this.bVC() * f2, this.bVD() * f2);
    }

    public void dH(float f2) {
        assert (f2 != 0.0f);
        this.y(this.bVA() / f2, this.bVB() / f2, this.bVC() / f2, this.bVD() / f2);
    }

    public void m(acr_1 acr_12) {
        this.y(acr_12.bVA(), acr_12.bVB(), acr_12.bVC(), acr_12.bVD());
    }

    public void z(float f2, float f3, float f4, float f5) {
        this.y(this.bVA() + f2, this.bVB() + f3, this.bVC() + f4, this.bVD() + f5);
    }

    public void n(acr_1 acr_12) {
        this.y(this.bVA() - acr_12.bVA(), this.bVB() - acr_12.bVB(), this.bVC() - acr_12.bVC(), this.bVD() - acr_12.bVD());
    }

    public void a(float f2, acr_1 acr_12) {
        this.y(this.bVA() + f2 * acr_12.bVA(), this.bVB() + f2 * acr_12.bVB(), this.bVC() + f2 * acr_12.bVC(), this.bVD() + f2 * acr_12.bVD());
    }

    public String toString() {
        return "V4{x=" + this.aPY + ", y=" + this.aPZ + ", z=" + this.aQa + ", w=" + this.dyY + "}";
    }
}

