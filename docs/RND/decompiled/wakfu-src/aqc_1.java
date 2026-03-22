/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from aqC
 */
public class aqc_1 {
    public static <T> TIntObjectHashMap<T[]> b(TIntObjectHashMap<ArrayList<T>> tIntObjectHashMap) {
        TIntObjectHashMap tIntObjectHashMap2 = new TIntObjectHashMap(tIntObjectHashMap.size());
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            tIntObjectHashMap2.put(tIntObjectIterator.key(), (Object)((ArrayList)tIntObjectIterator.value()).toArray());
        }
        return tIntObjectHashMap2;
    }

    public static <T> HashMap<Integer, T[]> a(HashMap<Integer, ArrayList<T>> hashMap) {
        HashMap<Integer, T[]> hashMap2 = new HashMap<Integer, T[]>(hashMap.size());
        Set<Map.Entry<Integer, ArrayList<T>>> set = hashMap.entrySet();
        for (Map.Entry<Integer, ArrayList<T>> entry : set) {
            hashMap2.put(entry.getKey(), entry.getValue().toArray());
        }
        return hashMap2;
    }
}

