/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.time.Duration;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bYx
 */
public final class byx_1 {
    private static final Logger lzG = Logger.getLogger(byx_1.class);
    private static final ccf_2 lzH = new ccf_2(Duration.ofSeconds(3L));
    private static final Map<Long, ArrayList<byy_1>> lzI = new HashMap<Long, ArrayList<byy_1>>();

    private byx_1() {
    }

    public static void a(@NotNull bhJ bhJ2, int n, boolean bl) {
        lzH.a(0, () -> {
            try {
                byx_1.epa();
            }
            catch (RuntimeException runtimeException) {
                lzG.error((Object)("An error occurred during toasts creation (level up data=" + String.valueOf(lzI) + ")"), (Throwable)runtimeException);
            }
            finally {
                lzI.clear();
            }
        });
        lzI.computeIfAbsent(bhJ2.Sn(), l -> new ArrayList()).add(new byy_1(bhJ2.dnG(), n, bl));
    }

    private static void epa() {
        lzI.forEach((l, arrayList) -> {
            Object object2;
            if (arrayList.isEmpty()) {
                return;
            }
            bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw((long)l);
            if (bgt_02 == null) {
                return;
            }
            int n = 0;
            boolean bl = false;
            for (Object object2 : arrayList) {
                n += ((byy_1)object2).epd();
                bl = bl || ((byy_1)object2).lzL;
            }
            short s = ((byy_1)arrayList.get((int)0)).lzJ;
            object2 = new byv_2(bgt_02, s, n, bl);
            byj_1.epo().a((bye_1)object2);
        });
    }

    public static List<byz_1> a(@NotNull bhJ bhJ2, short s, int n, boolean bl) {
        int n2 = s + n;
        ArrayList<byz_1> arrayList = new ArrayList<byz_1>();
        byx_1.a(bhJ2, (int)s, n2).ifPresent(arrayList::add);
        byx_1.ea(s, n2).ifPresent(arrayList::add);
        byx_1.eb(s, n2).ifPresent(arrayList::add);
        byx_1.b(bhJ2, s, n2).ifPresent(arrayList::add);
        byx_1.ec(s, n2).ifPresent(arrayList::add);
        byx_1.c(bhJ2, (int)s, n2).ifPresent(arrayList::add);
        byx_1.iJ(bl).ifPresent(arrayList::add);
        byx_1.a(bl, (int)s, n2).ifPresent(arrayList::add);
        return arrayList;
    }

    private static Optional<byz_1> a(@NotNull bhJ bhJ2, int n2, int n3) {
        EnumMap<exx_2, Integer> enumMap = new EnumMap<exx_2, Integer>(exx_2.class);
        bhJ2.dfW().fhV().a(enumMap, (short)n2, (short)n3);
        if (enumMap.isEmpty()) {
            return Optional.empty();
        }
        if (enumMap.values().stream().allMatch(n -> n <= 0)) {
            return Optional.empty();
        }
        String string = enumMap.entrySet().stream().filter(entry -> (Integer)entry.getValue() > 0).map(entry -> "+" + aum_0.cWf().cQ(((Integer)entry.getValue()).intValue()) + " " + bih_0.e((exx_2)entry.getKey())).collect(Collectors.joining(", "));
        String string2 = aum_0.cWf().c("level.up.toast.caracteristics", string);
        return Optional.of(new byz_1(string2, bya_1.lzO));
    }

    private static Optional<byz_1> ea(int n, int n2) {
        eHL eHL2 = eHK.qsX.V((short)n, (short)n2);
        int n3 = eHL2.fvX().values().stream().mapToInt(s -> s.shortValue()).sum();
        if (n3 == 0) {
            return Optional.empty();
        }
        String string = aum_0.cWf().c("level.up.toast.aptitudes", n3);
        return Optional.of(new byz_1(string, bya_1.lzQ));
    }

