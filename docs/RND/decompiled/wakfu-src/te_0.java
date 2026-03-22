/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from Te
 */
class te_0
implements TObjectProcedure<TQuotaType> {
    te_0(td_0 td_02) {
    }

    public boolean b(TQuotaType TQuotaType) {
        ((sz_0)TQuotaType).bgw();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ta_0)object);
    }
}

