/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.Collection;

class foW
implements TIntObjectProcedure<TProtector> {
    final /* synthetic */ fpd sNf;
    final /* synthetic */ Collection sNg;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    foW(foV foV2, fpd fpd2, Collection collection) {
        this.sNf = fpd2;
        this.sNg = collection;
    }

    public boolean a(int n, TProtector TProtector) {
        if (this.sNf == null || this.sNf.match(TProtector)) {
            this.sNg.add(TProtector);
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (foP)object);
    }
}

