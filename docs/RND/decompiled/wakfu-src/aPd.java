/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aPd {
    public static final Pattern ewz = Pattern.compile(" ");

    public static void Q(String string, String string2) {
        String string3 = aPd.iI(string);
        if (string3 == null) {
            return;
        }
        chU chU2 = new chU();
        chU2.oq(string2);
        chU2.op(string3);
        aue_0.cVJ().etu().d(chU2);
    }

    public static void iG(String string) {
        String[] stringArray = ewz.split(string, 2);
        aPd.e("error.chat.commandNotFound", stringArray[0]);
    }

    public static boolean czc() {
        return aPd.a(null, ejn_0.qzl);
    }

    public static boolean a(String string, ejn_0 ejn_02) {
        boolean bl = ejp_0.fxk().a(apb_0.ezt, string, ejn_02);
        if (bl) {
            aPd.e("error.chat.flood", new Object[0]);
        }
        return bl;
    }

    public static String iH(String string) {
        boolean bl = ejp_0.fxk().a(apb_0.ezt, string);
        if (bl) {
            aPd.e("error.chat.flood", new Object[0]);
            return null;
        }
        return string;
    }

    public static void n(int n, boolean bl) {
        aPd.o(n, bl);
        aPd.p(n, bl);
    }

    public static void o(int n, boolean bl) {
        dae_0 dae_02 = new dae_0(19275);
        dae_02.cC(bl);
        dae_02.sY(n);
        dae_02.gj(0L);
        aaw_1.bUq().h(dae_02);
    }

    public static void p(int n, boolean bl) {
        dae_0 dae_02 = new dae_0(19751);
        dae_02.cC(bl);
        dae_02.sY(n);
        dae_02.gj(5000L);
        aaw_1.bUq().h(dae_02);
    }

    public static void e(String string, Object ... objectArray) {
        String string2 = aum_0.cWf().c(string, objectArray);
        aPh.czg().iY(string2);
    }

    public static void f(String string, Object ... objectArray) {
        String string2 = aum_0.cWf().c(string, objectArray);
        aPh.czg().iZ(string2);
    }

    public static void g(String string, Object ... objectArray) {
        String string2 = aum_0.cWf().c(string, objectArray);
        aPh.czg().ja(string2);
    }

    public static void czd() {
        aPh.czg().iZ("");
    }

    @Nullable
    public static String iI(String string) {
        if (string == null) {
            return null;
        }
        if ((string = aPd.iH(string.trim())) == null) {
            return null;
        }
        string = aPe.czf().iK(string);
        if (string == null) {
            return null;
        }
        if ((string = bYV.nU(string)).isBlank()) {
            aPd.e("error.chat.operationNotPermited", new Object[0]);
            return null;
        }
        return aPd.iJ(string);
    }

    @NotNull
    private static String iJ(String string) {
        return string.replaceAll("(\\S)<o ", "$1 <o ");
    }

    @NotNull
    public static Mv a(List<aPa> list, String string) {
        for (aPa aPa2 : list) {
            if (!string.equals(aPb.a(aPa2))) continue;
            return aPa2.aUXX();
        }
        return aup_0.cWl();
    }

    public static String c(Mv mv, String string) {
        return aPd.a(mv, aPa.evA, aPl.k(mv), string);
    }

    public static String d(Mv mv, String string) {
        return aPd.a(mv, aPa.evF, aPl.l(mv), string);
    }

    private static String a(Mv mv, aPa aPa2, aPl aPl2, String string) {
        if (!ewo_0.z(mv)) {
            cdT.v(mv);
            return null;
        }
        if (!((bsg_1)aie_0.cfn().bmH()).t(mv)) {
            cdT.w(mv);
            return null;
        }
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljJ);
        if (string == null || bl) {
            if (mv == aup_0.cWl()) {
                aPd.a(aPb.iE(aPa2.cyR()).cBk());
            } else {
                aPd.h(aPl2);
            }
        }
        return aPd.iI(string);
    }

    public static void a(aPl aPl2, String string) {
        aPd.a(aPl2.czF(), string);
    }

    public static void a(aPP aPP2, String string) {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljJ);
        if (string == null || string.trim().isEmpty() || bl) {
            aPd.a(aPP2);
        }
    }

    private static void h(aPl aPl2) {
        aPd.a(aPl2.czF());
    }

    private static void a(aPP aPP2) {
        apr_0 apr_02 = aPt.cAg().cAl();
        if (apr_02 == null) {
            return;
        }
        apn_0 apn_02 = apr_02.czW();
        if (apn_02 == null) {
            return;
        }
        apn_02.a(aPP2, true);
    }
}

