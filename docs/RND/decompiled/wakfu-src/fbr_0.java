/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from fbR
 */
class fbr_0
implements TObjectProcedure<fbk_0> {
    final /* synthetic */ fby_0 rSC;
    final /* synthetic */ ArrayList rSD;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fbr_0(fby_0 fby_02, ArrayList arrayList) {
        this.rSC = fby_02;
        this.rSD = arrayList;
    }

    public boolean i(fbk_0 fbk_02) {
        if (fbk_02.coj() == this.rSC.fSr()) {
            this.rSD.add(fbk_02);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.i((fbk_0)object);
    }
}

