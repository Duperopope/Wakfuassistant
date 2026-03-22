/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCp
 */
public class acp_1 {
    private static final float dAN = (float)Math.PI;
    private static final float dAO = 0.3926991f;
    private static final float dAP = 1.1780972f;
    private static final float dAQ = 1.9634955f;
    private static final float dAR = 2.7488937f;
    private static final float dAS = 0.7853982f;
    private static final float dAT = 2.3561945f;
    public float aPY;
    public float aPZ;
    public float aQa;
    public static final acp_1 dAU = new acp_1(1.0f, 0.0f, 0.0f);
    public static final acp_1 dAV = new acp_1(0.0f, 1.0f, 0.0f);
    public static final acp_1 dAW = new acp_1(0.0f, 0.0f, 1.0f);
    public static final acp_1 dAX = new acp_1();

    public acp_1() {
        this(0.0f, 0.0f, 0.0f);
    }

    public acp_1(acp_1 acp_12) {
        this(acp_12.aPY, acp_12.aPZ, acp_12.aQa);
    }

    public acp_1(acd_1 acd_12, acd_1 acd_13) {
        this(acd_13.getX() - acd_12.getX(), acd_13.getY() - acd_12.getY(), acd_13.bdi() - acd_12.bdi());
    }

    public acp_1(float[] fArray) {
        this(fArray[0], fArray[1], fArray[2]);
    }

    public acp_1(int[] nArray) {
        this(nArray[0], nArray[1], nArray[2]);
    }

    public acp_1(float f2, float f3, float f4) {
        this.aPY = f2;
        this.aPZ = f3;
        this.aQa = f4;
    }

