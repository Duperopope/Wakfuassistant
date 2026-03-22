/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;

class bvt
implements TIntProcedure {
    final /* synthetic */ ArrayList jtk;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bvt(bvk bvk2, ArrayList arrayList) {
        this.jtk = arrayList;
    }

    public boolean execute(int n) {
        this.jtk.add(bcm_1.hIK.t(aue_0.cVJ().cVK().Sn(), n));
        return true;
    }
}

