/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Km
 */
public class km_1
implements ki_1 {
    protected int aLs;
    protected final float[] aLt = new float[]{64.0f, 64.0f};
    protected final float[] aLu = new float[]{64.0f, 64.0f};
    protected final float[] aLv = new float[]{1.0f, 1.0f};
    protected final float[] aLw = new float[2];
    protected final float[] aLx = new float[]{1.0f, 1.0f};
    protected final float[] aLy = new float[2];
    protected boolean aLz;
    protected final float[] aLA = new float[2];
    protected final float[] aLB = new float[2];
    protected final float[] aLC = new float[]{1.0f, 1.0f};
    protected final float[] aLD = new float[2];
    protected final float[] aLE = new float[]{1.0f, 1.0f};
    protected final float[] aLF = new float[2];
    protected final float[] aLG = new float[]{1.0f, 1.0f};
    protected final float[] aLH = new float[2];
    protected final float[] aLI = new float[]{1.0f, 1.0f};
    protected final float[] aLJ = new float[2];
    protected final float[] aLK = new float[2];
    protected final float[] aLL = new float[2];
    protected final float[] aLM = new float[2];
    protected float aLN;
    protected float aLO;
    protected float aLP;
    protected float aLQ;
    protected int aLR;
    protected int aLS;

    public int aPA() {
        return this.aLs;
    }

    public void nh(int n) {
        this.aLs = n;
    }

    public float[] aPB() {
        return this.aLt;
    }

    public void k(float f2, float f3) {
        this.aLt[0] = f2;
        this.aLt[1] = f3;
    }

    public float[] aPC() {
        return this.aLu;
    }

    public void l(float f2, float f3) {
        this.aLu[0] = f2;
        this.aLu[1] = f3;
    }

    public float[] aPD() {
        return this.aLv;
    }

    public void m(float f2, float f3) {
        this.aLv[0] = f2;
        this.aLv[1] = f3;
    }

    public float[] aPE() {
        return this.aLw;
    }

    public void n(float f2, float f3) {
        this.aLw[0] = f2;
        this.aLw[1] = f3;
    }

    public float[] aPF() {
        return this.aLx;
    }

    public void o(float f2, float f3) {
        this.aLx[0] = f2;
        this.aLx[1] = f3;
    }

    public float[] aPG() {
        return this.aLy;
    }

    public void p(float f2, float f3) {
        this.aLy[0] = f2;
        this.aLy[1] = f3;
    }

    public boolean aPH() {
        return this.aLz;
    }

    public void aB(boolean bl) {
        this.aLz = bl;
    }

    public float[] aPI() {
        return this.aLA;
    }

    public void q(float f2, float f3) {
        this.aLA[0] = f2;
        this.aLA[1] = f3;
    }

    public float[] aPJ() {
        return this.aLB;
    }

    public void r(float f2, float f3) {
        this.aLB[0] = f2;
        this.aLB[1] = f3;
    }

    public float[] aPK() {
        return this.aLC;
    }

    public void s(float f2, float f3) {
        this.aLC[0] = f2;
        this.aLC[1] = f3;
    }

    public float[] aPL() {
        return this.aLD;
    }

    public void t(float f2, float f3) {
        this.aLD[0] = f2;
        this.aLD[1] = f3;
    }

    public float[] aPM() {
        return this.aLE;
    }

    public void u(float f2, float f3) {
        this.aLE[0] = f2;
        this.aLE[1] = f3;
    }

    public float[] aPN() {
        return this.aLF;
    }

    public void v(float f2, float f3) {
        this.aLF[0] = f2;
        this.aLF[1] = f3;
    }

    public float[] aPO() {
        return this.aLG;
    }

    public void w(float f2, float f3) {
        this.aLG[0] = f2;
        this.aLG[1] = f3;
    }

    public float[] aPP() {
        return this.aLH;
    }

    public void x(float f2, float f3) {
        this.aLH[0] = f2;
        this.aLH[1] = f3;
    }

    public float[] aPQ() {
        return this.aLI;
    }

    public void y(float f2, float f3) {
        this.aLI[0] = f2;
        this.aLI[1] = f3;
    }

    public float[] aPR() {
        return this.aLJ;
    }

    public void z(float f2, float f3) {
        this.aLJ[0] = f2;
        this.aLJ[1] = f3;
    }

    public float[] aPS() {
        return this.aLK;
    }

    public void A(float f2, float f3) {
        this.aLK[0] = f2;
        this.aLK[1] = f3;
    }

    public float[] aPT() {
        return this.aLL;
    }

    public void B(float f2, float f3) {
        this.aLL[0] = f2;
        this.aLL[1] = f3;
    }

    public float[] aPU() {
        return this.aLM;
    }

    public void C(float f2, float f3) {
        this.aLM[0] = f2;
        this.aLM[1] = f3;
    }

    public float aPV() {
        return this.aLN;
    }

    public void O(float f2) {
        this.aLN = f2;
    }

    public float aPW() {
        return this.aLO;
    }

    public void P(float f2) {
        this.aLO = f2;
    }

    public float aPX() {
        return this.aLP;
    }

    public void Q(float f2) {
        this.aLP = f2;
    }

    public float aPY() {
        return this.aLQ;
    }

    public void R(float f2) {
        this.aLQ = f2;
    }

    public int aPZ() {
        return this.aLR;
    }

    public void ni(int n) {
        this.aLR = n;
    }

    public int aQa() {
        return this.aLS;
    }

    public void nj(int n) {
        this.aLS = n;
    }

    public String toString() {
        return "Bitmap{m_bitmapId=" + this.aLs + ", m_hotX=" + Arrays.toString(this.aLt) + ", m_hotY=" + Arrays.toString(this.aLu) + ", m_scaleX=" + Arrays.toString(this.aLv) + ", m_scaleRandomX=" + Arrays.toString(this.aLw) + ", m_scaleY=" + Arrays.toString(this.aLx) + ", m_scaleRandomY=" + Arrays.toString(this.aLy) + ", m_scaleRandomKeepRatio=" + this.aLz + ", m_rotation=" + Arrays.toString(this.aLA) + ", m_rotationRandom=" + Arrays.toString(this.aLB) + ", m_redColor=" + Arrays.toString(this.aLC) + ", m_redColorRandom=" + Arrays.toString(this.aLD) + ", m_greenColor=" + Arrays.toString(this.aLE) + ", m_greenColorRandom=" + Arrays.toString(this.aLF) + ", m_blueColor=" + Arrays.toString(this.aLG) + ", m_blueColorRandom=" + Arrays.toString(this.aLH) + ", m_alphaColor=" + Arrays.toString(this.aLI) + ", m_alphaColorRandom=" + Arrays.toString(this.aLJ) + ", m_rotationX=" + Arrays.toString(this.aLK) + ", m_rotationY=" + Arrays.toString(this.aLL) + ", m_rotationZ=" + Arrays.toString(this.aLM) + ", m_textureTop=" + this.aLN + ", m_textureLeft=" + this.aLO + ", m_textureBottom=" + this.aLP + ", m_textureRight=" + this.aLQ + ", m_halfHeight=" + this.aLR + ", m_halfWidth=" + this.aLS + "}";
    }
}

