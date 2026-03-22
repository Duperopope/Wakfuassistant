/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aLv
 */
public class alv_0
implements aqz_2 {
    protected short aZk;
    protected HashMap<Integer, aLw[]> eio;

    public short aWP() {
        return this.aZk;
    }

    public HashMap<Integer, aLw[]> clF() {
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
            aLw[] aLwArray = new aLw[n3];
            for (int j = 0; j < n3; ++j) {
                aLwArray[j] = new aLw();
                aLwArray[j].a(aqh_12);
            }
            this.eio.put(n2, aLwArray);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyB.d();
    }
}

