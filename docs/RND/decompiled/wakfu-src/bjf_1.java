/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bjf
 */
public final class bjf_1 {
    public static final List<fm_1> inI = List.of(fm_1.pw, fm_1.pH, fm_1.pG, fm_1.pv, fm_1.pu, fm_1.pB, fm_1.pD, fm_1.pE, fm_1.pC, fm_1.pF);
    public static final List<fm_1> inJ = List.of(fm_1.px, fm_1.pz, fm_1.py, fm_1.pA);
    public static final List<fm_1> inK = List.of(fm_1.pB, fm_1.pD, fm_1.pE, fm_1.pC, fm_1.pF);
    public static final String inL = "txDefaultPresetIcon";

    private bjf_1() {
    }

    public static boolean a(fm_1 fm_12) {
        return fm_12 != fm_1.py;
    }

    public static void a(fm_1 fm_12, List<Integer> list) {
        bbs_2.a(eva_1.owy).ifPresent(evv_22 -> list.forEach(n -> ((ekn_0)evv_22).f(fm_12, (int)n)));
    }

    public static void a(fm_1 fm_12, int n) {
        bbs_2.a(eva_1.owy).ifPresent(evv_22 -> {
            ((ekn_0)evv_22).g(fm_12, n);
            aue_0.cVJ().etu().d(new cjD(fm_12, Collections.singleton(n)));
        });
    }

    public static void a(fm_1 fm_12, Set<Integer> set) {
        bbs_2.a(eva_1.owy).ifPresent(evv_22 -> {
            ((ekn_0)evv_22).c(fm_12, set);
            aue_0.cVJ().etu().d(new cjD(fm_12, set));
        });
    }

    public static @Unmodifiable List<Integer> b(fm_1 fm_12) {
        return bjf_1.c(fm_12).stream().map(fb_2::AK).toList();
    }

