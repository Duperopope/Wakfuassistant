/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bjG
 */
class bjg_2
implements TObjectProcedure<bjj_2> {
    final /* synthetic */ bjj_2 ipt;
    final /* synthetic */ boolean[] ipu;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bjg_2(bjf_2 bjf_22, bjj_2 bjj_22, boolean[] blArray) {
        this.ipt = bjj_22;
        this.ipu = blArray;
    }

    public boolean b(bjj_2 bjj_22) {
        if (bjj_22.ipC.equals(this.ipt.ipC)) {
            bjj_22.t(this.ipt.beD);
            this.ipu[0] = true;
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((bjj_2)object);
    }
}

