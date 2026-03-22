/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.List;

/*
 * Renamed from eWK
 */
class ewk_2
implements TIntObjectProcedure<ewz_1<enk_0>> {
    final /* synthetic */ azg_1 rCd;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ewk_2(azg_1 azg_12) {
        this.rCd = azg_12;
    }

    public boolean a(int n, ewz_1<enk_0> ewz_12) {
        List<enk_0> list = ewz_12.eeu();
        this.rCd.vC(n);
        this.rCd.aF((byte)list.size());
        for (enk_0 enk_02 : list) {
            this.rCd.vC(enk_02.aZH());
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (ewz_1)object);
    }
}

