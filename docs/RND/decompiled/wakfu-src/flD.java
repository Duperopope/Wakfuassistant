/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 */
import gnu.trove.procedure.TLongProcedure;

class flD
implements TLongProcedure {
    final /* synthetic */ flB sFN;

    flD(flB flB2) {
        this.sFN = flB2;
    }

    public boolean execute(long l) {
        this.sFN.sFK.add(l);
        return true;
    }
}

