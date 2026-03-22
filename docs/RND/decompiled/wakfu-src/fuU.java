/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class fuU
implements aqz_2 {
    protected short aZk;
    protected HashMap<Integer, fuv_0[]> eio;

    public short aWP() {
        return this.aZk;
    }

    public HashMap<Integer, fuv_0[]> clF() {
        return this.eio;
    }

    @Override
    public void reset() {
        this.aZk = 0;
        this.eio = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.aZk = aqh_12.bGG();
        int n = aqh_12.bGI();
        this.eio = new HashMap(n);
        for (int i = 0; i < n; ++i) {
            int n2 = aqh_12.bGI();
            int n3 = aqh_12.bGI();
            fuv_0[] fuv_0Array = new fuv_0[n3];
            for (int j = 0; j < n3; ++j) {
                fuv_0Array[j] = new fuv_0();
                fuv_0Array[j].a(aqh_12);
            }
            this.eio.put(n2, fuv_0Array);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyB.d();
    }
}

