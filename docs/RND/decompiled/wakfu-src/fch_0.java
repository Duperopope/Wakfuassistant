/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fch
 */
public class fch_0
implements TObjectProcedure<fam_0> {
    private final int rTl;
    private int dvq;

    public fch_0(int n) {
        this.rTl = n;
        this.dvq = 0;
    }

    public boolean a(fam_0 fam_02) {
        fby_0 fby_02 = fbw_0.rSQ.eG(fam_02.erN().coj());
        if (fbo_0.g(fam_02.erN()) != fbt_0.rSH) {
            return true;
        }
        int n = fby_02.cov();
        if (exb_0.ff(n, this.rTl) || n == this.rTl) {
            ++this.dvq;
        }
        return true;
    }

    public int eEl() {
        return this.dvq;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fam_0)object);
    }
}

