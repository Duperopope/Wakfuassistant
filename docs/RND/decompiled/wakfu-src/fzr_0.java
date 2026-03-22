/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzR
 */
public final class fzr_0
extends Enum<fzr_0> {
    public static final /* enum */ fzr_0 tKo = new fzr_0();
    public static final /* enum */ fzr_0 tKp = new fzr_0();
    private static final /* synthetic */ fzr_0[] tKq;

    public static fzr_0[] values() {
        return (fzr_0[])tKq.clone();
    }

    public static fzr_0 valueOf(String string) {
        return Enum.valueOf(fzr_0.class, string);
    }

    public static fzr_0 tz(String string) {
        fzr_0[] fzr_0Array;
        for (fzr_0 fzr_02 : fzr_0Array = fzr_0.values()) {
            if (!fzr_02.name().equals(string.toUpperCase())) continue;
            return fzr_02;
        }
        return null;
    }

    private static /* synthetic */ fzr_0[] grP() {
        return new fzr_0[]{tKo, tKp};
    }

    static {
        tKq = fzr_0.grP();
    }
}

