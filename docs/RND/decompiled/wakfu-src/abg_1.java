/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from aBG
 */
public class abg_1 {
    float dyZ = Float.MIN_VALUE;
    float dza = Float.MAX_VALUE;
    float dzb = Float.MIN_VALUE;
    float dzc = Float.MAX_VALUE;
    float dzd = Float.MIN_VALUE;
    float dze = Float.MAX_VALUE;

    public abg_1(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.c(f2, f3, f4, f5, f6, f7);
    }

    public abg_1() {
    }

    public static abg_1 bVE() {
        return new abg_1();
    }

    public final void c(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.dp(f2);
        this.do(f3);
        this.dr(f4);
        this.dq(f5);
        this.dt(f6);
        this.ds(f7);
    }

    public final float bVF() {
        return this.dza;
    }

    public final void do(float f2) {
        if (this.dyZ > f2) {
            this.dza = this.dyZ;
            this.dyZ = f2;
        } else {
            this.dza = f2;
        }
    }

    public final float bVG() {
        return this.dyZ;
    }

    public final void dp(float f2) {
        if (this.dza < f2) {
            this.dyZ = this.dza;
            this.dza = f2;
        } else {
            this.dyZ = f2;
        }
    }

    public final float bVH() {
        return this.dzc;
    }

    public final void dq(float f2) {
        if (this.dzb > f2) {
            this.dzc = this.dzb;
            this.dzb = f2;
        } else {
            this.dzc = f2;
        }
    }

    public final float bVI() {
        return this.dzb;
    }

    public final void dr(float f2) {
        if (this.dzc < f2) {
            this.dzb = this.dzc;
            this.dzc = f2;
        } else {
            this.dzb = f2;
        }
    }

    public final float bVJ() {
        return this.dze;
    }

    public final void ds(float f2) {
        if (this.dzd > f2) {
            this.dze = this.dzd;
            this.dzd = f2;
        } else {
            this.dze = f2;
        }
    }

    public final float bVK() {
        return this.dzd;
    }

    public final void dt(float f2) {
        if (this.dze < f2) {
            this.dzd = this.dze;
            this.dze = f2;
        } else {
            this.dzd = f2;
        }
    }

    public final boolean E(float f2, float f3, float f4) {
        return this.dyZ <= f2 && f2 <= this.dza && this.dzb <= f3 && f3 <= this.dzc && this.dzd <= f4 && f4 <= this.dze;
    }

    public final boolean b(abg_1 abg_12) {
        if (abg_12 == null) {
            return false;
        }
        return this.dyZ <= abg_12.bVF() && abg_12.bVG() <= this.dza && this.dzb <= abg_12.bVH() && abg_12.bVI() <= this.dzc && this.dzd <= abg_12.bVJ() && abg_12.bVK() <= this.dze;
    }

    public final boolean c(abg_1 abg_12) {
        return this.dyZ <= abg_12.bVG() && abg_12.bVF() <= this.dza && this.dzb <= abg_12.bVI() && abg_12.bVH() <= this.dzc && this.dzd <= abg_12.bVK() && abg_12.bVJ() <= this.dze;
    }

    public final float bVL() {
        return this.dza - this.dyZ;
    }

    public final float bVM() {
        return this.dzc - this.dyZ;
    }
}

