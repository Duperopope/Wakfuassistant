/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 */
import gnu.trove.procedure.TLongProcedure;

class TK
implements TLongProcedure {
    final /* synthetic */ LU btS;
    final /* synthetic */ int btT;
    final /* synthetic */ long btU;
    final /* synthetic */ LU btV;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    TK(TJ tJ, LU lU, int n, long l, LU lU2) {
        this.btS = lU;
        this.btT = n;
        this.btU = l;
        this.btV = lU2;
    }

    public boolean execute(long l) {
        if (this.btS.aTn() > this.btT) {
            return false;
        }
        if (l == this.btU) {
            this.btV.aTo();
        }
        this.btS.aTo();
        return true;
    }
}

