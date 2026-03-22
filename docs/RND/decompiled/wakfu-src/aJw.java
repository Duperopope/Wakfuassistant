/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntFloatProcedure
 */
import gnu.trove.procedure.TIntFloatProcedure;

class aJw
implements TIntFloatProcedure {
    final /* synthetic */ aJv ebh;

    aJw(aJv aJv2) {
        this.ebh = aJv2;
    }

    public boolean execute(int n, float f2) {
        if (f2 < 0.9019608f) {
            this.ebh.ebg.put(n, 0.9019608f);
        }
        return true;
    }
}

