/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bml {
    public static final String iAj = ",";
    private final List<blZ> iAk = new ArrayList<blZ>();
    private @Unmodifiable @Nullable List<blZ> iAl;
    private final Map<Integer, blZ> iAm = new HashMap<Integer, blZ>();
    @Nullable
    private String hVA = null;

    public bml(ekr_0 ekr_02, OptionalInt optionalInt) {
        Map<Integer, eks_0> map = ekr_02.fxZ();
        for (int n : bml.a(map, optionalInt)) {
            blZ blZ2 = new blZ(map.get(n));
            this.iAk.add(blZ2);
            this.iAm.put(n, blZ2);
        }
    }

    public @Unmodifiable List<blZ> dvR() {
        return Collections.unmodifiableList(this.iAl != null ? this.iAl : this.iAk);
    }

    public int dvS() {
        return this.iAk.isEmpty() ? -1 : this.iAk.getFirst().BJ();
    }

    @Nullable
    public blZ Eb(int n) {
        return this.iAm.get(n);
    }

    public int aVo() {
        return this.iAk.size();
    }

    public void mc(@Nullable String string) {
        this.hVA = BH.aT(string);
        this.cUR();
    }

    public void a(@NotNull bml bml2) {
        this.hVA = bml2.hVA;
        this.cUR();
    }

    private void cUR() {
        this.iAl = this.hVA == null ? null : this.iAk.stream().filter(blZ2 -> BH.aT(blZ2.getName()).contains(this.hVA)).toList();
    }

    public boolean b(int n, blZ blZ2) {
        if (this.iAl != null) {
            return false;
        }
        blZ blZ3 = this.iAk.get(n);
        int n2 = this.iAk.indexOf(blZ2);
        int n3 = GC.a(n2, 0, this.iAk.size() - 1);
        this.iAk.remove(n);
        this.iAk.add(n3, blZ3);
        this.dvT();
        return true;
    }

    private static @Unmodifiable List<Integer> a(Map<Integer, eks_0> map, OptionalInt optionalInt) {
        String string = ((bsy_1)((bsg_1)aie_0.cfn().bmH()).bxn()).bS(bsn_1.lkI.getKey());
        List<Integer> list = map.values().stream().sorted(Comparator.comparing(eks_0::fyd).reversed()).map(eks_0::BJ).toList();
        try {
            ArrayList arrayList = Arrays.stream(string.split(iAj)).map(Integer::parseInt).distinct().filter(map::containsKey).collect(Collectors.toCollection(ArrayList::new));
            for (int n2 : list) {
                if (arrayList.contains(n2)) continue;
                arrayList.add(n2);
            }
            optionalInt.ifPresent(n -> {
                arrayList.remove((Object)n);
                arrayList.add(0, n);
            });
            return Collections.unmodifiableList(arrayList);
        }
        catch (NumberFormatException numberFormatException) {
            return list;
        }
    }

    void dvT() {
        String string = this.iAk.stream().map(blZ2 -> String.valueOf(blZ2.BJ())).collect(Collectors.joining(iAj));
        bsn_1 bsn_12 = bsn_1.lkI;
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_12, string);
        ((bsg_1)aie_0.cfn().bmH()).ev(bsn_12.getKey());
    }
}

