/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class bPa
extends Enum<bPa> {
    public static final /* enum */ bPa kOh = new bPa("");
    public static final /* enum */ bPa kOi = new bPa("MAX_TOTAL_PURCHASES_ACCOUNT");
    private final String kOj;
    private static final /* synthetic */ bPa[] kOk;

    public static bPa[] values() {
        return (bPa[])kOk.clone();
    }

    public static bPa valueOf(String string) {
        return Enum.valueOf(bPa.class, string);
    }

    private bPa(String string2) {
        this.kOj = string2;
    }

    @Nullable
    public static bPa ne(String string) {
        for (bPa bPa2 : bPa.values()) {
            if (!bPa2.kOj.equals(string)) continue;
            return bPa2;
        }
        return null;
    }

    private static /* synthetic */ bPa[] ehU() {
        return new bPa[]{kOh, kOi};
    }

    static {
        kOk = bPa.ehU();
    }
}