    public static Collection<fb_2> c(fm_1 fm_12) {
        Optional optional = bbs_2.a(eva_1.owy);
        if (optional.isEmpty()) {
            return Collections.emptyList();
        }
        ekn_0 ekn_02 = (ekn_0)optional.get();
        Collection<fb_2> collection = ekn_02.D(fm_12);
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyList();
        }
        return collection;
    }

    public static boolean a(int n, fm_1 ... fm_1Array) {
        for (fm_1 fm_12 : fm_1Array) {
            if (!ekj_0.e(fm_12, n)) continue;
            return true;
        }
        Optional optional = bbs_2.a(eva_1.owy);
        if (optional.isEmpty()) {
            return false;
        }
        ekn_0 ekn_02 = (ekn_0)optional.get();
        for (fm_1 fm_13 : fm_1Array) {
            if (!ekn_02.D(fm_13).stream().anyMatch(fb_22 -> fb_22.AK() == n)) continue;
            return true;
        }
        return false;
    }

    public static boolean b(int n, fm_1 ... fm_1Array) {
        Optional optional = bbs_2.a(eva_1.owy);
        if (optional.isEmpty()) {
            return false;
        }
        ekn_0 ekn_02 = (ekn_0)optional.get();
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(n);
        if (bgv_22 == null) {
            return true;
        }
        for (fm_1 fm_12 : fm_1Array) {
            boolean bl = ekn_02.D(fm_12).stream().anyMatch(bjf_1.f(bgv_22));
            if (!bl) continue;
            return true;
        }
        return false;
    }

    @NotNull
    private static Predicate<fb_2> f(bgv_2 bgv_22) {
        return fb_22 -> {
            bgv_2 bgv_23 = (bgv_2)bEm.dSb().Vd(fb_22.AK());
            if (bgv_23 == null || bgv_22 == null) {
                return true;
            }
            return bgv_23.aVt() == bgv_22.aVt();
        };
    }

    public static boolean c(int n, fm_1 ... fm_1Array) {
        Optional optional = bbs_2.a(eva_1.owy);
        if (optional.isEmpty()) {
            return false;
        }
        ekn_0 ekn_02 = (ekn_0)optional.get();
        for (fm_1 fm_12 : fm_1Array) {
            if (!ekn_02.E(fm_12).contains(n)) continue;
            return true;
        }
        return false;
    }

    public static Collection<Integer> d(fm_1 fm_12) {
        Optional optional = bbs_2.a(eva_1.owy);
        if (optional.isEmpty()) {
            return Collections.emptyList();
        }
        ekn_0 ekn_02 = (ekn_0)optional.get();
        return Collections.unmodifiableCollection(ekn_02.E(fm_12));
    }

    public static String e(fm_1 fm_12) {
        switch (fm_12) {
            case pu: {
                return "SmallMount";
            }
            case pv: {
                return "SmallPet";
            }
            case pw: {
                return "SmallCostume";
            }
            case px: {
                return "SmallRun";
            }
            case pz: {
                return "SmallAura";
            }
            case py: {
                return "SmallFinisher";
            }
            case pE: {
                return "SmallCape";
            }
            case pB: {
                return "SmallHelmet";
            }
            case pF: {
                return "SmallBoot";
            }
            case pC: {
                return "SmallChest";
            }
            case pD: {
                return "SmallShoulder";
            }
            case pG: {
                return "SmallBigSword";
            }
            case pH: {
                return "SmallShield";
            }
        }
        return "SmallStar";
    }

    public static int f(fm_1 fm_12) {
        switch (fm_12) {
            case pw: {
                return 0;
            }
            case pv: {
                return 1;
            }
            case pu: {
                return 2;
            }
            case px: {
                return 3;
            }
            case py: {
                return 4;
            }
            case pz: {
                return 5;
            }
            case pB: {
                return 6;
            }
            case pD: {
                return 7;
            }
            case pC: {
                return 8;
            }
            case pE: {
                return 9;
            }
            case pF: {
                return 10;
            }
            case pG: {
                return 11;
            }
            case pH: {
                return 12;
            }
            case pA: {
                return 13;
            }
            case pJ: {
                return 16;
            }
        }
        return 20;
    }

    public static @Unmodifiable List<fm_1> a(ffS ... ffSArray) {
        return Arrays.stream(ffSArray).map(ekj_0::r).filter(Optional::isPresent).map(Optional::get).toList();
    }

    public static String g(fm_1 fm_12) {
        switch (fm_12) {
            case pu: {
                return aum_0.cWf().c("contentLoader.mountSkin", new Object[0]);
            }
            case pv: {
                return aum_0.cWf().c("cosmetics.name.pet", new Object[0]);
            }
            case pw: {
                return aum_0.cWf().c(ffS.sgY.shc, new Object[0]);
            }
            case px: {
                return aum_0.cWf().c("cosmetics.name.sprint", new Object[0]);
            }
            case pz: {
                return aum_0.cWf().c("cosmetics.name.aura", new Object[0]);
            }
            case py: {
                return aum_0.cWf().c("cosmetics.name.finisher", new Object[0]);
            }
            case pA: {
                return aum_0.cWf().c("cosmetics.name.title", new Object[0]);
            }
            case pB: {
                return aum_0.cWf().c("cosmetics.name.head", new Object[0]);
            }
            case pC: {
                return aum_0.cWf().c("cosmetics.name.chest", new Object[0]);
            }
            case pD: {
                return aum_0.cWf().c("cosmetics.name.shoulder", new Object[0]);
            }
            case pE: {
                return aum_0.cWf().c("cosmetics.name.back", new Object[0]);
            }
            case pF: {
                return aum_0.cWf().c("cosmetics.name.boots", new Object[0]);
            }
            case pG: {
                return aum_0.cWf().c("cosmetics.name.weapon1", new Object[0]);
            }
            case pH: {
                return aum_0.cWf().c("cosmetics.name.weapon2", new Object[0]);
            }
            case pJ: {
                return aum_0.cWf().c("desc.equipment.accessory", new Object[0]);
            }
        }
        return aum_0.cWf().c("menu", new Object[0]);
    }

    public static boolean h(@NotNull fm_1 fm_12) {
        return switch (fm_12) {
            case fm_1.pJ, fm_1.pI -> false;
            default -> {
                List<Long> var1_1 = ewo_0.oBF.o(ewr_0.oFS);
                if (!var1_1.contains(fm_12.getNumber())) {
                    yield true;
                }
                yield false;
            }
        };
    }

    public static boolean i(@NotNull fm_1 fm_12) {
        return switch (fm_12) {
            case fm_1.py, fm_1.pA -> false;
            default -> bjf_1.h(fm_12);
        };
    }

    public static boolean a(fnr_0 fnr_02, fb_2 fb_22) {
        if (!fb_22.AN() || fb_22.AO() == 0) {
            return false;
        }
        boolean bl = fb_22.AK() != 0;
        Optional<fov_0> optional = foy_0.sLJ.XT(fb_22.AO());
        if (optional.isEmpty()) {
            return false;
        }
        fov_0 fov_02 = optional.get();
        if (!bl) {
            return fov_02.d() == fnr_02.geL().d();
        }
        foA foA2 = foC.sLW.aF(fb_22.AK());
        if (foA2 == null) {
            return fov_02.d() == fnr_02.geL().d();
        }
        fov_0 fov_03 = foy_0.sLJ.XQ(foA2.ctm());
        if (fov_03 == null) {
            return false;
        }
        return fov_03.XJ(fb_22.AO());
    }

    public static int a(long l, long l2, bgv_2 bgv_22) {
        int n2 = bgv_22.aVt();
        ffS ffS2 = bgv_22.dGh().fZq()[0];
        fb_2 fb_22 = ekj_0.a(l, l2, ffS2);
        if (fb_22.AK() == 0) {
            return n2;
        }
        return Optional.of(fb_22).map(fb_2::AK).map(n -> (bgv_2)bEm.dSb().Vd((int)n)).filter(bgv_23 -> bgv_23.dGh().aIi() == bgv_22.dGh().aIi()).map(fhc_0::aVt).orElse(n2);
    }

    public static int f(ffV ffV2) {
        return ffV2.fUX() > 0 ? ffV2.fUX() : ffV2.avr();
    }

    public static Optional<ffS> j(fm_1 fm_12) {
        switch (fm_12) {
            case pB: {
                return Optional.of(ffS.sgB);
            }
            case pC: {
                return Optional.of(ffS.sgG);
            }
            case pD: {
                return Optional.of(ffS.sgE);
            }
            case pE: {
                return Optional.of(ffS.sgO);
            }
            case pF: {
                return Optional.of(ffS.sgN);
            }
            case pG: {
                return Optional.of(ffS.sgQ);
            }
            case pH: {
                return Optional.of(ffS.sgR);
            }
            case pv: {
                return Optional.of(ffS.sgX);
            }
            case pu: {
                return Optional.of(ffS.sgZ);
            }
            case pJ: {
                return Optional.of(ffS.sgS);
            }
        }
        return Optional.empty();
    }

    public static void a(ekq_0 ekq_02) {
        switch (ekq_02) {
            case qBN: {
                aPd.e("cosmetic.preset.max.count.reached", new Object[0]);
                break;
            }
            case qBO: {
                aPd.e("cosmetic.preset.unknown.cosmetic", new Object[0]);
                break;
            }
            case qBP: {
                aPd.e("cosmetic.preset.generic.error", new Object[0]);
                break;
            }
            case qBQ: {
                aPd.e("cosmetic.preset.unknown.preset", new Object[0]);
                break;
            }
            case qBS: {
                aPd.e("cosmetic.preset.flooding", new Object[0]);
                break;
            }
            case qBT: {
                aPd.e("error.impossibleDuringFight", new Object[0]);
                break;
            }
        }
    }

    public static String k(fm_1 fm_12) {
        switch (fm_12) {
            case pu: {
                return ffS.sgZ.shd;
            }
            case pv: {
                return ffS.sgX.shd;
            }
            case pw: {
                return "equipCostumeBackground";
            }
            case px: {
                return "equipRunBackground";
            }
            case py: {
                return "equipFinisherBackground";
            }
            case pz: {
                return "equipAuraBackground";
            }
            case pA: {
                return "equipTitleBackground";
            }
            case pB: {
                return ffS.sgB.shd;
            }
            case pD: {
                return ffS.sgE.shd;
            }
            case pE: {
                return ffS.sgO.shd;
            }
            case pC: {
                return ffS.sgG.shd;
            }
            case pF: {
                return ffS.sgN.shd;
            }
            case pG: {
                return ffS.sgQ.shd;
            }
            case pH: {
                return ffS.sgR.shd;
            }
            case pJ: {
                return ffS.sgS.shd;
            }
        }
        return null;
    }

    public static String lM(@Nullable String string) {
        if (string == null || string.isBlank()) {
            return aum_0.cWf().c("cosmetic.preset.default.preset.name", new Object[0]);
        }
        return string;
    }

    public static int a(int n, bgt_0 bgt_02) {
        if (n == -1) {
            return -1;
        }
        ffV ffV2 = fgD.fXh().Ve(n);
        if (ffV2 == null) {
            return -1;
        }
        return bgt_02.aWO() == 1 ? ffV2.cpf() : ffV2.aVt();
    }

    public static boolean l(fm_1 fm_12) {
        return fm_12 != fm_1.pA;
    }

    public static Optional<eks_0> Di(int n) {
        Optional<ekr_0> optional = bbs_2.a(eva_1.owz);
        return optional.flatMap(ekr_02 -> ekr_02.Qu(n));
    }

    public static Optional<eks_0> jM(long l) {
        return bbs_2.a(eva_1.owz).flatMap(ekr_02 -> ekr_02.qd(l));
    }

    @NotNull
    public static List<fm_1> a(@NotNull fhc_0 fhc_02) {
        fgl_0 fgl_02 = fhc_02.fUZ();
        if (fgl_02 instanceof bga_1) {
            bga_1 bga_12 = (bga_1)fgl_02;
            return List.of(bga_12.duW());
        }
        return Arrays.stream(fhc_02.dGh().fZq()).map(bjf_1::c).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
    }

    public static Optional<fm_1> c(ffS ffS2) {
        return switch (ffS2) {
            case ffS.sgX -> Optional.of(fm_1.pv);
            case ffS.sgZ -> Optional.of(fm_1.pu);
            default -> ekj_0.r(ffS2);
        };
    }

    public static boolean g(@NotNull ffV ffV2) {
        return !bjf_1.a(ffV2.dOg()).isEmpty();
    }

    public static boolean b(@NotNull fhc_0 fhc_02) {
        return !bjf_1.a(fhc_02).isEmpty();
    }

    public static boolean a(@NotNull fhc_0 fhc_02, fm_1 fm_12) {
        return bjf_1.a(fhc_02).contains((Object)fm_12);
    }

    @NotNull
    public static bgv_2 h(@NotNull ffV ffV2) {
        bgv_2 bgv_22;
        if (ffV2.fUX() > 0 && (bgv_22 = (bgv_2)bEm.dSb().Vd(ffV2.fUX())) != null) {
            return bgv_22;
        }
        return (bgv_2)ffV2.dOg();
    }

    public static Optional<int[]> Dj(int n) {
        foA foA2 = foC.sLW.aF(n);
        if (foA2 == null) {
            return Optional.empty();
        }
        fov_0 fov_02 = foy_0.sLJ.XQ(foA2.ctm());
        if (fov_02 == null) {
            return Optional.empty();
        }
        if (fov_02.gfC() == null) {
            return Optional.empty();
        }
        return Optional.of(fov_02.gfC());
    }

    public static Optional<int[]> Dk(int n) {
        foA foA2 = foC.sLW.aF(n);
        if (foA2 == null) {
            return Optional.empty();
        }
        fov_0 fov_02 = foy_0.sLJ.XQ(foA2.ctm());
        if (fov_02 == null) {
            return Optional.empty();
        }
        if (fov_02.gfB() == null) {
            return Optional.empty();
        }
        return Optional.of(fov_02.gfB());
    }
}

