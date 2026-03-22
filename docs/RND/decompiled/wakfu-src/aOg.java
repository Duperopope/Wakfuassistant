/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class aOg
implements aqz_2 {
    protected int o;
    protected int efP;
    protected aOh[] eqy;
    protected Optional<Integer> eqz;

    public int d() {
        return this.o;
    }

    public int cjd() {
        return this.efP;
    }

    public aOh[] cub() {
        return this.eqy;
    }

    public Optional<Integer> cuc() {
        return this.eqz;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.efP = 0;
        this.eqy = null;
        int n = 0;
        this.eqz = Optional.ofNullable(n);
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.efP = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.eqy = new aOh[n2];
        for (n = 0; n < n2; ++n) {
            this.eqy[n] = new aOh();
            this.eqy[n].a(aqh_12);
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

