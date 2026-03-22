/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

class Ul
implements TObjectProcedure<List<TO>> {
    final /* synthetic */ TO buD;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    Ul(Uj uj, TO tO) {
        this.buD = tO;
    }

    public boolean k(List<TO> list) {
        list.remove(this.buD);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.k((List)object);
    }
}

