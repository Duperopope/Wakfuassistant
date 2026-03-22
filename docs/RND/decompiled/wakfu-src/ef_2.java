/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from EF
 */
public class ef_2 {
    private float ayH = 1.0f;
    private float ayI;
    private float ayJ;
    private float ayK = 1.0f;
    private float ayL;
    private float ayM;
    private boolean ayN = true;
    private boolean ayO = true;
    private float axp = 1.0f;
    private float axq = 1.0f;
    private float axr = 1.0f;
    private float ayP = 1.0f;
    private byte ayQ;

    public final void aIJ() {
        this.ayN = true;
        this.ayH = 1.0f;
        this.ayI = 0.0f;
        this.ayJ = 0.0f;
        this.ayK = 1.0f;
    }

    public final void a(float f2, float f3, float f4, float f5) {
        this.ayN = f2 == 1.0f && f3 == 0.0f && f4 == 0.0f && f5 == 1.0f;
        this.ayH = f2;
        this.ayI = f3;
        this.ayJ = f4;
        this.ayK = f5;
    }

    public final void a(float f2, float f3) {
        this.ayO = f2 == 0.0f && f3 == 0.0f;
        this.ayL = f2;
        this.ayM = f3;
    }

    public final boolean aIK() {
        return this.ayH != 1.0f || this.ayI != 0.0f || this.ayJ != 0.0f || this.ayK != 1.0f;
    }

    public final boolean aIL() {
        return this.ayL != 0.0f || this.ayM != 0.0f;
    }

    public float aIM() {
        return this.ayH;
    }

    public void c(float f2) {
        this.ayH = f2;
    }

    public float aIN() {
        return this.ayI;
    }

    public void d(float f2) {
        this.ayI = f2;
    }

    public float aIO() {
        return this.ayJ;
    }

    public void e(float f2) {
        this.ayJ = f2;
    }

    public float aIP() {
        return this.ayK;
    }

    public void f(float f2) {
        this.ayK = f2;
    }

    public float aIQ() {
        return this.ayL;
    }

    public void g(float f2) {
        this.ayL = f2;
    }

    public float aIR() {
        return this.ayM;
    }

    public void h(float f2) {
        this.ayM = f2;
    }

    public boolean aIS() {
        return this.ayN;
    }

    public void av(boolean bl) {
        this.ayN = bl;
    }

    public boolean aIT() {
        return this.ayO;
    }

    public void aw(boolean bl) {
        this.ayO = bl;
    }

    public float aIU() {
        return this.axp;
    }

    public void i(float f2) {
        this.axp = f2;
    }

    public float aIV() {
        return this.axq;
    }

    public void j(float f2) {
        this.axq = f2;
    }

    public float aIW() {
        return this.axr;
    }

    public void k(float f2) {
        this.axr = f2;
    }

    public float aIX() {
        return this.ayP;
    }

    public void setAlpha(float f2) {
        this.ayP = f2;
    }

    public byte aIY() {
        return this.ayQ;
    }

    public void h(byte by) {
        this.ayQ = by;
    }
}

