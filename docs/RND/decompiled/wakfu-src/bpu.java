/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

public final class bpu {
    private static String iVI = null;
    private static boolean iVJ = false;

    private bpu() {
    }

    public static String dCT() {
        if (iVI == null) {
            iVI = " " + aum_0.cWf().c("market.filter.min.to.max", new Object[0]) + " ";
        }
        return iVI;
    }

    public static boolean dCU() {
        return iVJ;
    }

    public static void gN(boolean bl) {
        iVJ = bl;
    }

    public static boolean a(@NotNull bjt_2 bjt_22) {
        if (iVJ) {
            return false;
        }
        return bjt_22.drq().stream().anyMatch(bjs_22 -> bjs_22.dro() == bje_2.ipl);
    }

    @NotNull
    public static @Unmodifiable Collection<bjt_2> a(@NotNull fhw fhw2) {
        HashMap hashMap = new HashMap();
        fhw2.s(bjt_22 -> {
            List<bpv_0> list = bjt_22.cqk() ? bpu.d(bjt_22.cmK(), bjt_22.avr()) : List.of(new bpv_0(bjt_22.avr(), bjt_22.cmK()));
            for (bpv_0 bpv_02 : list) {
                int n = Objects.hash(bpv_02.iVK, GC.c(bpu.W(bpv_02.iVL), 3), bjt_22.drq(), bjt_22.css());
                if (hashMap.containsKey(n)) continue;
                bjt_2 bjt_23 = (bjt_2)new bju_2().G(bjt_22.drq()).gn(bjt_22.css()).Wc(bpv_02.iVK).ac(bpv_02.iVL).drr();
                hashMap.put(n, bjt_23);
            }
        });
        return Collections.unmodifiableCollection(hashMap.values());
    }

    private static double W(double d2) {
        return d2 >= 0.0 ? d2 : 1.0;
    }

    @NotNull
    private static List<bpv_0> d(double d2, int n) {
        fhw fhw2 = fiJ.ssM.Wb(n);
        if (fhw2 == null) {
            return List.of();
        }
        double d3 = 0.0;
        for (fhv object : fhw2.fXW()) {
            if (!(object.cmK() >= 0.0)) continue;
            d3 += object.cmK();
        }
        ArrayList arrayList = new ArrayList();
        for (fhv fhv2 : fhw2.fXW()) {
            double d4;
            double d5 = d4 = fhv2.cmK() < 0.0 ? 1.0 : fhv2.cmK() / d3;
            if (fhv2.cqk()) {
                arrayList.addAll(bpu.d(d2 * d4, fhv2.avr()));
                continue;
            }
            arrayList.add(new bpv_0(fhv2.avr(), d2 * d4));
        }
        return arrayList;
    }

    public static double X(double d2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return d2;
        }
        double d3 = Math.max(0, 100 + Math.min(200, bgt_02.c(exx_2.rGH)));
        double d4 = d3 * (double)bsf_0.dGi().dGk();
        double d5 = (double)bgt_02.c(exx_2.rHM) / 100.0;
        double d6 = (double)bgt_02.c(exx_2.rHP) / 100.0;
        float f2 = bgt_02.dkC().ghw();
        evt_1 evt_12 = evt_1.Oq(aue_0.cVJ().cVO().arF());
        double d7 = evt_12.feB();
        return Math.min(1.0, d2 * (d4 / 100.0) * (1.0 + (d5 - 1.0) + (d6 - 1.0) + (double)(f2 - 1.0f)) * d7);
    }

    @NotNull
    public static String h(double d2, double d3) {
        return aum_0.cWf().c("encyclopedia.loot.popup.rate", GC.c(100.0 * d2, 3), GC.c(100.0 * d3, 3));
    }

    @NotNull
    public static @NotNull @Unmodifiable List<@NotNull bgv_2> e(@NotNull bjz_1 bjz_12) {
        return Arrays.stream(bjz_12.fhM()).mapToObj(bjz_12::OP).filter(Objects::nonNull).map(bmv_2::csA).distinct().map(bEm.dSb()::Vd).filter(Objects::nonNull).toList();
    }
}

