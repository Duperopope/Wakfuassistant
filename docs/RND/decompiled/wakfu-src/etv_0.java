/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.List;

/*
 * Renamed from eTV
 */
class etv_0
implements TIntObjectProcedure<List<enk_0>> {
    final /* synthetic */ etu_0 rqR;

    etv_0(etu_0 etu_02) {
        this.rqR = etu_02;
    }

    public boolean c(int n, List<enk_0> list) {
        this.rqR.dHf().eLo().d(n, list);
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.c(n, (List)object);
    }
}

