/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from Nb
 */
public class nb_2 {
    private static final nb_2 aXJ = new nb_2();
    private final TIntObjectHashMap<na_2> aXK = new TIntObjectHashMap();

    private nb_2() {
    }

    public static nb_2 aVA() {
        return aXJ;
    }

    public void a(int n, na_2 na_22) {
        this.aXK.put(n, (Object)na_22);
    }

    public na_2 nP(int n) {
        return (na_2)this.aXK.get(n);
    }
}

