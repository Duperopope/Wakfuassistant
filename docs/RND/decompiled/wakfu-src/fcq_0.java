/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fcq
 */
class fcq_0
implements TObjectProcedure<fbl_0> {
    final /* synthetic */ fcp_0 rTB;

    fcq_0(fcp_0 fcp_02) {
        this.rTB = fcp_02;
    }

    public boolean a(fbl_0 fbl_02) {
        int n = this.rTB.b(fbl_02);
        if (n > 0) {
            this.rTB.rTA.adjustOrPutValue(fbl_02.coB(), n, n);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fbl_0)object);
    }
}

