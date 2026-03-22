/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eKj
 */
public final class ekj_0 {
    public static final fm_1[] qBp = (fm_1[])Arrays.stream(fm_1.values()).filter(fm_12 -> !ekj_0.A(fm_12)).toArray(fm_1[]::new);

    private ekj_0() {
    }

    public static Optional<ekn_0> qa(long l) {
        return evx_2.feo().b(l, eva_1.owy);
    }

    public static Optional<ekr_0> qb(long l) {
        return evx_2.feo().b(l, eva_1.owz);
    }

    public static boolean z(fm_1 fm_12) {
        return fm_12 == fm_1.py;
    }

    public static int fxQ() {
        return ewo_0.oBF.i(ewr_0.oFU);
    }

    public static Optional<fm_1> r(ffS ffS2) {
        switch (ffS2) {
            case sgB: {
                return Optional.of(fm_1.pB);
            }
            case sgE: {
                return Optional.of(fm_1.pD);
            }
            case sgG: {
                return Optional.of(fm_1.pC);
            }
            case sgN: {
                return Optional.of(fm_1.pF);
            }
            case sgO: {
                return Optional.of(fm_1.pE);
            }
            case sgQ: {
                return Optional.of(fm_1.pG);
            }
            case sgR: {
                return Optional.of(fm_1.pH);
            }
            case sgS: {
                return Optional.of(fm_1.pJ);
            }
        }
        return Optional.empty();
    }

    public static boolean cc(ffV ffV2) {
        return ekj_0.b(ffV2.fWi().fZq());
    }

    public static boolean b(ffS ... ffSArray) {
        return Arrays.stream(ffSArray).anyMatch(ffS2 -> {
            Optional<fm_1> optional = ekj_0.r(ffS2);
            return optional.isPresent() && !ekj_0.A(optional.get());
        });
    }

    public static fm_1 e(fnl_0 fnl_02) {
        return fnl_02.geL().gfz() ? fm_1.pu : fm_1.pv;
    }

    public static boolean e(fm_1 fm_12, int n) {
        switch (fm_12) {
            case pI: {
                return fnt.sJb.geu().contains(n);
            }
        }
        return false;
    }

    public static boolean a(fm_1 fm_12, int n, ekn_0 ekn_02) {
        if (ekj_0.e(fm_12, n)) {
            return true;
        }
        return ekn_02.a(fm_12, n);
    }

    public static String sn(String string) {
        String string2 = BH.bf(string);
        if (string2.length() > 20) {
            return string2.substring(0, 20);
        }
        return string2;
    }

    public static String e(ekr_0 ekr_02) {
        String string = ekr_02.fyc().entrySet().stream().map(entry -> "Preset id : " + String.valueOf(entry.getKey()) + " with content : " + String.valueOf(entry.getValue())).collect(Collectors.joining(",\n"));
        return "List of presets : \n" + string;
    }

    public static boolean A(@NotNull fm_1 fm_12) {
        return fm_12 == fm_1.pJ;
    }

    @NotNull
    public static fo_2 a(long l, long l2, fm_1 fm_12) {
        Optional<ekr_0> optional = ekj_0.qb(l);
        if (optional.isEmpty()) {
            return ekl_0.qBy;
        }
        Optional<eks_0> optional2 = optional.get().qd(l2);
        if (optional2.isEmpty()) {
            return ekl_0.qBy;
        }
        List<ekp_0> list = optional2.get().fye().get((Object)fm_12);
        if (list == null || list.isEmpty()) {
            return ekl_0.qBy;
        }
        List<fb_2> list2 = list.stream().map(ekt_0::f).toList();
        return fo_2.zC().q(list2).zI();
    }

    @NotNull
    public static fb_2 b(long l, long l2, fm_1 fm_12) {
        fo_2 fo_22 = ekj_0.a(l, l2, fm_12);
        if (fo_22.zA() == 0) {
            return ekl_0.qBx;
        }
        return fo_22.cg(0);
    }

    @NotNull
    public static fb_2 a(long l, long l2, ffS ffS2) {
        Optional<fm_1> optional = ekj_0.r(ffS2);
        return optional.map(fm_12 -> ekj_0.b(l, l2, fm_12)).orElse(ekl_0.qBx);
    }

    public static boolean R(long l, long l2) {
        Optional<ekr_0> optional = evx_2.feo().b(l, eva_1.owz);
        return optional.flatMap(ekr_02 -> ekr_02.qd(l2)).map(eks_0::dva).map(bl -> bl == false).orElse(true);
    }

    public static int a(fnl_0 fnl_02, fb_2 fb_22) {
        if (fnl_02 == null) {
            return 0;
        }
        if (fb_22.AK() == 0) {
            return fnl_02.agI() == 0 ? fnl_02.geL().gfD() : fnl_02.agI();
        }
        if (fb_22.AL()) {
            return fb_22.AM();
        }
        return 0;
    }

    public static int b(fnl_0 fnl_02, fb_2 fb_22) {
        if (fnl_02 == null) {
            return 0;
        }
        if (fb_22.AK() == 0 && fnp_0.k(fnl_02)) {
            return fnl_02.agK();
        }
        if (fb_22.AN()) {
            return fb_22.AO();
        }
        return fb_22.AK();
    }
}

