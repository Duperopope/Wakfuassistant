/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from aGk
 */
public class agk_2 {
    private final TIntObjectHashMap<agl_2> dKK = new TIntObjectHashMap();

    public boolean e(afx_1 afx_12) {
        this.dKK.remove(afx_12.caw());
        return this.dKK.isEmpty();
    }

    public boolean a(agj_2 agj_22) {
        Object[] objectArray = new agl_2[this.dKK.size()];
        for (agl_2 agl_22 : (agl_2[])this.dKK.values(objectArray)) {
            agl_22.a(agj_22);
            if (!agl_22.cbs()) continue;
            this.dKK.remove(agl_22.cbt());
        }
        return this.dKK.isEmpty();
    }

    public void a(afx_1 afx_12, String string, afq_2[] afq_2Array, boolean bl) {
        this.dKK.put(afx_12.caw(), (Object)new agl_2(afx_12, string, afq_2Array, bl));
    }
}

