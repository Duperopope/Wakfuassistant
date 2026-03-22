/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntShortHashMap
 *  gnu.trove.map.hash.TShortShortHashMap
 */
import gnu.trove.map.hash.TIntShortHashMap;
import gnu.trove.map.hash.TShortShortHashMap;
import java.util.HashMap;

/*
 * Renamed from eXX
 */
public class exx_1 {
    private final int rJj;
    private final TIntShortHashMap rJk = new TIntShortHashMap();
    private final TShortShortHashMap rJl = new TShortShortHashMap();

    public exx_1(int n) {
        this.rJj = n;
    }

    public int d() {
        return this.rJj;
    }

    public void e(HashMap<Integer, Short> hashMap) {
        this.rJk.clear();
        this.rJk.putAll(hashMap);
    }

    public void f(HashMap<Short, Short> hashMap) {
        this.rJl.clear();
        this.rJl.putAll(hashMap);
    }

    public short D(int n, short s) {
        short s2 = this.rJk.get(n);
        if (s2 != 0 || this.rJk.contains(n)) {
            return s2;
        }
        short s3 = this.rJl.get(s);
        if (s3 != 0 || this.rJl.contains(s)) {
            return s3;
        }
        return 0;
    }

    public int[] fPi() {
        return this.rJk.keys();
    }

    public short[] fPj() {
        return this.rJl.keys();
    }
}