    public acp_1(int n, int n2, short s, int n3, int n4, short s2) {
        this.aPY = n3 - n;
        this.aPZ = n4 - n2;
        this.aQa = s2 - s;
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

    public float aSe() {
        return this.aQa;
    }

    public void ar(float f2) {
        this.aQa = f2;
    }

    public void m(float f2, float f3, float f4) {
        this.aPY = f2;
        this.aPZ = f3;
        this.aQa = f4;
    }

    public void u(int[] nArray) {
        this.aPY = nArray[0];
        this.aPZ = nArray[1];
        this.aQa = nArray[2];
    }

    public void g(acp_1 acp_12) {
        if (acp_12 == null) {
            return;
        }
        this.aPY = acp_12.aPY;
        this.aPZ = acp_12.aPZ;
        this.aQa = acp_12.aQa;
    }

    public void h(acp_1 acp_12) {
        if (acp_12 == null) {
            return;
        }
        this.aPY += acp_12.aPY;
        this.aPZ += acp_12.aPZ;
        this.aQa += acp_12.aQa;
    }

    public void i(acp_1 acp_12) {
        if (acp_12 == null) {
            return;
        }
        this.aPY -= acp_12.aPY;
        this.aPZ -= acp_12.aPZ;
        this.aQa -= acp_12.aQa;
    }

    public void K(double d2) {
        this.aPY = (float)((double)this.aPY * d2);
        this.aPZ = (float)((double)this.aPZ * d2);
        this.aQa = (float)((double)this.aQa * d2);
    }

    public boolean G(float f2, float f3, float f4) {
        boolean bl = this.dA(f2);
        boolean bl2 = this.dB(f3);
        boolean bl3 = this.dC(f4);
        return bl || bl2 || bl3;
    }

    public boolean dA(float f2) {
        if (-f2 <= this.aPY && this.aPY <= f2) {
            return false;
        }
        float f3 = Math.abs(f2);
        float f4 = Math.abs(this.aPY);
        this.aQa = this.aQa * f3 / f4;
        this.aPZ = this.aPZ * f3 / f4;
        this.aPY = this.aPY > f2 ? f2 : -f2;
        return true;
    }

    public boolean dB(float f2) {
        if (-f2 <= this.aPZ && this.aPZ <= f2) {
            return false;
        }
        float f3 = Math.abs(f2);
        float f4 = Math.abs(this.aPZ);
        this.aQa = this.aQa * f3 / f4;
        this.aPY = this.aPY * f3 / f4;
        this.aPZ = this.aPZ > f2 ? f2 : -f2;
        return true;
    }

    public boolean dC(float f2) {
        if (-f2 <= this.aQa && this.aQa <= f2) {
            return false;
        }
        float f3 = Math.abs(f2);
        float f4 = Math.abs(this.aQa);
        this.aPZ = this.aPZ * f3 / f4;
        this.aPY = this.aPY * f3 / f4;
        this.aQa = this.aQa > f2 ? f2 : -f2;
        return true;
    }

    public acp_1 j(acp_1 acp_12) {
        return new acp_1(acp_12.aPY + this.aPY, acp_12.aPZ + this.aPZ, acp_12.aQa + this.aQa);
    }

    public acp_1 k(acp_1 acp_12) {
        return new acp_1(this.aPY - acp_12.aPY, this.aPZ - acp_12.aPZ, this.aQa - acp_12.aQa);
    }

    public acp_1 l(acp_1 acp_12) {
        return new acp_1(this.aPY * acp_12.aPY + this.aPY * acp_12.aPZ + this.aPY * acp_12.aQa, this.aPZ * acp_12.aPY + this.aPZ * acp_12.aPZ + this.aPZ * acp_12.aQa, this.aQa * acp_12.aPY + this.aQa * acp_12.aPZ + this.aQa * acp_12.aQa);
    }

    public acp_1 dD(float f2) {
        return new acp_1(f2 * this.aPY, f2 * this.aPZ, f2 * this.aQa);
    }

    public float m(acp_1 acp_12) {
        return this.aPY * acp_12.aPY + this.aPZ * acp_12.aPZ + this.aQa * acp_12.aQa;
    }

    public float a(acq_1 acq_12) {
        return this.aPY * (float)acq_12.getX() + this.aPZ * (float)acq_12.getY() + this.aQa * (float)acq_12.NN();
    }

    public float n(acp_1 acp_12) {
        return this.aPY * acp_12.aPZ + this.aPZ * acp_12.aQa + this.aQa * acp_12.aPY - acp_12.aPY * this.aPZ - acp_12.aPZ * this.aQa - acp_12.aQa * this.aPY;
    }

    public float bWU() {
        return this.aPY * this.aPY + this.aPZ * this.aPZ + this.aQa * this.aQa;
    }

    public float bWV() {
        return (float)Math.sqrt(this.aPY * this.aPY + this.aPZ * this.aPZ + this.aQa * this.aQa);
    }

    public float bWY() {
        return aco_1.bm(this.aPY, this.aPZ);
    }

    public acp_1 bWZ() {
        float f2 = this.bWV();
        if (f2 == 0.0f) {
            return new acp_1(this.aPY, this.aPZ, this.aQa);
        }
        return this.dD(1.0f / f2);
    }

    public void bWX() {
        float f2 = this.bWV();
        if (f2 == 0.0f) {
            return;
        }
        this.K(1.0f / f2);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof acp_1)) {
            return false;
        }
        acp_1 acp_12 = (acp_1)object;
        return acp_12.aPY == this.aPY && acp_12.aPZ == this.aPZ && acp_12.aQa == this.aQa;
    }

    public String toString() {
        return "[" + this.aPY + " ; " + this.aPZ + " ; " + this.aQa + "]";
    }

    public static abi_1 bo(float f2, float f3) {
        float f4 = -((float)Math.atan2(f3, f2));
        abi_1 abi_12 = f4 < 2.7488937f && f4 >= 1.9634955f ? abi_1.dzp : (f4 < 1.9634955f && f4 >= 1.1780972f ? abi_1.dzq : (f4 < 1.1780972f && f4 >= 0.3926991f ? abi_1.dzj : (f4 < 0.3926991f && f4 >= -0.3926991f ? abi_1.dzk : (f4 < -0.3926991f && f4 >= -1.1780972f ? abi_1.dzl : (f4 < -1.1780972f && f4 >= -1.9634955f ? abi_1.dzm : (f4 < -1.9634955f && f4 >= -2.7488937f ? abi_1.dzn : abi_1.dzo))))));
        return abi_12;
    }

    public abi_1 bXa() {
        return acp_1.bo(this.aPY, this.aPZ);
    }

    public static abi_1 bp(float f2, float f3) {
        if (f2 == 0.0f && f3 == 0.0f) {
            return abi_1.dzt;
        }
        float f4 = -((float)Math.atan2(f3, f2));
        abi_1 abi_12 = f4 < 2.3561945f && f4 >= 0.7853982f ? abi_1.dzq : (f4 < 0.7853982f && f4 >= -0.7853982f ? abi_1.dzk : (f4 < -0.7853982f && f4 >= -2.3561945f ? abi_1.dzm : abi_1.dzo));
        return abi_12;
    }

    public abi_1 bXb() {
        return acp_1.bp(this.aPY, this.aPZ);
    }

    public acp_1 bXc() {
        return new acp_1(-this.aPY, -this.aPZ, -this.aQa);
    }

    public int hashCode() {
        assert (false) : "Il n'est pas pr\u00e9vu que ces objets comparables servent de clef dans une HashTable/HashMap.";
        return super.hashCode();
    }
}

