/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from fxx
 */
public class fxx_0
implements aqz_2 {
    protected int o;
    protected int elr;
    protected fxb_0[] tAX;
    protected fxy[] tAY;
    protected Optional<Integer> eqn;
    protected int eks;

    public int d() {
        return this.o;
    }

    public int blh() {
        return this.elr;
    }

    public fxb_0[] gpQ() {
        return this.tAX;
    }

    public fxy[] gpR() {
        return this.tAY;
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
        this.tAX = null;
        this.tAY = null;
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
        this.tAX = new fxb_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.tAX[n2] = new fxb_0();
            this.tAX[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.tAY = new fxy[n2];
        for (n = 0; n < n2; ++n) {
            this.tAY[n] = new fxy();
            this.tAY[n].a(aqh_12);
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

