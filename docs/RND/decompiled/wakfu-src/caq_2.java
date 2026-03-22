/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.set.hash.TShortHashSet
 */
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.set.hash.TShortHashSet;
import java.util.Arrays;

/*
 * Renamed from caq
 */
class caq_2
extends aat_1<short[]> {
    private short[] lGk;

    caq_2(int n) {
        super(n);
    }

    public static void a(caq_2 caq_22, caq_2 caq_23, TShortObjectHashMap<short[]> tShortObjectHashMap) {
        for (int i = 0; i < caq_22.bTW(); ++i) {
            short[] sArray = (short[])caq_22.wD(i);
            if (Arrays.binarySearch(sArray, (short)0) < 0) continue;
            short s = caq_22.wC(i);
            TShortHashSet tShortHashSet = new TShortHashSet((short[])tShortObjectHashMap.get(s));
            tShortHashSet.addAll(caq_23.eri());
            short[] sArray2 = tShortHashSet.toArray();
            Arrays.sort(sArray2);
            tShortObjectHashMap.put(s, (Object)sArray2);
        }
    }

    private short[] eri() {
        if (this.lGk == null) {
            int n = this.bTW();
            TShortArrayList tShortArrayList = new TShortArrayList(n);
            for (int i = 0; i < n; ++i) {
                short s = this.wC(i);
                if (s > 0) continue;
                tShortArrayList.add(s);
            }
            this.lGk = tShortArrayList.toArray();
        }
        return this.lGk;
    }
}

