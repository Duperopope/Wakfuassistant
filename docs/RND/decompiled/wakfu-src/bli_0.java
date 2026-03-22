/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bli
 */
public abstract class bli_0
implements aeh_2 {
    public static final String itd = "content";
    public static final String ite = "kama";
    public static final String itf = "name";
    public static final String itg = "locked";
    public static final String ith = "valid";
    public static final String iti = "freeBagSlotsSize";
    public static final String itj = "freeBagSlotsSize";
    private static final String[] itk = new String[]{"content", "kama", "name", "locked", "valid", "freeBagSlotsSize"};
    protected final bld_0 itl;
    protected blk_0 itm;

    public bli_0(bld_0 bld_02) {
        this.itl = bld_02;
    }

    @Override
    public String[] bxk() {
        return itk;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(itf)) {
            return this.itl.dji().getName();
        }
        if (string.equals(itg)) {
            return this.itl.djh().bfb();
        }
        if (string.equals(ith)) {
            return this.isValid();
        }
        return null;
    }

    public bld_0 dtn() {
        return this.itl;
    }

    protected abstract boolean isValid();

    public abstract void dto();

    public abstract long dtp();
}

