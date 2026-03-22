/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Collection;

class eVt
implements TObjectProcedure<F> {
    final /* synthetic */ evb_0[] rzX;
    final /* synthetic */ Collection rzY;
    final /* synthetic */ evr_0 rzZ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    eVt(evr_0 evr_02, evb_0[] evb_0Array, Collection collection) {
        this.rzZ = evr_02;
        this.rzX = evb_0Array;
        this.rzY = collection;
    }

    public boolean u(F f2) {
        if (this.rzZ.a(f2, this.rzX)) {
            this.rzY.add(f2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.u((exP)object);
    }
}

