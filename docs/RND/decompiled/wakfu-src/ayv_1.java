/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;

/*
 * Renamed from ayv
 */
class ayv_1
implements TIntProcedure {
    final /* synthetic */ ArrayList dte;
    final /* synthetic */ ayu_1 dtf;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ayv_1(ayu_1 ayu_12, ArrayList arrayList) {
        this.dtf = ayu_12;
        this.dte = arrayList;
    }

    public boolean execute(int n) {
        this.dte.add(this.dtf.bXE.get(n));
        return true;
    }
}

