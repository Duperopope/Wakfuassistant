/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from btS
 */
public final class bts_0
extends Enum<bts_0> {
    public static final /* enum */ bts_0 jmv = new bts_0(eVi.rzw, 800969, "MruFightMarkerSquare");
    public static final /* enum */ bts_0 jmw = new bts_0(eVi.rzx, 800968, "MruFightMarkerCircle");
    public static final /* enum */ bts_0 jmx = new bts_0(eVi.rzy, 800971, "MruFightMarkerCross");
    public static final /* enum */ bts_0 jmy = new bts_0(eVi.rzz, 800972, "MruFightMarkerHeart");
    public static final /* enum */ bts_0 jmz = new bts_0(eVi.rzA, 800973, "MruFightMarkerFlower");
    public static final /* enum */ bts_0 jmA = new bts_0(eVi.rzB, 800970, "MruFightMarkerTriangle");
    public static final /* enum */ bts_0 jmB = new bts_0(eVi.rzC, 800974, "MruFightMarkerSkull");
    public static final /* enum */ bts_0 jmC = new bts_0(eVi.rzD, 800975, "MruFightMarkerMoon");
    private final eVi jmD;
    private final int jmE;
    private final String jmF;
    private static final /* synthetic */ bts_0[] jmG;

    public static bts_0[] values() {
        return (bts_0[])jmG.clone();
    }

    public static bts_0 valueOf(String string) {
        return Enum.valueOf(bts_0.class, string);
    }

    private bts_0(eVi eVi2, int n2, String string2) {
        this.jmD = eVi2;
        this.jmE = n2;
        this.jmF = string2;
    }

    public static Optional<bts_0> b(eVi eVi2) {
        for (bts_0 bts_02 : bts_0.values()) {
            if (bts_02.jmD != eVi2) continue;
            return Optional.of(bts_02);
        }
        return Optional.empty();
    }

    public eVi dIk() {
        return this.jmD;
    }

    public int bBE() {
        return this.jmE;
    }

    public String dIl() {
        return this.jmF;
    }

    private static /* synthetic */ bts_0[] dIm() {
        return new bts_0[]{jmv, jmw, jmx, jmy, jmz, jmA, jmB, jmC};
    }

    static {
        jmG = bts_0.dIm();
    }
}

