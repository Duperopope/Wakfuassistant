/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bmI
 */
public class bmi_2 {
    public static final bmi_2 iDE = new bmi_2();
    private final Map<Integer, Map<Integer, Set<Integer>>> iDF = new HashMap<Integer, Map<Integer, Set<Integer>>>();
    private final Map<Integer, Map<Integer, Set<Integer>>> iDG = new HashMap<Integer, Map<Integer, Set<Integer>>>();

    private bmi_2() {
    }

    public void a(int n, int n2, int n3, boolean bl) {
        this.iDF.putIfAbsent(n, new HashMap());
        Map<Integer, Set<Integer>> map = this.iDF.get(n);
        map.putIfAbsent(n2, new HashSet());
        map.get(n2).add(n3);
        if (bl) {
            this.iDG.putIfAbsent(n, new HashMap());
            Map<Integer, Set<Integer>> map2 = this.iDG.get(n);
            map2.putIfAbsent(n2, new HashSet());
            map2.get(n2).add(n3);
        }
    }

    @NotNull
    public Set<Integer> a(int n, eki_0 eki_02) {
        Map<Integer, Set<Integer>> map = this.iDF.get(n);
        Map<Integer, Set<Integer>> map2 = this.iDG.get(n);
        if (map == null) {
            return Collections.emptySet();
        }
        return map.entrySet().stream().filter(entry -> entry.getValue() != null && !((Set)entry.getValue()).isEmpty()).filter(entry -> this.a((int)((Integer)entry.getKey()), (Set)entry.getValue(), map2, eki_02)).map(Map.Entry::getKey).collect(Collectors.toSet());
    }

    public boolean a(int n, Set<Integer> set, Map<Integer, Set<Integer>> map, eki_0 eki_02) {
        for (Integer n2 : set) {
            if (this.a(map, n, n2) && !eki_02.fv(n, n2)) continue;
            return true;
        }
        return false;
    }

    private boolean a(Map<Integer, Set<Integer>> map, int n, Integer n2) {
        if (map == null) {
            return false;
        }
        Set<Integer> set = map.get(n);
        return set != null && set.contains(n2);
    }
}

