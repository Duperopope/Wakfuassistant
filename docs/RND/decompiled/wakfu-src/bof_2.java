/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;

/*
 * Renamed from bOf
 */
class bof_2
implements TIntProcedure {
    final /* synthetic */ ArrayList kJO;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bof_2(boe_2 boe_22, ArrayList arrayList) {
        this.kJO = arrayList;
    }

    public boolean execute(int n) {
        bql_0 bql_02 = bqm_0.jbp.Fi(n);
        if (bql_02 == null) {
            return true;
        }
        for (bqu_0 bqu_02 : bql_02.dEz().fZX().values()) {
            for (bqq_0 bqq_02 : bqu_02.aGT()) {
                if (!(bqq_02 instanceof bqt_0)) continue;
                bog_2 bog_22 = new bog_2((bqt_0)bqq_02);
                if (bog_22.dil()) {
                    cye_1.eYk().a(bog_22);
                }
                this.kJO.add(bog_22);
            }
        }
        return true;
    }
}

