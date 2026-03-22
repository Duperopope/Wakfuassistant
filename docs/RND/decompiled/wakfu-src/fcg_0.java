/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fcg
 */
public class fcg_0
implements TObjectProcedure<fas_0> {
    private final int rTk;
    private int dvq;

    public fcg_0(int n) {
        this.rTk = n;
        this.dvq = 0;
    }

    public boolean c(fas_0 fas_02) {
        fby_0 fby_02 = fbw_0.rSQ.eG(fas_02.erN().coj());
        if (fbo_0.g(fas_02.erN()) != fbt_0.rSH) {
            return true;
        }
        int n = fby_02.cov();
        if (exb_0.ff(n, this.rTk) || n == this.rTk) {
            ++this.dvq;
        }
        return true;
    }

    public int eEl() {
        return this.dvq;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((fas_0)object);
    }
}

