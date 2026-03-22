/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from KH
 */
public class kh_2
implements JH,
ki_1 {
    private final JG aOJ = new JG();
    private final float[] aOK = new float[2];

    @Override
    public JG aPi() {
        return this.aOJ;
    }

    public float[] aPt() {
        return this.aOK;
    }

    public void g(float f2, float f3) {
        this.aOK[0] = f2;
        this.aOK[1] = f3;
    }

    public String toString() {
        return "RotorForce{" + String.valueOf(this.aOJ) + ", m_intensity=" + Arrays.toString(this.aOK) + "}";
    }
}

