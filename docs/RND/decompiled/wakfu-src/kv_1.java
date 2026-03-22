/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Kv
 */
public class kv_1
implements JH,
ki_1 {
    private final JG aNp = new JG();
    private final int[] aNq = new int[2];
    private final int[] aNr = new int[2];
    private final int[] aNs = new int[2];
    private final int[] aNt = new int[2];
    private final int[] aNu = new int[2];
    private final int[] aNv = new int[2];
    private final int[] aNw = new int[2];
    private final float[] aNx = new float[2];
    private final float[] aNy = new float[2];
    private final float[] aNz = new float[2];
    private final float[] aNA = new float[2];
    private final float[] aNB = new float[2];
    private final float[] aNC = new float[2];
    private final float[] aND = new float[2];
    private final float[] aNE = new float[2];
    private final float[] aNF = new float[2];
    private final float[] aNG = new float[2];
    private final float[] aNH = new float[2];
    private final float[] aNI = new float[2];
    private final int[] aNJ = new int[2];
    private final int[] aNK = new int[2];
    private boolean aNe;

    @Override
    public JG aPi() {
        return this.aNp;
    }

    public int[] aQr() {
        return this.aNq;
    }

    public void w(int n, int n2) {
        this.aNq[0] = n;
        this.aNq[1] = n2;
    }

    public int[] aQs() {
        return this.aNr;
    }

    public void x(int n, int n2) {
        this.aNr[0] = n;
        this.aNr[1] = n2;
    }

    public int[] aQt() {
        return this.aNs;
    }

    public void y(int n, int n2) {
        this.aNs[0] = n;
        this.aNs[1] = n2;
    }

    public int[] aQu() {
        return this.aNt;
    }

    public void z(int n, int n2) {
        this.aNt[0] = n;
        this.aNt[1] = n2;
    }

    public int[] aQv() {
        return this.aNu;
    }

    public void A(int n, int n2) {
        this.aNu[0] = n;
        this.aNu[1] = n2;
    }

    public int[] aQw() {
        return this.aNv;
    }

    public void B(int n, int n2) {
        this.aNv[0] = n;
        this.aNv[1] = n2;
    }

    public int[] aQx() {
        return this.aNw;
    }

    public void C(int n, int n2) {
        this.aNw[0] = n;
        this.aNw[1] = n2;
    }

    public float[] aQy() {
        return this.aNx;
    }

    public void S(float f2, float f3) {
        this.aNx[0] = f2;
        this.aNx[1] = f3;
    }

    public float[] aQz() {
        return this.aNy;
    }

    public void T(float f2, float f3) {
        this.aNy[0] = f2;
        this.aNy[1] = f3;
    }

    public float[] aQA() {
        return this.aNz;
    }

    public void U(float f2, float f3) {
        this.aNz[0] = f2;
        this.aNz[1] = f3;
    }

    public float[] aQB() {
        return this.aNA;
    }

    public void V(float f2, float f3) {
        this.aNA[0] = f2;
        this.aNA[1] = f3;
    }

    public float[] aQC() {
        return this.aNB;
    }

    public void W(float f2, float f3) {
        this.aNB[0] = f2;
        this.aNB[1] = f3;
    }

    public float[] aQD() {
        return this.aNC;
    }

    public void X(float f2, float f3) {
        this.aNC[0] = f2;
        this.aNC[1] = f3;
    }

    public float[] aQE() {
        return this.aND;
    }

    public void Y(float f2, float f3) {
        this.aND[0] = f2;
        this.aND[1] = f3;
    }

    public float[] aQF() {
        return this.aNE;
    }

    public void Z(float f2, float f3) {
        this.aNE[0] = f2;
        this.aNE[1] = f3;
    }

    public float[] aQG() {
        return this.aNF;
    }

    public void aa(float f2, float f3) {
        this.aNF[0] = f2;
        this.aNF[1] = f3;
    }

    public float[] aQH() {
        return this.aNG;
    }

    public void ab(float f2, float f3) {
        this.aNG[0] = f2;
        this.aNG[1] = f3;
    }

    public float[] aQI() {
        return this.aNH;
    }

    public void ac(float f2, float f3) {
        this.aNH[0] = f2;
        this.aNH[1] = f3;
    }

    public float[] aQJ() {
        return this.aNI;
    }

    public void ad(float f2, float f3) {
        this.aNI[0] = f2;
        this.aNI[1] = f3;
    }

    public int[] aQK() {
        return this.aNJ;
    }

    public void D(int n, int n2) {
        this.aNJ[0] = n;
        this.aNJ[1] = n2;
    }

    public int[] aQL() {
        return this.aNK;
    }

    public void E(int n, int n2) {
        this.aNK[0] = n;
        this.aNK[1] = n2;
    }

    public boolean aQM() {
        return this.aNe;
    }

    public void aC(boolean bl) {
        this.aNe = bl;
    }

    public String toString() {
        return "Emitter{" + String.valueOf(this.aNp) + ", m_levelCondition=" + Arrays.toString(this.aNq) + ", m_spawnFrequency=" + Arrays.toString(this.aNr) + ", m_spawnFrequencyRandom=" + Arrays.toString(this.aNs) + ", m_maxParticlesCount=" + Arrays.toString(this.aNt) + ", m_maxParticlesPerSpawn=" + Arrays.toString(this.aNu) + ", m_particleLifeTime=" + Arrays.toString(this.aNv) + ", m_particleLifeTimeRandom=" + Arrays.toString(this.aNw) + ", m_particleOffsetX=" + Arrays.toString(this.aNx) + ", m_particleOffsetRandomX=" + Arrays.toString(this.aNy) + ", m_particleOffsetY=" + Arrays.toString(this.aNz) + ", m_particleOffsetRandomY=" + Arrays.toString(this.aNA) + ", m_particleOffsetZ=" + Arrays.toString(this.aNB) + ", m_particleOffsetRandomZ=" + Arrays.toString(this.aNC) + ", m_particleVelocityX=" + Arrays.toString(this.aND) + ", m_particleVelocityRandomX=" + Arrays.toString(this.aNE) + ", m_particleVelocityY=" + Arrays.toString(this.aNF) + ", m_particleVelocityRandomY=" + Arrays.toString(this.aNG) + ", m_particleVelocityZ=" + Arrays.toString(this.aNH) + ", m_particleVelocityRandomZ=" + Arrays.toString(this.aNI) + ", m_startSpawnTime=" + Arrays.toString(this.aNJ) + ", m_endSpawnTime=" + Arrays.toString(this.aNK) + ", m_geocentric=" + this.aNe + "}";
    }
}

