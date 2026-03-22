/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzA
 */
public final class fza_0
extends Enum<fza_0> {
    public static final /* enum */ fza_0 tGr = new fza_0(true, true, true);
    public static final /* enum */ fza_0 tGs = new fza_0(false, false, false);
    public static final /* enum */ fza_0 tGt = new fza_0(true, false, true);
    private final boolean tGu;
    private final boolean tGv;
    private final boolean tGw;
    private static final /* synthetic */ fza_0[] tGx;

    public static fza_0[] values() {
        return (fza_0[])tGx.clone();
    }

    public static fza_0 valueOf(String string) {
        return Enum.valueOf(fza_0.class, string);
    }

    private fza_0(boolean bl, boolean bl2, boolean bl3) {
        this.tGu = bl;
        this.tGv = bl2;
        this.tGw = bl3;
    }

    public boolean grB() {
        return this.tGu;
    }

    public boolean grC() {
        return this.tGv;
    }

    public boolean grD() {
        return this.tGw;
    }

    private static /* synthetic */ fza_0[] grE() {
        return new fza_0[]{tGr, tGs, tGt};
    }

    static {
        tGx = fza_0.grE();
    }
}

