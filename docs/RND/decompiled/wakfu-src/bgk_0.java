/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from bgK
 */
class bgk_0
implements TLongObjectProcedure<bgy> {
    final /* synthetic */ bgj_0 icV;

    bgk_0(bgj_0 bgj_02) {
        this.icV = bgj_02;
    }

    public boolean a(long l, bgy bgy2) {
        int n = bgy2.doV().cqy();
        bgj_0.a(this.icV, n);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (bgy)object);
    }
}

