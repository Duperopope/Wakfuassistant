/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public class foT {
    public static final foT sMZ = new foT();
    private final TIntObjectHashMap<foS> sNa = new TIntObjectHashMap();

    public void a(int n, foS foS2) {
        this.sNa.put(n, (Object)foS2);
    }

    public foS Yl(int n) {
        foS foS2 = (foS)this.sNa.get(n);
        if (foS2 == null) {
            foS2 = new foS();
            this.a(n, foS2);
        }
        return foS2;
    }
}

