/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

class eLM
implements TIntProcedure {
    final /* synthetic */ emu_0 qJm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    eLM(emu_0 emu_02) {
        this.qJm = emu_02;
    }

    public boolean execute(int n) {
        if (enh_0.qWo.contains(n)) {
            return true;
        }
        eLL.qJk.put(n, (Object)this.qJm);
        return true;
    }
}

