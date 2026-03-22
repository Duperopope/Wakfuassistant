/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bMk
 */
class bmk_1
implements TObjectProcedure<eNd> {
    final /* synthetic */ ArrayList kwt;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bmk_1(ArrayList arrayList) {
        this.kwt = arrayList;
    }

    public boolean g(eNd eNd2) {
        this.kwt.add(bmj_1.f(eNd2));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.g((eNd)object);
    }
}

