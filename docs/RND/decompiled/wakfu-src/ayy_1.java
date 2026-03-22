/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;

/*
 * Renamed from ayy
 */
class ayy_1
implements TIntProcedure {
    final /* synthetic */ ArrayList dtj;
    final /* synthetic */ ayu_1 dtk;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ayy_1(ayu_1 ayu_12, ArrayList arrayList) {
        this.dtk = ayu_12;
        this.dtj = arrayList;
    }

    public boolean execute(int n) {
        this.dtj.remove(this.dtk.bXE.get(n));
        return true;
    }
}

