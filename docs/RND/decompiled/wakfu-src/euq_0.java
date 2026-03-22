/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eUQ
 */
public abstract class euq_0<F extends exP>
extends ety_0<F> {
    protected euq_0(int n, eUw eUw2, rh_0 rh_02) {
        super(n, eUw2, rh_02);
    }

    public ewk_1 dHf() {
        return this.rry;
    }

    public void mH(boolean bl) {
        if (this.dHf() != null) {
            this.dHf().bm(bl);
        }
    }

    public void et(long l) {
        if (this.dHf() != null) {
            this.dHf().et(l);
        }
    }

    public void kz(long l) {
        if (this.dHf() != null) {
            this.dHf().eu(l);
        }
    }

    public void SD(int n) {
        if (this.dHf() != null) {
            this.dHf().SD(n);
        }
    }

    public long qR(long l) {
        if (this.dHf() != null) {
            return this.dHf().qR(l);
        }
        return -1L;
    }

    public void fMI() {
        if (this.dHf() != null && this.dHf().bhl()) {
            this.dHf().bhK();
        }
    }

    public boolean bq(F f2) {
        if (!this.fMJ()) {
            return false;
        }
        boolean bl = this.dHf().eG(((exP)f2).Sn());
        if (!bl) {
            rrm.error((Object)this.sq("Impossible de d\u00e9buter le tour de " + ((exP)f2).Sn()));
        }
        return bl;
    }

    public boolean br(F f2) {
        if (!this.fMJ()) {
            return false;
        }
        boolean bl = this.dHf().eF(((exP)f2).Sn());
        if (!bl) {
            rrm.error((Object)this.sq("Impossible de pr\u00e9parer le tour de " + ((exP)f2).Sn()));
        }
        return bl;
    }

    protected boolean fMJ() {
        if (this.dHf() == null || !this.dHf().bhl()) {
            rrm.error((Object)this.sq("timeline null ou arret\u00e9e"));
            return false;
        }
        return true;
    }

    public boolean bs(F f2) {
        if (f2 == null) {
            return false;
        }
        boolean bl = ((exP)f2).fhm().get(2);
        return this.v(((exP)f2).Sn(), !bl);
    }

    public boolean v(long l, boolean bl) {
        if (!this.fMJ()) {
            return false;
        }
        boolean bl2 = this.dHf().e(l, bl);
        if (!bl2) {
            rrm.error((Object)this.sq("Impossible de terminer le tour de " + l));
        }
        return bl2;
    }

    protected final void qS(long l) {
        Object f2 = this.qJ(l);
        if (f2 != null) {
            this.z(f2);
        }
    }

    protected final void qT(long l) {
        Object f2 = this.qJ(l);
        if (f2 != null) {
            this.bt(f2);
        }
    }

    protected void z(@NotNull F ro_02) {
        ((exP)((Object)ro_02)).a((ro_0)new ro_0());
    }

    protected void bt(@NotNull F f2) {
    }

    protected void qU(long l) {
        Object f2 = this.qJ(l);
        if (f2 != null) {
            this.y(f2);
        }
    }

    protected void y(@NotNull F rn_02) {
        try {
            ((exP)((Object)rn_02)).a((rn_0)new rn_0());
        }
        catch (Exception exception) {
            rrm.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    public void dGU() {
        this.dGG();
        for (exP exP2 : this.rrw.a(evb_0.fNp())) {
            if (exP2 == null) continue;
            exP2.a(new rp_0());
            exf_2 exf_22 = exP2.e(exx_2.rGs);
            exf_22.oq(1);
        }
    }

    public void dHd() {
        this.dGG();
    }

    @Override
    public /* synthetic */ TA baf() {
        return this.dHf();
    }
}

