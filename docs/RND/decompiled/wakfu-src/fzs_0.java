/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzS
 */
public final class fzs_0
extends Enum<fzs_0> {
    public static final /* enum */ fzs_0 tKr = new fzs_0();
    public static final /* enum */ fzs_0 tKs = new fzs_0();
    public static final /* enum */ fzs_0 tKt = new fzs_0();
    public static final /* enum */ fzs_0 tKu = new fzs_0();
    private static final /* synthetic */ fzs_0[] tKv;

    public static fzs_0[] values() {
        return (fzs_0[])tKv.clone();
    }

    public static fzs_0 valueOf(String string) {
        return Enum.valueOf(fzs_0.class, string);
    }

    public static fzs_0 tA(String string) {
        fzs_0[] fzs_0Array;
        for (fzs_0 fzs_02 : fzs_0Array = fzs_0.values()) {
            if (!fzs_02.name().equals(string.toUpperCase())) continue;
            return fzs_02;
        }
        return fzs_0Array[0];
    }

    private static /* synthetic */ fzs_0[] grQ() {
        return new fzs_0[]{tKr, tKs, tKt, tKu};
    }

    static {
        tKv = fzs_0.grQ();
    }
}

