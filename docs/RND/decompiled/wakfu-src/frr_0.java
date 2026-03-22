/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from frR
 */
public class frr_0 {
    public static boolean a(@NotNull frq_0 frq_02, int n) {
        if (frq_02.gkw().add(n)) {
            frq_02.gkx().add(n);
            return true;
        }
        return false;
    }

    public static Set<Integer> a(@NotNull frq_0 frq_02, @NotNull Set<Integer> set) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int n : set) {
            if (!frq_02.gkw().add(n)) continue;
            hashSet.add(n);
            frq_02.gkx().add(n);
        }
        return hashSet;
    }

    public static Set<Integer> b(@NotNull frq_0 frq_02, @NotNull Set<Integer> set) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int n : set) {
            if (!frq_02.gkx().remove(n)) continue;
            hashSet.add(n);
        }
        return hashSet;
    }

    public static Set<Integer> c(@NotNull frq_0 frq_02, @NotNull Set<Integer> set) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int n : set) {
            if (frq_02.gkw().remove(n)) {
                hashSet.add(n);
            }
            frq_02.gkx().remove(n);
        }
        return hashSet;
    }

    public static boolean b(@NotNull frq_0 frq_02) {
        boolean bl = !frq_02.gkw().isEmpty() || !frq_02.gkx().isEmpty();
        frq_02.gkw().clear();
        frq_02.gkx().clear();
        return bl;
    }
}

