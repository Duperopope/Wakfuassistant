/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJt
 */
public class bjt_0 {
    private static final bjt_0 klO = new bjt_0();
    private final Map<Integer, Map<Integer, List<Integer>>> klP = new HashMap<Integer, Map<Integer, List<Integer>>>();
    private final Map<Integer, Map<Integer, List<Integer>>> klQ = new HashMap<Integer, Map<Integer, List<Integer>>>();
    private boolean klR = false;
    private boolean klS = false;

    public static bjt_0 eaK() {
        return klO;
    }

    private bjt_0() {
    }

    public void a(int n2, int n3, Boolean bl, List<Integer> list) {
        if (fpk.sNF.Yn(n2) == null) {
            return;
        }
        for (Integer n4 : list) {
            if (!bpm_1.dCG().EV(n4)) continue;
            if (bpm_1.EU(n4)) {
                if (bl.booleanValue()) {
                    this.klS = true;
                } else {
                    this.klR = true;
                }
            }
            (bl != false ? this.klQ : this.klP).computeIfAbsent(n4, n -> new HashMap()).computeIfAbsent(n2, n -> new ArrayList()).add(n3);
        }
    }

    @Nullable
    public Map<Integer, List<Integer>> Hq(int n) {
        boolean bl = bpu.dCU();
        if (bl) {
            HashMap<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
            hashMap.putAll(this.klP.getOrDefault(n, Collections.emptyMap()));
            hashMap.putAll(this.klQ.getOrDefault(n, Collections.emptyMap()));
            return hashMap;
        }
        return this.klP.get(n);
    }

    public boolean Hr(int n) {
        boolean bl = bpu.dCU();
        if (bl) {
            return this.klP.containsKey(n) || this.klQ.containsKey(n);
        }
        return this.klP.containsKey(n);
    }

    public boolean eaL() {
        boolean bl = bpu.dCU();
        if (bl) {
            return this.klS || this.klR;
        }
        return this.klR;
    }
}

