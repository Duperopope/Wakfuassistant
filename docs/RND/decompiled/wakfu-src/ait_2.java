/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntIntHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ait
 */
public class ait_2 {
    private static final Logger cyY = Logger.getLogger(ait_2.class);
    private static final boolean cyZ = true;
    private static final String cza = "scenario/";
    final TIntIntHashMap czb = new TIntIntHashMap();
    static final ait_2 czc = new ait_2();

    private ait_2() {
    }

    public static ait_2 bBq() {
        return czc;
    }

    public String sx(int n) {
        assert (afs_1.can().bYf() != null);
        return String.format("%s%d%s", cza, n, afs_1.can().bLX());
    }

    @Nullable
    public afx_1 g(int n, boolean bl) {
        afx_1 afx_12 = null;
        int n2 = this.czb.get(n);
        if (n2 > 0 && (afx_12 = afs_1.can().xD(n2)) != null) {
            return afx_12;
        }
        if (bl) {
            afx_12 = afs_1.can().a(this.sx(n), (afr_1[])null, false);
            if (afx_12 != null) {
                afx_12.c(new aiu_2(n));
                this.czb.put(n, afx_12.caw());
                return afx_12;
            }
            cyY.trace((Object)("On a pas trouv\u00e9 le script du sc\u00e9nario " + n));
        }
        return afx_12;
    }

    public void a(int n, int n2, long[] lArray, boolean bl) {
        afx_1 afx_12 = this.g(n, true);
        if (afx_12 == null) {
            cyY.error((Object)("runEvent : impossible de trouver un script d'id de sc\u00e9nario " + n));
            return;
        }
        afq_2[] afq_2Array = new afq_2[lArray.length];
        for (int i = 0; i < afq_2Array.length; ++i) {
            afq_2Array[i] = new afq_2(lArray[i]);
        }
        String string = null;
        string = bl ? "reward_" + n + "_" + n2 : "event_" + n + "_" + n2;
        afx_12.a(string.replaceAll("-", "_"), afq_2Array, new afp_2[0]);
    }

    public void clear() {
        this.czb.clear();
    }
}

