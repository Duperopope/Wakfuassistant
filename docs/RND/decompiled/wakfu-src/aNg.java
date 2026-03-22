/*
 * Decompiled with CFR 0.152.
 */
public class aNg
implements aqz_2 {
    protected int o;
    protected aNh[] emJ;

    public int d() {
        return this.o;
    }

    public aNh[] cqh() {
        return this.emJ;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.emJ = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.emJ = new aNh[n];
        for (int i = 0; i < n; ++i) {
            this.emJ[i] = new aNh();
            this.emJ[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAy.d();
    }
}

