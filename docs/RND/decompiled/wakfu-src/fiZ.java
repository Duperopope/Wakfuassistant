/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 *  org.jetbrains.annotations.VisibleForTesting
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.IntStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.VisibleForTesting;

public final class fiZ {
    public static final List<Integer> suZ = Collections.nCopies(4, fjd.swB.d());
    public static final List<Integer> sva = Collections.nCopies(4, fjd.swH.d());
    private static final Map<Integer, Set<Integer>> svb = Map.of(fjd.swB.d(), Set.of(Integer.valueOf(fjd.swB.d())), fjd.swC.d(), Set.of(Integer.valueOf(fjd.swC.d()), Integer.valueOf(fjd.swF.d())), fjd.swD.d(), Set.of(Integer.valueOf(fjd.swD.d()), Integer.valueOf(fjd.swF.d())), fjd.swE.d(), Set.of(Integer.valueOf(fjd.swE.d()), Integer.valueOf(fjd.swF.d())), fjd.swF.d(), Set.of(Integer.valueOf(fjd.swF.d())), fjd.swG.d(), Set.of(Integer.valueOf(fjd.swC.d()), Integer.valueOf(fjd.swD.d()), Integer.valueOf(fjd.swE.d()), Integer.valueOf(fjd.swF.d())), fjd.swH.d(), Set.of(Integer.valueOf(fjd.swB.d()), Integer.valueOf(fjd.swC.d()), Integer.valueOf(fjd.swD.d()), Integer.valueOf(fjd.swE.d()), Integer.valueOf(fjd.swF.d())));
    private static final Map<Integer, Set<Integer>> svc = Map.of(fjd.swB.d(), Set.of(Integer.valueOf(fjd.swB.d()), Integer.valueOf(fjd.swH.d())), fjd.swC.d(), Set.of(Integer.valueOf(fjd.swC.d()), Integer.valueOf(fjd.swG.d()), Integer.valueOf(fjd.swH.d())), fjd.swD.d(), Set.of(Integer.valueOf(fjd.swD.d()), Integer.valueOf(fjd.swG.d()), Integer.valueOf(fjd.swH.d())), fjd.swE.d(), Set.of(Integer.valueOf(fjd.swE.d()), Integer.valueOf(fjd.swG.d()), Integer.valueOf(fjd.swH.d())), fjd.swF.d(), Set.of(Integer.valueOf(fjd.swF.d()), Integer.valueOf(fjd.swG.d()), Integer.valueOf(fjd.swH.d())), fjd.swG.d(), Set.of(Integer.valueOf(fjd.swC.d()), Integer.valueOf(fjd.swD.d()), Integer.valueOf(fjd.swE.d()), Integer.valueOf(fjd.swF.d()), Integer.valueOf(fjd.swG.d()), Integer.valueOf(fjd.swH.d())), fjd.swH.d(), Set.of(Integer.valueOf(fjd.swB.d()), Integer.valueOf(fjd.swC.d()), Integer.valueOf(fjd.swD.d()), Integer.valueOf(fjd.swE.d()), Integer.valueOf(fjd.swF.d()), Integer.valueOf(fjd.swG.d()), Integer.valueOf(fjd.swH.d())));
    private static final int[] svd;
    private static final int[] sve;
    private static final Comparator<Integer> svf;
    private static final Comparator<Integer> svg;
    private static final Map<List<Integer>, Set<List<Integer>>> svh;
    private static final Map<List<Integer>, Set<List<Integer>>> svi;
    private static final Map<List<Integer>, Set<List<Integer>>> svj;
    private static final Map<List<Integer>, Set<List<Integer>>> svk;

    private fiZ() {
    }

    @VisibleForTesting
    public static boolean gax() {
        return !svh.isEmpty();
    }

    public static Set<List<Integer>> e(List<Integer> list, boolean bl) {
        if (bl) {
            return svh.get(list);
        }
        return svi.get(list);
    }

    public static Set<List<Integer>> f(List<Integer> list, boolean bl) {
        if (bl) {
            return svj.get(list);
        }
        return svk.get(list);
    }

    public static boolean a(List<Integer> list, List<Integer> list2, boolean bl) {
        if (bl) {
            return fiZ.e(list2, list);
        }
        return fiZ.g(list2, list);
    }

    public static void gay() {
        svh.clear();
        svi.clear();
        svj.clear();
        svk.clear();
        List<List<Integer>> list = fiZ.gaA();
        List<List<Integer>> list2 = fiZ.gaz();
        for (List<Integer> list3 : list2) {
            HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();
            HashSet<List<Integer>> hashSet2 = new HashSet<List<Integer>>();
            for (List<Integer> list4 : list) {
                if (fiZ.e(list4, list3)) {
                    hashSet.add(list4);
                }
                if (!fiZ.g(list4, list3)) continue;
                hashSet2.add(list4);
            }
            svh.put(list3, hashSet);
            svi.put(list3, hashSet2);
            hashSet = new HashSet();
            hashSet2 = new HashSet();
            for (List<Integer> list4 : list2) {
                if (fiZ.f(list4, list3)) {
                    hashSet.add(list4);
                }
                if (!fiZ.h(list4, list3)) continue;
                hashSet2.add(list4);
            }
            svj.put(list3, hashSet);
            svk.put(list3, hashSet2);
        }
    }

