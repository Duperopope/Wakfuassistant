/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bEs
 */
class bes_0
implements aqg_1<aMZ> {
    final /* synthetic */ TIntObjectHashMap jOo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bes_0(bEr bEr2, TIntObjectHashMap tIntObjectHashMap) {
        this.jOo = tIntObjectHashMap;
    }

    public void b(aMZ aMZ2) {
        try {
            bEq bEq2 = bEr.a(aMZ2);
            this.jOo.put((int)bEq2.aIi(), (Object)bEq2);
        }
        catch (Exception exception) {
            bEr.jOm.error((Object)("Exception levee sur " + aMZ2.aIi()), (Throwable)exception);
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.b((aMZ)aqz_22);
    }
}

