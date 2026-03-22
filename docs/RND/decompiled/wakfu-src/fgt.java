/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ArrayListMultimap
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ListMultimap
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ListMultimap;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fgt {
    private fgt() {
    }

    @Nullable
    public static ffV aG(long l, long l2) {
        TLongHashSet tLongHashSet;
        fhg fhg2 = fhi.soc.tx(l);
        if (fhg2 != null) {
            tLongHashSet = fhg2.fXH().iterator();
            while (tLongHashSet.hasNext()) {
                Object object = (fhe)tLongHashSet.next();
                Optional<ffV> optional = ((fhe)object).B(l2);
                if (!optional.isPresent()) continue;
                return optional.get();
            }
        }
        tLongHashSet = fcL.rUh.sx(l);
        for (long l3 : tLongHashSet.toArray()) {
            ffV ffV2;
            Object t = fcL.rUh.sw(l3);
            if (t == null || (ffV2 = ((exP)t).dod().tb(l2)) == null) continue;
            return ffV2;
        }
        return null;
    }

    private static Optional<ffV> a(fhk fhk2, ffS ffS2, long l) {
        Long l2 = fhk2.t(ffS2);
        if (l2 == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(fgt.aG(l, l2));
    }

    @Nullable
    public static ffV an(long l, int n) {
        TLongHashSet tLongHashSet;
        fhg fhg2 = fhi.soc.tx(l);
        if (fhg2 != null) {
            tLongHashSet = fhg2.fXH().iterator();
            while (tLongHashSet.hasNext()) {
                Object object = (fhe)tLongHashSet.next();
                ImmutableMap<Long, ffV> immutableMap = ((fhe)object).fXE();
                for (Map.Entry entry : immutableMap.entrySet()) {
                    ffV ffV2 = (ffV)entry.getValue();
                    if (ffV2.avr() != n) continue;
                    return ffV2;
                }
            }
        }
        tLongHashSet = fcL.rUh.sx(l);
        for (long l2 : tLongHashSet.toArray()) {
            ffV ffV3;
            Object t = fcL.rUh.sw(l2);
            if (t == null || (ffV3 = ((exP)t).dod().UK(n)) == null) continue;
            return ffV3;
        }
        return null;
    }

    public static fhc a(exP exP2, fhk fhk2, ffS ffS2, ffV ffV2, boolean bl, boolean bl2) {
        fhc fhc2 = fgt.a(exP2, fhk2, ffS2, ffV2, bl);
        if (fhc2 != fhc.snm) {
            return fhc2;
        }
        if (!fhk2.fXK() && !fgt.a(exP2, fhk2, ffV2, ffS2)) {
            return fhc.snw;
        }
        if (fgt.b(exP2, fhk2, ffV2, ffS2)) {
            return fhc.sno;
        }
        if (fgt.d(exP2, fhk2, ffV2, ffS2)) {
            return fhc.snq;
        }
        if (ffV2.bfd() > 1) {
            return fhc.snB;
        }
        if (ffV2.fWt()) {
            return fhc.snC;
        }
        if (bl2 && ffV2.adO() && !ffV2.ead().apo()) {
            return fhc.snM;
        }
        if (ewo_0.oBF.o(ewr_0.oDC).contains(ffV2.avr())) {
            return fhc.snv;
        }
        return fhc.snm;
    }

    public static fhc a(exP exP2, fhk fhk2, ffS ffS2, ffV ffV2, boolean bl) {
        if (ffV2 == null) {
            return fhc.snH;
        }
        if (!ffV2.dOg().fbT()) {
            return fhc.snF;
        }
        if (fgt.c(exP2, fhk2, ffV2, bl ? null : ffS2)) {
            return fhc.snn;
        }
        if (!ffV2.dOg().v(ffS2)) {
            return fhc.snz;
        }
        if (fgt.a(exP2, fhk2, (Long)ffV2.LV())) {
            return fhc.snT;
        }
        return fhc.snm;
    }

    public static boolean aH(long l, long l2) {
        Collection<fhm> collection = fhp.sop.tE(l);
        for (fhm fhm2 : collection) {
            for (fhk fhk2 : fhm2.uv().values()) {
                if (fhk2.tz(l2) == null) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean a(exP exP2, fhk fhk2, fhc_0 fhc_02, ffS ffS2) {
        if (fhc_02.adO() || fhc_02.c(fgg_0.sij)) {
            return true;
        }
        short s = fhk2.cmL() <= 0 ? exP2.dnG() : fhk2.cmL();
        return fhc_02.cmL() <= s;
    }

    public static boolean a(exP exP2, fhk fhk2, ffV ffV2, ffS ffS2) {
        short s;
        short s2 = s = fhk2.cmL() <= 0 ? exP2.dnG() : fhk2.cmL();
        if (ffV2.pe() && ffV2.fVV().cmL() > s) {
            return false;
        }
        return fgt.a(exP2, fhk2, ffV2.dOg(), ffS2);
    }

    public static boolean a(exP exP2, fhk fhk2, ffV ffV2, ffS ffS2, qm_0 qm_02, boolean bl) {
        if (fgt.a(exP2, fhk2, ffS2, ffV2, bl, true) != fhc.snm) {
            return false;
        }
        return ffV2.dOg().a(ffj_0.sge) == null || ffV2.dOg().a(ffj_0.sge).b(exP2, exP2, ffV2, qm_02);
    }

    public static boolean b(exP exP2, fhk fhk2, ffV ffV2, ffS ffS2) {
        if (ffV2 == null) {
            return false;
        }
        Set<ffS> set = fhk2.fUd().keySet();
        for (ffS ffS3 : set) {
            ffV ffV3;
            Optional<ffV> optional;
            if (ffS2 != null && ffS3 == ffS2 || (optional = fgt.a(fhk2, ffS3, exP2.Xi())).isEmpty() || (ffV3 = optional.get()).LV() == ffV2.LV()) continue;
            if (ffV3.avr() == ffV2.avr()) {
                return true;
            }
            if (!eKQ.qEb.fw(ffV2.avr(), ffV3.avr()) && !eKQ.qEb.fw(ffV3.avr(), ffV2.avr())) continue;
            return true;
        }
        return false;
    }

    public static boolean c(exP exP2, fhk fhk2, ffV ffV2, ffS ffS2) {
        Set<ffS> set = fhk2.fUd().keySet();
        for (ffS ffS3 : set) {
            Long l;
            if (ffS2 != null && ffS3 == ffS2 || (l = fhk2.t(ffS3)) == null || l.longValue() != ffV2.LV()) continue;
            return true;
        }
        return false;
    }

    public static boolean d(exP exP2, fhk fhk2, ffV ffV2, ffS ffS2) {
        fgj fgj2 = ffV2.dwg();
        if (fgj2 != fgj.siF && fgj2 != fgj.siH) {
            return false;
        }
        Set<ffS> set = fhk2.fUd().keySet();
        for (ffS ffS3 : set) {
            Optional<ffV> optional;
            if (ffS3 == ffS2 || !(optional = fgt.a(fhk2, ffS3, exP2.Xi())).isPresent() || optional.get().dwg() != fgj2) continue;
            return true;
        }
        return false;
    }

    public static boolean a(exP exP2, fhk fhk2, Long l) {
        Collection<fhm> collection = fhp.sop.tE(exP2.Xi());
        for (fhm fhm2 : collection) {
            long l2 = fhm2.KU();
            if (l2 == exP2.Sn()) continue;
            for (fhk fhk3 : fhm2.uv().values()) {
                ffS ffS2 = fhk3.tz(l);
                if (ffS2 == null) continue;
                return true;
            }
        }
        return false;
    }

    public static Set<ffS> e(@NotNull exP exP2, @NotNull fhk fhk2, @NotNull ffV ffV2, @NotNull ffS ffS2) {
        fhe fhe2 = fhi.soc.aI(exP2.Xi(), exP2.Sn());
        EnumSet<ffS> enumSet = EnumSet.noneOf(ffS.class);
        for (ffS ffS3 : fhk2.fUd().keySet()) {
            ffV ffV3 = fhk2.a(fhe2, ffS3);
            if (ffV3 == null) continue;
            Object[] objectArray = ffV3.fWi().fZs();
            if (ffS3 == ffS2) {
                enumSet.addAll(Arrays.asList(objectArray));
                continue;
            }
            if (!ado_1.a(objectArray, ffS2)) continue;
            enumSet.add(ffS3);
        }
        ffS[] ffSArray = ffV2.fWi().fZs();
        enumSet.addAll(Arrays.asList(ffSArray));
        enumSet.add(ffS2);
        return enumSet;
    }

    public static Set<ffS> b(@NotNull fgd_0 fgd_02, @NotNull ffV ffV3, @NotNull ffS ffS2) {
        EnumSet<ffS> enumSet = EnumSet.noneOf(ffS.class);
        fgd_02.c((ffV2, n) -> {
            Object[] objectArray = ffV2.fWi().fZs();
            ffS ffS3 = ffS.gj(n.byteValue());
            if (ffS3 == ffS2) {
                enumSet.addAll(Arrays.asList(objectArray));
            } else if (ado_1.a(objectArray, ffS2)) {
                enumSet.add(ffS3);
            }
        });
        ffS[] ffSArray = ffV3.fWi().fZs();
        enumSet.addAll(Arrays.asList(ffSArray));
        enumSet.add(ffS2);
        return enumSet;
    }

    @NotNull
    public static ffS a(fhk fhk2, ffV ffV2) {
        ffS[] ffSArray;
        for (ffS ffS2 : ffSArray = ffV2.dOg().dGh().fZq()) {
            if (fhk2.t(ffS2) != null) continue;
            return ffS2;
        }
        return ffSArray[0];
    }

    @NotNull
    public static ffS a(fgd_0 fgd_02, ffV ffV2) {
        ffS[] ffSArray;
        for (ffS ffS2 : ffSArray = ffV2.dOg().dGh().fZq()) {
            if (fgd_02.ai(ffS2.shb) != null) continue;
            return ffS2;
        }
        return ffSArray[0];
    }

    public static boolean cG(@NotNull ffV ffV2) {
        if (!ffV2.dXg()) {
            return false;
        }
        fhi_0 fhi_02 = ffV2.eAZ();
        return fhi_02.ahy() > 0 || fhi_02.ahA() > 0;
    }

    public static long cH(ffV ffV2) {
        if (!ffV2.dXg()) {
            return 0L;
        }
        fhi_0 fhi_02 = ffV2.eAZ();
        if (fhi_02.fYI() == 0) {
            return 0L;
        }
        int n = 0;
        int n2 = 0;
        for (fhn_0 fhn_02 : fhi_02.dTS().values()) {
            if (fhn_02.dBe() == rd_0.bjE) {
                ++n;
            }
            n2 += fhn_02.dSU();
        }
        return 10000000L * (long)GC.a(fhi_02.fYI(), 0, 9) + 1000000L * (long)GC.a(n, 0, 9) + (long)GC.a(n2, 0, 999999);
    }

    public static int cI(ffV ffV2) {
        int n;
        if (ffV2.dXg()) {
            int n2 = ffV2.eAZ().ahy();
            int n3 = ffV2.eAZ().ahA();
            n = (n2 > 0 ? fgt.Vc(n2) : 0) + (n3 > 0 ? fgt.Vc(n3) : 0);
        } else {
            n = 0;
        }
        if (n > 0) {
            return n;
        }
        return ffV2.dOg().dGh().fZq().length > 0 ? 0 : -1;
    }

    private static int Vc(int n) {
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            return 0;
        }
        if (((fhc_0)r).bcx().aVo() == 0) {
            return 0;
        }
        return (int)((fhc_0)r).bcx().vK(0).Rz(1);
    }

    public static List<ffV> a(@NotNull List<ffV> list, int ... nArray) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>(list.size());
        for (ffV ffV2 : list) {
            if (ado_1.a(nArray, ffV2.avr())) continue;
            arrayList.add(ffV2);
        }
        return arrayList;
    }

    public static List<ffV> a(@NotNull ffs_0 ffs_02, @NotNull Collection<ffV> collection) {
        return fgt.a(new fgu(ffs_02), collection);
    }

    public static List<ffV> a(@NotNull fft_0 fft_02, @NotNull Collection<ffV> collection) {
        ArrayListMultimap arrayListMultimap = ArrayListMultimap.create();
        fft_02.M((TObjectProcedure<ffV>)((TObjectProcedure)arg_0 -> fgt.a((ListMultimap)arrayListMultimap, arg_0)));
        List<azx_1<fgF, Integer>> list = fft_02.fVl();
        ArrayList<ffV> arrayList = new ArrayList<ffV>(collection.size());
        block0: for (ffV ffV2 : collection) {
            boolean bl = false;
            if (arrayListMultimap.containsKey((Object)ffV2.avr())) {
                for (azx_1<fgF, Integer> azx_12 : arrayListMultimap.get((Object)ffV2.avr())) {
                    if (!((ffV)((Object)azx_12.getFirst())).n(ffV2) || azx_12.aHI() < ffV2.bfd()) continue;
                    azx_12.N(azx_12.aHI() - ffV2.bfd());
                    arrayList.add(ffV2);
                    bl = true;
                    break;
                }
            }
            if (bl) continue;
            for (azx_1<fgF, Integer> azx_12 : list) {
                @Nullable fgF fgF2 = azx_12.getFirst();
                int n = azx_12.aHI();
                if (n == 0 || fgF2 != null && !fgF2.cM(ffV2)) continue;
                azx_12.N(n - 1);
                arrayList.add(ffV2);
                continue block0;
            }
        }
        return arrayList;
    }

    private static /* synthetic */ boolean a(ListMultimap listMultimap, ffV ffV2) {
        int n = ffV2.bfe() - ffV2.bfd();
        if (n > 0) {
            listMultimap.put((Object)ffV2.avr(), new azx_1<ffV, Integer>(ffV2, n));
        }
        return true;
    }
}

