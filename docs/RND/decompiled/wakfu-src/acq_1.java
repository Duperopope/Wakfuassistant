/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCq
 */
public class acq_1 {
    private int bap;
    private int baq;
    private int crE;

    public acq_1() {
        this(0, 0, 0);
    }

    public acq_1(acq_1 acq_12) {
        this(acq_12.bap, acq_12.baq, acq_12.crE);
    }

    public acq_1(int[] nArray) {
        this(nArray[0], nArray[1], nArray[2]);
    }

    public acq_1(acd_1 acd_12, acd_1 acd_13) {
        this.bap = acd_13.getX() - acd_12.getX();
        this.baq = acd_13.getY() - acd_12.getY();
        this.crE = acd_13.bdi() - acd_12.bdi();
    }

    public acq_1(int n, int n2, int n3) {
        this.bap = n;
        this.baq = n2;
        this.crE = n3;
    }

    public acq_1(int n, int n2, int n3, int n4, int n5, int n6) {
        this.bap = n4 - n;
        this.baq = n5 - n2;
        this.crE = n6 - n3;
    }

    public void u(int[] nArray) {
        this.bap = nArray[0];
        this.baq = nArray[1];
        this.crE = nArray[2];
    }

    public int getX() {
        return this.bap;
    }

    public void setX(int n) {
        this.bap = n;
    }

    public int getY() {
        return this.baq;
    }

    public void setY(int n) {
        this.baq = n;
    }

    public int NN() {
        return this.crE;
    }

    public void wV(int n) {
        this.crE = n;
    }

    public acq_1 b(acq_1 acq_12) {
        return new acq_1(acq_12.bap + this.bap, acq_12.baq + this.baq, acq_12.crE + this.crE);
    }

    public acq_1 c(acq_1 acq_12) {
        return new acq_1(this.bap - acq_12.bap, this.baq - acq_12.baq, this.crE - acq_12.crE);
    }

    public acq_1 d(acq_1 acq_12) {
        return new acq_1(this.bap * acq_12.bap + this.bap * acq_12.baq + this.bap * acq_12.crE, this.baq * acq_12.bap + this.baq * acq_12.baq + this.baq * acq_12.crE, this.crE * acq_12.bap + this.crE * acq_12.baq + this.crE * acq_12.crE);
    }

    public acq_1 wW(int n) {
        return new acq_1(n * this.bap, n * this.baq, n * this.crE);
    }

    public acq_1 dE(float f2) {
        return new acq_1((int)(f2 * (float)this.bap), (int)(f2 * (float)this.baq), (int)(f2 * (float)this.crE));
    }

    public float e(acq_1 acq_12) {
        return this.bap * acq_12.baq + this.baq * acq_12.crE + this.crE * acq_12.bap - acq_12.bap * this.baq - acq_12.baq * this.crE - acq_12.crE * this.bap;
    }

    public float a(acq_1 acq_12) {
        return this.bap * acq_12.bap + this.baq * acq_12.baq + this.crE * acq_12.crE;
    }

    public int bXd() {
        return this.bap * this.bap + this.baq * this.baq + this.crE * this.crE;
    }

    public int bXe() {
        int n = this.bap * this.bap + this.baq * this.baq + this.crE * this.crE;
        return GC.mU(n);
    }

    public acq_1 bXf() {
        int n = this.bXe();
        return this.wW(1 / n);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof acq_1)) {
            return false;
        }
        acq_1 acq_12 = (acq_1)object;
        return acq_12.bap == this.bap && acq_12.baq == this.baq && acq_12.crE == this.crE;
    }

    public String toString() {
        return "[" + this.bap + " ; " + this.baq + " ; " + this.crE + "]";
    }

    public static abi_1 bo(float f2, float f3) {
        return acp_1.bo(f2, f3);
    }

    public abi_1 bXa() {
        return acp_1.bo(this.bap, this.baq);
    }

    public static abi_1 bp(float f2, float f3) {
        return acp_1.bp(f2, f3);
    }

    public abi_1 bXb() {
        return acp_1.bp(this.bap, this.baq);
    }

    public abi_1 f(abi_1 abi_12) {
        int n = this.bap + this.baq;
        int n2 = this.bap - this.baq;
        int n3 = abi_12.dzz;
        int n4 = abi_12.dzA;
        if (n == 0) {
            n = n3 + n4;
        }
        if (n2 == 0) {
            n2 = n3 - n4;
        }
        if (n > 0) {
            if (n2 > 0) {
                return abi_1.dzk;
            }
            return abi_1.dzm;
        }
        if (n2 > 0) {
            return abi_1.dzq;
        }
        return abi_1.dzo;
    }

    public abi_1 g(abi_1 abi_12) {
        if (this.bap == 0 && this.baq == 0) {
            return abi_1.wG(abi_12.dzy);
        }
        return this.bXb();
    }

    public int hashCode() {
        assert (false) : "Il n'est pas pr\u00e9vu que ces objets comparables servent de clef dans une HashTable/HashMap.";
        return super.hashCode();
    }
}

