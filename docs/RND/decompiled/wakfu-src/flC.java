/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

class flC
implements TLongObjectProcedure<flv_0> {
    final /* synthetic */ flB sFM;

    flC(flB flB2) {
        this.sFM = flB2;
    }

    public boolean a(long l, flv_0 flv_02) {
        if (flv_02.bfb()) {
            this.sFM.sFK.add(l);
        }
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (flv_0)object);
    }
}

