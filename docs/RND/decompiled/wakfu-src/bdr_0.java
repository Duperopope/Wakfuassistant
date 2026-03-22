/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bDR
 */
public final class bdr_0 {
    private static final int jLF = 3;
    private static final Set<fgj> jLG = Collections.unmodifiableSet(EnumSet.of(fgj.siF, fgj.siH, fgj.siE, fgj.siG, fgj.siD));
    private static final String jLH = "yesButton";

    private bdr_0() {
    }

    public static bdu_0 b(@NotNull bgt_0 bgt_02, @NotNull List<ffV> list) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>(list.size());
        int n = 0;
        boolean bl = false;
        boolean bl2 = false;
        for (ffV ffV2 : list) {
            if (fhB.f(ffV2, bgt_02) != fhA.soV) continue;
            arrayList.add(ffV2);
            n += ffV2.bfd();
            bl = bl || bdr_0.ad(ffV2);
            bl2 = bl2 || bdr_0.ac(ffV2);
        }
        return new bdu_0(arrayList, n, bl, bl2);
    }

    public static void a(bdu_0 bdu_02, Runnable runnable) {
        if (bdu_02.jLJ.isEmpty()) {
            return;
        }
        fse_1.gFu().f("recyclingConfirmation", new bdv_0(bdu_02));
        fyw_0.gqw().a(new bds_0());
        fey_2 fey_22 = (fey_2)ccj_2.g("recyclingConfirmationDialog", 256L);
        ((fes_2)fey_22.getChildWithId(jLH)).setOnClick(new bdt_0(runnable));
    }

    private static boolean ac(@NotNull ffV ffV2) {
        return ffV2.fVX() >= 3;
    }

    private static boolean ad(@NotNull ffV ffV2) {
        return jLG.contains(ffV2.dwg());
    }

    public static boolean ae(@NotNull ffV ffV2) {
        return bdr_0.ad(ffV2) || bdr_0.ac(ffV2);
    }

    public static bdw_0 a(@NotNull List<ffV> list, @NotNull bhJ bhJ2) {
        Object object;
        List<ffV> list2 = fhB.c(list, bhJ2);
        int n = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
        for (ffV object22 : list2) {
            n += object22.bfd();
            Optional<Bu<Integer, Float>> n2 = fhB.cP(object22);
            if (n2.isEmpty()) continue;
            object = VJ.bu(n2.get().aHI().floatValue());
            hashMap.merge(n2.get().getFirst(), (Integer)((Bu)object).getFirst(), Integer::sum);
            hashMap2.merge(n2.get().getFirst(), (Integer)((Bu)object).aHI(), Integer::sum);
        }
        if (n == 0) {
            return new bdw_0(0, "");
        }
        List list3 = hashMap.keySet().stream().sorted(Integer::compare).toList();
        ahv_2 ahv_22 = new ahv_2();
        int n2 = 0;
        object = list3.iterator();
        while (object.hasNext()) {
            int n3 = (Integer)object.next();
            ahv_22.a(auc_0.cVq().a((fjm)bhJ2, n3), 24, 24, null);
            ahv_22.c(" ").c(aum_0.cWf().a(15, (long)n3, new Object[0]));
            ahv_22.c(" : ");
            int n4 = (Integer)hashMap.get(n3);
            int n5 = (Integer)hashMap2.get(n3);
            if (n4 == n5) {
                ahv_22.yx(n4);
            } else {
                ahv_22.yx(n4).c(" - ").yx(n5);
            }
            if (n2 < list3.size() - 1) {
                ahv_22.c("\n");
            }
            ++n2;
        }
        return new bdw_0(n, ahv_22.ceL());
    }
}

