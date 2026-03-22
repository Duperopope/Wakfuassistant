/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from frW
 */
public class frw_0 {
    private int taB;
    private float taC;
    private final List<fry_0> taD = new ArrayList<fry_0>();

    public frw_0() {
        this(0);
    }

    public frw_0(int n) {
        this.ZG(n);
    }

    public int gkD() {
        return this.taB;
    }

    public float gkE() {
        return this.taC;
    }

    static double ZF(int n) {
        return (double)(-Integer.signum(n)) * StrictMath.expm1((double)(-Math.abs(n)) / frx_0.taH);
    }

    public static frw_0 fr(float f2) {
        int n = (int)((double)Math.signum(f2) * frx_0.taH * StrictMath.log1p(-Math.abs(f2)));
        return new frw_0(n);
    }

    private void ZG(int n) {
        this.setValue(this.taB + n);
    }

    public void setValue(int n) {
        this.taB = frw_0.ZH(n);
        this.taC = (float)frw_0.ZF(this.taB);
        for (int i = 0; i < this.taD.size(); ++i) {
            this.taD.get(i).gkF();
        }
    }

    private static int ZH(int n) {
        return GC.a(n, -10000, 10000);
    }

    public void ZI(int n) {
        int n2 = (int)(frw_0.h(this.taC, Integer.signum(n)) * (double)n);
        this.ZG(n2);
    }

    static double h(float f2, int n) {
        if ((float)n * f2 > 0.0f) {
            return 1.0;
        }
        return 1.0 + Math.max(0.0, 4.0 * ((double)Math.abs(f2) - 0.5));
    }

    public boolean a(fry_0 fry_02) {
        return !this.taD.contains(fry_02) && this.taD.add(fry_02);
    }

    public boolean b(fry_0 fry_02) {
        return this.taD.remove(fry_02);
    }

    public String toString() {
        return "WakfuGauge{m_actionValue=" + this.taB + ", m_userFriendlyValue=" + this.taC + "}";
    }
}

