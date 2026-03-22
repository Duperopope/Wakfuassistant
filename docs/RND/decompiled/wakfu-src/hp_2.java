/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Histogram
 *  com.codahale.metrics.Meter
 *  com.codahale.metrics.Reservoir
 *  com.codahale.metrics.Timer
 *  com.codahale.metrics.UniformReservoir
 */
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.Reservoir;
import com.codahale.metrics.Timer;
import com.codahale.metrics.UniformReservoir;

/*
 * Renamed from Hp
 */
public final class hp_2 {
    private static final String aIC = "ai.decision.compute.";
    private static final String aID = ".time";
    private static final String aIE = "network.message.compute.";
    private static final String aIF = ".time";
    private static final String aIG = "instance.";
    private static final String aIH = ".count";
    private static final String aII = "instance.";
    private static final String aIJ = ".life";
    private static final String aIK = "network.message.in.";
    private static final String aIL = ".size";
    private static final String aIM = "network.message.out.";
    private static final String aIN = ".size";
    private static final Histogram aIO = new Histogram((Reservoir)new UniformReservoir());
    private static final Meter aIP = new Meter();
    private static final Timer aIQ = new Timer();
    private static boolean aIR = true;

    private hp_2() {
    }

    public static Timer mX(int n) {
        if (hp_2.aOW()) {
            return aIQ;
        }
        gg_2 gg_22 = FG.aLe().e(gg_2.class);
        return gg_22.e(aIC + n + ".time", () -> new gt_2(n));
    }

    public static Timer mY(int n) {
        if (hp_2.aOW()) {
            return aIQ;
        }
        gg_2 gg_22 = FG.aLe().e(gg_2.class);
        return gg_22.e(aIE + n + ".time", () -> new hm_2(n));
    }

    public static Histogram cC(long l) {
        if (hp_2.aOW()) {
            return aIO;
        }
        gg_2 gg_22 = FG.aLe().e(gg_2.class);
        return gg_22.d("instance." + l + aIH, () -> new gv_2(l));
    }

    public static Timer cD(long l) {
        if (hp_2.aOW()) {
            return aIQ;
        }
        gg_2 gg_22 = FG.aLe().e(gg_2.class);
        return gg_22.e("instance." + l + aIJ, () -> new gx_2(l));
    }

    public static Histogram mZ(int n) {
        if (hp_2.aOW()) {
            return aIO;
        }
        gg_2 gg_22 = FG.aLe().e(gg_2.class);
        return gg_22.d(aIK + n + ".size", () -> new hq_2(n));
    }

    public static Histogram na(int n) {
        if (hp_2.aOW()) {
            return aIO;
        }
        gg_2 gg_22 = FG.aLe().e(gg_2.class);
        return gg_22.d(aIM + n + ".size", () -> new hs_2(n));
    }

    private static boolean aOW() {
        return !aIR || !FG.aLe().aLf();
    }

    public static void aOX() {
        aIR = false;
    }
}