    private static Optional<byz_1> b(@NotNull bhJ bhJ2, int n, int n2) {
        bfo_2 bfo_22 = bhJ2.dkD();
        if (bfo_22 == null) {
            return Optional.empty();
        }
        List<bmt_0> list = Stream.concat(byx_1.a(bhJ2, bfo_22.dfX(), n, n2), byx_1.a(bhJ2, bfo_22.dfY(), n, n2)).toList();
        if (list.isEmpty()) {
            return Optional.empty();
        }
        String string = aum_0.cWf().c("level.up.toast.active.spells", list.size(), list.stream().map(bmt_0::getName).collect(Collectors.joining(", ")));
        return Optional.of(new byz_1(string, bya_1.lzR));
    }

    private static Optional<byz_1> c(@NotNull bhJ bhJ2, int n, int n2) {
        bfo_2 bfo_22 = bhJ2.dkD();
        if (bfo_22 == null) {
            return Optional.empty();
        }
        List<bmt_0> list = byx_1.a(bhJ2, bfo_22.dfZ(), n, n2).toList();
        if (list.isEmpty()) {
            return Optional.empty();
        }
        String string = aum_0.cWf().c("level.up.toast.passive.spells", list.size(), list.stream().map(bmt_0::getName).collect(Collectors.joining(", ")));
        return Optional.of(new byz_1(string, bya_1.lzR));
    }

    private static Stream<bmt_0> a(@NotNull bhJ bhJ2, List<bmt_0> list, int n, int n2) {
        return list.stream().filter(bmt_02 -> byx_1.a(bhJ2, bmt_02)).filter(bmt_02 -> n < bmt_02.cvo() && bmt_02.cvo() <= n2);
    }

    private static boolean a(@NotNull bhJ bhJ2, bmt_0 bmt_02) {
        ang_2 ang_22 = bmt_02.giI();
        return ang_22 == null || ang_22.b(bhJ2, null, null, null);
    }

    private static Optional<byz_1> eb(int n, int n2) {
        int n3 = byx_1.c(fra.sXn, n, n2);
        if (n3 == 0) {
            return Optional.empty();
        }
        String string = aum_0.cWf().c("level.up.toast.active.spell.slots", n3);
        return Optional.of(new byz_1(string, bya_1.lzR));
    }

    private static Optional<byz_1> ec(int n, int n2) {
        int n3 = byx_1.c(fra.sXo, n, n2);
        if (n3 == 0) {
            return Optional.empty();
        }
        String string = aum_0.cWf().c("level.up.toast.passive.spell.slots", n3);
        return Optional.of(new byz_1(string, bya_1.lzR));
    }

    private static int c(int[] nArray, int n, int n2) {
        int n3 = 0;
        for (int n4 : nArray) {
            if (n4 == 0 || n >= n4 || n4 > n2) continue;
            ++n3;
        }
        return n3;
    }

    private static Optional<byz_1> iJ(boolean bl) {
        if (!bl) {
            return Optional.empty();
        }
        if (eIA.pH(bbs_2.xl())) {
            return Optional.empty();
        }
        String string = aum_0.cWf().c("level.up.toast.downscaling", new Object[0]);
        return Optional.of(new byz_1(string, bya_1.lzP));
    }

    private static Optional<byz_1> a(boolean bl, int n, int n2) {
        if (eIA.pH(bbs_2.xl())) {
            return Optional.empty();
        }
        ArrayList<Short> arrayList = new ArrayList<Short>();
        int n3 = bl ? 0 : n;
        for (eIi eIi2 : eIi.qvN) {
            int n4 = eIi2.cmL() + 0;
            if (n3 >= n4 || n4 > n2) continue;
            arrayList.add(eIi2.cmL());
        }
        if (arrayList.isEmpty()) {
            return Optional.empty();
        }
        String string = aum_0.cWf().c("level.up.toast.permanent.builds", arrayList.size(), arrayList.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        return Optional.of(new byz_1(string, bya_1.lzP));
    }
}

