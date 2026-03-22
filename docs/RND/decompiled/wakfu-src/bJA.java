/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

class bJA
implements TIntObjectProcedure<abm_1> {
    final /* synthetic */ wk_2 kmb;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bJA(wk_2 wk_22) {
        this.kmb = wk_22;
    }

    public boolean a(int n, abm_1 abm_12) {
        xa_1 xa_12 = new xa_1();
        xa_12.ajg.Th = n;
        xa_12.ajg.aaw = abm_12.bWb();
        xa_12.ajg.aax = abm_12.bWc();
        this.kmb.air.ajf.add(xa_12);
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (abm_1)object);
    }
}

