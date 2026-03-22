/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;

/*
 * Renamed from ayw
 */
class ayw_1
implements TIntProcedure {
    final /* synthetic */ ArrayList dtg;
    final /* synthetic */ ayu_1 dth;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ayw_1(ayu_1 ayu_12, ArrayList arrayList) {
        this.dth = ayu_12;
        this.dtg = arrayList;
    }

    public boolean execute(int n) {
        this.dtg.add(this.dth.bXE.get(n));
        return true;
    }
}

