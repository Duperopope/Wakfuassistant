/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from aGQ
 */
public class agq_1 {
    public static final agq_1 dML = new agq_1(0.5f, 0.5f);
    public static final String dMM = "gain";
    public static final String dMN = "gainHF";
    private float czn = 0.5f;
    private float dMO = 0.5f;

    private agq_1() {
    }

    public agq_1(float f2, float f3) {
        this.czn = f2;
        this.dMO = f3;
    }

    public static agq_1 f(apd_1 apd_12) {
        agq_1 agq_12 = new agq_1();
        for (apd_1 apd_13 : apd_12.getChildren()) {
            if (apd_13.getName().equals(dMM)) {
                agq_12.czn = apd_13.fq("value").bCs();
                continue;
            }
            if (!apd_13.getName().equals(dMN)) continue;
            agq_12.dMO = apd_13.fq("value").bCs();
        }
        return agq_12;
    }

    public static TIntObjectHashMap<agq_1> g(apd_1 apd_12) {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (apd_1 apd_13 : apd_12.getChildren()) {
            if (!apd_13.getName().equals("lowpass")) continue;
            tIntObjectHashMap.put(apd_13.fq("id").bCo(), (Object)agq_1.f(apd_13));
        }
        return tIntObjectHashMap;
    }

    public float bBt() {
        return this.czn;
    }

    public float cbT() {
        return this.dMO;
    }
}

