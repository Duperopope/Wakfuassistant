/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axV
 */
public class axv_1 {
    private int bap;
    private int baq;
    private int brs;
    private int brt;

    public axv_1(int n, int n2, int n3, int n4) {
        this.bap = n;
        this.baq = n2;
        this.brs = n3;
        this.brt = n4;
    }

    public final int bRB() {
        return this.bap;
    }

    public final void vm(int n) {
        this.bap = n;
    }

    public final int bRC() {
        return this.baq;
    }

    public final void vn(int n) {
        this.baq = n;
    }

    public final int bRD() {
        return this.brs;
    }

    public final void vo(int n) {
        this.brs = n;
    }

    public final int bRE() {
        return this.brt;
    }

    public final void vp(int n) {
        this.brt = n;
    }

    public final float bRF() {
        return (float)(this.bRD() - this.bRB()) * 0.5f;
    }

    public final float bRG() {
        return (float)(this.bRE() - this.bRC()) * 0.5f;
    }

    public final axv_1 bRH() {
        return new axv_1(this.bap, this.baq, this.brs, this.brt);
    }

    public final void w(int n, int n2, int n3, int n4) {
        this.bap = n;
        this.baq = n2;
        this.brs = n3;
        this.brt = n4;
    }

    public final boolean x(int n, int n2, int n3, int n4) {
        return this.bap == n && this.baq == n2 && this.brs == n3 && this.brt == n4;
    }
}

