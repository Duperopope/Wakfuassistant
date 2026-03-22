/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

/*
 * Renamed from bqP
 */
class bqp_0
implements TIntProcedure {
    final /* synthetic */ boolean jbu;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bqp_0(boolean bl) {
        this.jbu = bl;
    }

    public boolean execute(int n) {
        bql_0 bql_02 = bqm_0.jbp.Fi(n);
        bql_02.T(this.jbu);
        return true;
    }
}

