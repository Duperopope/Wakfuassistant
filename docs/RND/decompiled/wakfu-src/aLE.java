/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class aLE
implements aqz_2 {
    protected short aZk;
    protected HashMap<Byte, Float> eiE;

    public short aWP() {
        return this.aZk;
    }

    public HashMap<Byte, Float> clV() {
        return this.eiE;
    }

    @Override
    public void reset() {
        this.aZk = 0;
        this.eiE = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.aZk = aqh_12.bGG();
        int n = aqh_12.bGI();
        this.eiE = new HashMap(n);
        for (int i = 0; i < n; ++i) {
            byte by = aqh_12.aTf();
            float f2 = aqh_12.bGH();
            this.eiE.put(by, Float.valueOf(f2));
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyG.d();
    }
}

