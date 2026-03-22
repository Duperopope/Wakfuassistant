/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from aBp
 */
class abp_2
implements TIntObjectProcedure<abq_2> {
    final /* synthetic */ ArrayList dyG;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    abp_2(abo_2 abo_22, ArrayList arrayList) {
        this.dyG = arrayList;
    }

    public boolean a(int n, abq_2 abq_22) {
        Iterator iterator = this.dyG.iterator();
        while (iterator.hasNext()) {
            Runnable runnable = (Runnable)iterator.next();
            if (abq_22.j(runnable)) continue;
            iterator.remove();
        }
        return !this.dyG.isEmpty();
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (abq_2)object);
    }
}

