/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from alk
 */
public class alk_2 {
    private final TIntObjectHashMap<all_2> cER = new TIntObjectHashMap();
    public static final alk_2 cES = new alk_2();
    static final int cET = 1;
    static final int cEU = 2;
    static final int cEV = 3;
    static final int cEW = 4;
    static final int cEX = 5;
    static final int cEY = 6;
    static final int cEZ = 7;

    public alk_2() {
        this.cER.put(1, aln_2::new);
        this.cER.put(2, alo_2::new);
        this.cER.put(3, alt_1::new);
        this.cER.put(4, als_1::new);
        this.cER.put(5, alq_2::new);
        this.cER.put(6, alp_2::new);
        this.cER.put(7, alr_2::new);
    }

    public alj_2 a(int n, apl_1 apl_12) {
        all_2 all_22 = (all_2)this.cER.get(n);
        return all_22.createData(apl_12);
    }
}

