/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fgY
 */
public class fgy_0 {
    private static final Logger smv = Logger.getLogger(fgy_0.class);
    public static final List<eNd> smw = List.of(eNd.qOZ, eNd.qPa, eNd.qPb, eNd.qPc);
    public static final byte[] smx = new byte[]{fgy_0.P(smw.subList(0, 0)), fgy_0.P(smw.subList(0, 1)), fgy_0.P(smw.subList(0, 2)), fgy_0.P(smw.subList(0, 3)), fgy_0.P(smw.subList(0, 4))};
    private TIntObjectHashMap<HashSet<eNd>> smy = new TIntObjectHashMap();

    public fgy_0() {
    }

    public fgy_0(fgy_0 fgy_02) {
        TIntObjectIterator tIntObjectIterator = fgy_02.smy.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            HashSet<eNd> hashSet = new HashSet<eNd>();
            for (eNd eNd2 : (HashSet)tIntObjectIterator.value()) {
                hashSet.add(eNd2);
            }
            this.smy.put(tIntObjectIterator.key(), hashSet);
        }
    }

    public static Collection<eNd> d(HashSet<eNd> hashSet) {
        ArrayList<eNd> arrayList = new ArrayList<eNd>(hashSet);
        arrayList.sort(Comparator.comparingInt(eNd::aJr));
        return arrayList;
    }

    public void a(vg_2 vg_22) {
        vg_22.afS = fgy_0.P((Collection)this.smy.get(enf_0.qPQ.d()));
        vg_22.afT = fgy_0.P((Collection)this.smy.get(enf_0.qPR.d()));
    }

    public static fgy_0 b(vg_2 vg_22) {
        fgy_0 fgy_02 = new fgy_0();
        fgy_0.a(fgy_02, vg_22.afS, enf_0.qPQ.d());
        fgy_0.a(fgy_02, vg_22.afT, enf_0.qPR.d());
        return fgy_02;
    }

    public static void a(fgy_0 fgy_02, byte by, int n) {
        if (by != 0) {
            HashSet<eNd> hashSet = fgy_0.gp(by);
            fgy_02.a(n, hashSet);
        }
    }

    @NotNull
    public static HashSet<eNd> gp(byte by) {
        HashSet<eNd> hashSet = new HashSet<eNd>();
        for (eNd eNd2 : smw) {
            if ((by & 1 << eNd2.aJr()) == 0) continue;
            hashSet.add(eNd2);
        }
        return hashSet;
    }

    private void a(int n, HashSet<eNd> hashSet) {
        this.smy.put(n, hashSet);
    }

    public static byte P(Collection<eNd> collection) {
        byte by = 0;
        if (collection != null) {
            for (eNd eNd2 : smw) {
                if (!collection.contains(eNd2)) continue;
                by = (byte)(by | 1 << eNd2.aJr());
            }
        }
        return by;
    }

    public byte Vh(int n) {
        return fgy_0.P((Collection)this.smy.get(n));
    }

    public void cN(ffV ffV2) {
        for (enk_0 enk_02 : ffV2) {
            int n = enk_02.avZ();
            if (n != enf_0.qPQ.d() && n != enf_0.qPR.d()) continue;
            if (this.smy == null) {
                this.smy = new TIntObjectHashMap();
            }
            HashSet hashSet = (HashSet)this.smy.get(n);
            HashSet<eNd> hashSet2 = new HashSet<eNd>();
            do {
                hashSet2.clear();
                ArrayList<eNd> arrayList = new ArrayList<eNd>(smw);
                int n2 = (int)enk_02.Rz(1);
                if (n2 > arrayList.size()) {
                    smv.error((Object)("[GD-SAISIE] un effet \u00e0 \u00e9l\u00e9ments variables demande un nombre d'\u00e9l\u00e9ments trop important : " + String.valueOf(enk_02)));
                    continue;
                }
                while (n2 > hashSet2.size()) {
                    int n3 = ve_0.pV(arrayList.size()) - 1;
                    eNd eNd2 = arrayList.remove(n3);
                    hashSet2.add(eNd2);
                }
            } while (fgy_0.P(hashSet) == fgy_0.P(hashSet2));
            this.smy.put(n, hashSet2);
        }
    }

    public HashSet<eNd> Vi(int n) {
        return (HashSet)this.smy.get(n);
    }

    public TIntObjectHashMap<HashSet<eNd>> fXz() {
        return this.smy;
    }

    public boolean aJG() {
        if (this.smy.isEmpty()) {
            return true;
        }
        TIntObjectIterator tIntObjectIterator = this.smy.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (((HashSet)tIntObjectIterator.value()).isEmpty()) continue;
            return false;
        }
        return true;
    }

    public int Vj(int n) {
        if (!this.smy.containsKey(n)) {
            return 0;
        }
        return ((HashSet)this.smy.get(n)).size();
    }

    public String toString() {
        return "MultiElementsInfo{m_multiElementsEffects=" + String.valueOf(this.smy) + "}";
    }
}

