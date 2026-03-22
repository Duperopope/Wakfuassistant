/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;

/*
 * Renamed from bIA
 */
class bia_2
implements TIntProcedure {
    final /* synthetic */ ArrayList kgI;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bia_2(ArrayList arrayList) {
        this.kgI = arrayList;
    }

    public boolean execute(int n) {
        String string = String.format("havenWorld.buildingWorldEffect%d", n);
        if (aum_0.cWf().cO(string)) {
            this.kgI.add(aum_0.cWf().c(string, new Object[0]));
        }
        return true;
    }
}

