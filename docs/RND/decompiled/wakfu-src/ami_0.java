/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMI
 */
public class ami_0
implements aqz_2 {
    protected int o;
    protected int eln;
    protected aMJ[] elo;

    public int d() {
        return this.o;
    }

    public int coF() {
        return this.eln;
    }

    public aMJ[] coG() {
        return this.elo;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.eln = 0;
        this.elo = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eln = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.elo = new aMJ[n];
        for (int i = 0; i < n; ++i) {
            this.elo[i] = new aMJ();
            this.elo[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAs.d();
    }
}

