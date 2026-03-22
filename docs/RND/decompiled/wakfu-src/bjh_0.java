/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

/*
 * Renamed from bJh
 */
class bjh_0
implements TIntProcedure {
    final /* synthetic */ ahv_2 klj;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bjh_0(bjg_0 bjg_02, ahv_2 ahv_22) {
        this.klj = ahv_22;
    }

    public boolean execute(int n) {
        Object r = fgD.fXh().Vd(n);
        this.klj.a(eLL.qJc, -1, -1, null).c(" ");
        this.klj.c(((fhc_0)r).getName()).c(" ");
        this.klj.a(auc_0.cVq().zx(((fhc_0)r).aVt()), 16, 16, null);
        this.klj.ceH();
        return true;
    }
}

