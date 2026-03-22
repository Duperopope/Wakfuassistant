/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from KA
 */
public class ka_0
implements JH,
ki_1 {
    private final JG aNX = new JG();
    private final float[] aNY = new float[2];
    private final float[] aNZ = new float[2];
    private final float[] aOa = new float[2];
    private boolean aOb = true;

    @Override
    public JG aPi() {
        return this.aNX;
    }

    public float[] aQd() {
        return this.aNY;
    }

    public void E(float f2, float f3) {
        this.aNY[0] = f2;
        this.aNY[1] = f3;
    }

    public float[] aQe() {
        return this.aNZ;
    }

    public void F(float f2, float f3) {
        this.aNZ[0] = f2;
        this.aNZ[1] = f3;
    }

    public float[] aQf() {
        return this.aOa;
    }

    public void G(float f2, float f3) {
        this.aOa[0] = f2;
        this.aOa[1] = f3;
    }

    public boolean aRc() {
        return this.aOb;
    }

    public void aF(boolean bl) {
        this.aOb = bl;
    }

    public String toString() {
        return "LinearForce{" + String.valueOf(this.aNX) + ", m_forceX=" + Arrays.toString(this.aNY) + ", m_forceY=" + Arrays.toString(this.aNZ) + ", m_forceZ=" + Arrays.toString(this.aOa) + ", m_applyOnVelocity=" + this.aOb + "}";
    }
}

