/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from bce
 */
class bce_1
implements TIntObjectProcedure<bcm_2> {
    final /* synthetic */ bcd_2 hDC;

    bce_1(bcd_2 bcd_22) {
        this.hDC = bcd_22;
    }

    public boolean a(int n, bcm_2 bcm_22) {
        this.hDC.hDu.put(n, (Object)new bcm_2(bcm_22));
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bcm_2)object);
    }
}

