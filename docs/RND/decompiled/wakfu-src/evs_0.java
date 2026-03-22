/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eVs
 */
class evs_0
implements TObjectProcedure<eVw> {
    final /* synthetic */ exP rzW;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    evs_0(evr_0 evr_02, exP exP2) {
        this.rzW = exP2;
    }

    public boolean a(eVw eVw2) {
        if (eVw2.qZ(this.rzW.Sn())) {
            eVw2.a(null, (byte)-1);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((eVw)object);
    }
}

