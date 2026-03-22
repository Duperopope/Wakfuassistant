/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public class fiJ {
    public static final fiJ ssM = new fiJ();
    private final TIntObjectHashMap<fhw> ssN = new TIntObjectHashMap();

    private fiJ() {
    }

    public void a(int n, fhw fhw2) {
        this.ssN.put(n, (Object)fhw2);
    }

    public fhw Wb(int n) {
        return (fhw)this.ssN.get(n);
    }

    public String toString() {
        return "ExternalLootListManager{m_lootLists=" + this.ssN.size() + "}";
    }
}

