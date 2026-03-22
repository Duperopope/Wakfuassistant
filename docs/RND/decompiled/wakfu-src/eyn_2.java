/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eYN
 */
class eyn_2
implements TObjectProcedure<ezv_1> {
    final /* synthetic */ jv_2 rLp;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    eyn_2(jv_2 jv_22) {
        this.rLp = jv_22;
    }

    public boolean b(ezv_1 ezv_12) {
        this.rLp.a(eyk_2.o(ezv_12));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ezv_1)object);
    }
}

