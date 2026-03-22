/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

public final class eHK {
    public static final eHK qsX = new eHK();
    private final Map<Integer, ehx_0> qsY = new HashMap<Integer, ehx_0>();
    private final Map<Integer, Integer> qsZ = new HashMap<Integer, Integer>();
    private final Map<Integer, List<Integer>> qta = new HashMap<Integer, List<Integer>>();
    private final Map<Short, Set<Integer>> qtb = new HashMap<Short, Set<Integer>>();
    private final Map<Short, eHL> qtc = new HashMap<Short, eHL>();

    public eHK() {
        for (short s = 1; s <= 245; s = (short)(s + 1)) {
            this.qtb.put(s, new HashSet());
            this.qtc.put(s, new eHL());
        }
    }

    public void b(ehx_0 ehx_02) {
        int n = ehx_02.d();
        this.qsY.put(n, ehx_02);
        this.qta.put(n, new ArrayList());
        Set set = ehx_02.fvZ();
        for (ehw_0 ehw_02 : set) {
            if (ehw_02 == null) continue;
            this.qsZ.put(ehw_02.d(), n);
            this.qta.get(n).add(ehw_02.d());
        }
        for (short s = 1; s <= 245; s = (short)(s + 1)) {
            if (!ehx_02.dv(s)) continue;
            this.qtb.get(s).add(n);
            for (short s2 = s; s2 <= 245; s2 = (short)(s2 + 1)) {
                this.qtc.get(s2).m(n, (short)1);
            }
        }
    }

    public @Unmodifiable Set<Integer> fvW() {
        return Collections.unmodifiableSet(this.qsY.keySet());
    }

    public boolean PA(int n) {
        return this.qsZ.containsKey(n);
    }

    public int PB(int n) {
        return this.qsZ.get(n);
    }

    public ehx_0 PC(int n) {
        return this.qsY.get(n);
    }

    public @Unmodifiable Set<Integer> dt(short s) {
        return Collections.unmodifiableSet(this.qtb.get(s));
    }

    public eHL du(short s) {
        return this.qtc.get(s);
    }

    @NotNull
    public eHL V(short s2, short s3) {
        eHL eHL2 = new eHL();
        short s4 = (short)Math.max(0, s2);
        eHL eHL3 = this.qtc.getOrDefault(s4, new eHL());
        short s5 = (short)Math.min(245, s3);
        eHL eHL4 = this.qtc.getOrDefault(s5, new eHL());
        eHL4.f((Integer n, Short s) -> {
            int n2 = s - eHL3.PE((int)n);
            if (n2 <= 0) {
                return;
            }
            eHL2.m((int)n, (short)n2);
        });
        return eHL2;
    }

    public @Unmodifiable List<Integer> PD(int n) {
        return Collections.unmodifiableList(this.qta.get(n));
    }

    public void f(Consumer<ehx_0> consumer) {
        this.qsY.values().forEach(consumer);
    }
}

