/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from KF
 */
public class kf_2
implements JH,
ki_1 {
    private final JG aOB = new JG();
    private final float[] aOC = new float[2];
    private final float[] aOD = new float[2];
    private final float[] aOE = new float[2];

    @Override
    public JG aPi() {
        return this.aOB;
    }

    public float[] aPS() {
        return this.aOC;
    }

    public void A(float f2, float f3) {
        this.aOC[0] = f2;
        this.aOC[1] = f3;
    }

    public float[] aPT() {
        return this.aOD;
    }

    public void B(float f2, float f3) {
        this.aOD[0] = f2;
        this.aOD[1] = f3;
    }

    public float[] aPU() {
        return this.aOE;
    }

    public void C(float f2, float f3) {
        this.aOE[0] = f2;
        this.aOE[1] = f3;
    }

    public String toString() {
        return "Rotation{" + String.valueOf(this.aOB) + ", m_rotationX=" + Arrays.toString(this.aOC) + ", m_rotationY=" + Arrays.toString(this.aOD) + ", m_rotationZ=" + Arrays.toString(this.aOE) + "}";
    }
}

