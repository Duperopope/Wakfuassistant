/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eKI
 */
public interface eki_0
extends eKJ {
    @NotNull
    public eka_0 i(@NotNull eKW var1);

    @NotNull
    public eka_0 k(@NotNull eKW var1);

    @NotNull
    public eka_0 fs(int var1, int var2);

    @NotNull
    public Set<Integer> QD(int var1);

    @NotNull
    default public Set<eKR> QS(int n) {
        eKW eKW2 = eKQ.qEb.QV(n);
        if (eKW2 == null) {
            return Collections.emptySet();
        }
        Set<Integer> set = this.QD(n);
        return set.stream().map(eKW2::QZ).filter(Objects::nonNull).collect(Collectors.toSet());
    }

    @NotNull
    default public Set<eKR> fyI() {
        HashSet<eKR> hashSet = new HashSet<eKR>();
        for (int n : this.fyp()) {
            hashSet.addAll(this.QS(n));
        }
        return hashSet;
    }

    default public long d(int n, long l, long l2) {
        long l3 = (long)((float)l * ftW.tgW.uT(l2));
        return this.D(n, l3);
    }

    public long D(int var1, long var2);

    public void QE(int var1);

    public void Y(int var1, boolean var2);

    public void t(int var1, short var2);

    public void QF(int var1);

    public boolean tX(int var1);

    public short PG(int var1);

    public double F(int var1, long var2);

    public double QG(int var1);

    public long QH(int var1);

    public long QI(int var1);

    public int QJ(int var1);

    public int QK(int var1);

    public int QL(int var1);

    public int QM(int var1);

    public short QN(int var1);

    public boolean QO(int var1);

    public boolean fym();

    public void lF(boolean var1);

    public void Z(int var1, boolean var2);

    public void fu(int var1, int var2);

    public @Unmodifiable @NotNull Set<Integer> fyp();

    public boolean fv(int var1, int var2);

    default public boolean h(eKR eKR2) {
        return this.fv(eKR2.cms(), eKR2.d());
    }

    public @Unmodifiable @NotNull Map<ekb_0, ekd_0> qg();

    public boolean a(ekb_0 var1, @Nullable ekd_0 var2);

    public void G(Map<ekb_0, ekd_0> var1);

    public @Unmodifiable @NotNull Map<Integer, Integer> dyy();

    public boolean f(int var1, @Nullable Integer var2);

    public void H(@NotNull Map<Integer, Integer> var1);

    public boolean fyq();

    public boolean lG(boolean var1);

    public boolean fyr();

    public boolean lH(boolean var1);

    public int a(@NotNull eKR var1, boolean var2);

    default public void d(@NotNull dt_2 dt_22) {
        this.a(dt_22, true);
    }

    public void a(@NotNull dt_2 var1, boolean var2);

    default public void f(@NotNull gj_1 gj_12) {
        this.a(gj_12, true);
    }

    public void a(@NotNull gj_1 var1, boolean var2);

    default public void i(@NotNull dn_2 dn_22) {
        this.a(dn_22, true);
    }

    public void a(@NotNull dn_2 var1, boolean var2);

    @NotNull
    public dt_2 fys();

    @NotNull
    public dz_2 fyt();

    @NotNull
    public ga_2 fyu();

    @NotNull
    public gj_1 fyv();

    @NotNull
    public dn_2 fyw();

    @NotNull
    public Map<Integer, Short> fyx();
}

