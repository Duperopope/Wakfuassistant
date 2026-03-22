/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fce
 */
public class fce_0
implements TObjectProcedure<fas_0> {
    private final short rTi;
    private int dvq;

    public fce_0(short s) {
        this.rTi = this.eI(s);
    }

    public boolean c(fas_0 fas_02) {
        if (this.rTi == this.eI(fas_02.erN().aIi())) {
            ++this.dvq;
        }
        return true;
    }

    private short eI(short s) {
        short s2 = s;
        fbu_0 fbu_02 = fbw_0.rSQ.eF(s);
        while (fbu_02 != null) {
            s2 = fbu_02.fSk();
            fbu_02 = fbw_0.rSQ.eF(fbu_02.fSk());
        }
        return s2;
    }

    public int eEl() {
        return this.dvq;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((fas_0)object);
    }
}

