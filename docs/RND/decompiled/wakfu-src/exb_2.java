/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eXB
 */
class exb_2
implements TObjectProcedure<exf_2> {
    final /* synthetic */ pu_0 rIq;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    exb_2(exy_2 exy_22, pu_0 pu_02) {
        this.rIq = pu_02;
    }

    public boolean i(exf_2 exf_22) {
        exf_22.a(this.rIq);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.i((exf_2)object);
    }
}

