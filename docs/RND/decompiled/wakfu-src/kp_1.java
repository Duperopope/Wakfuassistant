/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Kp
 */
public class kp_1
implements JH,
ki_1 {
    private final JG aMs = new JG();
    private final float[] aMt = new float[2];

    @Override
    public JG aPi() {
        return this.aMs;
    }

    public float[] aQg() {
        return this.aMt;
    }

    public void H(float f2, float f3) {
        this.aMt[0] = f2;
        this.aMt[1] = f3;
    }

    public String toString() {
        return "CirclePath{" + String.valueOf(this.aMs) + ", m_radialSpeed=" + Arrays.toString(this.aMt) + "}";
    }
}

