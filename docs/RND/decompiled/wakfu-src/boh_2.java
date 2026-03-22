/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from bOh
 */
public class boh_2 {
    public static final boh_2 kJT = new boh_2();
    private final TIntObjectHashMap<boi_2> kJU = new TIntObjectHashMap();

    private boh_2() {
    }

    public void d(int n, int[] nArray) {
        this.kJU.put(n, (Object)new boi_2(n, nArray));
    }

    public boolean b(TIntObjectProcedure<boi_2> tIntObjectProcedure) {
        return this.kJU.forEachEntry(tIntObjectProcedure);
    }
}

