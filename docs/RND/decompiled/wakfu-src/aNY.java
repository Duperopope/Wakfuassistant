/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class aNY
implements aqz_2 {
    protected int o;
    protected int elr;
    protected aOc[] eql;
    protected anz_0[] eqm;
    protected Optional<Integer> eqn;
    protected int eks;

    public int d() {
        return this.o;
    }

    public int blh() {
        return this.elr;
    }

    public aOc[] ctO() {
        return this.eql;
    }

    public anz_0[] ctP() {
        return this.eqm;
    }

    public Optional<Integer> ctQ() {
        return this.eqn;
    }

    public int cnG() {
        return this.eks;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.elr = 0;
        this.eql = null;
        this.eqm = null;
        int n = 0;
        this.eqn = Optional.ofNullable(n);
        this.eks = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        this.o = aqh_12.bGI();
        this.elr = aqh_12.bGI();
        int n3 = aqh_12.bGI();
        this.eql = new aOc[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.eql[n2] = new aOc();
            this.eql[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.eqm = new anz_0[n2];
        for (n = 0; n < n2; ++n) {
            this.eqm[n] = new anz_0();
            this.eqm[n].a(aqh_12);
        }
        if (aqh_12.bxv()) {
            n = aqh_12.bGI();
            this.eqn = Optional.of(n);
        } else {
            this.eqn = Optional.empty();
        }
        this.eks = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oBl.d();
    }
}

