/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from Tg
 */
class tg_0
implements TObjectProcedure<R> {
    final /* synthetic */ tf_0 bsm;

    tg_0(tf_0 tf_02) {
        this.bsm = tf_02;
    }

    public boolean e(R r) {
        this.bsm.a(r);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((tk_0)object);
    }
}

