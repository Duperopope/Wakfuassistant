/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzU
 */
public final class fzu_0
extends Enum<fzu_0> {
    public static final /* enum */ fzu_0 tKC = new fzu_0();
    public static final /* enum */ fzu_0 tKD = new fzu_0();
    public static final /* enum */ fzu_0 tKE = new fzu_0();
    public static final /* enum */ fzu_0 tKF = new fzu_0();
    private static final /* synthetic */ fzu_0[] tKG;

    public static fzu_0[] values() {
        return (fzu_0[])tKG.clone();
    }

    public static fzu_0 valueOf(String string) {
        return Enum.valueOf(fzu_0.class, string);
    }

    public boolean isVertical() {
        return this == tKC || this == tKD;
    }

    public boolean isHorizontal() {
        return this == tKF || this == tKE;
    }

    public static fzu_0 tC(String string) {
        fzu_0[] fzu_0Array;
        for (fzu_0 fzu_02 : fzu_0Array = fzu_0.values()) {
            if (!fzu_02.name().equals(string.toUpperCase())) continue;
            return fzu_02;
        }
        return fzu_0Array[0];
    }

    private static /* synthetic */ fzu_0[] grS() {
        return new fzu_0[]{tKC, tKD, tKE, tKF};
    }

    static {
        tKG = fzu_0.grS();
    }
}

