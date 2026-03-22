/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

class afo
implements TLongObjectProcedure<afb_0> {
    afo() {
    }

    public boolean a(long l, afb_0 afb_02) {
        afb_02.clear();
        ZM.bqw().d(afb_02);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (afb_0)object);
    }
}

