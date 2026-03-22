/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Kk
 */
public class kk_1
implements JH,
ki_1 {
    private final JG aLh = new JG();
    private final float[] aLi = new float[2];
    private final float[] aLj = new float[2];
    private final float[] aLk = new float[2];
    private final float[] aLl = new float[2];
    private kl_1 aLm = kl_1.aLp;

    @Override
    public JG aPi() {
        return this.aLh;
    }

    public float[] aPt() {
        return this.aLi;
    }

    public void g(float f2, float f3) {
        this.aLi[0] = f2;
        this.aLi[1] = f3;
    }

    public float[] aPu() {
        return this.aLj;
    }

    public void h(float f2, float f3) {
        this.aLj[0] = f2;
        this.aLj[1] = f3;
    }

    public float[] aPv() {
        return this.aLk;
    }

    public void i(float f2, float f3) {
        this.aLk[0] = f2;
        this.aLk[1] = f3;
    }

    public float[] aPw() {
        return this.aLl;
    }

    public void j(float f2, float f3) {
        this.aLl[0] = f2;
        this.aLl[1] = f3;
    }

    public kl_1 aPx() {
        return this.aLm;
    }

    public void a(kl_1 kl_12) {
        this.aLm = kl_12;
    }

    public String toString() {
        return "AttractionForce{" + String.valueOf(this.aLh) + ", m_intensity=" + Arrays.toString(this.aLi) + ", m_offsetX=" + Arrays.toString(this.aLj) + ", m_offsetY=" + Arrays.toString(this.aLk) + ", m_offsetZ=" + Arrays.toString(this.aLl) + ", m_axis=" + String.valueOf((Object)this.aLm) + "}";
    }
}

