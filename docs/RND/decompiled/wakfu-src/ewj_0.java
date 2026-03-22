/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongIntProcedure
 */
import gnu.trove.procedure.TLongIntProcedure;

/*
 * Renamed from eWJ
 */
class ewj_0
implements TLongIntProcedure {
    final /* synthetic */ azg_1 rCb;
    final /* synthetic */ ewn_2 rCc;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ewj_0(azg_1 azg_12, ewn_2 ewn_22) {
        this.rCb = azg_12;
        this.rCc = ewn_22;
    }

    public boolean execute(long l, int n) {
        this.rCb.gK(l);
        this.rCb.vC(n);
        this.rCb.aF((byte)(this.rCc.rk(l) ? 1 : 0));
        return true;
    }
}

