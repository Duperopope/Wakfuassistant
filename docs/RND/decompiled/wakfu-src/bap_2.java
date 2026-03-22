/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from baP
 */
public class bap_2 {
    private static final bap_2 hzu = new bap_2();
    private static final HashMap<Long, HashMap<String, Integer>> hzv = new HashMap();

    private bap_2() {
    }

    public static bap_2 cZB() {
        return hzu;
    }

    public void a(ero_0 ero_02, String string, int n) {
        HashMap<String, Integer> hashMap = hzv.get(ero_02.LV());
        if (hashMap == null) {
            hashMap = new HashMap();
            hzv.put(ero_02.LV(), hashMap);
        }
        hashMap.put(string, n);
    }

    public int a(ero_0 ero_02, String string) {
        HashMap<String, Integer> hashMap = hzv.get(ero_02.LV());
        if (hashMap != null) {
            int n = hashMap.remove(string);
            if (hashMap.isEmpty()) {
                hzv.remove(ero_02.LV());
            }
            agZ.bzy().so(n);
            return n;
        }
        return -1;
    }

    public void a(ero_0 ero_02) {
        HashMap<String, Integer> hashMap = hzv.get(ero_02.LV());
        if (hashMap != null) {
            for (int n : hashMap.values()) {
                agZ.bzy().so(n);
            }
            hzv.remove(ero_02.LV());
        }
    }
}

