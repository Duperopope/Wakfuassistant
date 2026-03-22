/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Point;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bow
 */
public final class bow_0 {
    public static final String iPJ = "headerChargesContainer";
    private static final String iPK = "effectsPanelFloatingSlots";
    private static final String iPL = "slotPanelFloatingSlots";
    private static final String iPM = "contentContainer";
    private static final String iPN = "selectedItemSublimationContainer";
    private static final String iPO = "selectedItemSpecialSublimationContainer";

    private bow_0() {
    }

    private static boolean dAT() {
        return ((bsg_1)aie_0.cfn().bmH()).a(aff.cpP);
    }

    private static Optional<faw_2> mi(String string) {
        fey_2 fey_22 = (fey_2)fyw_0.gqw().th("enchantmentDialog");
        if (fey_22 == null) {
            return Optional.empty();
        }
        return Optional.ofNullable((faw_2)fey_22.getChildWithId(string));
    }

    public static void dAU() {
        if (!bow_0.dAT()) {
            return;
        }
        fka_1 fka_12 = new fka_1();
        fka_12.aVI();
        fka_12.setFile("6001088.xps");
        fka_12.setAlignment(faa_2.tLO);
        fka_12.setApply3DTo2DProjection(true);
        bow_0.mi(iPJ).ifPresent(faw_22 -> faw_22.getAppearance().d(fka_12));
    }

    public static void a(@NotNull fhi_0 fhi_02, @NotNull fhi_0 fhi_03) {
        HashMap hashMap = new HashMap();
        fhi_02.dTS().forEach((by, fhn_02) -> {
            fhn_0 fhn_03 = fhi_03.gC((byte)by);
            if (fhn_03 == null || fhn_03.dBe() != fhn_02.dBe()) {
                hashMap.put(by, fhn_02.dBe());
            }
        });
        bow_0.mj(iPL).ifPresent(fbz_22 -> bow_0.a(fbz_22, hashMap));
    }

    public static void a(@NotNull fhi_0 fhi_02, @NotNull fhi_0 fhi_03, @NotNull rc_0 rc_02) {
        HashMap hashMap = new HashMap();
        if (rc_02 == rc_0.bjv) {
            fhi_02.dTS().forEach((by, fhn_02) -> {
                if (fhi_03.gC((byte)by) == null) {
                    hashMap.put(by, fhn_02.dBe());
                }
            });
        } else {
            boolean bl = ewo_0.oBF.k(ewr_0.oDh);
            if (!bl && fhi_02.fYI() == 4 && fhi_02.k(rd_0.bjE)) {
                bow_0.dAV();
                return;
            }
            fhi_02.dTS().forEach((by, fhn_02) -> hashMap.put(by, fhn_02.dBe()));
        }
        bow_0.mj(iPL).ifPresent(fbz_22 -> bow_0.a(fbz_22, hashMap));
    }

    public static void a(@NotNull fbz_2 fbz_22, @NotNull fhi_0 fhi_02) {
        HashMap<Byte, rd_0> hashMap = new HashMap<Byte, rd_0>();
        fhi_02.dTS().forEach((by, fhn_02) -> hashMap.put((Byte)by, fhn_02.dBe()));
        bow_0.a(fbz_22, hashMap);
    }

    public static void b(@NotNull fhi_0 fhi_02, @NotNull fhi_0 fhi_03) {
        HashMap hashMap = new HashMap();
        fhi_03.dTS().forEach((by, fhn_02) -> {
            fhn_0 fhn_03 = fhi_02.gC((byte)by);
            if (fhn_02.dSU() > 0 && !fhn_02.h(fhn_03) && fhn_02.dSU() >= fhn_03.dSU()) {
                hashMap.put(by, fhn_02.dBe());
            }
        });
        bow_0.mj(iPK).ifPresent(fbz_22 -> bow_0.a(fbz_22, hashMap));
    }

    private static Optional<fbz_2> mj(String string) {
        fey_2 fey_22 = (fey_2)fyw_0.gqw().th("enchantmentDialog");
        if (fey_22 == null) {
            return Optional.empty();
        }
        return Optional.ofNullable((fbz_2)fey_22.getChildWithId(string));
    }

    private static void a(@NotNull fbz_2 fbz_22, @NotNull Map<Byte, rd_0> map) {
        ArrayList<fcv_1> arrayList = fbz_22.getRenderables();
        map.forEach((by, rd_02) -> bow_0.a(rd_02).ifPresent(fka_12 -> {
            if (by >= arrayList.size()) {
                return;
            }
            ((fcv_1)arrayList.get(by.byteValue())).getAppearance().d((fhv_1)fka_12);
        }));
    }

    private static Optional<fka_1> a(@Nullable rd_0 rd_02) {
        String string;
        if (!bow_0.dAT()) {
            return Optional.empty();
        }
        Object object = rd_02;
        int n = 0;
        switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"RED", "GREEN", "BLUE", "WHITE"}, (rd_0)object, n)) {
            case 0: {
                String string2 = "6001081.xps";
                break;
            }
            case 1: {
                String string2 = "6001082.xps";
                break;
            }
            case 2: {
                String string2 = "6001083.xps";
                break;
            }
            case 3: {
                String string2 = "6001084.xps";
                break;
            }
            default: {
                String string2 = string = null;
            }
        }
        if (string == null) {
            return Optional.empty();
        }
        object = new fka_1();
        ((fka_1)object).aVI();
        ((fka_1)object).setFile(string);
        ((fka_1)object).setAlignment(faa_2.tLO);
        ((fka_1)object).setApply3DTo2DProjection(true);
        return Optional.of(object);
    }

    private static void dAV() {
        if (!bow_0.dAT()) {
            return;
        }
        Optional<faw_2> optional = bow_0.mi(iPM);
        if (optional.isEmpty()) {
            return;
        }
        HashMap<Integer, List> hashMap = new HashMap<Integer, List>();
        int n2 = 22;
        int n3 = 15;
        int n4 = 14;
        int n5 = 17;
        int n6 = 40;
        int n7 = -3;
        for (int i = 0; i <= 22; ++i) {
            for (int j = 0; j <= 22; ++j) {
                int n8 = Math.abs(i - 15);
                if (j < 14) {
                    n8 += 14 - j;
                } else if (j > 17) {
                    n8 += j - 17;
                }
                hashMap.computeIfAbsent(n8, n -> new ArrayList()).add(new Point(j, i));
            }
        }
        faw_2 faw_22 = optional.get();
        box_1 box_12 = new box_1(hashMap, faw_22);
        abg_2.bUP().a((Runnable)box_12, 1L);
    }

    public static void a(fhr_0 fhr_02) {
        if (!bow_0.dAT()) {
            return;
        }
        fka_1 fka_12 = new fka_1();
        fka_12.aVI();
        fka_12.setFile(bow_0.b(fhr_02));
        fka_12.setAlignment(faa_2.tLO);
        fka_12.setApply3DTo2DProjection(true);
        boolean bl = fhr_02 != fhr_0.sqz;
        String string = bl ? iPO : iPN;
        bow_0.mi(string).ifPresent(faw_22 -> faw_22.getAppearance().d(fka_12));
    }

    private static String b(@NotNull fhr_0 fhr_02) {
        return switch (fhr_02) {
            default -> throw new MatchException(null, null);
            case fhr_0.sqz -> "6001085.xps";
            case fhr_0.sqx -> "6001086.xps";
            case fhr_0.sqy -> "6001087.xps";
        };
    }
}

