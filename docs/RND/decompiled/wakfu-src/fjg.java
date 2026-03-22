/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class fjg
extends Enum<fjg> {
    public static final /* enum */ fjg sxj = new fjg(0, 604800000L, 0.3333333333333333);
    public static final /* enum */ fjg sxk = new fjg(1, 1209600000L, 0.5);
    public static final /* enum */ fjg sxl = new fjg(2, 2419200000L, 1.0);
    private static final fjg[] sxm;
    private static final long[] sxn;
    private final byte sxo;
    private final long sxp;
    private final ua_0 sxq;
    private final double sxr;
    private static final /* synthetic */ fjg[] sxs;

    public static fjg[] values() {
        return (fjg[])sxs.clone();
    }

    public static fjg valueOf(String string) {
        return Enum.valueOf(fjg.class, string);
    }

    private fjg(byte by, long l, double d2) {
        this.sxo = by;
        this.sxp = l;
        this.sxq = new uz_0(l / 1000L);
        this.sxr = d2;
    }

    public byte aJr() {
        return this.sxo;
    }

    public long Tz() {
        return this.sxp;
    }

    public ua_0 gaL() {
        return this.sxq;
    }

    public double gaM() {
        return this.sxr;
    }

    public static Optional<fjg> eL(byte by) {
        for (fjg fjg2 : sxm) {
            if (fjg2.sxo != by) continue;
            return Optional.of(fjg2);
        }
        return Optional.empty();
    }

    public static Optional<fjg> tN(long l) {
        for (fjg fjg2 : sxm) {
            if (fjg2.sxp != l) continue;
            return Optional.of(fjg2);
        }
        return Optional.empty();
    }

    public static fjg Wy(int n) {
        return sxm[n];
    }

    public static long gN(byte by) {
        return sxn[by];
    }

    public static long Wz(int n) {
        return sxn[n];
    }

    private static /* synthetic */ fjg[] gaN() {
        return new fjg[]{sxj, sxk, sxl};
    }

    static {
        sxs = fjg.gaN();
        sxm = fjg.values();
        sxn = new long[sxm.length];
        for (fjg fjg2 : sxm) {
            fjg.sxn[fjg2.sxo] = fjg2.sxp;
        }
    }
}

