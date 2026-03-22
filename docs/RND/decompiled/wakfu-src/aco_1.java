/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCo
 */
public class aco_1 {
    public float aPY;
    public float aPZ;

    public aco_1() {
        this(0.0f, 0.0f);
    }

    public aco_1(aco_1 aco_12) {
        this(aco_12.aPY, aco_12.aPZ);
    }

    public aco_1(float[] fArray) {
        this(fArray[0], fArray[1]);
    }

    public aco_1(acb_1 acb_12, acb_1 acb_13) {
        this.aPY = acb_13.bWv() - acb_12.bWv();
        this.aPZ = acb_13.bWw() - acb_12.bWw();
    }

    public aco_1(float f2, float f3) {
        this.aPY = f2;
        this.aPZ = f3;
    }

    public aco_1(int n, int n2, int n3, int n4) {
        this.aPY = n3 - n;
        this.aPZ = n4 - n2;
    }

    public void Y(float[] fArray) {
        this.aPY = fArray[0];
        this.aPZ = fArray[1];
    }

    public void aS(float f2, float f3) {
        this.aPY = f2;
        this.aPZ = f3;
    }

    public void g(aco_1 aco_12) {
        this.aPY = aco_12.aPY;
        this.aPZ = aco_12.aPZ;
    }

    public float aSc() {
        return this.aPY;
    }

    public void ap(float f2) {
        this.aPY = f2;
    }

    public float aSd() {
        return this.aPZ;
    }

    public void aq(float f2) {
        this.aPZ = f2;
    }

    public aco_1 h(aco_1 aco_12) {
        return new aco_1(aco_12.aPY + this.aPY, aco_12.aPZ + this.aPZ);
    }

    public void i(aco_1 aco_12) {
        this.aPY += aco_12.aPY;
        this.aPZ += aco_12.aPZ;
    }

    public final float j(aco_1 aco_12) {
        float f2 = this.aPY - aco_12.aPY;
        float f3 = this.aPZ - aco_12.aPZ;
        return f2 * f2 + f3 * f3;
    }

    public aco_1 k(aco_1 aco_12) {
        return new aco_1(this.aPY - aco_12.aPY, this.aPZ - aco_12.aPZ);
    }

    public void l(aco_1 aco_12) {
        this.aPY -= aco_12.aPY;
        this.aPZ -= aco_12.aPZ;
    }

    public aco_1 m(aco_1 aco_12) {
        return new aco_1(this.aPY * aco_12.aPY + this.aPY * aco_12.aPZ, this.aPZ * aco_12.aPY + this.aPZ * aco_12.aPZ);
    }

    public aco_1 dx(float f2) {
        return new aco_1(f2 * this.aPY, f2 * this.aPZ);
    }

    public void dy(float f2) {
        this.aPY *= f2;
        this.aPZ *= f2;
    }

    public aco_1 dz(float f2) {
        return new aco_1((int)(f2 * this.aPY), (int)(f2 * this.aPZ));
    }

    public float n(aco_1 aco_12) {
        return this.aPY * aco_12.aPZ - aco_12.aPY * this.aPZ;
    }

    public float o(aco_1 aco_12) {
        return this.aPY * aco_12.aPY + this.aPZ * aco_12.aPZ;
    }

    public float bWU() {
        return aco_1.bn(this.aPY, this.aPZ);
    }

    public float bWV() {
        return aco_1.bm(this.aPY, this.aPZ);
    }

    public aco_1 bWW() {
        return this.dx(1.0f / this.bWV());
    }

    public void bWX() {
        float f2 = this.bWV();
        if (f2 == 0.0f) {
            f2 = 0.001f;
        }
        float f3 = 1.0f / f2;
        this.aPY *= f3;
        this.aPZ *= f3;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof aco_1)) {
            return false;
        }
        aco_1 aco_12 = (aco_1)object;
        return aco_12.aPY == this.aPY && aco_12.aPZ == this.aPZ;
    }

    public String toString() {
        return "V2 : [" + this.aPY + " ; " + this.aPZ + "]";
    }

    public int hashCode() {
        long l = 31L * (31L + (long)this.aPY) + (long)this.aPZ;
        return (int)(l ^ l >> 32);
    }

    public static float bm(float f2, float f3) {
        return GC.J(f2 * f2 + f3 * f3);
    }

    public static float bn(float f2, float f3) {
        return f2 * f2 + f3 * f3;
    }
}

