/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from cPA
 */
public final class cpa_1 {
    private static final List<? extends pv_0> nhU = ImmutableList.of((Object)ezj_0.psV, (Object)ezj_0.puc);
    private static final Map<pv_0, List<Integer>> nhV = new HashMap<pv_0, List<Integer>>();

    private cpa_1() {
    }

    public static boolean j(pv_0 pv_02) {
        return nhU.contains(pv_02);
    }

    public static boolean Mg(int n) {
        for (List<Integer> list : nhV.values()) {
            if (!list.contains(n)) continue;
            return true;
        }
        return false;
    }

    public static int k(pv_0 pv_02) {
        if (nhV.containsKey(pv_02)) {
            return nhV.get(pv_02).size();
        }
        throw new IllegalArgumentException("La propri\u00e9t\u00e9 ne correspond pas \u00e0 un type d'encapuchonn\u00e9" + String.valueOf(pv_02));
    }

    public static int a(int n, pv_0 pv_02) {
        if (nhV.containsKey(pv_02)) {
            return nhV.get(pv_02).get(n);
        }
        throw new IllegalArgumentException("La propri\u00e9t\u00e9 ne correspond pas \u00e0 un type d'encapuchonn\u00e9" + String.valueOf(pv_02));
    }

    static {
        nhV.put(ezj_0.psV, (List<Integer>)ImmutableList.of((Object)129402237, (Object)129402238, (Object)129402239));
        nhV.put(ezj_0.puc, (List<Integer>)ImmutableList.of((Object)180103927, (Object)180103928, (Object)180103929));
    }
}

