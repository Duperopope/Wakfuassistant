/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fwT
 */
public class fwt_0
implements aqz_2 {
    protected int o;
    protected int[] tAD;
    protected HashMap<Integer, Integer> tAE;
    protected int[] tAd;

    public int d() {
        return this.o;
    }

    public int[] gpw() {
        return this.tAD;
    }

    public HashMap<Integer, Integer> gpx() {
        return this.tAE;
    }

    public int[] goX() {
        return this.tAd;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tAD = null;
        this.tAE = null;
        this.tAd = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.tAD = aqh_12.bGM();
        int n = aqh_12.bGI();
        this.tAE = new HashMap(n);
        for (int i = 0; i < n; ++i) {
            int n2 = aqh_12.bGI();
            int n3 = aqh_12.bGI();
            this.tAE.put(n2, n3);
        }
        this.tAd = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozj.d();
    }
}

