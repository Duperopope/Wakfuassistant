/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Comparator;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fhW
 */
public final class fhw_0
extends Enum<fhw_0> {
    public static final /* enum */ fhw_0 sqC = new fhw_0(0);
    public static final /* enum */ fhw_0 sqD = new fhw_0(1, sqC);
    public static final /* enum */ fhw_0 sqE = new fhw_0(2, Comparator.comparing(ffV::getName));
    public static final /* enum */ fhw_0 sqF = new fhw_0(3, sqE);
    public static final /* enum */ fhw_0 sqG = new fhw_0(4, Comparator.comparingInt(ffV2 -> ffV2.dwg().fWK()));
    public static final /* enum */ fhw_0 sqH = new fhw_0(5, sqG);
    public static final /* enum */ fhw_0 sqI = new fhw_0(6, Comparator.comparingInt(ffV2 -> ffV2.dOg().dGh().cqd()));
    public static final /* enum */ fhw_0 sqJ = new fhw_0(7, sqI);
    public static final /* enum */ fhw_0 sqK = new fhw_0(8, Comparator.comparingInt(ffV::cmL));
    public static final /* enum */ fhw_0 sqL = new fhw_0(9, sqK);
    public static final /* enum */ fhw_0 sqM = new fhw_0(10, Comparator.comparingInt(ffV::bfd));
    public static final /* enum */ fhw_0 sqN = new fhw_0(11, sqM);
    public static final /* enum */ fhw_0 sqO = new fhw_0(12, Comparator.comparingLong(fgt::cH));
    public static final /* enum */ fhw_0 sqP = new fhw_0(13, sqO);
    public static final /* enum */ fhw_0 sqQ = new fhw_0(14, Comparator.comparingInt(ffV2 -> ffV2.dXg() ? ffV2.eAZ().fYO() : 0).thenComparing(fhw_0.sqO.sqX));
    public static final /* enum */ fhw_0 sqR = new fhw_0(15, sqQ);
    public static final /* enum */ fhw_0 sqS = new fhw_0(16, Comparator.comparingInt(fgt::cI));
    public static final /* enum */ fhw_0 sqT = new fhw_0(17, sqS);
    private static final fhw_0[] sqU;
    public static final fhw_0 sqV;
    private final byte sqW;
    @NotNull
    private final Comparator<ffV> sqX;
    private static final /* synthetic */ fhw_0[] sqY;

    public static fhw_0[] values() {
        return (fhw_0[])sqY.clone();
    }

    public static fhw_0 valueOf(String string) {
        return Enum.valueOf(fhw_0.class, string);
    }

    private fhw_0(byte by, Comparator<ffV> comparator) {
        this.sqW = by;
        this.sqX = comparator != null ? comparator.thenComparing(fhv_0.sqB) : fhv_0.sqB;
    }

    private fhw_0(byte by, fhw_0 fhw_02) {
        this(by, fhw_02.sqX.reversed());
    }

    private fhw_0(byte by) {
        this(by, (Comparator<ffV>)null);
    }

    public byte aJr() {
        return this.sqW;
    }

    @NotNull
    public Comparator<ffV> dcC() {
        return this.sqX;
    }

    public static Optional<fhw_0> mL(int n) {
        for (fhw_0 fhw_02 : sqU) {
            if (fhw_02.sqW != n) continue;
            return Optional.of(fhw_02);
        }
        return Optional.empty();
    }

    public static Optional<fhw_0> dh(@NotNull String string) {
        for (fhw_0 fhw_02 : sqU) {
            if (!fhw_02.name().equalsIgnoreCase(string)) continue;
            return Optional.of(fhw_02);
        }
        return Optional.empty();
    }

    private static /* synthetic */ fhw_0[] fZh() {
        return new fhw_0[]{sqC, sqD, sqE, sqF, sqG, sqH, sqI, sqJ, sqK, sqL, sqM, sqN, sqO, sqP, sqQ, sqR, sqS, sqT};
    }

    static {
        sqY = fhw_0.fZh();
        sqU = fhw_0.values();
        sqV = sqC;
    }
}

