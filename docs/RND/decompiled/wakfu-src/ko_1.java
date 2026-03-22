/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Ko
 */
public class ko_1
implements JH,
ki_1 {
    private final JG aMo = new JG();
    private final float[] aMp = new float[2];
    private final float[] aMq = new float[2];
    private final float[] aMr = new float[2];

    @Override
    public JG aPi() {
        return this.aMo;
    }

    public float[] aQd() {
        return this.aMp;
    }

    public void E(float f2, float f3) {
        this.aMp[0] = f2;
        this.aMp[1] = f3;
    }

    public float[] aQe() {
        return this.aMq;
    }

    public void F(float f2, float f3) {
        this.aMq[0] = f2;
        this.aMq[1] = f3;
    }

    public float[] aQf() {
        return this.aMr;
    }

    public void G(float f2, float f3) {
        this.aMr[0] = f2;
        this.aMr[1] = f3;
    }

    public String toString() {
        return "BoostForce{" + String.valueOf(this.aMo) + ", m_forceX=" + Arrays.toString(this.aMp) + ", m_forceY=" + Arrays.toString(this.aMq) + ", m_forceZ=" + Arrays.toString(this.aMr) + "}";
    }
}

