/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bwh
extends Enum<bwh> {
    public static final /* enum */ bwh jwF = new bwh(0);
    public static final /* enum */ bwh jwG = new bwh(1);
    public static final /* enum */ bwh jwH = new bwh(2);
    public static final /* enum */ bwh jwI = new bwh(3);
    public static final /* enum */ bwh jwJ = new bwh(4);
    private final int jwK;
    private static final /* synthetic */ bwh[] jwL;

    public static bwh[] values() {
        return (bwh[])jwL.clone();
    }

    public static bwh valueOf(String string) {
        return Enum.valueOf(bwh.class, string);
    }

    private bwh(int n2) {
        this.jwK = n2;
    }

    public int d() {
        return this.jwK;
    }

    @Nullable
    public static bwh mD(@NotNull String string) {
        for (bwh bwh2 : bwh.values()) {
            if (!bwh2.name().equalsIgnoreCase(string)) continue;
            return bwh2;
        }
        return null;
    }

    private static /* synthetic */ bwh[] dLC() {
        return new bwh[]{jwF, jwG, jwH, jwI, jwJ};
    }

    static {
        jwL = bwh.dLC();
    }
}

