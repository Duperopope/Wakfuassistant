/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eXm
 */
class exm_2
implements TObjectProcedure<exf_2> {
    final /* synthetic */ pu_0 rFL;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    exm_2(exh_1 exh_12, pu_0 pu_02) {
        this.rFL = pu_02;
    }

    public boolean i(exf_2 exf_22) {
        exf_22.b(this.rFL);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.i((exf_2)object);
    }
}

