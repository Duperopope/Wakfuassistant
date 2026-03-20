/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Comparator;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public final class bIn
extends Enum<bIn> {
    public static final /* enum */ bIn kfm = new bIn(Comparator.comparing(bIm::getName));
    public static final /* enum */ bIn kfn = new bIn(bIn.kfm.kfw.reversed());
    public static final /* enum */ bIn kfo = new bIn(Comparator.comparingInt(bIm::cmL));
    public static final /* enum */ bIn kfp = new bIn(bIn.kfo.kfw.reversed());
    public static final /* enum */ bIn kfq = new bIn(Comparator.comparingLong(bIm2 -> bGN.dUk().a(bIm2.dXE(), 0L)));
    public static final /* enum */ bIn kfr = new bIn(bIn.kfq.kfw.reversed());
    public static final /* enum */ bIn kfs = new bIn(Comparator.comparingInt(bIm::oP));
    public static final /* enum */ bIn kft = new bIn(bIn.kfs.kfw.reversed());
    public static final /* enum */ bIn kfu = new bIn(Comparator.comparingLong(bIm2 -> fgt.cH(bIm2.dXE())));
    public static final /* enum */ bIn kfv = new bIn(bIn.kfu.kfw.reversed());
    private final Comparator<bIm> kfw;
    private static final /* synthetic */ bIn[] kfx;

    public static bIn[] values() {
        return (bIn[])kfx.clone();
    }

    public static bIn valueOf(String string) {
        return Enum.valueOf(bIn.class, string);
    }

    private bIn(Comparator<bIm> comparator) {
        this.kfw = comparator;
    }

    public Comparator<bIm> dcC() {
        return this.kfw.thenComparingLong(bIm2 -> bIm2.dXE().LV());
    }

    public static Optional<bIn> dh(@NotNull String string) {
        for (bIn bIn2 : bIn.values()) {
            if (!bIn2.name().equalsIgnoreCase(string)) continue;
            return Optional.of(bIn2);
        }
        return Optional.empty();
    }

    private static /* synthetic */ bIn[] dXF() {
        return new bIn[]{kfm, kfn, kfo, kfp, kfq, kfr, kfs, kft, kfu, kfv};
    }

    static {
        kfx = bIn.dXF();
    }
}
