/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TByteArrayList
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.list.array.TByteArrayList;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

/*
 * Renamed from aEb
 */
public class aeb_2 {
    private aeb_2() {
    }

    public static long a(TLongArrayList tLongArrayList) {
        int n = GC.mR(tLongArrayList.size());
        return tLongArrayList.removeAt(n);
    }

    public static boolean a(TLongArrayList tLongArrayList, long l) {
        boolean bl = false;
        for (int i = tLongArrayList.size() - 1; i >= 0; --i) {
            if (tLongArrayList.getQuick(i) != l) continue;
            tLongArrayList.removeAt(i);
            bl = true;
        }
        return bl;
    }

    public static boolean b(TLongArrayList tLongArrayList, long l) {
        int n = tLongArrayList.size();
        for (int i = 0; i < n; ++i) {
            if (tLongArrayList.getQuick(i) != l) continue;
            tLongArrayList.removeAt(i);
            return true;
        }
        return false;
    }

    public static boolean a(TIntArrayList tIntArrayList, int n) {
        int n2 = tIntArrayList.size();
        for (int i = 0; i < n2; ++i) {
            if (tIntArrayList.getQuick(i) != n) continue;
            tIntArrayList.removeAt(i);
            return true;
        }
        return false;
    }

    public static boolean a(TShortArrayList tShortArrayList, short s) {
        int n = tShortArrayList.size();
        for (int i = 0; i < n; ++i) {
            if (tShortArrayList.getQuick(i) != s) continue;
            tShortArrayList.removeAt(i);
            return true;
        }
        return false;
    }

    public static boolean a(TByteArrayList tByteArrayList, byte by) {
        int n = tByteArrayList.size();
        for (int i = 0; i < n; ++i) {
            if (tByteArrayList.getQuick(i) != by) continue;
            tByteArrayList.removeAt(i);
            return true;
        }
        return false;
    }

    public static <T> void a(TIntObjectHashMap<ArrayList<T>> tIntObjectHashMap, int n, T t) {
        ArrayList<T> arrayList = (ArrayList<T>)tIntObjectHashMap.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<T>();
            tIntObjectHashMap.put(n, arrayList);
        }
        arrayList.add(t);
    }
}

