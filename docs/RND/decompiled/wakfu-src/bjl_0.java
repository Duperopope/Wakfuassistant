/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from bJl
 */
class bjl_0
implements TIntObjectProcedure<axb_2> {
    final /* synthetic */ bjk_0 klo;

    bjl_0(bjk_0 bjk_02) {
        this.klo = bjk_02;
    }

    public boolean c(int n, axb_2 axb_22) {
        this.klo.a(n, axb_22.bQj());
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.c(n, (axb_2)object);
    }
}

