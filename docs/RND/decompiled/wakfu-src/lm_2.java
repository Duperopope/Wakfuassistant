/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Lm
 */
public class lm_2 {
    private short aPm;
    private short aPn;
    private short aPo;
    private short aPp;
    private short[] aPq;
    private int aPr;
    private short[] aPs;

    public String toString() {
        return "Dur\u00e9e: " + this.aPr + "ms  images: " + this.aPs.length;
    }

    public short aRu() {
        return this.aPm;
    }

    public void z(short s) {
        this.aPm = s;
    }

    public short aRv() {
        return this.aPn;
    }

    public void A(short s) {
        this.aPn = s;
    }

    public short aRw() {
        return this.aPo;
    }

    public void B(short s) {
        this.aPo = s;
    }

    public short aRx() {
        return this.aPp;
    }

    public void C(short s) {
        this.aPp = s;
    }

    public short[] aRy() {
        return this.aPq;
    }

    public void h(short[] sArray) {
        this.aPq = sArray;
    }

    public int aRz() {
        return this.aPr;
    }

    public void no(int n) {
        this.aPr = n;
    }

    public short[] aRA() {
        return this.aPs;
    }

    public void i(short[] sArray) {
        this.aPs = sArray;
    }
}

