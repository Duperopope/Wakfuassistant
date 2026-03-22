/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bde
 */
public final class bde_2
extends Enum<bde_2> {
    public static final /* enum */ bde_2 hJD = new bde_2(null);
    public static final /* enum */ bde_2 hJE = new bde_2(Comparator.comparing(bci_1::getName));
    public static final /* enum */ bde_2 hJF = new bde_2(bde_2.hJE.hJK.reversed());
    public static final /* enum */ bde_2 hJG = new bde_2(Comparator.comparingInt(bci_12 -> bci_12.daS().cjl()));
    public static final /* enum */ bde_2 hJH = new bde_2(bde_2.hJG.hJK.reversed());
    public static final /* enum */ bde_2 hJI = new bde_2(Comparator.comparingLong(bci_12 -> bci_12.daS().aYu()));
    public static final /* enum */ bde_2 hJJ = new bde_2(bde_2.hJI.hJK.reversed());
    @Nullable
    private final Comparator<bci_1> hJK;
    private static final /* synthetic */ bde_2[] hJL;

    public static bde_2[] values() {
        return (bde_2[])hJL.clone();
    }

    public static bde_2 valueOf(String string) {
        return Enum.valueOf(bde_2.class, string);
    }

    private bde_2(Comparator<bci_1> comparator) {
        this.hJK = comparator;
    }

    @Nullable
    public Comparator<bci_1> dcC() {
        return this.hJK;
    }

    public static Optional<bde_2> dh(@NotNull String string) {
        for (bde_2 bde_22 : bde_2.values()) {
            if (!bde_22.name().equalsIgnoreCase(string)) continue;
            return Optional.of(bde_22);
        }
        return Optional.empty();
    }

    private static /* synthetic */ bde_2[] dcD() {
        return new bde_2[]{hJD, hJE, hJF, hJG, hJH, hJI, hJJ};
    }

    static {
        hJL = bde_2.dcD();
    }
}

