/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bGk
 */
public final class bgk_1
extends Enum<bgk_1> {
    public static final /* enum */ bgk_1 jUU = new bgk_1(0, true);
    public static final /* enum */ bgk_1 jUV = new bgk_1(1, true);
    public static final /* enum */ bgk_1 jUW = new bgk_1(2, true);
    public static final /* enum */ bgk_1 jUX = new bgk_1(3, true);
    public static final /* enum */ bgk_1 jUY = new bgk_1(4, false);
    private static final bgk_1[] jUZ;
    private final int jVa;
    private final boolean jVb;
    private static final /* synthetic */ bgk_1[] jVc;

    public static bgk_1[] values() {
        return (bgk_1[])jVc.clone();
    }

    public static bgk_1 valueOf(String string) {
        return Enum.valueOf(bgk_1.class, string);
    }

    private bgk_1(int n2, boolean bl) {
        this.jVa = n2;
        this.jVb = bl;
    }

    public int d() {
        return this.jVa;
    }

    public boolean dTJ() {
        return this.jVb;
    }

    public static Optional<bgk_1> dh(@NotNull String string) {
        for (bgk_1 bgk_12 : jUZ) {
            if (!bgk_12.name().equalsIgnoreCase(string)) continue;
            return Optional.of(bgk_12);
        }
        return Optional.empty();
    }

    private static /* synthetic */ bgk_1[] dTN() {
        return new bgk_1[]{jUU, jUV, jUW, jUX, jUY};
    }

    static {
        jVc = bgk_1.dTN();
        jUZ = bgk_1.values();
    }
}

