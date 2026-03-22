/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class fyq
implements aqz_2 {
    protected int o;
    protected boolean tBA;
    protected HashMap<Integer, fyr> tBB;

    public int d() {
        return this.o;
    }

    public boolean gqt() {
        return this.tBA;
    }

    public HashMap<Integer, fyr> gqu() {
        return this.tBB;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tBA = false;
        this.tBB = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.tBA = aqh_12.bxv();
        int n = aqh_12.bGI();
        this.tBB = new HashMap(n);
        for (int i = 0; i < n; ++i) {
            int n2 = aqh_12.bGI();
            fyr fyr2 = new fyr();
            fyr2.a(aqh_12);
            this.tBB.put(n2, fyr2);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozL.d();
    }
}

