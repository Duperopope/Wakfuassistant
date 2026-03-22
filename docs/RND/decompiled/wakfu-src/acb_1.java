/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCb
 */
public class acb_1 {
    public float aPY;
    public float aPZ;

    public acb_1() {
    }

    public acb_1(acb_1 acb_12) {
        this.b(acb_12);
    }

    public acb_1(float f2, float f3) {
        this.bj(f2, f3);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        acb_1 acb_12 = (acb_1)object;
        return this.aPY == acb_12.aPY && this.aPZ == acb_12.aPZ;
    }

    public final int hashCode() {
        long l = 31L * (31L + (long)this.aPY) + (long)this.aPZ;
        return (int)(l ^ l >> 32);
    }

    public String toString() {
        return "{Point2i : (" + this.aPY + ", " + this.aPZ + ") @" + Integer.toHexString(this.hashCode()) + "}";
    }

    public final boolean bi(float f2, float f3) {
        return this.aPY == f2 && this.aPZ == f3;
    }

    public final boolean a(acb_1 acb_12) {
        return this.aPY == acb_12.aPY && this.aPZ == acb_12.aPZ;
    }

    public final void bj(float f2, float f3) {
        this.aPY = f2;
        this.aPZ = f3;
    }

    public final void b(acb_1 acb_12) {
        this.aPY = acb_12.aPY;
        this.aPZ = acb_12.aPZ;
    }

    public final float bWv() {
        return this.aPY;
    }

    public final float bWw() {
        return this.aPZ;
    }

    public final void dv(float f2) {
        this.aPY = f2;
    }

    public final void dw(float f2) {
        this.aPZ = f2;
    }
}

