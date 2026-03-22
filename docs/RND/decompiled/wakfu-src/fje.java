/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public final class fje
extends Enum<fje> {
    public static final /* enum */ fje swO = new fje(0);
    public static final /* enum */ fje swP = new fje(1);
    public static final /* enum */ fje swQ = new fje(2);
    public static final /* enum */ fje swR = new fje(3);
    public static final /* enum */ fje swS = new fje(4);
    public static final /* enum */ fje swT = new fje(5);
    public static final /* enum */ fje swU = new fje(6);
    public static final /* enum */ fje swV = new fje(7);
    public static final fje swW;
    private final int swX;
    private static final /* synthetic */ fje[] swY;

    public static fje[] values() {
        return (fje[])swY.clone();
    }

    public static fje valueOf(String string) {
        return Enum.valueOf(fje.class, string);
    }

    @NotNull
    public static fje Wv(int n) {
        for (fje fje2 : fje.values()) {
            if (fje2.swX != n) continue;
            return fje2;
        }
        return swW;
    }

    @Generated
    public int d() {
        return this.swX;
    }

    @Generated
    private fje(int n2) {
        this.swX = n2;
    }

    private static /* synthetic */ fje[] gaJ() {
        return new fje[]{swO, swP, swQ, swR, swS, swT, swU, swV};
    }

    static {
        swY = fje.gaJ();
        swW = swO;
    }
}

