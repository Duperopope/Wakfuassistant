/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBX
 */
public abstract sealed class abx_2
extends Enum<abx_2>
implements aca_1
permits aby_2, abz_2 {
    public static final /* enum */ abx_2 dAn = new aby_2();
    public static final /* enum */ abx_2 dAo = new abz_2();
    private static final /* synthetic */ abx_2[] dAp;

    public static abx_2[] values() {
        return (abx_2[])dAp.clone();
    }

    public static abx_2 valueOf(String string) {
        return Enum.valueOf(abx_2.class, string);
    }

    private static /* synthetic */ abx_2[] bWu() {
        return new abx_2[]{dAn, dAo};
    }

    static {
        dAp = abx_2.bWu();
    }
}

