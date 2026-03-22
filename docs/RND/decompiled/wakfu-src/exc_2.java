/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eXC
 */
class exc_2
implements TObjectProcedure<exf_2> {
    final /* synthetic */ pu_0 rIr;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    exc_2(exy_2 exy_22, pu_0 pu_02) {
        this.rIr = pu_02;
    }

    public boolean i(exf_2 exf_22) {
        exf_22.b(this.rIr);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.i((exf_2)object);
    }
}

