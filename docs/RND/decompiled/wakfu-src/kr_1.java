/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Kr
 */
public class kr_1
implements JH,
ki_1 {
    private final JG aMA = new JG();
    private final float[] aMB = new float[2];
    private final float[] aMC = new float[2];
    private final float[] aMD = new float[2];
    private final float[] aME = new float[2];
    private final float[] aMF = new float[2];
    private final float[] aMG = new float[2];

    @Override
    public JG aPi() {
        return this.aMA;
    }

    public float[] aQl() {
        return this.aMB;
    }

    public void M(float f2, float f3) {
        this.aMB[0] = f2;
        this.aMB[1] = f3;
    }

    public float[] aQm() {
        return this.aMC;
    }

    public void N(float f2, float f3) {
        this.aMC[0] = f2;
        this.aMC[1] = f3;
    }

    public float[] aQn() {
        return this.aMD;
    }

    public void O(float f2, float f3) {
        this.aMD[0] = f2;
        this.aMD[1] = f3;
    }

    public float[] aQo() {
        return this.aME;
    }

    public void P(float f2, float f3) {
        this.aME[0] = f2;
        this.aME[1] = f3;
    }

    public float[] aQp() {
        return this.aMF;
    }

    public void Q(float f2, float f3) {
        this.aMF[0] = f2;
        this.aMF[1] = f3;
    }

    public float[] aQq() {
        return this.aMG;
    }

    public void R(float f2, float f3) {
        this.aMG[0] = f2;
        this.aMG[1] = f3;
    }

    public String toString() {
        return "Deformer{" + String.valueOf(this.aMA) + ", m_growthX=" + Arrays.toString(this.aMB) + ", m_growthY=" + Arrays.toString(this.aMC) + ", m_rotate=" + Arrays.toString(this.aMD) + ", m_growthRandomX=" + Arrays.toString(this.aME) + ", m_growthRandomY=" + Arrays.toString(this.aMF) + ", m_rotateRandom=" + Arrays.toString(this.aMG) + "}";
    }
}

