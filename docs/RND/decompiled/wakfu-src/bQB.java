/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public class bQB {
    public static final bQB kVP = new bQB();
    private final TIntObjectHashMap<bQA> kVQ = new TIntObjectHashMap();

    private bQB() {
    }

    public void a(bQA bQA2) {
        this.kVQ.put(bQA2.coF(), (Object)bQA2);
    }

    public bQA IU(int n) {
        return (bQA)this.kVQ.get(n);
    }
}

