/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fwr
 */
public class fwr_0
implements aqz_2 {
    protected short avX;
    protected int emw;
    protected int[] emx;
    protected HashMap<Integer, int[]> emy;

    public short aIi() {
        return this.avX;
    }

    public int cpU() {
        return this.emw;
    }

    public int[] cpV() {
        return this.emx;
    }

    public HashMap<Integer, int[]> cpW() {
        return this.emy;
    }

    @Override
    public void reset() {
        this.avX = 0;
        this.emw = 0;
        this.emx = null;
        this.emy = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.avX = aqh_12.bGG();
        this.emw = aqh_12.bGI();
        this.emx = aqh_12.bGM();
        int n = aqh_12.bGI();
        this.emy = new HashMap(n);
        for (int i = 0; i < n; ++i) {
            int n2 = aqh_12.bGI();
            int[] nArray = aqh_12.bGM();
            this.emy.put(n2, nArray);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oza.d();
    }
}

