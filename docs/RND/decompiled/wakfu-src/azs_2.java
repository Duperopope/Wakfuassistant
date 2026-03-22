/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from azs
 */
public class azs_2<K, V>
implements Iterable {
    protected final LinkedHashMap<K, V> dvy;
    int dvz;
    private int dvs = 0;
    private int dvr = 1;

    public azs_2(int n) {
        this.dvz = n;
        this.dvy = new azt_2(this, n, 0.75f, true);
    }

    public V O(K k2) {
        return this.dvy.get(k2);
    }

    public void f(K k2, V v) {
        this.dvy.put(k2, v);
    }

    public V P(K k2) {
        return this.dvy.remove(k2);
    }

    public void clear() {
        this.dvy.clear();
    }

    public int bTv() {
        return this.dvz;
    }

    public void vP(int n) {
        this.dvz = n;
        this.dvr = 1;
        this.dvs = 0;
    }

    public int bTu() {
        return this.dvs;
    }

    public int bTt() {
        return this.dvr;
    }

    public int bTw() {
        return this.dvy.size() * 100 / this.dvz;
    }

    public int aVo() {
        return this.dvy.size();
    }

    @NotNull
    public Iterator iterator() {
        return this.dvy.values().iterator();
    }

    public boolean vQ(int n) {
        return this.dvy.containsKey(n);
    }
}

