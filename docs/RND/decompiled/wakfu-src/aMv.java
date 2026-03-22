/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class aMv
implements aqz_2 {
    protected int o;
    protected HashMap<Integer, Short> ekD;
    protected HashMap<Short, Short> ekE;

    public int d() {
        return this.o;
    }

    public HashMap<Integer, Short> cnR() {
        return this.ekD;
    }

    public HashMap<Short, Short> cnS() {
        return this.ekE;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ekD = null;
        this.ekE = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.ekD = new HashMap(n2);
        for (n = 0; n < n2; ++n) {
            int n3 = aqh_12.bGI();
            short s = aqh_12.bGG();
            this.ekD.put(n3, s);
        }
        n = aqh_12.bGI();
        this.ekE = new HashMap(n);
        for (int i = 0; i < n; ++i) {
            short s = aqh_12.bGG();
            short s2 = aqh_12.bGG();
            this.ekE.put(s, s2);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyW.d();
    }
}

