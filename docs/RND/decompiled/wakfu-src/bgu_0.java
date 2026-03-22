/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bgU
 */
class bgu_0
implements TObjectProcedure<exP> {
    final /* synthetic */ ArrayList ifw;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bgu_0(ArrayList arrayList) {
        this.ifw = arrayList;
    }

    public boolean u(exP exP2) {
        this.ifw.add(((bgy)exP2).dnG());
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.u((exP)object);
    }
}

