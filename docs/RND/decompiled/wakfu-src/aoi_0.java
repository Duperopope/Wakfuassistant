/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from aOi
 */
public class aoi_0
implements aqz_2 {
    protected int o;
    protected Optional<Integer> eqB;
    protected int eks;

    public int d() {
        return this.o;
    }

    public Optional<Integer> cud() {
        return this.eqB;
    }

    public int cnG() {
        return this.eks;
    }

    @Override
    public void reset() {
        this.o = 0;
        int n = 0;
        this.eqB = Optional.ofNullable(n);
        this.eks = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        if (aqh_12.bxv()) {
            int n = aqh_12.bGI();
            this.eqB = Optional.of(n);
        } else {
            this.eqB = Optional.empty();
        }
        this.eks = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oBq.d();
    }
}

