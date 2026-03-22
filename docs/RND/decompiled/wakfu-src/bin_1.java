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
 * Renamed from bIn
 */
public final class bin_1
extends Enum<bin_1> {
    public static final /* enum */ bin_1 kfm = new bin_1(Comparator.comparing(bim_1::getName));
    public static final /* enum */ bin_1 kfn = new bin_1(bin_1.kfm.kfw.reversed());
    public static final /* enum */ bin_1 kfo = new bin_1(Comparator.comparingInt(bim_1::cmL));
    public static final /* enum */ bin_1 kfp = new bin_1(bin_1.kfo.kfw.reversed());
    public static final /* enum */ bin_1 kfq = new bin_1(Comparator.comparingLong(bim_12 -> bgn_1.dUk().a(bim_12.dXE(), 0L)));
    public static final /* enum */ bin_1 kfr = new bin_1(bin_1.kfq.kfw.reversed());
    public static final /* enum */ bin_1 kfs = new bin_1(Comparator.comparingInt(bim_1::oP));
    public static final /* enum */ bin_1 kft = new bin_1(bin_1.kfs.kfw.reversed());
    public static final /* enum */ bin_1 kfu = new bin_1(Comparator.comparingLong(bim_12 -> fgt.cH(bim_12.dXE())));
    public static final /* enum */ bin_1 kfv = new bin_1(bin_1.kfu.kfw.reversed());
    private final Comparator<bim_1> kfw;
    private static final /* synthetic */ bin_1[] kfx;

    public static bin_1[] values() {
        return (bin_1[])kfx.clone();
    }

    public static bin_1 valueOf(String string) {
        return Enum.valueOf(bin_1.class, string);
    }

    private bin_1(Comparator<bim_1> comparator) {
        this.kfw = comparator;
    }

    public Comparator<bim_1> dcC() {
        return this.kfw.thenComparingLong(bim_12 -> bim_12.dXE().LV());
    }

    public static Optional<bin_1> dh(@NotNull String string) {
        for (bin_1 bin_12 : bin_1.values()) {
            if (!bin_12.name().equalsIgnoreCase(string)) continue;
            return Optional.of(bin_12);
        }
        return Optional.empty();
    }

    private static /* synthetic */ bin_1[] dXF() {
        return new bin_1[]{kfm, kfn, kfo, kfp, kfq, kfr, kfs, kft, kfu, kfv};
    }

    static {
        kfx = bin_1.dXF();
    }
}

