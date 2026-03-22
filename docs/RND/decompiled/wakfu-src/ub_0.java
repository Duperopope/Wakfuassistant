/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Renamed from UB
 */
public final class ub_0
extends Enum<ub_0> {
    public static final /* enum */ ub_0 bwb = new ub_0("Winter");
    public static final /* enum */ ub_0 bwc = new ub_0("Spring");
    public static final /* enum */ ub_0 bwd = new ub_0("Summer");
    public static final /* enum */ ub_0 bwe = new ub_0("Fall");
    static final Calendar bwf;
    private final String bwg;
    private static final /* synthetic */ ub_0[] bwh;

    public static ub_0[] values() {
        return (ub_0[])bwh.clone();
    }

    public static ub_0 valueOf(String string) {
        return Enum.valueOf(ub_0.class, string);
    }

    public static synchronized ub_0 n(ux_0 ux_02) {
        long l = ux_02.bjB() - bwf.getTime().getTime();
        long l2 = l / ud_0.bwr.bjB();
        ub_0[] ub_0Array = ub_0.values();
        return ub_0Array[GC.cw(l2 % (long)ub_0.values().length)];
    }

    public static uw_0 o(ux_0 ux_02) {
        long l = bwf.getTime().getTime();
        long l2 = ux_02.bjB() - l;
        long l3 = l2 / ud_0.bwr.bjB() * ud_0.bwr.bjB();
        return uw_0.fn(l3 + l);
    }

    public static int p(ux_0 ux_02) {
        uw_0 uw_02 = ub_0.o(ux_02);
        return uw_02.l(ux_02).f(ud_0.bwp);
    }

    public ux_0 q(ux_0 ux_02) {
        ux_0 ux_03 = ux_02;
        ub_0 ub_02 = ub_0.n(ux_03);
        while (ub_02 != this) {
            ux_03 = ux_03.pO((int)(ud_0.bwr.bjS() / 86400L));
            ub_02 = ub_0.n(ux_03);
        }
        return ub_0.o(ux_03);
    }

    private ub_0(String string2) {
        this.bwg = string2;
    }

    public String getName() {
        return this.bwg;
    }

    public byte bjT() {
        return (byte)(this.ordinal() + 1);
    }

    public String toString() {
        switch (this.ordinal()) {
            case 1: {
                return "Printemps";
            }
            case 2: {
                return "Et\u00e9";
            }
            case 3: {
                return "Automne";
            }
            case 0: {
                return "Hiver";
            }
        }
        return super.toString();
    }

    private static /* synthetic */ ub_0[] bjU() {
        return new ub_0[]{bwb, bwc, bwd, bwe};
    }

    static {
        bwh = ub_0.bjU();
        bwf = new GregorianCalendar();
        bwf.setTimeZone(uw_0.bvG);
        bwf.setTimeInMillis(0L);
        bwf.set(3, 2);
        bwf.set(7, 3);
    }
}

