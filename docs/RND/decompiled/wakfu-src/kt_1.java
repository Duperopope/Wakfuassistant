/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Kt
 */
public class kt_1
implements JH,
ki_1 {
    private final JG aMI = new JG();
    private final int[] aMJ = new int[2];
    private final int[] aMK = new int[2];
    private final int[] aML = new int[2];
    private final int[] aMM = new int[2];
    private final int[] aMN = new int[2];
    private final int[] aMO = new int[2];
    private final int[] aMP = new int[2];
    private final float[] aMQ = new float[2];
    private final float[] aMR = new float[2];
    private final float[] aMS = new float[2];
    private final float[] aMT = new float[2];
    private final float[] aMU = new float[2];
    private final float[] aMV = new float[2];
    private final float[] aMW = new float[2];
    private final float[] aMX = new float[2];
    private final float[] aMY = new float[2];
    private final float[] aMZ = new float[2];
    private final float[] aNa = new float[2];
    private final float[] aNb = new float[2];
    private final int[] aNc = new int[2];
    private final int[] aNd = new int[2];
    private boolean aNe;
    private String p = "";
    private String aNf = "";

    @Override
    public JG aPi() {
        return this.aMI;
    }

    public int[] aQr() {
        return this.aMJ;
    }

    public void w(int n, int n2) {
        this.aMJ[0] = n;
        this.aMJ[1] = n2;
    }

    public int[] aQs() {
        return this.aMK;
    }

    public void x(int n, int n2) {
        this.aMK[0] = n;
        this.aMK[1] = n2;
    }

    public int[] aQt() {
        return this.aML;
    }

    public void y(int n, int n2) {
        this.aML[0] = n;
        this.aML[1] = n2;
    }

    public int[] aQu() {
        return this.aMM;
    }

    public void z(int n, int n2) {
        this.aMM[0] = n;
        this.aMM[1] = n2;
    }

    public int[] aQv() {
        return this.aMN;
    }

    public void A(int n, int n2) {
        this.aMN[0] = n;
        this.aMN[1] = n2;
    }

    public int[] aQw() {
        return this.aMO;
    }

    public void B(int n, int n2) {
        this.aMO[0] = n;
        this.aMO[1] = n2;
    }

    public int[] aQx() {
        return this.aMP;
    }

    public void C(int n, int n2) {
        this.aMP[0] = n;
        this.aMP[1] = n2;
    }

    public float[] aQy() {
        return this.aMQ;
    }

    public void S(float f2, float f3) {
        this.aMQ[0] = f2;
        this.aMQ[1] = f3;
    }

    public float[] aQz() {
        return this.aMR;
    }

    public void T(float f2, float f3) {
        this.aMR[0] = f2;
        this.aMR[1] = f3;
    }

    public float[] aQA() {
        return this.aMS;
    }

    public void U(float f2, float f3) {
        this.aMS[0] = f2;
        this.aMS[1] = f3;
    }

    public float[] aQB() {
        return this.aMT;
    }

    public void V(float f2, float f3) {
        this.aMT[0] = f2;
        this.aMT[1] = f3;
    }

    public float[] aQC() {
        return this.aMU;
    }

    public void W(float f2, float f3) {
        this.aMU[0] = f2;
        this.aMU[1] = f3;
    }

    public float[] aQD() {
        return this.aMV;
    }

    public void X(float f2, float f3) {
        this.aMV[0] = f2;
        this.aMV[1] = f3;
    }

    public float[] aQE() {
        return this.aMW;
    }

    public void Y(float f2, float f3) {
        this.aMW[0] = f2;
        this.aMW[1] = f3;
    }

    public float[] aQF() {
        return this.aMX;
    }

    public void Z(float f2, float f3) {
        this.aMX[0] = f2;
        this.aMX[1] = f3;
    }

    public float[] aQG() {
        return this.aMY;
    }

    public void aa(float f2, float f3) {
        this.aMY[0] = f2;
        this.aMY[1] = f3;
    }

    public float[] aQH() {
        return this.aMZ;
    }

    public void ab(float f2, float f3) {
        this.aMZ[0] = f2;
        this.aMZ[1] = f3;
    }

    public float[] aQI() {
        return this.aNa;
    }

    public void ac(float f2, float f3) {
        this.aNa[0] = f2;
        this.aNa[1] = f3;
    }

    public float[] aQJ() {
        return this.aNb;
    }

    public void ad(float f2, float f3) {
        this.aNb[0] = f2;
        this.aNb[1] = f3;
    }

    public int[] aQK() {
        return this.aNc;
    }

    public void D(int n, int n2) {
        this.aNc[0] = n;
        this.aNc[1] = n2;
    }

    public int[] aQL() {
        return this.aNd;
    }

    public void E(int n, int n2) {
        this.aNd[0] = n;
        this.aNd[1] = n2;
    }

    public boolean aQM() {
        return this.aNe;
    }

    public void aC(boolean bl) {
        this.aNe = bl;
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    public String getDescription() {
        return this.aNf;
    }

    public void cA(String string) {
        this.aNf = string;
    }

    public String toString() {
        return "EditableEmitter{" + String.valueOf(this.aMI) + ", m_levelCondition=" + Arrays.toString(this.aMJ) + ", m_spawnFrequency=" + Arrays.toString(this.aMK) + ", m_spawnFrequencyRandom=" + Arrays.toString(this.aML) + ", m_maxParticlesCount=" + Arrays.toString(this.aMM) + ", m_maxParticlesPerSpawn=" + Arrays.toString(this.aMN) + ", m_particleLifeTime=" + Arrays.toString(this.aMO) + ", m_particleLifeTimeRandom=" + Arrays.toString(this.aMP) + ", m_particleOffsetX=" + Arrays.toString(this.aMQ) + ", m_particleOffsetRandomX=" + Arrays.toString(this.aMR) + ", m_particleOffsetY=" + Arrays.toString(this.aMS) + ", m_particleOffsetRandomY=" + Arrays.toString(this.aMT) + ", m_particleOffsetZ=" + Arrays.toString(this.aMU) + ", m_particleOffsetRandomZ=" + Arrays.toString(this.aMV) + ", m_particleVelocityX=" + Arrays.toString(this.aMW) + ", m_particleVelocityRandomX=" + Arrays.toString(this.aMX) + ", m_particleVelocityY=" + Arrays.toString(this.aMY) + ", m_particleVelocityRandomY=" + Arrays.toString(this.aMZ) + ", m_particleVelocityZ=" + Arrays.toString(this.aNa) + ", m_particleVelocityRandomZ=" + Arrays.toString(this.aNb) + ", m_startSpawnTime=" + Arrays.toString(this.aNc) + ", m_endSpawnTime=" + Arrays.toString(this.aNd) + ", m_geocentric=" + this.aNe + ", m_name='" + this.p + "', m_description='" + this.aNf + "'}";
    }
}

