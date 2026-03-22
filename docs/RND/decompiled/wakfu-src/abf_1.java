/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBF
 */
public class abf_1 {
    public float aPY;
    public float aPZ;
    public float aQa;
    public float dyY;

    public abf_1() {
    }

    public abf_1(abf_1 abf_12) {
        this.b(abf_12);
    }

    public abf_1(float f2, float f3, float f4, float f5) {
        this.y(f2, f3, f4, f5);
    }

    public final void y(float f2, float f3, float f4, float f5) {
        this.aPY = f2;
        this.aPZ = f3;
        this.aQa = f4;
        this.dyY = f5;
    }

    public final void a(abf_1 abf_12) {
        this.b(abf_12);
    }

    public final void dk(float f2) {
        this.aPY = f2;
    }

    public final void dl(float f2) {
        this.aPZ = f2;
    }

    public final void dm(float f2) {
        this.aQa = f2;
    }

    public final void dn(float f2) {
        this.dyY = f2;
    }

    public final void b(abf_1 abf_12) {
        this.aPY = abf_12.aPY;
        this.aPZ = abf_12.aPZ;
        this.aQa = abf_12.aQa;
        this.dyY = abf_12.dyY;
    }

    public final float bVA() {
        return this.aPY;
    }

    public final float bVB() {
        return this.aPZ;
    }

    public final float bVC() {
        return this.aQa;
    }

    public final float bVD() {
        return this.dyY;
    }

    public final boolean c(abf_1 abf_12) {
        return GC.e(this.aPY, abf_12.aPY) && GC.e(this.aPZ, abf_12.aPZ) && GC.e(this.aQa, abf_12.aQa) && GC.e(this.dyY, abf_12.dyY);
    }
}

