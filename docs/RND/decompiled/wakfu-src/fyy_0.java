/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Collection;

/*
 * Renamed from fyy
 */
class fyy_0
implements TObjectProcedure<fhv_1> {
    final /* synthetic */ Collection tCI;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fyy_0(fyw_0 fyw_02, Collection collection) {
        this.tCI = collection;
    }

    public boolean i(fhv_1 fhv_12) {
        try {
            if (!fhv_12.isUnloading() && "MRU".equals(fhv_12.getElementMap().getId())) {
                this.tCI.add(fhv_12);
            }
        }
        catch (Exception exception) {
            fyw_0.tBD.error((Object)"Exception lev\u00e9e lors du parcours des \u00e9l\u00e9ments charg\u00e9s pour pouvoir fermer les MRU", (Throwable)exception);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.i((fhv_1)object);
    }
}

