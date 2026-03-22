/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzB
 */
public final class fzb_0
extends Enum<fzb_0> {
    public static final /* enum */ fzb_0 tGy = new fzb_0(false, false, false);
    public static final /* enum */ fzb_0 tGz = new fzb_0(true, false, false);
    public static final /* enum */ fzb_0 tGA = new fzb_0(true, true, false);
    public static final /* enum */ fzb_0 tGB = new fzb_0(true, true, true);
    public final boolean tGC;
    public final boolean tGD;
    public final boolean tGE;
    private static final /* synthetic */ fzb_0[] tGF;

    public static fzb_0[] values() {
        return (fzb_0[])tGF.clone();
    }

    public static fzb_0 valueOf(String string) {
        return Enum.valueOf(fzb_0.class, string);
    }

    private fzb_0(boolean bl, boolean bl2, boolean bl3) {
        this.tGC = bl;
        this.tGD = bl2;
        this.tGE = bl3;
    }

    private static /* synthetic */ fzb_0[] grF() {
        return new fzb_0[]{tGy, tGz, tGA, tGB};
    }

    static {
        tGF = fzb_0.grF();
    }
}

