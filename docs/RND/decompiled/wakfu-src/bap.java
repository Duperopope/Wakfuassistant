/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

class bap
implements aqg_1<aOB> {
    final /* synthetic */ TIntObjectHashMap hyR;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bap(TIntObjectHashMap tIntObjectHashMap) {
        this.hyR = tIntObjectHashMap;
    }

    public void a(aOB aOB2) {
        bmq_0 bmq_02 = new bmq_0();
        bao.a(bmq_02, aOB2);
        this.hyR.put((int)bmq_02.gjy(), (Object)bmq_02);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aOB)aqz_22);
    }
}

