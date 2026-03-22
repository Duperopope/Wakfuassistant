/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzT
 */
public final class fzt_0
extends Enum<fzt_0> {
    public static final /* enum */ fzt_0 tKw = new fzt_0();
    public static final /* enum */ fzt_0 tKx = new fzt_0();
    public static final /* enum */ fzt_0 tKy = new fzt_0();
    public static final /* enum */ fzt_0 tKz = new fzt_0();
    public static final /* enum */ fzt_0 tKA = new fzt_0();
    private static final /* synthetic */ fzt_0[] tKB;

    public static fzt_0[] values() {
        return (fzt_0[])tKB.clone();
    }

    public static fzt_0 valueOf(String string) {
        return Enum.valueOf(fzt_0.class, string);
    }

    public static fzt_0 tB(String string) {
        fzt_0[] fzt_0Array;
        for (fzt_0 fzt_02 : fzt_0Array = fzt_0.values()) {
            if (!fzt_02.name().equals(string.toUpperCase())) continue;
            return fzt_02;
        }
        return fzt_0Array[0];
    }

    private static /* synthetic */ fzt_0[] grR() {
        return new fzt_0[]{tKw, tKx, tKy, tKz, tKA};
    }

    static {
        tKB = fzt_0.grR();
    }
}

