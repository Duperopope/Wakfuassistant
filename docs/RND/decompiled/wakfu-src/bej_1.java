/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bEj
 */
public class bej_1 {
    private bej_1() {
    }

    public static boolean aM(ffV ffV2) {
        long l = aue_0.cVJ().cVO().xl();
        return fcI.ag(l, ffV2.LV()) != null || bEf.a(aue_0.cVJ().cVK(), ffV2);
    }

    public static void lg(long l) {
        Object object = fse_1.gFu().aW("itemDetail", "inventoryDialog");
        if (object instanceof ffV && ((ffV)object).LV() == l) {
            fse_1.gFu().b("itemDetail", (Object)null, "inventoryDialog");
        }
    }

    @Contract(value="null, _, _ -> null")
    public static ffV a(@Nullable exP exP2, long l, boolean bl) {
        if (exP2 == null) {
            return null;
        }
        ffV ffV2 = exP2.dod().ld(l);
        if (ffV2 != null) {
            if (cvu_2.eQx()) {
                cvu_2.eTO().bG(ffV2);
            }
            if (bl) {
                bgz_2.be(ffV2);
            }
        }
        return ffV2;
    }

    public static Optional<ffV> lh(long l) {
        Set set = fcL.rUh.sz(bbs_2.xl());
        for (bgt_0 bgt_02 : set) {
            ffV ffV2 = bgt_02.jC(l);
            if (ffV2 == null) continue;
            return Optional.of(ffV2);
        }
        return Optional.empty();
    }

    @Nullable
    public static eJS b(@NotNull bgt_0 bgt_02, ffV ffV2) {
        eyp_1 eyp_12 = bgt_02.dnQ().dKL();
        if (eyp_12 == null) {
            return null;
        }
        for (exz_1 exz_12 : eyp_12.pP(bgt_02.Xi())) {
            eJS eJS2 = eJN.qAF.pR(-exz_12.KU());
            if (eJS2 == null || !eJS2.dme().dM(ffV2.LV())) continue;
            return eJS2;
        }
        return null;
    }

    public static Optional<ffV> li(long l) {
        ffV ffV2 = fgt.aG(bbs_2.xl(), l);
        if (ffV2 != null) {
            return Optional.of(ffV2);
        }
        return Optional.ofNullable(blq_1.jZ(l));
    }

    @NotNull
    public static String b(fgj fgj2) {
        return aum_0.cWf().c("item.rarity." + fgj2.name(), new Object[0]);
    }

    @NotNull
    public static String c(fgj fgj2) {
        return aum_0.cWf().d("item.rarity." + fgj2.name(), new Object[0]);
    }
}

