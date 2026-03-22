/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Ky
 */
public class ky_0
implements JH,
ki_1 {
    private final JG aNP = new JG();
    private final float[] aNQ = new float[]{1.0f, 1.0f};
    private final float[] aNR = new float[]{1.0f, 1.0f};
    private final float[] aNS = new float[]{1.0f, 1.0f};
    private final float[] aNT = new float[2];
    private final float[] aNU = new float[]{3.0f, 3.0f};

    @Override
    public JG aPi() {
        return this.aNP;
    }

    public float[] aQY() {
        return this.aNQ;
    }

    public void af(float f2, float f3) {
        this.aNQ[0] = f2;
        this.aNQ[1] = f3;
    }

    public float[] aQZ() {
        return this.aNR;
    }

    public void ag(float f2, float f3) {
        this.aNR[0] = f2;
        this.aNR[1] = f3;
    }

    public float[] aRa() {
        return this.aNS;
    }

    public void ah(float f2, float f3) {
        this.aNS[0] = f2;
        this.aNS[1] = f3;
    }

    public float[] aPt() {
        return this.aNT;
    }

    public void g(float f2, float f3) {
        this.aNT[0] = f2;
        this.aNT[1] = f3;
    }

    public float[] aRb() {
        return this.aNU;
    }

    public void ai(float f2, float f3) {
        this.aNU[0] = f2;
        this.aNU[1] = f3;
    }

    public String toString() {
        return "EditableLight{" + String.valueOf(this.aNP) + ", m_colorRed=" + Arrays.toString(this.aNQ) + ", m_colorGreen=" + Arrays.toString(this.aNR) + ", m_colorBlue=" + Arrays.toString(this.aNS) + ", m_intensity=" + Arrays.toString(this.aNT) + ", m_range=" + Arrays.toString(this.aNU) + "}";
    }
}

