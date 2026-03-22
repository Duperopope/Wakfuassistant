/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

public final class bEm
extends fgD<bgv_2> {
    private final TIntHashSet jNM = new TIntHashSet();
    private final TreeMap<String, bgv_2> jNN = new TreeMap();
    private final TIntObjectHashMap<String> jNO = new TIntObjectHashMap();
    private final Map<Integer, Set<Integer>> jNP = new HashMap<Integer, Set<Integer>>();
    private final TIntHashSet jNQ = new TIntHashSet();

    public Map<String, bgv_2> dSa() {
        return Collections.unmodifiableMap(this.jNN);
    }

    public String Gq(int n) {
        return (String)this.jNO.get(n);
    }

    public static bEm dSb() {
        return (bEm)fgD.fXh();
    }

    public void p(@NotNull bgv_2 bgv_22) {
        super.e(bgv_22);
        String string = bgv_22.dah() + " " + bej_1.c(bgv_22.dwg());
        this.jNO.put(bgv_22.d(), (Object)string);
        if (bgv_22.dUx()) {
            this.jNN.put(string, bgv_22);
        }
        this.q(bgv_22);
    }

    public void dSc() {
        this.jNP.clear();
        this.fXi().forEach(this::q);
    }

    private void q(@NotNull bgv_2 bgv_22) {
        fgl_0 fgl_02 = bgv_22.fUZ();
        if (!(fgl_02 instanceof bfv_1)) {
            return;
        }
        bfv_1 bfv_12 = (bfv_1)((Object)fgl_02);
        if (!bpm_1.dCG().i(bgv_22)) {
            return;
        }
        for (Integer n2 : bfv_12.dTn()) {
            bgv_2 bgv_23 = (bgv_2)this.sjS.get(n2.intValue());
            if (bgv_23 == null || !bpm_1.dCG().i(bgv_23)) continue;
            this.jNP.computeIfAbsent(n2, n -> new HashSet()).add(bgv_22.d());
        }
    }

    public void Gr(int n) {
        this.jNQ.add(n);
    }

    public boolean Gs(int n) {
        return this.jNM.contains(n);
    }

    public void Gt(int n) {
        this.jNM.add(n);
    }

    public boolean Gu(int n) {
        return this.jNP.containsKey(n);
    }

    public boolean Gv(int n) {
        return this.jNQ.contains(n);
    }

    @NotNull
    public List<bgv_2> Gw(int n) {
        Set<Integer> set = this.jNP.get(n);
        if (set == null) {
            return Collections.emptyList();
        }
        ArrayList<bgv_2> arrayList = new ArrayList<bgv_2>(set.size());
        for (Integer n2 : set) {
            arrayList.add((bgv_2)this.sjS.get(n2.intValue()));
        }
        Comparator<bgv_2> comparator = Comparator.comparingInt(bgv_22 -> bgv_22.dwg() == fgj.siA ? 1 : 0);
        arrayList.sort(comparator.thenComparing(bgv_22 -> bgv_22.dah()));
        return arrayList;
    }

    @Override
    public /* synthetic */ void e(@NotNull fhc_0 fhc_02) {
        this.p((bgv_2)fhc_02);
    }
}

