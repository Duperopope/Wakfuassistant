/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.Collection;

/*
 * Renamed from fjv
 */
class fjv_0
implements TIntObjectProcedure<fjo_0> {
    final /* synthetic */ Collection syP;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fjv_0(fju_0 fju_02, Collection collection) {
        this.syP = collection;
    }

    public boolean b(int n, fjo_0 fjo_02) {
        return !this.syP.contains(n);
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.b(n, (fjo_0)object);
    }
}

