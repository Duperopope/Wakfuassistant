/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBS
 */
public abstract sealed class abs_1
extends Enum<abs_1>
implements abw_1
permits abt_1, abu_1, abv_1 {
    public static final /* enum */ abs_1 dAj = new abt_1();
    public static final /* enum */ abs_1 dAk = new abu_1();
    public static final /* enum */ abs_1 dAl = new abv_1();
    private static final /* synthetic */ abs_1[] dAm;

    public static abs_1[] values() {
        return (abs_1[])dAm.clone();
    }

    public static abs_1 valueOf(String string) {
        return Enum.valueOf(abs_1.class, string);
    }

    private static /* synthetic */ abs_1[] bWt() {
        return new abs_1[]{dAj, dAk, dAl};
    }

    static {
        dAm = abs_1.bWt();
    }
}

