/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from aZU
 */
public final class azu_0
implements afl {
    private static final String hyC = "IsNeoServer".toLowerCase();

    public void a(WL wL) {
        HashMap<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
        for (apx_1 apx_12 : aqf_2.bGr().a(new az_0())) {
            az_0 az_02;
            if (!(apx_12 instanceof az_0) || (az_02 = (az_0)apx_12).aFV().isEmpty()) continue;
            List<Integer> list = az_02.aFV().stream().map(bb_0::azv).toList();
            hashMap.put(az_02.d(), list);
        }
        HashMap hashMap2 = new HashMap();
        aqb_1.bGD().a(new alb_0(), alb_02 -> {
            List<Bu> list = Arrays.stream(alb_02.clR()).map(aLC2 -> {
                int n = aLC2.clS();
                boolean bl = aLC2.clB().toLowerCase().contains(hyC);
                return new Bu<Integer, Boolean>(n, bl);
            }).toList();
            hashMap2.put(alb_02.d(), list);
        });
        aqb_1.bGD().a(new aNQ(), aNQ2 -> {
            int n = aNQ2.cto();
            int n2 = aNQ2.ctr();
            int n3 = aNQ2.ctt();
            azu_0.a(n3, n, hashMap2, hashMap);
            azu_0.a(n3, n2, hashMap2, hashMap);
        });
        wL.b(this);
    }

    private static void a(int n, int n2, Map<Integer, List<Bu<Integer, Boolean>>> map, Map<Integer, List<Integer>> map2) {
        List<Bu<Integer, Boolean>> list = map.get(n2);
        if (list == null) {
            return;
        }
        for (Bu<Integer, Boolean> bu : list) {
            List<Integer> list2 = map2.get(bu.getFirst());
            if (list2 == null || list2.isEmpty()) continue;
            bjt_0.eaK().a(n, bu.getFirst(), bu.aHI(), list2);
        }
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.protectorChallengeItems", new Object[0]);
    }
}

