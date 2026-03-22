/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ffG
 */
class ffg_0
implements TObjectProcedure<MI> {
    final /* synthetic */ ffd_0 sfZ;

    ffg_0(ffd_0 ffd_02) {
        this.sfZ = ffd_02;
    }

    public boolean f(MI MI) {
        for (fgx_0 fgx_02 : this.sfZ.sfV) {
            fgx_02.c((ffc_0)MI);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.f((ffc_0)object);
    }
}

