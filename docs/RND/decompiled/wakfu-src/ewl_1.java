/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.List;

/*
 * Renamed from eWL
 */
class ewl_1
implements TIntObjectProcedure<List<enk_0>> {
    final /* synthetic */ LU rCe;
    final /* synthetic */ azg_1 rCf;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ewl_1(LU lU, azg_1 azg_12) {
        this.rCe = lU;
        this.rCf = azg_12;
    }

    public boolean c(int n, List<enk_0> list) {
        this.rCe.aTo();
        this.rCf.vC(n);
        this.rCf.aF((byte)list.size());
        for (enk_0 enk_02 : list) {
            this.rCf.vC(enk_02.aZH());
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.c(n, (List)object);
    }
}

