/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class fxF
implements aqz_2 {
    protected int o;
    protected fxG[] tBd;
    protected Optional<Integer> eqz;

    public int d() {
        return this.o;
    }

    public fxG[] gpW() {
        return this.tBd;
    }

    public Optional<Integer> cuc() {
        return this.eqz;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tBd = null;
        int n = 0;
        this.eqz = Optional.ofNullable(n);
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.tBd = new fxG[n2];
        for (n = 0; n < n2; ++n) {
            this.tBd[n] = new fxG();
            this.tBd[n].a(aqh_12);
        }
        if (aqh_12.bxv()) {
            n = aqh_12.bGI();
            this.eqz = Optional.of(n);
        } else {
            this.eqz = Optional.empty();
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBn.d();
    }
}

