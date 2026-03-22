/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

class aJt
implements TLongObjectProcedure<bKV> {
    final /* synthetic */ aJs ebe;

    aJt(aJs aJs2) {
        this.ebe = aJs2;
    }

    public boolean a(long l, bKV bKV2) {
        byte by;
        byte by2 = this.ebe.eaY.get((Object)bKV2);
        if (by2 != (by = this.ebe.d(bKV2))) {
            this.ebe.cSL = true;
        }
        this.ebe.eaY.put((Object)bKV2, by);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (bKV)object);
    }
}

