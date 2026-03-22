/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Kq
 */
public class kq_1
implements JH,
ki_1 {
    private final JG aMu = new JG();
    private final float[] aMv = new float[2];
    private final float[] aMw = new float[2];
    private final float[] aMx = new float[2];
    private final float[] aMy = new float[2];
    private final float[] aMz = new float[2];

    @Override
    public JG aPi() {
        return this.aMu;
    }

    public float[] aQh() {
        return this.aMv;
    }

    public void I(float f2, float f3) {
        this.aMv[0] = f2;
        this.aMv[1] = f3;
    }

    public float[] aQi() {
        return this.aMw;
    }

    public void J(float f2, float f3) {
        this.aMw[0] = f2;
        this.aMw[1] = f3;
    }

    public float[] aQj() {
        return this.aMx;
    }

    public void K(float f2, float f3) {
        this.aMx[0] = f2;
        this.aMx[1] = f3;
    }

    public float[] aQk() {
        return this.aMy;
    }

    public void L(float f2, float f3) {
        this.aMy[0] = f2;
        this.aMy[1] = f3;
    }

    public float[] aQc() {
        return this.aMz;
    }

    public void D(float f2, float f3) {
        this.aMz[0] = f2;
        this.aMz[1] = f3;
    }

    public String toString() {
        return "ColorFader{" + String.valueOf(this.aMu) + ", m_red=" + Arrays.toString(this.aMv) + ", m_green=" + Arrays.toString(this.aMw) + ", m_blue=" + Arrays.toString(this.aMx) + ", m_alpha=" + Arrays.toString(this.aMy) + ", m_speed=" + Arrays.toString(this.aMz) + "}";
    }
}

