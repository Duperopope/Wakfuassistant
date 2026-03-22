/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzH
 */
public final class fzh_0
extends Enum<fzh_0> {
    public static final /* enum */ fzh_0 tGV = new fzh_0();
    public static final /* enum */ fzh_0 tGW = new fzh_0();
    public static final /* enum */ fzh_0 tGX = new fzh_0();
    public static final /* enum */ fzh_0 tGY = new fzh_0();
    private static final /* synthetic */ fzh_0[] tGZ;

    public static fzh_0[] values() {
        return (fzh_0[])tGZ.clone();
    }

    public static fzh_0 valueOf(String string) {
        return Enum.valueOf(fzh_0.class, string);
    }

    public static fzh_0 tv(String string) {
        fzh_0[] fzh_0Array;
        for (fzh_0 fzh_02 : fzh_0Array = fzh_0.values()) {
            if (!fzh_02.name().equals(string.toUpperCase())) continue;
            return fzh_02;
        }
        return fzh_0Array[0];
    }

    public static fzh_0 aaw(int n) {
        fzh_0[] fzh_0Array = fzh_0.values();
        if (fzh_0Array.length > n && n >= 0) {
            return fzh_0Array[n];
        }
        return null;
    }

    private static /* synthetic */ fzh_0[] grJ() {
        return new fzh_0[]{tGV, tGW, tGX, tGY};
    }

    static {
        tGZ = fzh_0.grJ();
    }
}

