/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bNs
 */
class bns_1
implements TObjectProcedure<fao> {
    final /* synthetic */ bnr_0 kCl;

    bns_1(bnr_0 bnr_02) {
        this.kCl = bnr_02;
    }

    public boolean a(fao fao2) {
        try {
            this.kCl.kCk.add(new bnp_0(fao2));
        }
        catch (Exception exception) {
            bnr_0.kCg.error((Object)exception.getMessage(), (Throwable)exception);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fao)object);
    }
}

