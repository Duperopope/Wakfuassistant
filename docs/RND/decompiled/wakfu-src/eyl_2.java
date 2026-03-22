/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eYL
 */
class eyl_2
implements TObjectProcedure<fab> {
    final /* synthetic */ jv_2 rLm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    eyl_2(jv_2 jv_22) {
        this.rLm = jv_22;
    }

    public boolean f(fab fab2) {
        this.rLm.a(eyk_2.m(fab2));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.f((fab)object);
    }
}

