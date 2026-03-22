/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bov
 */
public final class bov_1
extends Enum<bov_1> {
    public static final /* enum */ bov_1 iPD = new bov_1(0);
    public static final /* enum */ bov_1 iPE = new bov_1(1);
    public static final /* enum */ bov_1 iPF = new bov_1(2);
    public static final /* enum */ bov_1 iPG = new bov_1(3);
    private final int iPH;
    private static final /* synthetic */ bov_1[] iPI;

    public static bov_1[] values() {
        return (bov_1[])iPI.clone();
    }

    public static bov_1 valueOf(String string) {
        return Enum.valueOf(bov_1.class, string);
    }

    private bov_1(int n2) {
        this.iPH = n2;
    }

    public int d() {
        return this.iPH;
    }

    public static Optional<bov_1> dh(@NotNull String string) {
        for (bov_1 bov_12 : bov_1.values()) {
            if (!bov_12.name().equalsIgnoreCase(string)) continue;
            return Optional.of(bov_12);
        }
        return Optional.empty();
    }

    private static /* synthetic */ bov_1[] dAS() {
        return new bov_1[]{iPD, iPE, iPF, iPG};
    }

    static {
        iPI = bov_1.dAS();
    }
}

