/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bLz
 */
class blz_2
implements TObjectProcedure<blv_2> {
    final /* synthetic */ bly_2 kts;

    blz_2(bly_2 bly_22) {
        this.kts = bly_22;
    }

    public boolean b(blv_2 blv_22) {
        this.kts.ktq.add(new blx_2(blv_22));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((blv_2)object);
    }
}

