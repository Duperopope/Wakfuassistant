/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eWQ
 */
public class ewq_1 {
    protected final aah_1<ewt_1> rCq = new aah_1();
    private ewr_1 rCr;

    public void a(ewr_1 ewr_12) {
        this.rCr = ewr_12;
    }

    public void b(ewp_1 ewp_12) {
        this.a(ewp_12, 0, 0);
    }

    public void a(ewp_1 ewp_12, int n, int n2) {
        ewt_1 ewt_12 = new ewt_1(ewp_12);
        this.rCq.b(ewp_12.d(), ewt_12);
        ewt_12.SY(n);
        ewt_12.SZ(n2);
        if (this.rCr != null) {
            this.rCr.Fw(ewp_12.d());
        }
    }

    protected ewt_1 SU(int n) {
        return this.rCq.vK(n);
    }

    public void c(int n, @NotNull ewx_1 ewx_12) {
        ewt_1 ewt_12 = this.rCq.vK(n);
        if (ewt_12 != null) {
            ewt_12.a(ewx_12);
            if (this.rCr != null) {
                this.rCr.a(n, ewx_12);
            }
        }
    }

    @Nullable
    public ewx_1 SV(int n) {
        ewt_1 ewt_12 = this.rCq.vK(n);
        return ewt_12 != null ? ewt_12.ezS() : null;
    }

    public int SW(int n) {
        ewt_1 ewt_12 = this.rCq.vK(n);
        return ewt_12 != null ? ewt_12.fOr() : 0;
    }

    public int SX(int n) {
        ewt_1 ewt_12 = this.rCq.vK(n);
        return ewt_12 != null ? ewt_12.fOs() : 0;
    }

    public void bkZ() {
        if (this.rCr != null) {
            this.rCr.dHN();
        }
    }

    public void clear() {
        if (this.rCr != null) {
            for (ewt_1 ewt_12 : this.rCq) {
                this.rCr.Fx(ewt_12.d());
            }
        }
        this.rCq.clear();
    }
}

