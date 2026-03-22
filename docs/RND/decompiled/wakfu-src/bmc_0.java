/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bMC
 */
class bmc_0
implements aqg_1<aOx> {
    final /* synthetic */ TIntObjectHashMap kyQ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bmc_0(bmb_0 bmb_02, TIntObjectHashMap tIntObjectHashMap) {
        this.kyQ = tIntObjectHashMap;
    }

    public void a(aOx aOx2) {
        try {
            bmt_0 bmt_02 = new bmt_0(bmb_0.d(aOx2));
            this.kyQ.put(bmt_02.d(), (Object)bmt_02);
        }
        catch (Exception exception) {
            bmb_0.aGh().error((Object)("Exception levee sur " + aOx2.d()), (Throwable)exception);
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aOx)aqz_22);
    }
}

