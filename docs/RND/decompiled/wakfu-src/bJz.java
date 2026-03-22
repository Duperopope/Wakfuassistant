/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

class bJz
implements TIntObjectProcedure<abm_1> {
    final /* synthetic */ wk_2 kma;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bJz(wk_2 wk_22) {
        this.kma = wk_22;
    }

    public boolean a(int n, abm_1 abm_12) {
        ws_2 ws_22 = new ws_2();
        ws_22.aiH.Th = n;
        ws_22.aiH.aaw = abm_12.bWb();
        ws_22.aiH.aax = abm_12.bWc();
        this.kma.aiq.aiG.add(ws_22);
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (abm_1)object);
    }
}

