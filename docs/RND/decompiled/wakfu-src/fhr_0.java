/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fhR
 */
public abstract sealed class fhr_0
extends Enum<fhr_0>
permits fhs_0, fht_0, fhu_0 {
    public static final /* enum */ fhr_0 sqx = new fhs_0();
    public static final /* enum */ fhr_0 sqy = new fht_0();
    public static final /* enum */ fhr_0 sqz = new fhu_0();
    private static final /* synthetic */ fhr_0[] sqA;

    public static fhr_0[] values() {
        return (fhr_0[])sqA.clone();
    }

    public static fhr_0 valueOf(String string) {
        return Enum.valueOf(fhr_0.class, string);
    }

    public abstract boolean aA(ffV var1);

    public static fhr_0 v(boolean bl, boolean bl2) {
        if (bl) {
            return sqx;
        }
        if (bl2) {
            return sqy;
        }
        return sqz;
    }

    private static /* synthetic */ fhr_0[] fZg() {
        return new fhr_0[]{sqx, sqy, sqz};
    }

    static {
        sqA = fhr_0.fZg();
    }
}

