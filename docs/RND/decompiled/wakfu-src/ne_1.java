/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;

/*
 * Renamed from Ne
 */
public abstract class ne_1<T extends ni_1>
extends RC<T> {
    private final TShortObjectHashMap<ayw_2<ng_1>> aXN = new TShortObjectHashMap();
    private final TIntObjectHashMap<nf_1> aXO = new TIntObjectHashMap();

    public final void a(nh_1[] nh_1Array) {
        for (nh_1 nh_12 : nh_1Array) {
            this.aXN.put(nh_12.aVE(), nh_12.aVF());
        }
    }

    public final void a(int n, short s, int n2, byte by, int n3, int n4, int n5) {
        this.aXO.put(n, (Object)new nf_1(s, n2, by, n3, n4, n5));
    }

    public final TIntIntHashMap P(short s) {
        TIntIntHashMap tIntIntHashMap = new TIntIntHashMap();
        TIntObjectIterator tIntObjectIterator = this.aXO.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            nf_1 nf_12 = (nf_1)tIntObjectIterator.value();
            if (nf_12.aXP != s) continue;
            tIntIntHashMap.put(tIntObjectIterator.key(), nf_12.aXQ);
        }
        return tIntIntHashMap;
    }

    public final ayw_2<ng_1> nR(int n) {
        nf_1 nf_12 = (nf_1)this.aXO.get(n);
        if (nf_12 == null) {
            blS.error((Object)("Aucune d\u00e9finition pour la vue de viewModelId=" + n));
            return null;
        }
        short s = nf_12.aXP;
        ayw_2 ayw_22 = (ayw_2)this.aXN.get(s);
        if (ayw_22 == null) {
            blS.error((Object)("Aucune factory d'enregistr\u00e9e pour le viewTypeId=" + s));
        }
        return ayw_22;
    }

    public final ng_1 nS(int n) {
        ayw_2<ng_1> ayw_22 = this.nR(n);
        if (ayw_22 == null) {
            return null;
        }
        nf_1 nf_12 = (nf_1)this.aXO.get(n);
        if (nf_12 == null) {
            return null;
        }
        ng_1 ng_12 = ayw_22.baw();
        ng_12.nT(n);
        ng_12.nU(nf_12.aXQ);
        ng_12.B(nf_12.aXR);
        ng_12.aD(nf_12.aXR == 0);
        ng_12.nV(nf_12.aXS);
        ng_12.K(nf_12.aXT, nf_12.aXU);
        return ng_12;
    }
}

