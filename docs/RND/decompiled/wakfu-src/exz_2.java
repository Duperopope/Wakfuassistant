/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eXz
 */
class exz_2
implements TObjectProcedure<exf_2> {
    final /* synthetic */ exy_2 rIo;

    exz_2(exy_2 exy_22) {
        this.rIo = exy_22;
    }

    public boolean i(exf_2 exf_22) {
        this.rIo.e(exf_22.dqy()).g(exf_22);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.i((exf_2)object);
    }
}

