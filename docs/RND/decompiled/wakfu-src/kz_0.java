/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Kz
 */
public class kz_0
implements JH,
ki_1 {
    private final JG aNV = new JG();
    private final float[] aNW = new float[2];

    @Override
    public JG aPi() {
        return this.aNV;
    }

    public float[] aQl() {
        return this.aNW;
    }

    public void M(float f2, float f3) {
        this.aNW[0] = f2;
        this.aNW[1] = f3;
    }

    public String toString() {
        return "LightRadiusDeformer{" + String.valueOf(this.aNV) + ", m_growthX=" + Arrays.toString(this.aNW) + "}";
    }
}

