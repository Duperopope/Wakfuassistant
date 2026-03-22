/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fco
 */
class fco_0
implements TObjectProcedure<fbl_0> {
    final /* synthetic */ fcn_0 rTx;

    fco_0(fcn_0 fcn_02) {
        this.rTx = fcn_02;
    }

    public boolean a(fbl_0 fbl_02) {
        int n = this.rTx.b(fbl_02);
        if (n > 0) {
            this.rTx.rTw.adjustOrPutValue(fbl_02.coB(), n, n);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fbl_0)object);
    }
}

