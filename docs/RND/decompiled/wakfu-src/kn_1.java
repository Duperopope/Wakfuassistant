/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Kn
 */
public class kn_1
implements ki_1 {
    protected int aLs;
    protected final float[] aLT = new float[]{64.0f, 64.0f};
    protected final float[] aLU = new float[]{64.0f, 64.0f};
    protected final float[] aLV = new float[]{1.0f, 1.0f};
    protected final float[] aLW = new float[2];
    protected final float[] aLX = new float[]{1.0f, 1.0f};
    protected final float[] aLY = new float[2];
    protected boolean aLz;
    protected final float[] aLZ = new float[2];
    protected final float[] aMa = new float[2];
    protected final float[] aMb = new float[]{1.0f, 1.0f};
    protected final float[] aMc = new float[2];
    protected final float[] aMd = new float[]{1.0f, 1.0f};
    protected final float[] aMe = new float[2];
    protected final float[] aMf = new float[]{1.0f, 1.0f};
    protected final float[] aMg = new float[2];
    protected final float[] aMh = new float[]{1.0f, 1.0f};
    protected final float[] aMi = new float[2];
    protected final float[] aMj = new float[2];
    protected final float[] aMk = new float[2];
    protected final float[] aMl = new float[2];
    protected float aLN;
    protected float aLO;
    protected float aLP;
    protected float aLQ;
    protected int aLR;
    protected int aLS;
    private final int[] aMm = new int[]{-1, -1};
    private final float[] aMn = new float[]{1.0f, 1.0f};

    public int aPA() {
        return this.aLs;
    }

    public void nh(int n) {
        this.aLs = n;
    }

    public float[] aPB() {
        return this.aLT;
    }

    public void k(float f2, float f3) {
        this.aLT[0] = f2;
        this.aLT[1] = f3;
    }

    public float[] aPC() {
        return this.aLU;
    }

    public void l(float f2, float f3) {
        this.aLU[0] = f2;
        this.aLU[1] = f3;
    }

    public float[] aPD() {
        return this.aLV;
    }

    public void m(float f2, float f3) {
        this.aLV[0] = f2;
        this.aLV[1] = f3;
    }

    public float[] aPE() {
        return this.aLW;
    }

    public void n(float f2, float f3) {
        this.aLW[0] = f2;
        this.aLW[1] = f3;
    }

    public float[] aPF() {
        return this.aLX;
    }

    public void o(float f2, float f3) {
        this.aLX[0] = f2;
        this.aLX[1] = f3;
    }

    public float[] aPG() {
        return this.aLY;
    }

    public void p(float f2, float f3) {
        this.aLY[0] = f2;
        this.aLY[1] = f3;
    }

    public boolean aPH() {
        return this.aLz;
    }

    public void aB(boolean bl) {
        this.aLz = bl;
    }

    public float[] aPI() {
        return this.aLZ;
    }

    public void q(float f2, float f3) {
        this.aLZ[0] = f2;
        this.aLZ[1] = f3;
    }

    public float[] aPJ() {
        return this.aMa;
    }

    public void r(float f2, float f3) {
        this.aMa[0] = f2;
        this.aMa[1] = f3;
    }

    public float[] aPK() {
        return this.aMb;
    }

    public void s(float f2, float f3) {
        this.aMb[0] = f2;
        this.aMb[1] = f3;
    }

    public float[] aPL() {
        return this.aMc;
    }

    public void t(float f2, float f3) {
        this.aMc[0] = f2;
        this.aMc[1] = f3;
    }

    public float[] aPM() {
        return this.aMd;
    }

    public void u(float f2, float f3) {
        this.aMd[0] = f2;
        this.aMd[1] = f3;
    }

    public float[] aPN() {
        return this.aMe;
    }

    public void v(float f2, float f3) {
        this.aMe[0] = f2;
        this.aMe[1] = f3;
    }

    public float[] aPO() {
        return this.aMf;
    }

    public void w(float f2, float f3) {
        this.aMf[0] = f2;
        this.aMf[1] = f3;
    }

    public float[] aPP() {
        return this.aMg;
    }

    public void x(float f2, float f3) {
        this.aMg[0] = f2;
        this.aMg[1] = f3;
    }

    public float[] aPQ() {
        return this.aMh;
    }

    public void y(float f2, float f3) {
        this.aMh[0] = f2;
        this.aMh[1] = f3;
    }

    public float[] aPR() {
        return this.aMi;
    }

    public void z(float f2, float f3) {
        this.aMi[0] = f2;
        this.aMi[1] = f3;
    }

    public float[] aPS() {
        return this.aMj;
    }

    public void A(float f2, float f3) {
        this.aMj[0] = f2;
        this.aMj[1] = f3;
    }

    public float[] aPT() {
        return this.aMk;
    }

    public void B(float f2, float f3) {
        this.aMk[0] = f2;
        this.aMk[1] = f3;
    }

    public float[] aPU() {
        return this.aMl;
    }

    public void C(float f2, float f3) {
        this.aMl[0] = f2;
        this.aMl[1] = f3;
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

    public int[] aQb() {
        return this.aMm;
    }

    public void v(int n, int n2) {
        this.aMm[0] = n;
        this.aMm[1] = n2;
    }

    public float[] aQc() {
        return this.aMn;
    }

    public void D(float f2, float f3) {
        this.aMn[0] = f2;
        this.aMn[1] = f3;
    }

    public String toString() {
        return "Bitmap{m_bitmapId=" + this.aLs + ", m_hotX=" + Arrays.toString(this.aLT) + ", m_hotY=" + Arrays.toString(this.aLU) + ", m_scaleX=" + Arrays.toString(this.aLV) + ", m_scaleRandomX=" + Arrays.toString(this.aLW) + ", m_scaleY=" + Arrays.toString(this.aLX) + ", m_scaleRandomY=" + Arrays.toString(this.aLY) + ", m_scaleRandomKeepRatio=" + this.aLz + ", m_rotation=" + Arrays.toString(this.aLZ) + ", m_rotationRandom=" + Arrays.toString(this.aMa) + ", m_redColor=" + Arrays.toString(this.aMb) + ", m_redColorRandom=" + Arrays.toString(this.aMc) + ", m_greenColor=" + Arrays.toString(this.aMd) + ", m_greenColorRandom=" + Arrays.toString(this.aMe) + ", m_blueColor=" + Arrays.toString(this.aMf) + ", m_blueColorRandom=" + Arrays.toString(this.aMg) + ", m_alphaColor=" + Arrays.toString(this.aMh) + ", m_alphaColorRandom=" + Arrays.toString(this.aMi) + ", m_rotationX=" + Arrays.toString(this.aMj) + ", m_rotationY=" + Arrays.toString(this.aMk) + ", m_rotationZ=" + Arrays.toString(this.aMl) + ", m_textureTop=" + this.aLN + ", m_textureLeft=" + this.aLO + ", m_textureBottom=" + this.aLP + ", m_textureRight=" + this.aLQ + ", m_halfHeight=" + this.aLR + ", m_halfWidth=" + this.aLS + "}";
    }
}

