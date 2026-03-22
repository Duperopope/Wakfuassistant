/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzK
 */
public abstract sealed class fzk_0
extends Enum<fzk_0>
permits fzl_0, fzm_0, fzn_0 {
    public static final /* enum */ fzk_0 tHl = new fzl_0();
    public static final /* enum */ fzk_0 tHm = new fzm_0();
    public static final /* enum */ fzk_0 tHn = new fzn_0();
    public static final fzk_0 tHo;
    private static final /* synthetic */ fzk_0[] tHp;

    public static fzk_0[] values() {
        return (fzk_0[])tHp.clone();
    }

    public static fzk_0 valueOf(String string) {
        return Enum.valueOf(fzk_0.class, string);
    }

    public abstract boolean x(boolean var1, boolean var2);

    private static /* synthetic */ fzk_0[] grM() {
        return new fzk_0[]{tHl, tHm, tHn};
    }

    static {
        tHp = fzk_0.grM();
        tHo = tHm;
    }
}

