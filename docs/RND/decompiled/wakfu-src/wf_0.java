/*
 * Decompiled with CFR 0.152.
 */
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
 * Renamed from Wf
 */
public class wf_0 {
    private final int bMw;
    private float bMx;
    private float bMp;
    private float bMq;
    private final float[] bMy = new float[6];
    private final Random bMz = new SecureRandom();
    private float bMA;
    private float bMB;
    private ArrayList<wj_0> bMC;
    private float bMD;
    private float bME;
    private wg_0 bMF;

    public wf_0(int n) {
        this.bMw = n;
    }

    public void a(wj_0 wj_02, wc_0 wc_02) {
        if (this.bMC == null) {
            this.bMC = new ArrayList();
        } else if (this.bMC.contains(wj_02)) {
            return;
        }
        this.bMC.add(wj_02);
        float f2 = wc_02.blm();
        float f3 = wc_02.bll();
        float f4 = wj_02.blM();
        this.bME = GC.b(this.bME + f4, f3 - this.bMp, f2 - this.bMq);
        this.bMD += wj_02.blN();
    }

    public void b(wj_0 wj_02, wc_0 wc_02) {
        if (this.bMC == null) {
            this.bMC = new ArrayList();
        } else if (this.bMC.contains(wj_02)) {
            return;
        }
        this.bMC.clear();
        this.bME = 0.0f;
        this.bMD = 0.0f;
        this.bMC.add(wj_02);
        float f2 = wc_02.blm();
        float f3 = wc_02.bll();
        float f4 = wj_02.blM();
        this.bME = GC.b(this.bME + f4, f3 - this.bMp, f2 - this.bMq);
        this.bMD += wj_02.blN();
    }

    public ArrayList<wj_0> blB() {
        return this.bMC;
    }

    public int blC() {
        return this.bMw;
    }

    public float blD() {
        return this.bMx;
    }

    public void bB(float f2) {
        this.bMx = f2;
    }

    public float bll() {
        return this.bMp;
    }

    public void bv(float f2) {
        this.bMp = f2;
    }

    public float blm() {
        return this.bMq;
    }

    public void bw(float f2) {
        this.bMq = f2;
    }

    public wg_0 blE() {
        return this.bMF;
    }

    public void b(wg_0 wg_02) {
        this.bMF = wg_02;
    }

    public float blF() {
        return this.bMA;
    }

    public void bC(float f2) {
        this.bMA = f2;
    }

    public float blG() {
        return this.bMB;
    }

    public float blH() {
        return this.bMD;
    }

    public float blI() {
        return this.bME;
    }

    public void av(float f2, float f3) {
        for (int i = 0; i < this.bMy.length; ++i) {
            float f4 = f2 + this.bMz.nextFloat() * (f3 - f2) + this.bMD;
            this.bMy[i] = GC.b(f4, f2, f3);
        }
    }

    protected void bD(float f2) {
        int n = (int)Math.floor(f2 * (float)(this.bMy.length - 1));
        this.bMB = this.bMy[n];
    }

    public String toString() {
        return "CycleWeather{m_cycle=" + this.bMw + ", m_windForce=" + this.bMx + ", m_tMin=" + this.bMp + ", m_tMax=" + this.bMq + ", m_winds=" + Arrays.toString(this.bMy) + ", m_currentTemperature=" + this.bMA + ", m_currentWind=" + this.bMB + ", m_modifiers=" + String.valueOf(this.bMC) + ", m_modifierWind=" + this.bMD + ", m_modifierTemperature=" + this.bME + "}";
    }
}

