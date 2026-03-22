/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from KG
 */
public class kg_2
implements JH,
ki_1 {
    private final JG aOF = new JG();
    private final float[] aOG = new float[2];
    private final float[] aOH = new float[2];
    private final float[] aOI = new float[2];

    @Override
    public JG aPi() {
        return this.aOF;
    }

    public float[] aPS() {
        return this.aOG;
    }

    public void A(float f2, float f3) {
        this.aOG[0] = f2;
        this.aOG[1] = f3;
    }

    public float[] aPT() {
        return this.aOH;
    }

    public void B(float f2, float f3) {
        this.aOH[0] = f2;
        this.aOH[1] = f3;
    }

    public float[] aPU() {
        return this.aOI;
    }

    public void C(float f2, float f3) {
        this.aOI[0] = f2;
        this.aOI[1] = f3;
    }

    public String toString() {
        return "RotationInterpolation{" + String.valueOf(this.aOF) + ", m_rotationX=" + Arrays.toString(this.aOG) + ", m_rotationY=" + Arrays.toString(this.aOH) + ", m_rotationZ=" + Arrays.toString(this.aOI) + "}";
    }
}

