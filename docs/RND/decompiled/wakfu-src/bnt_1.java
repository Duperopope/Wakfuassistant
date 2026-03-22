/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bNt
 */
class bnt_1
implements TObjectProcedure<fap> {
    final /* synthetic */ bnr_0 kCm;

    bnt_1(bnr_0 bnr_02) {
        this.kCm = bnr_02;
    }

    public boolean a(fap fap2) {
        this.kCm.kCk.add(new bnq_0(fap2));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fap)object);
    }
}

