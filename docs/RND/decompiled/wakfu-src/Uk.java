/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

class Uk
implements TObjectProcedure<List<TO>> {
    final /* synthetic */ TO buC;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    Uk(Uj uj, TO tO) {
        this.buC = tO;
    }

    public boolean k(List<TO> list) {
        list.remove(this.buC);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.k((List)object);
    }
}

