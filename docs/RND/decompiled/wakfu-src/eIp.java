/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class eIp {
    private static final Logger qwc = Logger.getLogger(eIp.class);
    public static final long qwd = -1L;

    private eIp() {
    }

    public static int fwv() {
        return ewo_0.oBF.i(ewr_0.oFT);
    }

    public static int fww() {
        return GC.q(1, 41);
    }

    public static boolean an(exP exP2) {
        return eIp.pF(exP2.Xi());
    }

    public static boolean pF(long l) {
        return fug_0.uX(l) || eto_0.qE(l);
    }

    public static Optional<ffV> a(exP exP2, ffS ffS2) {
        fhe fhe2 = exP2.dnP();
        if (fhe2 == null) {
            return Optional.empty();
        }
        fhk fhk2 = exP2.dmL();
        if (fhk2 == null) {
            return Optional.empty();
        }
        return fhe2.B(fhk2.t(ffS2));
    }

    @Contract(pure=true)
    public static int d(@NotNull exP exP2, int n) {
        frf frf2 = exP2.dnJ();
        eHZ eHZ2 = exP2.dnN();
        return GC.a(eIp.a(exP2, exP2.CL(n)), frf2 == null ? 0 : eIp.f(frf2.Zx(n)), new int[]{eHZ2 == null ? 0 : eIp.q(eHZ2.PI(n))});
    }

    @Contract(pure=true)
    public static int a(@NotNull exP exP2, @Nullable fhk fhk2) {
        if (fhk2 == null) {
            return 0;
        }
        int n = 0;
        for (Long l : fhk2.fUd().values()) {
            if (l == null) continue;
            Optional<ffV> optional = exP2.dnP().B(l);
            if (optional.isEmpty()) {
                qwc.error((Object)("[Build] Item " + l + " is in equipment sheet of player " + exP2.Sn() + " / " + exP2.Xi() + " but not in its equipment inventory."));
                continue;
            }
            ffV ffV2 = optional.get();
            short s = ffV2.fWb() == null ? ffV2.dOg().cmL() : ffV2.fWb().shortValue();
            n = Math.max(n, s);
        }
        return n;
    }

    @Contract(pure=true)
    public static int f(@Nullable frd frd2) {
        if (frd2 == null) {
            return 0;
        }
        int n = 0;
        for (Bu<Integer, Integer> bu : eIp.g(frd2)) {
            Integer n2 = bu.getFirst();
            int n3 = bu.aHI();
            if (n2 == null || n2 == 0) continue;
            Object Spell = fqF.giR().Ig(n2);
            if (Spell == null) {
                qwc.error((Object)("[Builds] Unknown spell " + n2 + " in deck " + String.valueOf(frd2)));
                continue;
            }
            int n4 = ((fqD)Spell).eeY() ? fra.sXo[n3] : fra.sXn[n3];
            n = GC.a(n, (int)((fqD)Spell).cvo(), new int[]{n4});
        }
        return n;
    }

    @Contract(pure=true)
    public static int q(@Nullable ehy_0 ehy_02) {
        if (ehy_02 == null) {
            return 0;
        }
        LU lU = new LU(0);
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        ehy_02.fwb().forEach((n, s) -> {
            int n2 = eHK.qsX.PB((int)n);
            hashMap.merge(n2, Integer.valueOf(s.shortValue()), Integer::sum);
        });
        hashMap.forEach((n, n2) -> {
            int n3 = eHK.qsX.PC((int)n).PF((int)n2);
            lU.ny(n3);
        });
        return lU.aTn();
    }

    @Contract(pure=true)
    public static List<Bu<Integer, Integer>> g(frd frd2) {
        ArrayList<Bu<Integer, Integer>> arrayList = new ArrayList<Bu<Integer, Integer>>();
        ArrayList<Integer> arrayList2 = frd2.eEu();
        for (int i = 0; i < arrayList2.size(); ++i) {
            arrayList.add(new Bu<Integer, Integer>(arrayList2.get(i), i));
        }
        ArrayList<Integer> arrayList3 = frd2.eEv();
        for (int i = 0; i < arrayList3.size(); ++i) {
            arrayList.add(new Bu<Integer, Integer>(arrayList3.get(i), i));
        }
        return arrayList;
    }

    @Contract(pure=true)
    private static List<Long> a(exP exP2, int n, @Nullable fhk fhk2, boolean bl) {
        if (fhk2 == null) {
            return Collections.emptyList();
        }
        if (exP2.dnO() == null) {
            return List.of(Long.valueOf(-1L));
        }
        long l = exP2.Xi();
        fhe fhe2 = fhi.soc.aI(l, exP2.Sn());
        if (fhe2 == null) {
            return List.of(Long.valueOf(-1L));
        }
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (Map.Entry<ffS, Long> entry : fhk2.fUd().entrySet()) {
            long l2;
            ffV ffV2;
            ffS ffS2 = entry.getKey();
            fhc fhc2 = fgt.a(exP2, fhk2, ffS2, ffV2 = fgt.aG(l, l2 = entry.getValue().longValue()), false, false);
            if (fhc2 != fhc.snm) {
                arrayList.add(l2);
                continue;
            }
            ang_2 ang_22 = ffV2.dOg().a(ffj_0.sge);
            if (!bl || ang_22 == null || ang_22.b(exP2, exP2, ffV2, fhk2)) continue;
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Contract(pure=true)
    public static List<Long> a(exP exP2, int n, @Nullable fhk fhk2) {
        return eIp.a(exP2, n, fhk2, true);
    }

    public static List<Long> b(exP exP2, int n, @Nullable fhk fhk2) {
        return eIp.a(exP2, n, fhk2, false);
    }

    @Contract(pure=true)
    public static List<Integer> a(exP exP2, @Nullable frd frd2) {
        if (frd2 == null) {
            return Collections.emptyList();
        }
        int n = frd2.gjR() ? exP2.dnG() : frd2.tL();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Bu<Integer, Integer> bu : eIp.g(frd2)) {
            int n2 = bu.getFirst();
            int n3 = bu.aHI();
            if (n2 == 0) continue;
            Object Spell = fqF.giR().Ig(n2);
            if (Spell == null) {
                arrayList.add(n2);
                continue;
            }
            if (!exP2.CX(n2)) {
                arrayList.add(n2);
                continue;
            }
            if (((fqD)Spell).cvo() > n) {
                arrayList.add(n2);
                continue;
            }
            if ((!((fqD)Spell).eeY() || fra.sXo[n3] <= n) && (((fqD)Spell).eeY() || fra.sXn[n3] <= n)) continue;
            arrayList.add(n2);
        }
        return arrayList;
    }

    @Contract(pure=true)
    public static List<Integer> a(exP exP2, @Nullable ehy_0 ehy_02) {
        if (ehy_02 == null) {
            return Collections.emptyList();
        }
        short s = ehy_02.fwc() == -1 ? exP2.dnG() : ehy_02.fwc();
        return eIp.a(ehy_02, s);
    }

    @Contract(pure=true)
    public static List<Integer> a(@NotNull ehy_0 ehy_02, short s) {
        eHL eHL2 = eHK.qsX.du(s);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Map.Entry<Integer, Short> entry : ehy_02.fwb().entrySet()) {
            int n = entry.getKey();
            short s2 = entry.getValue();
            if (!eHK.qsX.PA(n)) {
                arrayList.add(n);
                continue;
            }
            int n2 = eHK.qsX.PB(n);
            if (s2 < 0) {
                arrayList.add(n);
                continue;
            }
            if (s2 > eHL2.PE(n2)) {
                arrayList.add(n);
                continue;
            }
            Object t = eHJ.qsV.Py(n);
            if (((ehw_0)t).bWc() == 0 || s2 <= ((ehw_0)t).bWc()) continue;
            arrayList.add(n);
        }
        Iterator<Object> iterator = eHK.qsX.fvW().iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            if (ehy_02.PH(n) <= eHL2.PE(n)) continue;
            arrayList.add(-n);
        }
        return arrayList;
    }

    @Contract(pure=true)
    public static List<Bu<Integer, Integer>> b(@NotNull exP exP2, @NotNull frd frd2) {
        int n = frd2.tL() == -1 ? exP2.dnG() : frd2.tL();
        return eIp.a(n, fra.sXn, frd2.eEu());
    }

    @Contract(pure=true)
    public static List<Bu<Integer, Integer>> c(@NotNull exP exP2, @NotNull frd frd2) {
        int n = frd2.tL() == -1 ? exP2.dnG() : frd2.tL();
        return eIp.a(n, fra.sXo, frd2.eEv());
    }

    @Contract(pure=true)
    private static List<Bu<Integer, Integer>> a(int n, int[] nArray, List<Integer> list) {
        ArrayList<Bu<Integer, Integer>> arrayList = new ArrayList<Bu<Integer, Integer>>();
        for (int i = 0; i < list.size(); ++i) {
            int n2 = list.get(i);
            if (n2 == 0 || nArray[i] <= n) continue;
            arrayList.add(new Bu<Integer, Integer>(n2, i));
        }
        return arrayList;
    }

    @Contract(pure=true)
    public static boolean b(@NotNull ehy_0 ehy_02, short s) {
        return ehy_02.dy(s) >= eIp.q(ehy_02);
    }
}

