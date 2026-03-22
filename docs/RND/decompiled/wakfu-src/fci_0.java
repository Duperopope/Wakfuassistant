/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fci
 */
public class fci_0
implements TObjectProcedure<fbk_0> {
    private final short rTm;
    private long rTn;
    private long rTo;

    public fci_0(short s) {
        this.rTm = s;
    }

    public boolean i(fbk_0 fbk_02) {
        if (this.eJ(fbk_02.aIi()) || this.rTm == fbk_02.aIi()) {
            this.rTn += (long)fbk_02.fSb();
            this.rTo += (long)fbk_02.fSe();
        }
        return true;
    }

    private boolean eJ(short s) {
        fbu_0 fbu_02 = fbw_0.rSQ.eF(s);
        while (fbu_02 != null) {
            if (fbu_02.fSk() == this.rTm) {
                return true;
            }
            fbu_02 = fbw_0.rSQ.eF(fbu_02.fSk());
        }
        return false;
    }

    public long fSu() {
        return this.rTn;
    }

    public long fSv() {
        return this.rTo;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.i((fbk_0)object);
    }
}

