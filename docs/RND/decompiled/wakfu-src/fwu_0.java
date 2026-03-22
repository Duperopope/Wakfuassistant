/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fwU
 */
public class fwu_0
implements aqz_2 {
    protected int o;
    protected int tAF;
    protected HashMap<Integer, Float> tAG;

    public int d() {
        return this.o;
    }

    public int gpy() {
        return this.tAF;
    }

    public HashMap<Integer, Float> gpz() {
        return this.tAG;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tAF = 0;
        this.tAG = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.tAF = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.tAG = new HashMap(n);
        for (int i = 0; i < n; ++i) {
            int n2 = aqh_12.bGI();
            float f2 = aqh_12.bGH();
            this.tAG.put(n2, Float.valueOf(f2));
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozk.d();
    }
}

