/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from Nd
 */
public class nd_2<T extends ni_1, C extends ne_1<T>>
extends RB<T, C> {
    private final TLongObjectHashMap<int[]> aXL = new TLongObjectHashMap();

    public void a(RE rE, int[] nArray) {
        this.a(rE);
        this.aXL.put(rE.Sn(), (Object)nArray);
    }

    @Override
    protected void a(T t, RE rE) {
        int[] nArray = (int[])this.aXL.get(((RH)t).Sn());
        assert (nArray != null) : "element interactif " + ((RH)t).Sn() + " n'a pas de vue";
        for (int n : nArray) {
            ng_1 ng_12;
            if (blP.isTraceEnabled()) {
                blP.trace((Object)("Adding view " + n + " to element " + ((RH)t).Sn()));
            }
            if ((ng_12 = this.nQ(n)) == null) continue;
            ((ni_1)t).a(ng_12);
        }
    }

    public ng_1 nQ(int n) {
        return ((ne_1)this.blQ).nS(n);
    }
}

