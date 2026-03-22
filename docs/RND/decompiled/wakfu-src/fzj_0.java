/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzJ
 */
public final class fzj_0
extends Enum<fzj_0> {
    public static final /* enum */ fzj_0 tHe = new fzj_0(false, false, false);
    public static final /* enum */ fzj_0 tHf = new fzj_0(true, true, false);
    public static final /* enum */ fzj_0 tHg = new fzj_0(true, true, true);
    public final boolean tHh;
    public final boolean tHi;
    public final boolean tHj;
    private static final /* synthetic */ fzj_0[] tHk;

    public static fzj_0[] values() {
        return (fzj_0[])tHk.clone();
    }

    public static fzj_0 valueOf(String string) {
        return Enum.valueOf(fzj_0.class, string);
    }

    private fzj_0(boolean bl, boolean bl2, boolean bl3) {
        this.tHh = bl;
        this.tHi = bl2;
        this.tHj = bl3;
    }

    private static /* synthetic */ fzj_0[] grL() {
        return new fzj_0[]{tHe, tHf, tHg};
    }

    static {
        tHk = fzj_0.grL();
    }
}

