/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

class eIe
implements TIntProcedure {
    final /* synthetic */ eIb quR;
    final /* synthetic */ eId quS;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    eIe(eId eId2, eIb eIb2) {
        this.quS = eId2;
        this.quR = eIb2;
    }

    public boolean execute(int n) {
        this.quS.quQ.put(n, this.quR.d());
        return true;
    }
}