    @VisibleForTesting
    public static @Unmodifiable List<List<Integer>> gaz() {
        return fiZ.Wo(fjd.swJ);
    }

    @VisibleForTesting
    public static @Unmodifiable List<List<Integer>> gaA() {
        return fiZ.Wo(rd_0.values().length);
    }

    private static @Unmodifiable List<List<Integer>> Wo(int n) {
        int n3 = GC.u(n, 3);
        int n4 = GC.u(n, 4);
        return IntStream.concat(IntStream.of(0), IntStream.range(n3, n4)).boxed().map(n2 -> fiZ.fX(n2, n)).filter(Objects::nonNull).toList();
    }

    @VisibleForTesting
    @Nullable
    public static List<Integer> fX(int n, int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 4; ++i) {
            if (i > 0 && ((Integer)arrayList.get(0)).intValue() != fjd.swB.d() && n % n2 == fjd.swB.d()) {
                return null;
            }
            arrayList.add(0, n % n2);
            n /= n2;
        }
        return arrayList;
    }

    public static boolean e(List<Integer> list, List<Integer> list2) {
        return fiZ.a(list, list2, svb);
    }

    public static boolean f(List<Integer> list, List<Integer> list2) {
        return fiZ.a(list, list2, svc);
    }

    private static boolean a(List<Integer> list, List<Integer> list2, Map<Integer, Set<Integer>> map) {
        List<Integer> list3 = fiZ.bi(list2);
        if (list3.isEmpty()) {
            return true;
        }
        for (int i = 0; i <= 4 - list3.size(); ++i) {
            if (!fiZ.a(list, list3, i, map)) continue;
            return true;
        }
        return false;
    }

    @NotNull
    private static List<Integer> bi(List<Integer> list) {
        int n = 3;
        int n2 = -1;
        for (int i = 0; i < 4; ++i) {
            if (list.get(i).intValue() == fjd.swH.d()) continue;
            n = i;
            if (n2 != -1) continue;
            n2 = i;
        }
        if (n2 == -1) {
            return List.of();
        }
        return list.subList(n2, n + 1);
    }

    private static boolean a(List<Integer> list, List<Integer> list2, int n, Map<Integer, Set<Integer>> map) {
        for (int i = 0; i < list2.size(); ++i) {
            if (map.get(list2.get(i)).contains(list.get(n + i))) continue;
            return false;
        }
        return true;
    }

    public static boolean g(List<Integer> list, List<Integer> list2) {
        return fiZ.a(list, list2, svb, svf);
    }

    public static boolean h(List<Integer> list, List<Integer> list2) {
        return fiZ.a(list, list2, svc, svg);
    }

    private static boolean a(List<Integer> list, List<Integer> list2, Map<Integer, Set<Integer>> map, Comparator<Integer> comparator) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(list);
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(list2);
        for (int i = arrayList2.size() - 1; i >= 0; --i) {
            if (!arrayList.remove(arrayList2.get(i))) continue;
            arrayList2.remove(i);
        }
        arrayList.sort(comparator);
        arrayList2.sort(comparator);
        for (int n : arrayList2) {
            boolean bl = false;
            for (int i = 0; i < arrayList.size(); ++i) {
                Integer n2 = arrayList.get(i);
                if (!map.get(n).contains(n2)) continue;
                arrayList.remove(n2);
                bl = true;
                break;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    public static List<Integer> f(fhi_0 fhi_02) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(suZ);
        if (fhi_02.dTS() != null) {
            fhi_02.dTS().forEach((by, fhn_02) -> arrayList.set(by.byteValue(), Integer.valueOf(fhn_02.dBe().aJr())));
        }
        return arrayList;
    }

    static {
        fjd[] fjdArray = fjd.values();
        svd = new int[fjdArray.length];
        sve = new int[fjdArray.length];
        for (fjd fjd2 : fjdArray) {
            fiZ.svd[fjd2.d()] = svb.get(fjd2.d()).size();
            fiZ.sve[fjd2.d()] = svc.get(fjd2.d()).size();
        }
        svf = Comparator.comparingInt(n -> svd[n]);
        svg = Comparator.comparingInt(n -> sve[n]);
        svh = new HashMap<List<Integer>, Set<List<Integer>>>();
        svi = new HashMap<List<Integer>, Set<List<Integer>>>();
        svj = new HashMap<List<Integer>, Set<List<Integer>>>();
        svk = new HashMap<List<Integer>, Set<List<Integer>>>();
    }
}

