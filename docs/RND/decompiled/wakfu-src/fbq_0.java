/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fbQ
 */
class fbq_0
implements TObjectProcedure<fby_0> {
    fbq_0() {
    }

    public boolean f(fby_0 fby_02) {
        fbo_0.rSz.put(fby_02.fSr(), fbo_0.c(fby_02));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.f((fby_0)object);
    }
}

