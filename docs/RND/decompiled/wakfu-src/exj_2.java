/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eXj
 */
class exj_2
implements TObjectProcedure<exf_2> {
    final /* synthetic */ exh_1 rFI;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    exj_2(exh_1 exh_12, exh_1 exh_13) {
        this.rFI = exh_13;
    }

    public boolean i(exf_2 exf_22) {
        exf_2 exf_23 = this.rFI.e(exf_22.dqy());
        exf_22.g(exf_23);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.i((exf_2)object);
    }
}

