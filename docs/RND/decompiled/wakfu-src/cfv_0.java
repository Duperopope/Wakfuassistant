/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cfV
 */
class cfv_0
implements TObjectProcedure<eVZ> {
    final /* synthetic */ cft_0 lTk;

    cfv_0(cft_0 cft_02) {
        this.lTk = cft_02;
    }

    public boolean b(eVZ eVZ2) {
        this.lTk.a(eVZ2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((eVZ)object);
    }
}

