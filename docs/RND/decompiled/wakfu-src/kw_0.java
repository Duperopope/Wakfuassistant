/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Kw
 */
public class kw_0
implements JH,
ki_1 {
    private final JG aNL = new JG();
    private final float[] aNM = new float[2];

    @Override
    public JG aPi() {
        return this.aNL;
    }

    public float[] aQV() {
        return this.aNM;
    }

    public void ae(float f2, float f3) {
        this.aNM[0] = f2;
        this.aNM[1] = f3;
    }

    public String toString() {
        return "FrictionalForce{m_tags=" + String.valueOf(this.aNL) + ", m_friction=" + Arrays.toString(this.aNM) + "}";
    }
}

